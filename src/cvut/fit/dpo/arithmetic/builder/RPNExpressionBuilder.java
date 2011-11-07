package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.AddOperator;
import cvut.fit.dpo.arithmetic.ArithmeticExpression;
import cvut.fit.dpo.arithmetic.NumericOperand;
import cvut.fit.dpo.arithmetic.Operand;
import cvut.fit.dpo.arithmetic.SubstractOperator;
import java.util.Stack;

/**
 * Concrete arithmetic expressions builder for RPN.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class RPNExpressionBuilder extends ExpressionBuilder {

	private Stack<Operand> stack = new Stack<Operand>();

	@Override
	public void buildNumericOperand(Integer number) {
		stack.push(new NumericOperand(number));
	}

	@Override
	public void buildSubstractOperator() {
		Operand right = stack.pop();
		Operand left = stack.pop();
		stack.push(new SubstractOperator(left, right));
	}

	@Override
	public void buildAddOperator() {
		Operand right = stack.pop();
		Operand left = stack.pop();
		stack.push(new AddOperator(left, right));
	}

	@Override
	public ArithmeticExpression getExpression() {
		if (stack.size() != 1) {
			throw new IllegalArgumentException("Invalid RPN expression");
		}
		return new ArithmeticExpression(stack.pop());
	}
	
}
