package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.SubstractOperation;

public class SubtractPostOrderIterator extends BinaryPostOrderIterator {

	public SubtractPostOrderIterator(BinaryOperator operand) {
		super(operand);
	}

	@Override
	protected ExpressionElement getSignOperation() {
		return new SubstractOperation();
	}

}