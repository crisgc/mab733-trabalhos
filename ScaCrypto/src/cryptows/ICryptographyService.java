/*
 * PPGI UFRJ 2013
 */
package cryptows;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.osoa.sca.annotations.Remotable;


/**
 * Serviço de criptografia
 * @author Cristiano Castro
 */
@Remotable
public interface ICryptographyService extends Remote {
	
	/**
	 * Encriptação RSA
	 * @param e
	 * @param N
	 * @param stringPlainText
	 * @return
	 */
	public String rsaEncryptToDecimal(String e, String N, String stringPlainText) throws RemoteException;
	
	/**
	 * Decriptografia RSA
	 * @param d
	 * @param N
	 * @param decimalCipherText
	 * @return
	 */
	public String rsaDecryptFromDecimal(String d, String N, String decimalCipherText) throws RemoteException;

}
