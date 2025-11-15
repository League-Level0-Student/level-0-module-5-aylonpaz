package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Number {
public static void main(String[] args) {
	String primeOrNot = JOptionPane.showInputDialog("Please write a number.");
	int w = Integer.parseInt(primeOrNot);
	boolean prime = true;
	for(int i=2; i < w/2; i +=1) {
		if(w%i==0) {
			prime = false;
			break;
		}
	}
	if(prime==true) {
		JOptionPane.showMessageDialog(null, "The number is prime.");
	}
	else if(prime == false) {
		JOptionPane.showMessageDialog(null, "The number is composite");
	}
	
}
}
