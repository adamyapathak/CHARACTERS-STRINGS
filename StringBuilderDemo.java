import javax.swing.JOptionPane;
public class StringBuilderDemo{
    public static void main(String[] args){
        StringBuilder nameString = new StringBuilder(" Adamya ");
        int nameStringCapacity = nameString.capacity();
        System.out.println(" Capacity of nameString is " + nameStringCapacity);
        StringBuilder addressString = null;
        addressString = new StringBuilder(" 101 great lawn dr. ");
        int addStringCapacity = addressString.capacity();
        System.out.println(" Capacity of addressString is " + addStringCapacity);
        nameString.setLength(30);
        System.out.println(" The name is  " + nameString + " aand ");
        addressString.setLength(10);
        System.out.println(" The address is " + addressString);
        
    }
}