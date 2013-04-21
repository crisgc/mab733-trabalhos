/*
 * INMETRO 2012
 */
package br.ufrj.ppgi.business;

/**
 * Operações matemáticas utilizando o webservice
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public class RemoteMathOperations implements IMathOperations {

    @Override
    public float sum(float a, float b) {
        return RemoteMathOperations.add(a, b);
    }

    @Override
    public float minus(float a, float b) {
        return RemoteMathOperations.subtract(a, b);
    }

    @Override
    public float multiply(float a, float b) {
        return RemoteMathOperations.multiply_1(a, b);
    }

    @Override
    public float divide(float a, float b) {
        return RemoteMathOperations.divide_1(a, b);
    }

    private static float add(float i, float j) {
        org.me.calculator.CalculatorWS_Service service = new
          org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

    private static float subtract(float arg0, float arg1) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.subtract(arg0, arg1);
    }

    private static float multiply_1(float arg0, float arg1) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.multiply(arg0, arg1);
    }

    private static float divide_1(float arg0, float arg1) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.divide(arg0, arg1);
    }

}
