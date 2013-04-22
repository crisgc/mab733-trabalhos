/*
 * INMETRO 2012
 */
package br.ufrj.ppgi.business;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;

import localhost.soap.server.ServerStub;
import localhost.soap.server.ServerStub.Fatorial;
import localhost.soap.server.ServerStub.FatorialResponse;

import org.apache.axis2.AxisFault;

import br.ufrj.ppgi.business.remote.CalculatorWSStub;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.Add;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.AddResponse;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.Divide;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.DivideResponse;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.Multiply;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.MultiplyResponse;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.Subtract;
import br.ufrj.ppgi.business.remote.CalculatorWSStub.SubtractResponse;

/**
 * Operações matemáticas utilizando o webservice
 *
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public class RemoteMathOperations implements IMathOperations {

	@Override
	public BigDecimal sum(BigDecimal a, BigDecimal b) {
		BigDecimal result = null;
		try {
			CalculatorWSStub stub = new CalculatorWSStub();
			Add request = new Add();
			request.setI(a);
			request.setJ(b);
			AddResponse response = stub.add(request);
			result = response.get_return();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public BigDecimal minus(BigDecimal a, BigDecimal b) {
		BigDecimal result = null;
		try {
			CalculatorWSStub stub = new CalculatorWSStub();
			Subtract request = new Subtract();
			request.setArg0(a);
			request.setArg1(b);
			SubtractResponse response = stub.subtract(request);
			result = response.get_return();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public BigDecimal multiply(BigDecimal a, BigDecimal b) {
		BigDecimal result = null;
		try {
			CalculatorWSStub stub = new CalculatorWSStub();
			Multiply request = new Multiply();
			request.setArg0(a);
			request.setArg1(b);
			MultiplyResponse response = stub.multiply(request);
			result = response.get_return();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public BigDecimal divide(BigDecimal a, BigDecimal b) {
		BigDecimal result = null;
		try {
			CalculatorWSStub stub = new CalculatorWSStub();
			Divide request = new Divide();
			request.setArg0(a);
			request.setArg1(b);
			DivideResponse response = stub.divide(request);
			result = response.get_return();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public BigInteger fatorial(BigInteger number) {
		BigInteger result = null;
		ServerStub stub;
		try {
			stub = new ServerStub();
			Fatorial request = new Fatorial();
			request.setNumber(number.intValue());
			FatorialResponse response = stub.fatorial(request);
			result = BigInteger.valueOf(response.get_return());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
