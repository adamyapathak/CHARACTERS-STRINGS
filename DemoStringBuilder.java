public class DemoStringBuilder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("coding");
        System.out.print(str);
        str.append(" on the weekend (11/05/22)");
        System.out.print(str);
        str.insert(0, "Human");
        System.out.print(str);
        str.insert(5, "Aadi");
        System.out.print(str);
        str.append("earlymorning");
        System.out.print(str);
    }
    
}
