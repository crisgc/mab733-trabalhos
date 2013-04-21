package br.ufrj.ppgi.view;

import br.ufrj.ppgi.business.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;
import javax.swing.*;

public class CalculatorGui extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1734238057473495590L;
	/*
     * BOTÕES DE Número
     */
    private JButton jbtNum1 = new JButton("1");
    private JButton jbtNum2 = new JButton("2");
    private JButton jbtNum3 = new JButton("3");
    private JButton jbtNum4 = new JButton("4");
    private JButton jbtNum5 = new JButton("5");
    private JButton jbtNum6 = new JButton("6");
    private JButton jbtNum7 = new JButton("7");
    private JButton jbtNum8 = new JButton("8");
    private JButton jbtNum9 = new JButton("9");
    private JButton jbtNum0 = new JButton("0");
    private JButton[] jbtNum = {jbtNum0, jbtNum1, jbtNum2, jbtNum3, jbtNum4, jbtNum5,
        jbtNum6, jbtNum7, jbtNum8, jbtNum9};

    /*
     * BOTÕES DE OPERAÇÃO
     */
    private JButton jbtAdd = new JButton("+");
    private JButton jbtSubtract = new JButton("-");
    private JButton jbtMultiply = new JButton("*");
    private JButton jbtDivide = new JButton("/");
    private JButton binaryOperators[] = {jbtAdd, jbtSubtract, jbtMultiply,
        jbtDivide};
    
    /*
     * Operadores un�rios
     */
    private JButton jbtSay = new JButton("SAY");
    private JButton jbtFactorial = new JButton("FAT");
    private JButton unaryOperators[] = {jbtFactorial, jbtSay};
    
    private JButton jbtEnter = new JButton("ENTER");
    private JButton jbtClear = new JButton("C");
    /**
     * Modelo do histórico
     */
    private Stack<BigDecimal> stackHistory = new Stack<>();
    /**
     * Campos visuais
     */
    private JTextField jtfResult = new JTextField(20);
    private JTextArea jTextAreaStack = new JTextArea();
    String display = "";
    
    IMathOperations operator = new RemoteMathOperations();

    public CalculatorGui() {
        this.initView();
        this.initController();
    }

    /**
     * Inicializa a visualização do componente
     */
    private void initView() {
        JPanel panelNumber = new JPanel();
        panelNumber.setLayout(new GridLayout(4, 3));
        for (int i = 1; i < this.jbtNum.length; i++) {
        	panelNumber.add(this.jbtNum[i]);
        }
        panelNumber.add(jbtNum0);
        panelNumber.add(jbtClear);


        JPanel panelVisor = new JPanel();
        panelVisor.setLayout(new BorderLayout());
        panelVisor.add(jtfResult, BorderLayout.SOUTH);
        panelVisor.add(new JScrollPane(this.jTextAreaStack),
                BorderLayout.CENTER);
        this.jTextAreaStack.setEditable(false);

        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel panelOperations = new JPanel();
        panelOperations.setLayout(new GridLayout(7, 1));
        panelOperations.add(jbtAdd);
        panelOperations.add(jbtSubtract);
        panelOperations.add(jbtMultiply);
        panelOperations.add(jbtDivide);
        panelOperations.add(this.jbtFactorial);
        panelOperations.add(jbtEnter);
        panelOperations.add(this.jbtSay);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(panelVisor, BorderLayout.CENTER);
        p.add(panelNumber, BorderLayout.SOUTH);
        p.add(panelOperations, BorderLayout.EAST);

        this.add(p);
    }

    /**
     * Imprime o status da pilha no textArea
     */
    protected void printStack() {
        this.jTextAreaStack.setText("");
        int i = 1;
        StringBuilder str = new StringBuilder();
        for (BigDecimal d : this.stackHistory) {
            str.append(i);
            str.append(" : ");
            str.append(d);
            str.append("\n");
            i++;
        }
        this.jTextAreaStack.setText(str.toString());
    }

    /**
     * Inicializa o controle do componente
     */
    private void initController() {
        NumberListener numberListener = new NumberListener();
        for (int i = 0; i < jbtNum.length; i++) {
            jbtNum[i].addActionListener(numberListener);
        }
        BinaryOperatorListener binaryOperatorsListener = new BinaryOperatorListener();
        for (int i = 0; i < this.binaryOperators.length; i++) {
            this.binaryOperators[i].addActionListener(binaryOperatorsListener);
        }
        UnaryOperatorListener unaryListener = new UnaryOperatorListener();
        for (int i = 0 ; i < this.unaryOperators.length; i++) {
        	this.unaryOperators[i].addActionListener(unaryListener);
        }
        jbtEnter.addActionListener(new EnterListener());
    }

    /**
     * Listener para pressionamento de números
     */
    private class NumberListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String newDigit = new String();
            for (int i = 0; i < 10; i++) {
                if (e.getSource().equals(CalculatorGui.this.jbtNum[i])) {
                    newDigit = Integer.toString(i);
                    i = 10; // Fim do loop de busca
                }
            }
            jtfResult.setText(jtfResult.getText() + newDigit);
        }
    }

    /**
     * Listener par operadores binários da calculadora
     */
    private class BinaryOperatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (CalculatorGui.this.stackHistory.size() >= 2) {
                BigDecimal arg1 = CalculatorGui.this.stackHistory.pop();
                BigDecimal arg0 = CalculatorGui.this.stackHistory.pop();
                BigDecimal result = null;
                try {
                    if (e.getSource().equals(CalculatorGui.this.jbtAdd)) {
                        result = operator.sum(arg0, arg1);
                    } else if (e.getSource().equals(CalculatorGui.this.jbtSubtract)) {
                        result = operator.minus(arg0, arg1);
                    } else if (e.getSource().equals(CalculatorGui.this.jbtMultiply)) {
                        result = operator.multiply(arg0, arg1);
                    } else if (e.getSource().equals(CalculatorGui.this.jbtDivide)) {
                        result = operator.divide(arg0, arg1);
                    }
                } catch (Exception ex) { }

                if (result != null) {
                    CalculatorGui.this.stackHistory.push(result);
                } else {
                    CalculatorGui.this.stackHistory.push(arg0);
                    CalculatorGui.this.stackHistory.push(arg1);
                }
                CalculatorGui.this.printStack();
            }
        }
    }

    /**
     * Ouvinte para a entrada de números
     */
    private class EnterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                BigDecimal arg = new BigDecimal(jtfResult.getText());
                CalculatorGui.this.stackHistory.push(arg);
                jtfResult.setText(new String());
                CalculatorGui.this.printStack();
            } catch (Exception ex) {
            }
        }
    }

    /**
     * Operador unário
     */
    private class UnaryOperatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BigDecimal arg = CalculatorGui.this.stackHistory.pop();
            if (e.getSource().equals(CalculatorGui.this.jbtSay)) {
                INumberToWords converter = new RemoteNumberToWords();
                BigInteger intValue = arg.toBigInteger();
                String numberStr = converter.convert(intValue);
                JOptionPane.showMessageDialog(CalculatorGui.this, numberStr);
                CalculatorGui.this.stackHistory.push(arg);
            } else if (e.getSource().equals(CalculatorGui.this.jbtFactorial)) {
            	BigInteger intValue = arg.toBigInteger();
            	BigInteger result = CalculatorGui.this.operator.fatorial(intValue);
            	BigDecimal resultDecimal = new BigDecimal(result);
            	CalculatorGui.this.stackHistory.push(resultDecimal);
            }
            CalculatorGui.this.printStack();
        }

    }
}