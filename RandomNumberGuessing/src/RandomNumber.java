
import java.util.Scanner;
import java.util.Random;
public class RandomNumber{
	public static void main(String args[]) {
		System.out.println();
		System.out.println("******************************** NUMBER GUESSING GAME  ************************************                       ");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		//generate  random number
		
		Random r=new Random();
		int number=r.nextInt(101);
	
		
	
		int chance=5;
		int count=0;
		int score=5;
		for(int i=1;i<=5;i++) {
			
			//Getting number from user
			
			System.out.print("Guess the number from 1 to 100:");
			int guess=sc.nextInt();
			try {
				if(guess>100) {
					System.out.println("Invalid Input! pls guess the number from 1 to 100");
					
				}
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
		
			
			if(number > guess) {
				System.out.println("your guess is too low");
				count++;
				score--;
				chance--;
				System.out.println("Remaining chance:"+chance);
				System.out.println("Try Again!");
				System.out.println("---------------------------------------------------------------------");
			}
			else if(number < guess && number<=100) {
				System.out.println("your guess is too high");
				count++;
				chance--;
				score--;
				System.out.println("Remaining chance:"+(5-i));
				System.out.println("Try Again!");
				System.out.println("------------------------------------------------------------------------");
			}
			
		
			System.out.println();
			System.out.println();
			System.out.println();
			if(count>=5) {
				System.out.println("your chance is over");
				System.out.println("Your Score  :"+score);
				System.out.println("remaining chance: "+0);
				System.out.println("Try Again!");
				System.out.println("--------------------------**********************------------------------------------------------");
				
			}
			
			
			if(guess== number) {
				System.out.println("Congratulation! your guess is correct");
				System.out.println("Your score :"+score);
				System.out.println("how many chance do you took:"+i);
				System.out.println("--------------------**********************----------------------------------------");
				break;
			}
		}
	}
}
