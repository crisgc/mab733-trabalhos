/*
 * INMETRO 2012
 */
package br.ufrj.ppgi;

import br.ufrj.ppgi.view.CalculatorGui;
import javax.swing.JFrame;

/**
 * Classe principal da calculadora
 * @author Cristiano Gurgel de Castro <cgcastro@inmetro.gov.br>
 */
public class App {
	
    public static void main(String[] args) {
        CalculatorGui calc = new CalculatorGui();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
