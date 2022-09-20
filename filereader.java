import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;


public class filereader {

public static void main(String[] args) {

    File file = new File("text.txt");

		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				
				int i = sc.nextInt();
				System.out.println();
			}
			sc.close();	
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}



// input mismatch exception.


/*
	catch (InputMismatchException e){
		///
	}
*/