/* Dagmawe (Bobby) Afework

        csc321
 	Lab #4
	       */

	import java.util.Scanner;

	public class dafework4
        {

		public static void main(String[] args)
		{
			System.out.print("\t\t\tFOOD MENU\n\n\t\t\tPizza\n\t\t\tCheeseburger\n\t\t\tSpaghetti\n\t\t\tChicken\n\n");
                        Scanner keyboard = new Scanner(System.in);
			System.out.print("Select a food you want out of these 4 choices: ");

			String food = keyboard.next();

			if(food.equalsIgnoreCase("Pizza"))
				System.out.println("\nMamma Mia! Let's a eatsa pizza!");

			else if(food.equalsIgnoreCase("Cheeseburger"))
				System.out.println("\nI asked you for a cheeseburger!");

			else if (food.equalsIgnoreCase("Spaghetti"))
				System.out.println("\nI hope you made lotsa spaghetti!");

			else if(food.equalsIgnoreCase("Chicken"))
				System.out.println("\nLove that chicken from Popeyes!");

			else
				System.out.println("\nI'm sorry, but that is not one of the 4 choices.");


		}

	}
