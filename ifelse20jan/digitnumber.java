import java.util.*;
public class digitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number<=9 && number>=0){
            System.out.println(" IS Digit");
        }else{
            System.out.println("is a number");
        }
        
        
    }  
    
}
