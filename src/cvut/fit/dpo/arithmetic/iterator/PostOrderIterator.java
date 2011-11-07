package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.Operand;
import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

abstract public class PostOrderIterator implements Iterator<ExpressionElement> {

	protected Operand operand;

	public PostOrderIterator(Operand operand) {
		this.operand = operand;
	}
}
