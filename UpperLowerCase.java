import java.util.Scanner;

public class UpperLowerCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        int num1 = 1, num2 = 0, num3 = -1;

        if(ch >= 'A' && ch <= 'Z') {

            System.out.println(num1);

        } else if(ch >= 'a' && ch <= 'z') {

            System.out.println(num2);

        } else {
            
             System.out.println(num3);

        }

    }
}