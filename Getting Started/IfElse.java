import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks>=35){
           System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}