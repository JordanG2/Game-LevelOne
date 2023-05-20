package game.item;

/**
 * Classe repr�sentant une arme dans le jeu.
 * Cette classe h�rite de la classe abstraite AbstractItem.
 */
public class Weapon extends AbstractItem {
	private int damage;
	
	/**
	 * Constructeur de la classe Weapon.
	 * 
	 * @param name        Le nom de l'arme.
	 * @param damage      Les d�g�ts inflig�s par l'arme.
	 * @param description La description de l'arme.
	 * @param btnText     Le texte affich� sur le bouton associ� � l'arme.
	 */
	public Weapon(String name, int damage, String description, String btnText) {
		super(name, description, btnText);
		this.damage = damage;
	}

	/**
	 * Retourne les d�g�ts inflig�s par l'arme.
	 * 
	 * @return Les d�g�ts inflig�s par l'arme.
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * D�finit les d�g�ts inflig�s par l'arme.
	 * 
	 * @param damage Les nouveaux d�g�ts inflig�s par l'arme.
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
