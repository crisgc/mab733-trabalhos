/*
 * PPGI UFRJ 2013
 */
package certificate;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface que define as operações de uma autoridade certificadora
 * 
 * @author Cristiano Castro
 */
public interface ICertificationAuthority extends Remote {
	
	/**
	 * Retorna a chave pública de um usuário identificado por ID
	 * 
	 * @param id a identificação do usuário
	 * @return a chave pública do usuário
	 */
	public String getPublicKeyExponent(String id) throws RemoteException ;
	
	/**
	 * Retorna a chave privada do usuário a partir da identificação 
	 * @param id
	 * @return
	 */
	public String getPrivateKeyExponent(String id) throws RemoteException ;
	
	/**
	 * Captura o Módulo
	 * @param id
	 * @return
	 */
	public String getModulo(String id) throws RemoteException;
	
}
