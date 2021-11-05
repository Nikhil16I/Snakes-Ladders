


public class SnakeAndLadder {

	public static void main(String[] args) {
		
		
		int position = 0;

		System.out.println(" Moksh-Patam Welcome to the game ! ");
		
		
		int dice;
		int option;
		
		
		while (position <= 100) {

			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1);
 
			System.out.println("Dice's Value comes out  " + dice);

			option = (int)Math.floor(Math.random() * 3); 
			
			
            if (option == 0) {

            	System.out.println("No Movement Stay the same");

            }else if (option == 1) {

                System.out.println("Ladder Oh yes !");
                position += dice;
 
                System.out.println("Your Current Position is -" + position);

            }else if (option == 2) {
                System.out.println("oh no ! Snake");
                position -= dice;  

                System.out.println("Your Current Position is -" + position);

                if (position < 0) {
                    position = 0;

                    System.out.println("Your Current Position is ==>" + position);				
			}
			
			System.out.println(" your Current position: " + position);
			
		}
		
		System.out.println(" Congratulations!- You won the game!");
	}

    }


 }



