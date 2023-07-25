package uppercasetolowercase;
//Convert Uppercase to Lowercase in java without using built in method?

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();

        String UpperCase = "AMIT";
        System.out.println("In UpperCase : "+ UpperCase);

        System.out.print("Convert In Lower Case : ");
        methods.convertToLowerC(UpperCase);
    }
}
