package cryptoclient;

import org.osoa.sca.annotations.Reference;

import certificate.ICertificationAuthority;
import cryptows.CryptographyServiceImpl;
import cryptows.ICryptographyService;

public class CryptoClient
{
	/**
	 * Referência para serviços de criptografia
	 */
	private ICryptographyService tools;
	
	/**
	 * Referência para uma autoridade certificadora
	 */
	private ICertificationAuthority certAuthority;

	public ICryptographyService getTools() {
		return tools;
	}

	@Reference
	public void setTools(ICryptographyService ntools) {
		this.tools = ntools;
	}
	
    public ICertificationAuthority getCertAuthority() {
		return certAuthority;
	}

    @Reference
	public void setCertAuthority(ICertificationAuthority certAuthority) {
		this.certAuthority = certAuthority;
	}

	public static void main(String[] args)    
    {
//        SCANodeFactory factory = SCANodeFactory.newInstance();
//        SCANode node = factory.createSCANodeFromClassLoader("crypto.composite", 
//        		CryptoClient.class.getClassLoader());
//        node.start();
//        
//        CryptoClient client = ((SCAClient)node).getService(CryptoClient.class, 
//        		"crypto");        

    	CryptoClient client = new CryptoClient();
    	client.setTools(new CryptographyServiceImpl());
        String id = "111";
        String originalMessage = "antonio lacerda junior";
        
        System.out.println("--------------------------------------------------");
        System.out.println("Original Message = " + originalMessage);
        
        String decimalCipherText = client.encryptToDecimal(id, originalMessage);
        System.out.println("Decimal cipher text = " + decimalCipherText);
        
        String plainText1 = client.decryptFromDecimal(id, decimalCipherText.toString());
        System.out.println("Plain text from decimal = " + plainText1);
        System.out.println("--------------------------------------------------");
//        node.stop();
    }
    
    public String GetPubKeyExponent(String id)
    {
    	String pubKey = this.getCertAuthority().getPublicKeyExponent(id);;
    	return pubKey;
    }
    
    public String GetPriKeyExponent(String id)
    {
    	String priKey = this.getCertAuthority().getPrivateKeyExponent(id);
    	return priKey;
    }
    
    public String GetPubKeyModulo(String id)
    {
    	String modulo = this.getCertAuthority().getModulo(id);
    	return modulo;    	
    }
    
    public String encryptToDecimal(String id, String stringPlainText)
    {
    	String publicKey = this.GetPubKeyExponent(id);
    	String modulo = this.GetPubKeyModulo(id);
    	String result = this.tools.rsaEncryptToDecimal(publicKey, 
    			modulo, 
    			stringPlainText);
    	return result;
    	
    }
    
    public String decryptFromDecimal(String id, String decimalCipherText)
    {
    	String publicKey = this.GetPubKeyExponent(id);
    	String modulo = this.GetPubKeyModulo(id);
    	String result = this.tools.rsaDecryptFromDecimal(publicKey, 
    			modulo, 
    			decimalCipherText);
    	return result;
    }
}
