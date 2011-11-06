package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.NumericInOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.NumericPostOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents number in the arithmetic expression
 * 
 * @author Jan Kurš
 */
public class NumericOperand extends Operand {
	private Integer value;
	
	public NumericOperand(Integer value)
	{
		setValue(value);
	}
	
	public Integer getValue()
	{
		return value;
	}
	
	public void setValue(Integer value)
	{
		this.value = value;
	}

	@Override
	public InOrderIterator createInOrderIterator() {
		return new NumericInOrderIterator(this);
	}

	@Override
	public PostOrderIterator createPostOrderIterator() {
		return new NumericPostOrderIterator(this);
	}

	public Integer evaluate() {
		return value;
	}

}
