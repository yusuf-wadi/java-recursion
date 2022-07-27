import java.util.Scanner;

public class isPalin{

public static boolean isPalindrome(String str){
    return check(str, 0, str.length() - 1);
}

private static boolean check (String str,int begin,int end){

    return end - begin < 2 || str.charAt(begin) == str.charAt(end) && check(str, begin + 1, end - 1);

}

public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Which palin are you droning today?:  ");
	String s = scan.nextLine();

	if(isPalindrome(s)){
	
	
		System.out.print("This is a palindrome");
	
	}else{
		
		System.out.print("This is not a palindrome");

		}
	


		scan.close();

	}
}