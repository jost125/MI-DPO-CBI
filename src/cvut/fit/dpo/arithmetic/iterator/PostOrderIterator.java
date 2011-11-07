package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.Operand;
import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

/**
 * Abstract iterator, which can iterate through whole tree on Operand and
 * returns expression elements with post order notation.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class PostOrderIterator implements Iterator<ExpressionElement> {

	protected Operand operand;

	public PostOrderIterator(Operand operand) {
		this.operand = operand;
	}
}
