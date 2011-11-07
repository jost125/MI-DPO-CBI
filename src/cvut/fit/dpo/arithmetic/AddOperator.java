package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.AddInOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.AddPostOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents + operation
 * 
 * @author Jan Kurš
 * 
 */
public class AddOperator extends BinaryOperator {

	public AddOperator(Operand firstOperand, Operand secondOperand) {
		super(firstOperand, secondOperand);
	}

	/**
	 * @param Integer val1
	 * @param Integer val2
	 * @return Integer
	 */
	@Override
	protected Integer evaluate(Integer val1, Integer val2) {
		return val1 + val2;
	}

	/**
	 * @return InOrderIterator
	 */
	@Override
	public InOrderIterator createInOrderIterator() {
		return new AddInOrderIterator(this);
	}

	/**
	 * @return PostOrderIterator
	 */
	@Override
	public PostOrderIterator createPostOrderIterator() {
		return new AddPostOrderIterator(this);
	}
}
