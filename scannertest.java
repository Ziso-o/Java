import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class scannertest {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		
		System.out.print("Please enter any numbers or alphabets : ");
		s = sc.nextLine();
		
		System.out.println("\nYou entered : '" + s + "'.");
		
	}
}