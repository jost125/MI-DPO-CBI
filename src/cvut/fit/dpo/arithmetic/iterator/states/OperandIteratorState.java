/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cvut.fit.dpo.arithmetic.iterator.states;

/**
 * During iteration through node (operand) is needed to kept state.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public enum OperandIteratorState {
	OPENED,					// I've just visited Operand
	IN_LEFT_OPERAND,		// The operator type is binnary and I am visitng left operand.
	IN_RIGHT_OPERAND,		// The operator type is binnary and I am visitng right operand.
	CLOSED,					// I've iterated through all elements.
}
