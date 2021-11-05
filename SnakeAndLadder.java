public class SnakeAndLadder{


        public static void main(String[] args) {


		int position = 0;

		System.out.println(" Moksha Patam - Welcome to the game ! Your Current Position = " + position);
                           
                double dice = Math.floor( (Math.random() * 10) % 6 + 1); 
                System.out.println("Dice value is = " +dice);
 
                   int option = (int)Math.floor(Math.random() * 3);



		if (option == 0) {
			
                    System.out.println("No movement ,stay on the same place");
		}else if(option == 1){
		
               	    System.out.println(" Ladder Oh Yes !");
			position += dice;
		
 	            System.out.println("Your Current Position is " +position);
		}
                else {
			
                     System.out.println("Oh no! Snake");
			position -= dice;
		
         	    System.out.println(" Your Current Position is " +position);

	}

    }


		System.out.println(" Moksha Patam - Welcome to the game ! Your Current Position = " + position);

                           double dice = Math.floor( (Math.random() * 10) % 6 + 1); 

                                System.out.println("Dice value is = " +dice);
                                      
        public static void main(String[] args) {
		
		
		int position = 0;

		System.out.println(" Moksha Patam - Welcome to the game ! Your Current Position - " + position);
		
		

   }


}
