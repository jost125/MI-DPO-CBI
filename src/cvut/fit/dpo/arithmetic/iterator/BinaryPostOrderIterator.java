package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.iterator.states.OperandIteratorState;

/**
 * Abstract post order iterator for binary operations. Implements equal
 * behavior for + and -.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class BinaryPostOrderIterator extends PostOrderIterator {

	private ExpressionElement current;

	private OperandIteratorState state = OperandIteratorState.IN_LEFT_OPERAND;

	public BinaryPostOrderIterator(BinaryOperator operand) {
		super(operand);
		current = null;
	}

	@Override
	public boolean hasNext() {
		return !(state == OperandIteratorState.CLOSED);
	}
	
	abstract protected ExpressionElement getSignOperation();

	@Override
	public ExpressionElement next() {
		BinaryOperator binaryOperand;

		switch (state) {
			case IN_LEFT_OPERAND:
				binaryOperand = (BinaryOperator)operand;

				if (binaryOperand.getFirstOperand().getPostOrderIterator().hasNext()) {
					current = binaryOperand.getFirstOperand().getPostOrderIterator().next();
					if (!binaryOperand.getFirstOperand().getPostOrderIterator().hasNext()) {
						state = OperandIteratorState.IN_RIGHT_OPERAND;
					}
				}
				break;
			case IN_RIGHT_OPERAND:
				binaryOperand = (BinaryOperator)operand;

				if (binaryOperand.getSecondOperand().getPostOrderIterator().hasNext()) {
					current = binaryOperand.getSecondOperand().getPostOrderIterator().next();
				} else {
					current = getSignOperation();
					state = OperandIteratorState.CLOSED;
				}
				break;
		}

		return current;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
