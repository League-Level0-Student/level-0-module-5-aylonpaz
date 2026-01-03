package _02_nested_loops._3_for_loop_gauntlet;

public class WE_ARE_JOLLY_GOOD {
	public static void main(String[]args) {
		for(int i = 0; i <=100; i+=1) {
			//System.out.println(i);
		}
		for(int w = 100; w>=0; w -=1) {
			//System.out.println(w);
		}
		for(int p = 2; p <=100; p +=1) {
			if(p %2 == 0) {
				//System.out.println(p);
			}
		}
			for(int a = 1; a <= 99; a +=1) {
				if(a % 2 == 1) {
					//System.out.println(a);
				}
			}
			for(int q = 1; q  <= 500; q +=1) {
				if(q % 2 == 1) {
					//System.out.println(q + "is odd");
				}
				if(q % 2==0) {
					//System.out.println(q +"is even");
				}
			}
			for(int p =0; p <= 777; p +=1) {
				if(p % 7 == 0) {
				//	System.out.println(p);
				}
			}
			int age = 0;
			for(int e = 2014; e < 2026; e +=1) {
			//	System.out.println("in " + e + " I was " + age + ".");
				age +=1;
			}
			for(int j = 0; j < 3;j +=1) {
				for(int a = 0; a <3; a +=1) {
					//System.out.println(j + " " + a);
				}
			}
			for(int x = 1; x <=9; x +=1) {
				if(x == 3 || x == 6) {
					//System.out.println(x + " ");
				}else{
					//System.out.print(x + " ");
				}
			}
			for(int z = 0; z <=100; z +=1) {
				if(z % 10 == 0) {
					//System.out.println(z + " ");
				}else {
					//System.out.print(z + " ");
				}
			}
			int numberOfStars = 0;
			for(int q = 1; q < 7; q +=1) {
				System.out.println();
				for(int efc = 1;  efc <= q; efc +=1) {
					System.out.print("* ");
					
					}
				
			}
		}
	}

