package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.AddOperation;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

/**
 * Concrete iterator returns expression elements in format:
 * firstOperand secondOperand +
 *
 * where operands have its own iterators depending on operand type.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class AddPostOrderIterator extends BinaryPostOrderIterator {

	public AddPostOrderIterator(BinaryOperator operand) {
		super(operand);
	}

	@Override
	protected ExpressionElement getSignOperation() {
		return new AddOperation();
	}
}
