import java.util.*;
public class check_alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabet");
        char ch=sc.next().charAt(0);
        if (ch>='A'&ch<='Z'||ch>='a'&ch<='z') {
            System.out.println("is alphabet");
            
        }else{
            System.out.println("is not alphabet");
        }
    }
    
}
