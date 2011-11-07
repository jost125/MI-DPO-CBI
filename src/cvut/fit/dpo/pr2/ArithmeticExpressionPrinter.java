package cvut.fit.dpo.pr2;

import cvut.fit.dpo.arithmetic.AddOperator;
import cvut.fit.dpo.arithmetic.ArithmeticExpression;
import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.NumericOperand;
import cvut.fit.dpo.arithmetic.SubstractOperator;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import java.util.Iterator;

/**
 * Printer for {@link ArithmeticExpression}s. It can print
 * 	inOrder notation (3 + 1) or postOrder notation (3 1 +).
 * 
 * PostOrder is RPN (Reverse Polish Notation) in fact. See
 * 	wiki for more information.
 * 
 * @author Jan Kurš
 *
 */
public class ArithmeticExpressionPrinter {

	private ArithmeticExpression expression;

	public ArithmeticExpressionPrinter(ArithmeticExpression expression) {
		this.expression = expression;
	}

	/**
	 * Print an expression in classical notation, e.g. (3+1).
	 * 
	 * The "(" and ")" is used to preserve priorities.
	 * 
	 * @return String in classical "inOrder" format.
	 */
	public String printInOrder() {

		StringBuilder sb = new StringBuilder();
		for (Iterator<ExpressionElement> it = expression.getInOrderIterator(); it.hasNext();) {
			sb.append(it.next().stringValue());
		}

		return sb.toString();
	}

	/**
	 * Print an expression in RPN notation, e.g. 3 1 +.
	 *
	 * Please note, the "(" and ")" is no longer necessary, because
	 * 	RPN does not need them :)
	 * 
	 * @return string in "postOrder" (RPN) format.
	 */
	public String printPostOrder() {
		StringBuilder sb = new StringBuilder();
		for (Iterator<ExpressionElement> it = expression.getPostOrderIterator(); it.hasNext();) {
			sb.append(it.next().stringValue());
			if (it.hasNext()) {
				sb.append(" ");
			}
		}

		return sb.toString();
	}
}
