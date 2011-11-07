package cvut.fit.dpo.arithmetic;

import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

public class ArithmeticExpression {

	private Operand root;

	public Integer evaluate() {
		return root.evaluate();
	}

	/**
	 * @param Operand root
	 */
	public ArithmeticExpression(Operand root) {
		this.root = root;
	}

	/**
	 * {@link #root} field getter.
	 * 
	 * @deprecated Do not provide access to the inner representation
	 */
	public Operand getRoot() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return Iterator
	 */
	public Iterator<ExpressionElement> getInOrderIterator() {
		return root.getInOrderIterator();
	}

	/**
	 * @return Iterator
	 */
	public Iterator<ExpressionElement> getPostOrderIterator() {
		return root.getPostOrderIterator();
	}
}
