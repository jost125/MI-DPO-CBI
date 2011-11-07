package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.ArithmeticExpression;

/**
 * Abstract builder of arithmetic expression.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class ExpressionBuilder {
	abstract public void buildNumericOperand(Integer number);
	abstract public void buildSubstractOperator();
	abstract public void buildAddOperator();
	abstract public ArithmeticExpression getExpression();
}
