package virtualpet;

public class VirtualPet {
	
	
	
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
	
	
}

