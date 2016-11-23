package dia231116;

public class Character {

	
	public int ataque,
			   defesa, 
			   health;

	
	
	public Character(int ataque, int defesa, int health) {
		super();
		this.ataque = ataque;
		this.defesa = defesa;
		this.health = health;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
