package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public PostOrderIterator createPostIterator() {
		throw new UnsupportedOperationException("Not supported yet.");
	}


}
