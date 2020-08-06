import java.util.Scanner;

public class MixedCase {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    System.out.print("In:");

    String s = inp.nextLine();
    String cad1 = "";
    String cad;

    for (int i = 0; i < s.length(); i++) {
        cad = s.substring(i, i+1);
        if (i == 0) {
            cad1 = cad.toLowerCase();
        } else if (i % 2 == 0) {
            cad1 += cad.toLowerCase();
        } else {
            cad1 += cad.toUpperCase();
        }
    }
        System.out.println(cad1);

  }
}
