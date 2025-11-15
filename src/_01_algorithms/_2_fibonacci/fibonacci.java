package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int number1;
	int number2;
	int sum;
	number1 =0;
	number2=1;
	sum = number1+number2;
	for(int i=0;i<10;i+=1) {
		number1 = number1+number2;
		number2 = sum;
		sum = number1+number2;
		System.out.println(sum);
	}
}
}
