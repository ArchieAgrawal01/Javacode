import java.util.Scanner;

class Myclass{
	public static void main(String args[]){
		int[] n = new int[5];
		int[] m = new int[5];
		int[] sum = new int[5];
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter elements for 1st array:");
		for(int i=0 ; i<5 ; i++){
			 n[i] = sc.nextInt();
		}
		System.out.println("Enter elements for 2nd array:");
		for(int i=0 ; i<5 ; i++){
			 m[i] = sc.nextInt();
		}
		for(int j=0 ; j<5 ; j++){
			sum[j] = n[j] + m[j];
		}
		System.out.print("sum={");
		for(int k=0 ; k<5 ; k++){
			System.out.print(" "+sum[k]);
		}
		System.out.println("}");
		
	}

}