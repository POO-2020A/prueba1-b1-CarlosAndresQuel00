import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    
    boolean ok = false;

    System.out.print("In:");

    String s = inp.nextLine();

   	char[] letter = s.toCharArray();
        
        if (letter.length % 2 == 0) {
            for (int i = 0; i < letter.length/2-1; i++) {
                if (letter[i] != letter[letter.length-i-1]) {
                    ok = false;
                } else {
                    ok = true;
                }
            }
        } else {
            for (int i = 0; i < (letter.length-1)/2-1; i++) {
                if (letter[i] != letter[letter.length-i-1]) {
                    ok = false;
                } else {
                    ok = true;
                }
            }
        }
        
        System.out.println(ok);
        

  }
}
