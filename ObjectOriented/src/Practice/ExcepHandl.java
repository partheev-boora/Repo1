package Practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.AutoCloseable;

public class ExcepHandl {
   public static void main(String ar[]) {
	   try (Scanner sc=new Scanner(System.in)){
		      int a=sc.nextInt();
		      int b=sc.nextInt();
		      System.out.println(a/b);
		    }

	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   finally {
		   System.out.println("Iam here");
	   }
   }

}
