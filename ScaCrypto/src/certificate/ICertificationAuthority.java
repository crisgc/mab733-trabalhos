/*
 * PPGI UFRJ 2013
 */
package certificate;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface que define as opera��es de uma autoridade certificadora
 * 
 * @author Cristiano Castro
 */
public interface ICertificationAuthority extends Remote {
	
	/**
	 * Retorna a chave p�blica de um usu�rio identificado por ID
	 * 
	 * @param id a identifica��o do usu�rio
	 * @return a chave p�blica do usu�rio
	 */
	public String getPublicKeyExponent(String id) throws RemoteException ;
	
	/**
	 * Retorna a chave privada do usu�rio a partir da identifica��o 
	 * @param id
	 * @return
	 */
	public String getPrivateKeyExponent(String id) throws RemoteException ;
	
	/**
	 * Captura o M�dulo
	 * @param id
	 * @return
	 */
	public String getModulo(String id) throws RemoteException;
	
}
