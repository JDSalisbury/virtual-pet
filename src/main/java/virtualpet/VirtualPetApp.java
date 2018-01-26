package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		VirtualPet startPet = new VirtualPet(50,50,50,50);
		
		System.out.println("Please give your virtual pet a name: ");
		String name = input.nextLine();
		
		System.out.println(name + " The Virtual Pet!");
		System.out.println("");
		System.out.println("Hunger: " + startPet.getHunger()+"/50");
		System.out.println("Thirst: " + startPet.getThirst()+"/50");
		System.out.println("Boredom: " + startPet.getBoredom()+"/50");
		System.out.println("Tiredness: " + startPet.getTiredness()+ "/50");
		System.out.println("");
		System.out.println("What shall you and " + name + " do today?");
		
		
		System.out.println("1. Feed " + name);
		System.out.println("2. Water " + name);
		System.out.println("3. Play with "  + name);
		System.out.println("4. Let " + name + " nap");
		System.out.println("5. Do nothing with " + name);
		
		input.close();
	}

}
