/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cvut.fit.dpo.arithmetic.iterator.states;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public enum BinaryIteratorState {
	OPENED,
	IN_LEFT_OPERAND,
	IN_RIGHT_OPERAND,
	CLOSED,
}