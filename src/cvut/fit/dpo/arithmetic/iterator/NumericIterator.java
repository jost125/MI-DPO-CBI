package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.iterator.states.OperandIteratorState;
import cvut.fit.dpo.arithmetic.NumericOperand;
import cvut.fit.dpo.arithmetic.Operand;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.Number;
import java.util.Iterator;

/**
 * Numeric iterator is same for in order and post order.
 *
 * It returns only one number.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class NumericIterator implements Iterator<ExpressionElement> {

	private ExpressionElement current;
	private Operand operand;

	private OperandIteratorState state = OperandIteratorState.OPENED;

	public NumericIterator(NumericOperand operand) {
		this.operand = operand;
		this.current = null;
	}

	@Override
	public boolean hasNext() {
		return !(state == OperandIteratorState.CLOSED);
	}

	@Override
	public ExpressionElement next() {
		NumericOperand numericOperand = (NumericOperand)operand;
		switch (state) {
			case OPENED:
				current = new Number(numericOperand.getValue());
				state = OperandIteratorState.CLOSED;
				break;
		}
		
		return current;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Not supported yet.");
	}


}
