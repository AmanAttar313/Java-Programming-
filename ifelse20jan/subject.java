
import java.util.Scanner;    
public class subject {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the mark of first subject");
    int first=sc.nextInt();
    System.out.println("Enter Second Subject mark");
    int second=sc.nextInt();
    System.out.println("enter third subject marks");
    int c=sc.nextInt();
    int sum=first+second+c;
    System.out.println("The sum is : " + sum);
    double  percent=sum/3;
    System.out.println("percentage is"+percent);
    if (percent>=90) {
        System.out.println("Grade is A: " +percent);
        
    }else if(percent>=80&&percent<90){
        System.out.println("Grade is B: "+percent);

    }else if(percent>=70&&percent<80){
        System.out.println("Grade is C: "+percent);

    }else if(percent>=60&&percent<70){
        System.out.println("Grade is D"+percent);
    }else{
        System.out.println("fail");
    }

 } 
 

    
}

    
    

