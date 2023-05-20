package game.item;

/**
 * Classe repr�sentant un item sp�cifique du jeu.
 * Cette classe h�rite de la classe abstraite AbstractItem.
 */
public class Items extends AbstractItem {

	/**
	 * Constructeur de la classe Items.
	 * 
	 * @param name        Le nom de l'item.
	 * @param description La description de l'item.
	 * @param btnText     Le texte affich� sur le bouton associ� � l'item.
	 */
	public Items(String name, String description, String btnText) {
		super(name, description, btnText);
	}
}
