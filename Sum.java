import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inpuT = scn.nextInt();
        scn.close();
        int result = 0;
        for (int i=1; i<=inpuT; i++){
            result = result + i;
        }
        System.out.println(result);
    }
}
