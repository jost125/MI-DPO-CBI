package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.AddOperation;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

public class AddPostOrderIterator extends BinaryPostOrderIterator {

	public AddPostOrderIterator(BinaryOperator operand) {
		super(operand);
	}

	@Override
	protected ExpressionElement getSignOperation() {
		return new AddOperation();
	}

}
