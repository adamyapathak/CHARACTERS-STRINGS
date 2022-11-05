import javax.swing.*;
public class NumberInput {
    public static void main(String[] args){
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 12;
        inputString = JOptionPane.showInputDialog(null, " Enter a number ");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber+ " * " + FACTOR + " = " + result);
        // * You can change final int FACTORs number as you want to get different outputs
    }
    
}
