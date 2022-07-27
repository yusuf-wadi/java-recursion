import java.util.Scanner;

class fib{


	public static long fib (int n, int z, int o){
	
	
		
		if(n==0){

			return z;

		}else if(n==1){

			return o;
		}
	
			return fib(n-1,o,z+o);



	}




	public static void main(String args[]){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the fib number you seek: ");
		int n = s.nextInt();
		
		System.out.print(fib(n,0,1));

		s.close();
	}






}



