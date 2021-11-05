
public class SnakeAndLadder {

	public static void main(String[] args) {
		
		
		int position = 0;


		System.out.println(" Moksh Patam - Welcome to the game ! ");
		
		
		int dice;
		int option;
		
		

		while (position < 100) {
	        		            dice = (int)Math.floor( (Math.random() * 10) % 6 + 1);
 
		        	            System.out.println("Dice value is - " + dice);

			                    option = (int)Math.floor(Math.random() * 3);


                                      switch(option) {
			case 0: 
				System.out.println(" No Movement Stay the same");
				break;
			case 1: 
				System.out.println(" ladder Oh yes!");
				position += dice;
				if (position > 100) {
					position -= dice;
					System.out.println(" counting not more than 100");
				}
				break;
			case 2: 
				System.out.println(" Oh no ! snake");
				position -= dice;
				position = position < 0 ? 0 : position;
				break;
							
			}
							
			
			System.out.println("Your Current position - " + position);
			
		}
		
		System.out.println("Congratulations!- You won the game");
	   }

   }







