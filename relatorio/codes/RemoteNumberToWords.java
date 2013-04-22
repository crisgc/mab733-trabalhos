/*
 * INMETRO 2012
 */
package br.ufrj.ppgi.business;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.logging.Logger;

import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.UnsignedLong;

import com.dataaccess.www.webservicesserver.NumberConversionStub;
import com.dataaccess.www.webservicesserver.NumberConversionStub.NumberToWords;
import com.dataaccess.www.webservicesserver.NumberConversionStub.NumberToWordsResponse;

/**
 * Classe de utilização do WebService para tranformar um número em inglês
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public class RemoteNumberToWords implements INumberToWords {
  @Override
  public String convert(BigInteger number) {
    String result = null;
    try {
      NumberConversionStub stub = new NumberConversionStub();
      NumberToWords request = new NumberToWords();
      request.setUbiNum(new UnsignedLong(number));
      NumberToWordsResponse response = stub.numberToWords(request);
      result = response.getNumberToWordsResult();
    } catch (AxisFault e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (RemoteException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return result;
  }
}
