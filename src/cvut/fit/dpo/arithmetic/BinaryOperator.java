package cvut.fit.dpo.arithmetic;

/**
 * Represents the Binary operations like + - etc.
 *
 * It the "Composite" from Composite pattern.
 * 
 * @author Jan Kurš
 *
 */
public abstract class BinaryOperator extends Operand {

	private Operand firstOperand;
	private Operand secondOperand;

	/**
	 * @param Integer val1
	 * @param Integer val2
	 * @return Integer
	 */
	protected abstract Integer evaluate(Integer val1, Integer val2);

	public BinaryOperator(Operand firstOperand, Operand secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}

	/**
	 * @return Operand
	 */
	public Operand getFirstOperand() {
		return firstOperand;
	}

	/**
	 * @return Operand
	 */
	public Operand getSecondOperand() {
		return secondOperand;
	}

	/**
	 * @return Integer
	 */
	@Override
	public Integer evaluate() {
		return evaluate(firstOperand.evaluate(), secondOperand.evaluate());
	}
}
