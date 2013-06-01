package cryptows.base;

public class Symbol
{
    private String caracter;
    private String binary;
    private String octal;
    private String decimal;
    private String hexa;
    private int    qtd;
    private float  frequency;
    private String substituto;
    
    public Symbol(String decimal, String octal, String hexa, String binary, String caracter)
    {
        super();
        this.caracter = caracter;
        this.binary = binary;
        this.octal = octal;
        this.decimal = decimal;
        this.hexa = hexa;
        this.qtd = 0;
        this.substituto = caracter;
    }
    
    public String getCaracter()
    {
        return this.caracter;
    }
    
    public String getBinary()
    {
        return this.binary;
    }
    
    public String getOctal()
    {
        return this.octal;
    }
    
    public String getDecimal()
    {
        return this.decimal;
    }
    
    public String getHexa()
    {
        return this.hexa;
    }
    
    public int getQtd()
    {
        return this.qtd;
    }
    
    public void setQtd(int qtd)
    {
        this.qtd = qtd;
    }
    
    public void incQtd()
    {
        this.qtd++;
    }
    
    public float getFrequency()
    {
        return this.frequency;
    }
    
    public void setFrequency(float frequency)
    {
        this.frequency = frequency;
    }
    
    public String getSubstituto()
    {
        return this.substituto;
    }
    
    public void setSubstituto(String substituto)
    {
        this.substituto = substituto;
    }
}