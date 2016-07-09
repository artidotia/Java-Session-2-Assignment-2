
public class PrimeNumbers {
	public static void main(String[] args) {
		int j=0, i=0, cnt;
		//using the for loop
		System.out.println("Using FOR loop");
		System.out.println("Prime Numbers between 1 and 100");
		for (i=2; i<=100; i++){
			cnt = 0;
			for (j=2; j<=i/2; j++) {
				if (i%j==0){
					cnt = cnt + 1;
					break;
				}
			}
			if (cnt == 0){
				System.out.print(i + " ");
			}
		}
		//using do while 
		System.out.println();
		System.out.println();
		System.out.println("Using DO WHILE");
		System.out.println("Prime Numbers between 1 and 100");
		i = 2;
		do {
			cnt = 0;
			j = 2;
			do {
				if (i==2 || i==3) break;
				if (i%j == 0){
					cnt += 1;
					break;
				}
				j++;
			} while (j <= i/2);// do ends
			if (cnt==0){
				System.out.print(i + " ");
			}
			i++;
		} while (i<=100);//do ends
		
		//using while 
		System.out.println();
		System.out.println();
		System.out.println("Using WHILE");
		System.out.println("Prime Numbers between 1 and 100");
		i = 2;
		while (i<=100) {
			cnt = 0;
			j = 2;
			while (j <= i/2){
				if (i%j == 0){
					cnt += 1;
					break;
				}
				j++;
			}
			if (cnt == 0){
				System.out.print(i + " ");
			}
			i++;
		} //while ends 
		
	} //main ends

} //class PrimeNumbers ends
