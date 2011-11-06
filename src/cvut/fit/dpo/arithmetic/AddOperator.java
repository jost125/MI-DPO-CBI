package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents + operation
 * 
 * @author Jan Kurš
 * 
 */
public class AddOperator extends BinaryOperator
{

	public AddOperator(Operand firstOperand, Operand secondOperand)
	{
		super(firstOperand, secondOperand);
	}

	@Override
	protected Integer evaluate(Integer val1, Integer val2)
	{
		return val1 + val2;
	}

	@Override
	public InOrderIterator createInOrderIterator() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public PostOrderIterator createPostIterator() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
