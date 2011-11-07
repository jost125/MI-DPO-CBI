package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.iterator.states.OperandIteratorState;
import cvut.fit.dpo.arithmetic.NumericOperand;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.Number;

public class NumericPostOrderIterator extends PostOrderIterator {

	private ExpressionElement current;

	private OperandIteratorState state = OperandIteratorState.OPENED;

	public NumericPostOrderIterator(NumericOperand operand) {
		super(operand);
		current = null;
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
