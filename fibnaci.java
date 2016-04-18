import java.util.Scanner;

public class JavaApplication2 {

    
    public static void main(String[] args) {
        
        int a=1;
        int b=0;
        int c=0;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input :");
        c= input.nextInt ();
        System.out.println("Output :");
        for ( int i=1; i<=c; i++)
            {
                System.out.print("  "+a);
                a=a+b;
                b=a-b;
            }//*benedict*//
    }
    }
