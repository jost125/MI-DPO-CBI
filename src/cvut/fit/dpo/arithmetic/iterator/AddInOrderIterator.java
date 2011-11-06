package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.AddOperation;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

public class AddInOrderIterator extends BinaryInOrderIterator {

	public AddInOrderIterator(BinaryOperator operand) {
		super(operand);
	}

	@Override
	protected ExpressionElement getSignOperation() {
		return new AddOperation();
	}

}
