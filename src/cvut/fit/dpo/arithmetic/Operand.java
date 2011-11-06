package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

abstract public class Operand {

	private InOrderIterator inOrderIterator = null;
	private PostOrderIterator postOrderIterator = null;

	abstract protected InOrderIterator createInOrderIterator();
	abstract protected PostOrderIterator createPostOrderIterator();

	public InOrderIterator getInOrderIterator() {
		if (inOrderIterator == null) {
			inOrderIterator = createInOrderIterator();
		}
		return inOrderIterator;
	}

	public PostOrderIterator getPostOrderIterator() {
		if (postOrderIterator == null) {
			postOrderIterator = createPostOrderIterator();
		}
		return postOrderIterator;
	}
}
