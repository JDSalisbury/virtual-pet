package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet startPet = new VirtualPet(20, 20, 20, 20);

		System.out.println("Please give your virtual pet a name: ");
		String name = input.nextLine();
		String move;
		int turn = 0;
		int day = 0;

		do {
			System.out.println("");
			System.out.println(name + " The Virtual Pet!");
			System.out.println("");
			System.out.println("Hunger: " + startPet.getHunger() + "/50");
			System.out.println("Thirst: " + startPet.getThirst() + "/50");
			System.out.println("Boredom: " + startPet.getBoredom() + "/50");
			System.out.println("Tiredness: " + startPet.getTiredness() + "/50");
			System.out.println("");

			System.out.println("1. Feed " + name);
			System.out.println("2. Water " + name);
			System.out.println("3. Play with " + name);
			System.out.println("4. Let " + name + " nap");
			System.out.println("5. Do nothing with " + name);
			System.out.println("6. Quit and never see " + name + " again.");

			move = input.nextLine();
			turn++;
			if (startPet.getHunger() >= 50 || startPet.getThirst() >= 50 || startPet.getBoredom() >= 50
					|| startPet.getTiredness() >= 50) {
				System.out.println(day + " Days... Poor little " + name + ". I remember my First Virtual pet...");
				System.exit(0);

			}

			if (move.equals("1") && !(startPet.getHunger() <= 0)) {
				startPet.feeding();
				System.out.println(name + "'s THIRST AND BOREDOM GROWS!");
			}

			if (move.equals("2") && !(startPet.getThirst() <= 0)) {
				startPet.quenching();
				System.out.println(name + "'s HUNGER AND TIREDNESS GROWS!");
			}

			if (move.equals("3") && !(startPet.getBoredom() <= 0)) {
				startPet.activity();
				System.out.println(name + "'s TIREDNESS AND THIRST GROWS!");
			}

			if (move.equals("4") && !(startPet.getTiredness() <= 0)) {
				startPet.rest();
				System.out.println(name + "'s BOREDOM AND HUNGER GROWS!");
			}
			if (turn % 3 == 0) {
				startPet.tick();
				day++;
				System.out.println("");
				System.out.println("!! A NEW DAY DONT LET STATS MAX!!");
			}
			System.out.println("");

		} while (!(move.equals("6")));

		System.out.println("Only " + day + " days old, Poor little " + name + ". So young...");

		input.close();
	}

}
