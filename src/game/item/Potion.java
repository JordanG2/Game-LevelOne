package game.item;

/**
 * Classe repr�sentant une potion dans le jeu.
 * Cette classe h�rite de la classe abstraite AbstractItem.
 */
public class Potion extends AbstractItem {

	/**
	 * Constructeur de la classe Potion.
	 * 
	 * @param name        Le nom de la potion.
	 * @param description La description de la potion.
	 * @param btnText     Le texte affich� sur le bouton associ� � la potion.
	 */
	public Potion(String name, String description, String btnText) {
		super(name, description, btnText);
	}
}
