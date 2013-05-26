/*
 * PPGI UFRJ 2013
 */
package cryptows;


/**
 * Serviço de criptografia
 * @author Cristiano Castro
 */
//@Remotable
public interface ICryptographyService {
	
	/**
	 * Encriptação RSA
	 * @param e
	 * @param N
	 * @param stringPlainText
	 * @return
	 */
	public String rsaEncryptToDecimal(String e, String N, String stringPlainText);
	
	/**
	 * Decriptografia RSA
	 * @param d
	 * @param N
	 * @param decimalCipherText
	 * @return
	 */
	public String rsaDecryptFromDecimal(String d, String N, String decimalCipherText);

}
