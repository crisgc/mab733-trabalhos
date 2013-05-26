package launch;

import org.apache.tuscany.sca.host.embedded.SCADomain;

import cryptoclient.CryptoClient;

public class Launch {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting ...");
        SCADomain scaDomain = SCADomain.newInstance("crypto.composite");
        CryptoClient client = scaDomain.getService(CryptoClient.class, "crypto"); 
        
        System.out.println("crypto.composite ready for big business !!!");
        String id = "111";
        String originalMessage = "antonio lacerda junior";
        
        System.out.println("--------------------------------------------------");
        System.out.println("Original Message = " + originalMessage);
        
        String decimalCipherText = client.encryptToDecimal(id, originalMessage);
        System.out.println("Decimal cipher text = " + decimalCipherText);
        
        String plainText1 = client.decryptFromDecimal(id, decimalCipherText.toString());
        System.out.println("Plain text from decimal = " + plainText1);
        System.out.println("--------------------------------------------------");
        System.in.read();
        System.out.println("Stopping ...");
        scaDomain.close();
        System.out.println();
    }
}
