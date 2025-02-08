import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        if (word.equals(word.toUpperCase())) {
          
            System.out.println(word.toLowerCase());
        } else if (Character.isLowerCase(word.charAt(0)) && 
                   word.substring(1).equals(word.substring(1).toUpperCase())) {
          
            System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
        } else {
           
            System.out.println(word);
        }
    }
}
