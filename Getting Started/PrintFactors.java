import java.util.*;
public class PrintFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}