import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch <= 90 && ch >= 65) {return (char) (ch + 32);}
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        int len = str.length();
        String result = "";
        for(int i = 0; i < len; i++) {
            result += toLower(str.charAt(i));
        }
        return result;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if(ch <= 122 && ch >= 97) {return (char) (ch - 32);}
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        int len = str.length();
        String result = "";
        for(int i = 0; i < len; i++) {
            result += toUpper(str.charAt(i));
        }
        return result;
    }


    public static void main(String[] args) {
        //Init scanner
        Scanner scan = new Scanner(System.in);

        //Gather user input
        System.out.println("Please enter a String: ");
        String sInput = scan.nextLine();
        System.out.println("What would you like to make your string: lowercase or uppercase?");
        String mInput = scan.nextLine();

        //Run alteration methods
        if(mInput.equals("lowercase")) { System.out.println("Here is your string in lowercase: " + myToLowerCase(sInput));}
        if(mInput.equals("uppercase")) { System.out.println("Here is your string in uppercase: " + myToUpperCase(sInput));}

        //Close resources
        scan.close();
        
    }
}
