package com.soban;

/**
 * @author Soban
 * date 06/06/2024
 * Code that converts each name to lowercase, removes spaces, and prints the modified names.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class NameEqualizer {
	/**
	 * Main method
	 * @param args Command line arguments
	 * @throws FileNotFoundException if the file "names.txt" is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new FileReader("names.txt"));
			while (input.hasNext()) {
				String line = input.nextLine();
				String newline = line.toLowerCase();
				System.out.println(newline.replace(" ", ""));
			}
	}
}
