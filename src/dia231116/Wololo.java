package dia231116;

public class Wololo extends Character {

	public int convertionRate;
	
	public Wololo(int ataque, int defesa, int health, int convertionRate) {
		super(ataque, defesa, health);
		this.convertionRate = convertionRate;
	}

	public int getConvertionRate() {
		return convertionRate;
	}

	public void setConvertionRate(int convertionRate) {
		this.convertionRate = convertionRate;
	}

	public Wololo() {
		// TODO Auto-generated constructor stub
	}

}
