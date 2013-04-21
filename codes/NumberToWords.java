/*
 * INMETRO 2012
 */
package br.ufrj.ppgi.business;

import java.math.BigInteger;

/**
 * Classe de utilização do WebService para tranformar um número em inglês
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public class NumberToWords implements INumberToWords {


  @Override
  public String convert(int number) {
    String words = NumberToWords.numberToWords_1(BigInteger.valueOf(number));
    return words;
  }

private static String numberToWords_1(java.math.BigInteger ubiNum) {
    com.dataaccess.webservicesserver.NumberConversion service = 
      new com.dataaccess.webservicesserver.NumberConversion();
    com.dataaccess.webservicesserver.NumberConversionSoapType port =
      service.getNumberConversionSoap();
    return port.numberToWords(ubiNum);
}

}
