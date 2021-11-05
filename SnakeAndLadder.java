public class SnakeAndLadder {

	public static void main(String[] args) {
		
		
		int position = 0;
		int position2 = 0;
		System.out.println(" Moksh Patam Welcome to the game ! ");
		
		
                         		int dice;
		                        int option;
		                        int times = 0;
		                        int turn = 0;
		                        int oldTurn = 0;
		
		
		while (position < 100 && position2 < 100) {
			
			if (turn == 0) 
				System.out.println(" 1st Player is Playing");
			else
				System.out.println(" 2nd Player is playing");
			
			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1); 
			System.out.println(" Value of Dice is " + dice);
			option = (int)Math.floor(Math.random() * 3); 
			
			switch(option) {
			case 0: 
				System.out.println("No Movement Stay the same");
				break;
			case 1: 
				System.out.println("ladder Oh yes !");
				if (turn == 0) 
					position += dice;
					
				else
					position2 += dice;
				
				if (position > 100) {
					position -= dice;
					System.out.println(" 1st Player counting not more than 100 ");
				}
				
				if (position2 > 100) {
					position2 -= dice;
					System.out.println(" 2nd Player counting not more than 100 ");
				}
				break;
			case 2: 
				System.out.println(" Oh no ! snake");
				if (turn != 0) 
					position -= dice;
					
				else
					position2 -= dice;
				
				
				if (position < 0) {
					position = 0;
					System.out.println(" 1st Player1 back to 0");
				}
				
				if (position2 < 0) {
					position2 = 0;
					System.out.println(" 2nd Player back to 0");
				}
				
				turn = (turn + 1) % 2;
				break;
							
			}
			
			if (oldTurn == 0)
				System.out.println(" Current position of 1st Player- " + position + "\n");
			else
				System.out.println(" Current position of 2nd Player- " + position2 + "\n");
			times++;
			oldTurn = turn;
		}
		
		System.out.println(" Congratulation Player" + (turn + 1) + "\n");
		System.out.println(" it takes " + times + " roll times to win the game");
	}

}
