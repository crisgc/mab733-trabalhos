/*
 * INMETRO 2012
 */
package br.ufrj.ppgi.business;

import java.math.BigInteger;

/**
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public interface INumberToWords {

    public String convert(BigInteger number);

}
