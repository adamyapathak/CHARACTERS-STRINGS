import javax.swing.JOptionPane;
public class PayCheckCalculator {
    public static void main(String[] args){
        String stringHours;
        int hours;
        Integer integerHours;
        final double PAY_RATE = 50;
        stringHours = JOptionPane.showInputDialog(null, " How many hours did you work this week?");
        integerHours = Integer.valueOf(stringHours);
        hours = integerHours.intValue();
        JOptionPane.showMessageDialog(null, " You worked " + hours + " hours at $ " + PAY_RATE + " per hour " + " \nThat's $ " + 
        (hours * PAY_RATE));
        //You can customize this code as your own PAY_RATE and dialog box message etc..
        
    }
    
}
