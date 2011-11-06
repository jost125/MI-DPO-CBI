package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents the Binary operations like + - etc.
 * 
 * @author Jan Kurš
 *
 */
public abstract class BinaryOperator extends Operand
{
	private Operand firstOperand;
	private Operand secondOperand;

	protected abstract Integer evaluate(Integer val1, Integer val2);
	
	public BinaryOperator(Operand firstOperand, Operand secondOperand)
	{
		setFirstOperand(firstOperand);
		setSecondOperand(secondOperand);
	}
	
	void setFirstOperand(Operand o)
	{
		firstOperand = o;
	}
	void setSecondOperand(Operand o)
	{
		secondOperand = o;
	}
	
	public Operand getFirstOperand()
	{
		return firstOperand;
	}
	
	public Operand getSecondOperand()
	{
		return secondOperand;
	}
	
	public Integer evaluate()
	{
		int val1 = getOperandValue(firstOperand);
		int val2 = getOperandValue(secondOperand);
		
		return evaluate(val1, val2);
	}
	
	private Integer getOperandValue(Object o)
	{
		if (o instanceof NumericOperand)
		{
			return ((NumericOperand)o).getValue();
		}
		
		if (o instanceof BinaryOperator)
		{
			return ((BinaryOperator)o).evaluate();
		}
		
		throw new IllegalArgumentException("Unsuported operand type!");
	}

	
}
