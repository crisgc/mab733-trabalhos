/*
 * UFRJ - PPGI - 2013
 */
package br.ufrj.ppgi;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public class CalculatorWS {

    /**
     * Operação de serviço web
     */
    public BigDecimal add(BigDecimal i, BigDecimal j) {
        BigDecimal k = i.add(j, MathContext.DECIMAL32);
        return k;
    }

    /**
     * Operação de serviço web
     */
    public BigDecimal subtract(BigDecimal arg0, BigDecimal arg1) {
        BigDecimal result = arg0.subtract(arg1, MathContext.DECIMAL32);
        return result;
    }

    /**
     * Operação de serviço web
     */
    public BigDecimal multiply(BigDecimal arg0, BigDecimal arg1) {
        BigDecimal result = arg0.multiply(arg1, MathContext.DECIMAL32);
        return result;
    }

    /**
     * Operação de serviço web
     */
    public BigDecimal divide(BigDecimal arg0, BigDecimal arg1) {
        BigDecimal result = arg0.divide(arg1, MathContext.DECIMAL32);
        return result;
    }
}

