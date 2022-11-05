import javax.swing.*;
public class BusinessLetter {
    public static void main(String[] args){
        String name;
        String firstName = "";
        String familyName = "";
        int x;
        char c;
        name = JOptionPane.showInputDialog(null, " Please enter customer's first and last name ");
        x = 0;
        while( x < name.length()){
            if(name.charAt(x) == ' '){
                firstName = name.substring(0, x);
                familyName = name.substring(x + 1, name.length());
                x = name.length();
            }
            ++x;
        }
        JOptionPane.showMessageDialog(null, " Dear " + firstName + " ,\nI am so glad I'm on my first name basis" +
        " \nbecause I would like the opportunity to" + 
        " \ntalk to you about an good code" +
        " \nthis is a very good code for every one " + familyName + 
        " \nif you like it please share you review with me now!" +
        " \nat adamyapathak12@gmail.com");

           //You can customize this code as your own Topic of choice instead of code and dialog box message etc..
}
}
