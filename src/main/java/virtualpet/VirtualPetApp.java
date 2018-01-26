package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet startPet = new VirtualPet(20, 20, 20, 20);

		System.out.println("Please give your virtual pet a name: ");
		String name = input.nextLine();
		String move;

		do {
			System.out.println(name + " The Virtual Pet!");
			System.out.println("");
			System.out.println("Hunger: " + startPet.getHunger() + "/50");
			System.out.println("Thirst: " + startPet.getThirst() + "/50");
			System.out.println("Boredom: " + startPet.getBoredom() + "/50");
			System.out.println("Tiredness: " + startPet.getTiredness() + "/50");
			System.out.println("");
			System.out.println("What shall you and " + name + " do today?");

			System.out.println("1. Feed " + name);
			System.out.println("2. Water " + name);
			System.out.println("3. Play with " + name);
			System.out.println("4. Let " + name + " nap");
			System.out.println("5. Do nothing with " + name);
			System.out.println("6. Quit and never see " + name + " again.");

			move = input.nextLine();

			if (startPet.getHunger() >= 50 || startPet.getThirst() >= 50 || startPet.getBoredom() >= 50
					|| startPet.getTiredness() >= 50) {
				System.out.println("Little " + name + " didn't make it... Good luck with the next one.");
				System.exit(0);

			}

			if (move.equals("1") && !(startPet.getHunger() <= 0)) {
				startPet.feeding();

			}

			if (move.equals("2") && !(startPet.getThirst() <= 0)) {
				startPet.quenching();

			}

			if (move.equals("3") && !(startPet.getBoredom() <= 0)) {
				startPet.activity();

			}

			if (move.equals("4") && !(startPet.getTiredness() <= 0)) {
				startPet.rest();

			}

			startPet.countTick();
			System.out.println("");
			System.out.println(name + " GROWS STRONG! DONT LET HIS STATS MAX!");

		} while (!(move.equals("6")));

		System.out.println(
				"Thanks for playing with " + name + " and remeber all the good memories you got to share together...");

		input.close();
	}

}
