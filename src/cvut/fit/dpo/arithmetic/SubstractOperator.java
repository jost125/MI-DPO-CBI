package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.SubstractInOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.SubstractPostOrderIterator;

/**
 * Represents - operation
 * 
 * @author Jan Kurš
 */
public class SubstractOperator extends BinaryOperator {

	public SubstractOperator(Operand firstOperand, Operand secondOperand) {
		super(firstOperand, secondOperand);
	}

	/**
	 * @param Integer val1
	 * @param Integer val2
	 * @return Integer
	 */
	@Override
	protected Integer evaluate(Integer val1, Integer val2) {
		return val1 - val2;
	}

	/**
	 * @return InOrderIterator
	 */
	@Override
	public InOrderIterator createInOrderIterator() {
		return new SubstractInOrderIterator(this);
	}

	/**
	 * @return PostOrderIterator
	 */
	@Override
	public PostOrderIterator createPostOrderIterator() {
		return new SubstractPostOrderIterator(this);
	}
}
