/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    private Calc calc;

    @Before
    public void setUp() {
        calc = new Calc();
    }

    @Test
    public void testButton0ActionPerformed() {
        calc.jButton30.doClick();
        assertEquals("0", calc.casillaResultados.getText());
    }

    @Test
    public void testButton1ActionPerformed() {
        calc.jButton26.doClick();
        assertEquals("1", calc.casillaResultados.getText());
    }

    @Test
    public void testButton2ActionPerformed() {
        calc.jButton23.doClick();
        assertEquals("2", calc.casillaResultados.getText());
    }

    @Test
    public void testButton3ActionPerformed() {
        calc.jButton24.doClick();
        assertEquals("3", calc.casillaResultados.getText());
    }

    @Test
    public void testButton4ActionPerformed() {
        calc.jButton22.doClick();
        assertEquals("4", calc.casillaResultados.getText());
    }

    @Test
    public void testButton5ActionPerformed() {
        calc.jButton19.doClick();
        assertEquals("5", calc.casillaResultados.getText());
    }

    @Test
    public void testButton6ActionPerformed() {
        calc.jButton20.doClick();
        assertEquals("6", calc.casillaResultados.getText());
    }

    @Test
    public void testButton7ActionPerformed() {
        calc.jButton18.doClick();
        assertEquals("7", calc.casillaResultados.getText());
    }

    @Test
    public void testButton8ActionPerformed() {
        calc.jButton15.doClick();
        assertEquals("8", calc.casillaResultados.getText());
    }

    @Test
    public void testButton9ActionPerformed() {
        calc.jButton16.doClick();
        assertEquals("9", calc.casillaResultados.getText());
    }

    @Test
    public void testButtonClearActionPerformed() {
        calc.jButton3.doClick();
        assertEquals("", calc.casillaResultados.getText());
    }
    
    @Test
    public void testButtonAdditionActionPerformed() {
        calc.jButton17.doClick(); // Botón de suma
        assertEquals("", calc.casillaResultados.getText());
        calc.casillaResultados.setText("10");
        calc.jButton16.doClick(); // Botón 9
        calc.jButton29.doClick(); // Botón de igual
        assertEquals("19", calc.casillaResultados.getText());
    }

    @Test
    public void testButtonSubtractionActionPerformed() {
        calc.jButton14.doClick(); // Botón de resta
        assertEquals("", calc.casillaResultados.getText());
        calc.casillaResultados.setText("10");
        calc.jButton16.doClick(); // Botón 9
        calc.jButton29.doClick(); // Botón de igual
        assertEquals("1", calc.casillaResultados.getText());
    }

    @Test
    public void testButtonMultiplicationActionPerformed() {
        calc.jButton13.doClick(); // Botón de multiplicación
        assertEquals("", calc.casillaResultados.getText());
        calc.casillaResultados.setText("10");
        calc.jButton16.doClick(); // Botón 9
        calc.jButton29.doClick(); // Botón de igual
        assertEquals("90", calc.casillaResultados.getText());
    }

    @Test
    public void testButtonDivisionActionPerformed() {
        calc.jButton12.doClick(); // Botón de división
        assertEquals("", calc.casillaResultados.getText());
        calc.casillaResultados.setText("10");
        calc.jButton16.doClick(); // Botón 9
        calc.jButton29.doClick(); // Botón de igual
        assertEquals("1.1111112", calc.casillaResultados.getText()); // Redondeado para mostrar solo 7 decimales
    }

    @Test
    public void testButtonDecimalPointActionPerformed() {
        calc.casillaResultados.setText("10");
        calc.jButton28.doClick(); // Botón de punto decimal
        assertEquals("10.", calc.casillaResultados.getText());
        calc.jButton19.doClick(); // Botón 5
        assertEquals("10.5", calc.casillaResultados.getText());
    }

    /**
     * Test of main method, of class Calc.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calc.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
