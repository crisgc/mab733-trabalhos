package br.ufrj.ppgi.business;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IMathOperations {

	/**
	 * Soma um float com outro
	 * @param a Dividento
	 * @param b
	 * @return
	 */
	public BigDecimal sum(BigDecimal a, BigDecimal b);

	/**
	 * Subtrai um float de outro
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal minus(BigDecimal a, BigDecimal b);

	/**
	 * Multiplica um float pelo outro
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal multiply(BigDecimal a, BigDecimal b);

	/**
	 * Divide um número por outro
	 * @param a
	 * @param b
	 * @return
	 */
	public BigDecimal divide(BigDecimal a, BigDecimal b);
	
	/**
	 * Calcula o Fatorial
	 * @param number
	 * @return
	 */
	public BigInteger fatorial(BigInteger number);

}
