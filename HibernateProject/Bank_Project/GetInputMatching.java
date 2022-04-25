package Bank_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInputMatching {

public char nextChar() {
	char value;
	while(true) {
	try {
		value=new Scanner(System.in).next().charAt(0);
		return value;
		}
		catch(InputMismatchException e) {
			System.err.println("Invalid Input!!!"
							+ "\nPlease Enter a Valid Input : ");
			continue;
			}}}
	public int nextInt(){
		int value;
		while(true) {
		try {
			value=new Scanner(System.in).nextInt();
			return value;
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid Input!!!"
						+ "\nPlease Enter a Integer Input : ");
				//continue;
				}	} }
	public float nextFloat(){
		float value;
		while(true) {
		try {
			value=new Scanner(System.in).nextFloat();
			return value;
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid Input!!!"
						+ "\nPlease Enter a Decimal-Integer Input : ");
				continue;
				}	} }
	
	public String next(){
		String value;
		while(true) {
		try {
			value=new Scanner(System.in).next();
			return value;
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid Input!!!"
						+ "\nPlease Enter a Valid Input : ");
				continue;
				}	} }
	public String nextLine(){
		String value;
		while(true) {
		try {
			value=new Scanner(System.in).nextLine();
			return value;
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid Input!!!"
						+ "\nPlease Enter a Valid Input : ");
				continue;
				}	} }
	
}

