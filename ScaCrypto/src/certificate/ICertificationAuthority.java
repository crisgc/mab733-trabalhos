/*
 * PPGI UFRJ 2013
 */
package certificate;

/**
 * Interface que define as operações de uma autoridade certificadora
 * 
 * @author Cristiano Castro
 */
public interface ICertificationAuthority {
	
	/**
	 * Retorna a chave pública de um usuário identificado por ID
	 * 
	 * @param id a identificação do usuário
	 * @return a chave pública do usuário
	 */
	public String getPublicKeyExponent(String id);
	
	/**
	 * Retorna a chave privada do usuário a partir da identificação 
	 * @param id
	 * @return
	 */
	public String getPrivateKeyExponent(String id);
	
	/**
	 * Captura o Módulo
	 * @param id
	 * @return
	 */
	public String getModulo(String id);
	
}
