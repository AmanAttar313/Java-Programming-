import java.util.*;
public class uppercaseandlowercase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabet : ");
        char ch=sc.next().charAt(0);
        
        if (ch>='a'& ch<='z'){
            System.out.println("is a lower case:");
            
        }else if (ch>='A'&ch<='Z') {
            System.out.println("is a uppercase: ");
            
        }else{
            System.out.println("is invalid");
        }
           
        }
        

    }
