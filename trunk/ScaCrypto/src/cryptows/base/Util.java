package cryptows.base;

import java.math.BigInteger;

public class Util
{
    public static StringBuffer rsaEncryptToDecimal(StringBuffer e, StringBuffer N, StringBuffer sbPlainText)
    {
        try
        {
            AsciiTable asciiTable = new AsciiTable();
    
            StringBuffer binaryPlainText = asciiTable.stringToBinary(sbPlainText);
            StringBuffer decimalPlainText = binaryToDecimal(binaryPlainText);
    
            BigInteger biE = new BigInteger(e.toString());
            BigInteger biN = new BigInteger(N.toString());
            
            BigInteger biPlainText = new BigInteger(decimalPlainText.toString());
            BigInteger biCipherText = rsaEncrypt(biE, biN, biPlainText);
            
            StringBuffer decimalCipherText = new StringBuffer(biCipherText.toString());
            
            return decimalCipherText;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer rsaDecryptFromDecimal(StringBuffer d, StringBuffer N, StringBuffer decimalCipherText)
    {
        try
        {
            BigInteger biPlainText = new BigInteger(decimalCipherText.toString());
            BigInteger biD = new BigInteger(d.toString());
            BigInteger biN = new BigInteger(N.toString());
            
            BigInteger biCipherText = rsaDecrypt(biD, biN, biPlainText);
            
            StringBuffer decimalPlainText = new StringBuffer(biCipherText.toString());
            StringBuffer binaryPlainText = decimalToBinary(decimalPlainText);
    
            AsciiTable asciiTable = new AsciiTable();
            StringBuffer sbPlainText = asciiTable.binaryToString(binaryPlainText);
    
            return sbPlainText;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static BigInteger rsaEncrypt(BigInteger e, BigInteger N, BigInteger plainText)
    {
        try
        {
            BigInteger cipherText = plainText.modPow(e, N);
            return cipherText;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static BigInteger rsaDecrypt(BigInteger d, BigInteger N, BigInteger cipherText)
    {
        try
        {
            BigInteger plainText = cipherText.modPow(d, N);
            return plainText;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer binaryToDecimal(StringBuffer binary)
    {
        try
        {
            BigInteger decimal = new BigInteger("0");
            BigInteger DOIS = new BigInteger("2");
            int length = binary.length();
            for(int i = (length-1); i >= 0; i--)
            {
                int expoente = length - 1 - i;
                if(binary.charAt(i) == '1')
                {
                    BigInteger valor = DOIS.pow(expoente);
                    decimal = decimal.add(valor);
                }
            }
            return new StringBuffer(decimal.toString());
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer decimalToBinary(StringBuffer decimal)
    {
        try
        {
            BigInteger biDecimal = new BigInteger(decimal.toString());
            StringBuffer binary = new StringBuffer("");
            BigInteger biZERO = new BigInteger("0");
            BigInteger biUM = new BigInteger("1");
            BigInteger biDOIS = new BigInteger("2");
            BigInteger resto = new BigInteger("0");
            BigInteger quociente = new BigInteger(biDecimal.toString());
            int cont = 0;
            while(quociente.compareTo(biZERO) != 0)
            {
                quociente = biDecimal.divide(biDOIS);
                resto = biDecimal.remainder(biDOIS);
                if(resto.compareTo(biZERO) == 0)
                {
                    binary = binary.insert(0, "0");
                }
                if(resto.compareTo(biUM) == 0)
                {
                    binary = binary.insert(0, "1");
                }
                biDecimal = new BigInteger(quociente.toString());
                cont++;
                if(cont == 1000)
                {
                    break;
                }
            }
            return binary;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer binaryToHexadecimal(StringBuffer binary)
    {
        try
        {
            StringBuffer result = new StringBuffer("");
            if(binary != null && binary.length() > 0)
            {
                int length = binary.length();
                if(length%4 == 1) binary = binary.insert(0, "000");
                else if(length%4 == 2) binary = binary.insert(0, "00");
                else if(length%4 == 3) binary = binary.insert(0, "0");
                for(int i = 0; i < length; i += 4)
                {
                    String strBin = binary.substring(i, i+4);
                    StringBuffer hexa = binToHexaOnlyOne(strBin);
                    result = result.append(hexa);
                }
            }
            return result;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer hexadecimalToBinary(StringBuffer hexadecimal)
    {
        try
        {
            StringBuffer binary = new StringBuffer("");
            if(hexadecimal != null && hexadecimal.length() > 0)
            {
                int len = hexadecimal.length();
                for(int i = 0; i < len; i++)
                {
                    char hexa = hexadecimal.charAt(i);
                    StringBuffer bin = hexaToBinOnlyOne(hexa);
                    binary = binary.append(bin);
                }
            }
            return binary;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer decimalToHexadecimal(StringBuffer decimal)
    {
        try
        {
            StringBuffer binary = decimalToBinary(decimal);
            StringBuffer hexadecimal = binaryToHexadecimal(binary);
            return hexadecimal;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer hexadecimalToDecimal(StringBuffer hexadecimal)
    {
        try
        {
            StringBuffer binary = decimalToBinary(hexadecimal);
            StringBuffer decimal = binaryToDecimal(binary);
            return decimal;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer hexaToBinOnlyOne(char hexa)
    {
        try
        {
            StringBuffer binary = new StringBuffer("");
            if(hexa == '0') binary = new StringBuffer("0000");
            else if(hexa == '1') binary = new StringBuffer("0001");
            else if(hexa == '2') binary = new StringBuffer("0010");
            else if(hexa == '3') binary = new StringBuffer("0011");
            else if(hexa == '4') binary = new StringBuffer("0100");
            else if(hexa == '5') binary = new StringBuffer("0101");
            else if(hexa == '6') binary = new StringBuffer("0110");
            else if(hexa == '7') binary = new StringBuffer("0111");
            else if(hexa == '8') binary = new StringBuffer("1000");
            else if(hexa == '9') binary = new StringBuffer("1001");
            else if(hexa == 'a' || hexa == 'A') binary = new StringBuffer("1010");
            else if(hexa == 'b' || hexa == 'B') binary = new StringBuffer("1011");
            else if(hexa == 'c' || hexa == 'C') binary = new StringBuffer("1100");
            else if(hexa == 'd' || hexa == 'D') binary = new StringBuffer("1101");
            else if(hexa == 'e' || hexa == 'E') binary = new StringBuffer("1110");
            else if(hexa == 'f' || hexa == 'F') binary = new StringBuffer("1111");
            return binary;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    
    public static StringBuffer binToHexaOnlyOne(String bin)
    {
        try
        {
            if(bin == null) return null;
            StringBuffer hexa = new StringBuffer("");
            
            int length = bin.length();
            if(length%4 == 1) bin = "000" + bin;
            else if(length%4 == 2) bin = "00" + bin;
            else if(length%4 == 3) bin = "0" + bin;
            
            if(bin.equals("0000")) hexa = new StringBuffer("0");
            else if(bin.equals("0001")) hexa = new StringBuffer("1");
            else if(bin.equals("0010")) hexa = new StringBuffer("2");
            else if(bin.equals("0011")) hexa = new StringBuffer("3");
            else if(bin.equals("0100")) hexa = new StringBuffer("4");
            else if(bin.equals("0101")) hexa = new StringBuffer("5");
            else if(bin.equals("0110")) hexa = new StringBuffer("6");
            else if(bin.equals("0111")) hexa = new StringBuffer("7");
            else if(bin.equals("1000")) hexa = new StringBuffer("8");
            else if(bin.equals("1001")) hexa = new StringBuffer("9");
            else if(bin.equals("1010")) hexa = new StringBuffer("a");
            else if(bin.equals("1011")) hexa = new StringBuffer("b");
            else if(bin.equals("1100")) hexa = new StringBuffer("c");
            else if(bin.equals("1101")) hexa = new StringBuffer("d");
            else if(bin.equals("1110")) hexa = new StringBuffer("e");
            else if(bin.equals("1111")) hexa = new StringBuffer("f");
            return hexa;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
}
