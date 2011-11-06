package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.CloseBracketOperation;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.OpenBracketOperation;
import cvut.fit.dpo.arithmetic.iterator.states.BinaryIteratorState;

abstract public class BinaryInOrderIterator extends InOrderIterator {

	private ExpressionElement current;

	private BinaryIteratorState state = BinaryIteratorState.OPENED;

	public BinaryInOrderIterator(BinaryOperator operand) {
		super(operand);
		current = null;
	}

	@Override
	public boolean hasNext() {
		return !(state == BinaryIteratorState.CLOSED);
	}
	
	abstract protected ExpressionElement getSignOperation();

	@Override
	public ExpressionElement next() {
		BinaryOperator binaryOperand;

		switch (state) {
			case OPENED:
				current = new OpenBracketOperation();
				state = BinaryIteratorState.IN_LEFT_OPERAND;
				break;
			case IN_LEFT_OPERAND:
				binaryOperand = (BinaryOperator)operand;

				if (binaryOperand.getFirstOperand().getInOrderIterator().hasNext()) {
					current = binaryOperand.getFirstOperand().getInOrderIterator().next();
				} else {
					current = getSignOperation();
					state = BinaryIteratorState.IN_RIGHT_OPERAND;
				}
				break;
			case IN_RIGHT_OPERAND:
				binaryOperand = (BinaryOperator)operand;

				if (binaryOperand.getSecondOperand().getInOrderIterator().hasNext()) {
					current = binaryOperand.getSecondOperand().getInOrderIterator().next();
				} else {
					current = new CloseBracketOperation();
					state = BinaryIteratorState.CLOSED;
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
