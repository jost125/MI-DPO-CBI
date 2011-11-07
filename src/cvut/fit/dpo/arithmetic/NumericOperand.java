package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.NumericInOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.NumericPostOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents number in the arithmetic expression.
 *
 * It the "Leaf" from Composite pattern.
 * 
 * @author Jan Kurš
 */
public class NumericOperand extends Operand {

	private Integer value;

	/**
	 * @param Integer value
	 */
	public NumericOperand(Integer value) {
		this.value = value;
	}

	/**
	 * Actual value of number.
	 *
	 * @return Integer
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @return InOrderIterator
	 */
	@Override
	public InOrderIterator createInOrderIterator() {
		return new NumericInOrderIterator(this);
	}

	/**
	 * @return PostOrderIterator
	 */
	@Override
	public PostOrderIterator createPostOrderIterator() {
		return new NumericPostOrderIterator(this);
	}

	/**
	 * @return Integer
	 */
	@Override
	public Integer evaluate() {
		return value;
	}
}
