package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.SubtractInOrderIterator;

/**
 * Represents - operation
 * 
 * @author Jan Kurš
 */
public class SubstractOperator extends BinaryOperator
{

	public SubstractOperator(Operand firstOperand, Operand secondOperand)
	{
		super(firstOperand, secondOperand);
	}

	@Override
	protected Integer evaluate(Integer val1, Integer val2)
	{
		return val1 - val2;
	}

	@Override
	public InOrderIterator createInOrderIterator() {
		return new SubtractInOrderIterator(this);
	}

	@Override
	public PostOrderIterator createPostOrderIterator() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
