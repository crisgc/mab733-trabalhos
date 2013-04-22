package br.ufrj.ppgi;

import java.math.BigInteger;
import java.rmi.RemoteException;

import localhost.soap.server.ServerStub;
import localhost.soap.server.ServerStub.Hello;
import localhost.soap.server.ServerStub.HelloResponse;

import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.UnsignedLong;

import com.dataaccess.www.webservicesserver.NumberConversionStub;
import com.dataaccess.www.webservicesserver.NumberConversionStub.NumberToWords;
import com.dataaccess.www.webservicesserver.NumberConversionStub.NumberToWordsResponse;

import br.ufrj.ppgi.ConverterStub.CelsiusToFarenheit;

public class ConverterClient {

  public static void main(String[] args) {
    try {
      float celsiusValue = 100;
      ConverterStub stub = new ConverterStub();
      CelsiusToFarenheit celsius = new CelsiusToFarenheit();
      celsius.setCelsius(celsiusValue);
      br.ufrj.ppgi.ConverterStub.CelsiusToFarenheitResponse resp = stub.celsiusToFarenheit(celsius);
      System.out.println("Celsius : "+celsiusValue+" = "+"Farenheit : "+resp.get_return());

      ServerStub serverStub = new ServerStub();
      Hello hello = new Hello();
      hello.setUsername("Cristiano");
      HelloResponse helloResponse = serverStub.hello(hello);
      System.out.println(helloResponse.get_return());

      NumberConversionStub numberConv = new NumberConversionStub();
      NumberToWords numberToWords = new NumberToWords();
      numberToWords.setUbiNum(new UnsignedLong(new BigInteger("123")));
      NumberToWordsResponse numberResponse = numberConv.numberToWords(numberToWords);
      System.out.println(numberResponse.getNumberToWordsResult());

    } catch (AxisFault e) {
      e.printStackTrace();
    } catch (RemoteException e) {
      e.printStackTrace();
    }

  }
}
