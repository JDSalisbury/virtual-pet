package virtualpet;

public class VirtualPet {

	private int tick;

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

	public int getTick() {
		return tick;
	}

	public void feeding() {
		int eating = 5;
		hunger -= eating;
		thirst += eating;
		
	}

	public void quenching() {
		int drink = 5;
		thirst -= drink;
		hunger += drink;
	}

	public void activity() {
		int fun = 5;
		boredom -= fun;
		tiredness +=fun;
	}

	public void rest() {
		int nap = 5;
		tiredness -= nap;
		boredom += nap;
	}
	
	public void countTick() {
		
		
	}
}
