package cryptows;

import cryptows.base.Util;

public class CryptographyServiceImpl implements ICryptographyService
{
    public String rsaEncryptToDecimal(String e, String N, String stringPlainText)
    {
        try
        {
            StringBuffer sbPlainText = new StringBuffer(stringPlainText);            
            StringBuffer sbE = new StringBuffer(e);
            StringBuffer sbN = new StringBuffer(N);
            
            StringBuffer decimalCipherText = Util.rsaEncryptToDecimal(sbE, sbN, sbPlainText);
            return decimalCipherText.toString();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public String rsaDecryptFromDecimal(String d, String N, String decimalCipherText)
    {
        try
        {
            StringBuffer sbDecimalCipherText = new StringBuffer(decimalCipherText);
            StringBuffer sbD = new StringBuffer(d);
            StringBuffer sbN = new StringBuffer(N);
            
            StringBuffer decimalPlainText = Util.rsaDecryptFromDecimal(sbD, sbN, sbDecimalCipherText);
            return decimalPlainText.toString();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
}
