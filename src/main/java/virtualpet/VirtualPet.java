package virtualpet;

import java.util.Random;

public class VirtualPet {

	Random rand = new Random();

	private int hunger;

	private int thirst;

	private int boredom;

	private int tiredness;

	public VirtualPet(int hunger, int thirst, int boredom, int tiredness) {

		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.tiredness = tiredness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getTiredness() {
		return tiredness;
	}

	public void feeding() {
		int eating = rand.nextInt(10) + 1;
		hunger -= eating;
		thirst += eating;
		boredom += eating;

	}

	public void quenching() {
		int drink = rand.nextInt(10) + 1;
		thirst -= drink;
		hunger += drink;
		tiredness += drink;
	}

	public void activity() {
		int fun = rand.nextInt(10) + 1;
		boredom -= fun;
		tiredness += fun;
		thirst += fun;
	}

	public void rest() {
		int nap = rand.nextInt(10) + 1;
		tiredness -= nap;
		boredom += nap;
		hunger += nap;
	}

	public void tick() {

		if (hunger > thirst) {
			hunger -= 5;
		} else if (thirst > hunger) {
			thirst -= 5;
		}
		if (tiredness > boredom) {
			tiredness -= 5;
		} else if (boredom > tiredness) {
			boredom -= 5;
		}

		hunger += rand.nextInt(2) + 1;
		thirst += rand.nextInt(2) + 1;
		tiredness += rand.nextInt(2) + 1;
		boredom += rand.nextInt(2) + 1;

	}

}
