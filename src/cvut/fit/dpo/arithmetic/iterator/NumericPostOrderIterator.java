package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.NumericOperand;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

/**
 * Delegate to NumericIterator.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class NumericPostOrderIterator extends PostOrderIterator {

	private NumericIterator numericOperator;

	public NumericPostOrderIterator(NumericOperand operand) {
		super(operand);
		this.numericOperator = new NumericIterator(operand);
	}

	@Override
	public boolean hasNext() {
		return numericOperator.hasNext();
	}

	@Override
	public ExpressionElement next() {
		return numericOperator.next();
	}

	@Override
	public void remove() {
		numericOperator.remove();
	}

}
