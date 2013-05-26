/*
 * PPGI UFRJ 2013
 */
package certificate;

/**
 * Interface que define as opera��es de uma autoridade certificadora
 * 
 * @author Cristiano Castro
 */
public interface ICertificationAuthority {
	
	/**
	 * Retorna a chave p�blica de um usu�rio identificado por ID
	 * 
	 * @param id a identifica��o do usu�rio
	 * @return a chave p�blica do usu�rio
	 */
	public String getPublicKeyExponent(String id);
	
	/**
	 * Retorna a chave privada do usu�rio a partir da identifica��o 
	 * @param id
	 * @return
	 */
	public String getPrivateKeyExponent(String id);
	
	/**
	 * Captura o M�dulo
	 * @param id
	 * @return
	 */
	public String getModulo(String id);
	
}
