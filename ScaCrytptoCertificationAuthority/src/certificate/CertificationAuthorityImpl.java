/*
 * UFRJ PPGI 2013
 */
package certificate;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import localhost.soap.server.ServerStub;
import localhost.soap.server.ServerStub.GetPriKeyExponent;
import localhost.soap.server.ServerStub.GetPriKeyExponentResponse;
import localhost.soap.server.ServerStub.GetPubKeyExponent;
import localhost.soap.server.ServerStub.GetPubKeyExponentResponse;
import localhost.soap.server.ServerStub.GetPubKeyModulo;
import localhost.soap.server.ServerStub.GetPubKeyModuloResponse;

/**
 * Classe que implementa o Certification Authority a partir do acesso a um web 
 * service externo.
 * 
 * @author Cristiano Castro
 *
 */
public class CertificationAuthorityImpl implements ICertificationAuthority {

	@Override
	public String getPublicKeyExponent(String id) {
		ServerStub stub = null;
		try {
			stub = new ServerStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GetPubKeyExponent param = new GetPubKeyExponent();
		param.setId(id);
		GetPubKeyExponentResponse response = null;
		try {
			response = stub.getPubKeyExponent(param);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result = response.get_return();
		return result;
	}

	@Override
	public String getPrivateKeyExponent(String id) {
		ServerStub stub = null;
		try {
			stub = new ServerStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GetPriKeyExponent param = new GetPriKeyExponent();
		param.setId(id);
		GetPriKeyExponentResponse response = null;
		try {
			response = stub.getPriKeyExponent(param);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		String result = response.get_return();
		return result;
	}

	@Override
	public String getModulo(String id) {
		ServerStub stub = null;
		try {
			stub = new ServerStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GetPubKeyModulo param = new GetPubKeyModulo();
		param.setId(id);
		GetPubKeyModuloResponse response = null;
		try {
			response = stub.getPubKeyModulo(param);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result = response.get_return();
		return result;
	}

}
