package scan;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Studentname");
        String name = scan.nextLine();
		
		System.out.println("Studentid");
        int id = scan.nextInt();
        
        scan.nextLine();  //----> avoid some mistakes
        
        System.out.println("Section");
        String sub = scan.nextLine();
        
		System.out.println("Mark1");
        int score1 = scan.nextInt();
        
        System.out.println("Mark2");
        int score2 = scan.nextInt();
        
        System.out.println("Mark3");
        int score3 = scan.nextInt();
        
        System.out.println("Mark4");
        int score4 = scan.nextInt();
 
        System.out.println("Mark5");
        int score5 = scan.nextInt();   
        
        int Total  =score1+score2+score3+score4+score5;
        
        System.out.println("Total :" + Total);
        	}
}
