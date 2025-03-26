import java.util.*;
public class swap_two_number_withoutusing_varibale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=20;
        // a=a+b; //first solution
        // b=a-b;
        // a=a-b;


        // a=a^b; //second solution using xor
        // b=a^b;
        // a=a^b;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        //with thirdvaribale
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        



    }
    
}
