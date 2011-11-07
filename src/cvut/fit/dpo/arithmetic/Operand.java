package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents any Operand of ArithmeticExpression.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class Operand {

	private InOrderIterator inOrderIterator = null;
	private PostOrderIterator postOrderIterator = null;

	/**
	 * This will actually create operand specific iterator.
	 *
	 * @return InOrderIterator
	 */
	abstract protected InOrderIterator createInOrderIterator();

	/**
	 * This will actually create operand specific iterator.
	 *
	 * @return PostOrderIterator
	 */
	abstract protected PostOrderIterator createPostOrderIterator();

	/**
	 * All operands can be evaluated, binary or numeric.
	 *
	 * @return Integer
	 */
	abstract public Integer evaluate();

	/**
	 * Lazy creates iterator if not exists, otherwise get existing instance.
	 *
	 * @return InOrderIterator
	 */
	public InOrderIterator getInOrderIterator() {
		if (inOrderIterator == null) {
			inOrderIterator = createInOrderIterator();
		}
		return inOrderIterator;
	}

	/**
	 * Lazy creates iterator if not exists, otherwise get existing instance.
	 *
	 * @return PostOrderIterator
	 */
	public PostOrderIterator getPostOrderIterator() {
		if (postOrderIterator == null) {
			postOrderIterator = createPostOrderIterator();
		}
		return postOrderIterator;
	}
}
