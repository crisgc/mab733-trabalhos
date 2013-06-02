package cryptows;

import java.rmi.RemoteException;

import org.osoa.sca.annotations.Reference;

public class CryptographyServiceImpl implements ICryptographyService
{
	
	
	private ICryptographyService refCrytptography;
	
	@Reference
	public void setRefCrytptography(ICryptographyService refCrytptography) {
		this.refCrytptography = refCrytptography;
	}
	
    public String rsaEncryptToDecimal(String e, String N, String stringPlainText)
    {
    	String result = null;
        try {
			result = this.refCrytptography.rsaEncryptToDecimal(e, N, stringPlainText);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	return result;
    }
    
    public String rsaDecryptFromDecimal(String d, String N, String decimalCipherText)
    {
    	String result = null;
        try {
			result = this.refCrytptography.rsaDecryptFromDecimal(d, N, decimalCipherText);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return result;
    }
}
