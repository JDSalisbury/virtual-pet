package virtualpet;
import java.util.Random;

public class VirtualPet {

	Random rand = new Random();
	
	
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
		int eating = rand.nextInt(10) +1;
		hunger -= eating;
		thirst += eating;
		
	}

	public void quenching() {
		int drink = rand.nextInt(10) +1;
		thirst -= drink;
		hunger += drink;
	}

	public void activity() {
		int fun = rand.nextInt(10) +1;
		boredom -= fun;
		tiredness +=fun;
	}

	public void rest() {
		int nap = rand.nextInt(10) +1;
		tiredness -= nap;
		boredom += nap;
	}
	
	public void countTick() {
		
			hunger += rand.nextInt(2) +1;
			thirst += rand.nextInt(2) +1;
			tiredness += rand.nextInt(2) +1;
			boredom += rand.nextInt(2)+1;
		}
	
}	


