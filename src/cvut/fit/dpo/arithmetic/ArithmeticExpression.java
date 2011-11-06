package cvut.fit.dpo.arithmetic;

import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

public class ArithmeticExpression
{
	private Operand root;
	
	public Integer evaluate()
	{
		return root.evaluate();
	}
	
	public void setRoot(Operand root)
	{
		this.root = root;
	}

	/**
	 * {@link #root} field getter.
	 * 
	 * @deprecated Do not provide access to the inner representation
	 */
	public Operand getRoot()
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Should be implemented.
	 * 
	 * @return
	 */
	public Iterator<ExpressionElement> getInOrderIterator()
	{
		return this.root.getInOrderIterator();
	}

	/**
	 * Should be implemented
	 * 
	 * TODO
	 * 
	 * @return
	 */
	public Iterator<ExpressionElement> getPostOrderIterator()
	{
		return this.root.getPostOrderIterator();
	}

}
