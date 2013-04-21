package br.ufrj.ppgi.business;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MathOperations implements IMathOperations {

	@Override
	public BigDecimal sum(BigDecimal a, BigDecimal b) {		
		return a.add(b);
	}

	@Override
	public BigDecimal minus(BigDecimal a, BigDecimal b) {
		return a.subtract(b);
	}

	@Override
	public BigDecimal multiply(BigDecimal a, BigDecimal b) {
		return a.multiply(b);
	}

	@Override
	public BigDecimal divide(BigDecimal a, BigDecimal b) {
		return a.divide(b);
	}
	
	@Override
	public BigInteger fatorial(BigInteger number) {		
		return null;
	}



}
