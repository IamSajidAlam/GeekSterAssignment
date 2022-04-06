import java.util.*;
public class GreatestNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Number One : ");
        num1=sc.nextInt();
        System.out.println("Number Two : ");
        num2=sc.nextInt();
        System.out.println("Number Three : ");
	    num3=sc.nextInt();
        sc.close();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " Number is Greater");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Number is Greater");
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " Number is Greater");
        }
        else {
            System.out.println("All are equal or any two values are equal");
        } 
    }
}