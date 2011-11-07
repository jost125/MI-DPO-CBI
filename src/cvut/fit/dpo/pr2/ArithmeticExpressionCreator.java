package cvut.fit.dpo.pr2;

import cvut.fit.dpo.arithmetic.AddOperator;
import cvut.fit.dpo.arithmetic.ArithmeticExpression;
import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.NumericOperand;
import cvut.fit.dpo.arithmetic.Operand;
import cvut.fit.dpo.arithmetic.SubstractOperator;
import java.util.Scanner;
import java.util.Stack;


/**
 * Stupid class which can create some {@link ArithmeticExpression}s.
 * 
 * @author Jan Kurš
 *
 */
public class ArithmeticExpressionCreator
{
	/**
	 * Creates 3 - (1 + 2)
	 * 
	 * This is ugly. I don't like creating expressions in this
	 * 	form. I never know, what expression I have created...
	 */
	public ArithmeticExpression createExpression1()
	{
		NumericOperand op1 = new NumericOperand(1);
		NumericOperand op2 = new NumericOperand(2);
		NumericOperand op3 = new NumericOperand(3);
		
		BinaryOperator o2 = new AddOperator(op1, op2);
		BinaryOperator o1 = new SubstractOperator(op3, o2);
		
		return new ArithmeticExpression(o1);
	}

	/**
	 * Creates (3 - 1) + 2
	 *
	 * This is ugly. I don't like creating expressions in this
	 * 	form. I never know, what expression I have created...
	 */
	public ArithmeticExpression createExpression2()
	{
		
		NumericOperand op1 = new NumericOperand(1);
		NumericOperand op2 = new NumericOperand(2);
		NumericOperand op3 = new NumericOperand(3);
		
		BinaryOperator o1 = new SubstractOperator(op3, op1);
		BinaryOperator o2 = new AddOperator(o1, op2);
		
		return new ArithmeticExpression(o2);
	}
	
	/**
	 * Creates any expression from the RPN input. This is nice and
	 * 	universal. 
	 * 
	 * @see http://en.wikipedia.org/wiki/Reverse_Polish_notation
	 * 	
	 * @param input in Reverse Polish Notation
	 * @return {@link ArithmeticExpression} equivalent to the RPN input.
	 */
	public ArithmeticExpression createExpressionFromRPN(String input)
	{

		if (input.length() == 0) {
			throw new IllegalArgumentException();
		}

		Stack<Operand> stack = new Stack<Operand>();

		for (Scanner scanner = new Scanner(input); scanner.hasNext();) {
			String item = scanner.next();

			Integer integer = this.tryParseInteger(item);
			
			if (integer != null) {
				stack.push(new NumericOperand(integer));

			} else if (item.equals("+")) {
				Operand right = stack.pop();
				Operand left = stack.pop();
				stack.push(new AddOperator(left, right));

			} else if (item.equals("-")) {
				Operand right = stack.pop();
				Operand left = stack.pop();
				stack.push(new SubstractOperator(left, right));

			} else {
				throw new IllegalArgumentException();
			}
		}

		if (stack.size() != 1) {
			throw new IllegalArgumentException();
		}
		return new ArithmeticExpression(stack.pop());
	}

	/**
	 * Java WTF with non existing tryParse on Integer class.
	 *
	 * @param String integer
	 * @return Integer
	 */
	private Integer tryParseInteger(String integer) {
		try {
			return Integer.parseInt(integer);
		} catch (NumberFormatException ex) {
			return null;
		}
	}
}
