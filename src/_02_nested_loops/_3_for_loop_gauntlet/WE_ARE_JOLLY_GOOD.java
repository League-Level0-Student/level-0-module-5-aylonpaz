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
					System.out.println(p);
				}
			}
		}
	}

