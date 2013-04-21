/*
 * INMETRO 2012
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    /**
     * Operacao de servico web
     */
    @WebMethod(operationName = "add")
    public float add(@WebParam(name = "i") float i, 
                     @WebParam(name = "j") float j) {
        float k = i + j;
        return k;
    }

    /**
     * Operacao de serviço web
     */
    @WebMethod(operationName = "subtract")
    public float subtract(@WebParam(name = "arg0") float arg0,
    @WebParam(name = "arg1") float arg1) {
        //TODO write your implementation code here:
        return arg0 - arg1;
    }

    /**
     * Operacao de serviço web
     */
    @WebMethod(operationName = "multiply")
    public float multiply(@WebParam(name = "arg0") float arg0,
    @WebParam(name = "arg1") float arg1) {
        //TODO write your implementation code here:
        float result = arg0 * arg1;
        return result;
    }

    /**
     * Operacao de serviço web
     */
    @WebMethod(operationName = "divide")
    public float divide(@WebParam(name = "arg0") float arg0,
    @WebParam(name = "arg1") float arg1) throws ArithmeticException {
        //TODO write your implementation code here:
        float result = arg0 / arg1;
        return result;
    }
}
