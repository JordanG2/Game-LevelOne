package game.item;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Classe abstraite repr�sentant un item du jeu.
 */
public abstract class AbstractItem{
	protected String name;
	protected String description;
	protected ImageView imageView;
	protected String btnText;

	/**
	 * Constructeur de la classe AbstractItem.
	 * 
	 * @param name        Le nom de l'item.
	 * @param description La description de l'item.
	 * @param btnText     Le texte affich� sur le bouton associ� � l'item.
	 */
	public AbstractItem(String name, String description, String btnText) {
		this.name = name;
		this.description = description;
		this.btnText = btnText;
		this.imageView = new ImageView(new Image("file:res/images/"+name+".png"));
		this.imageView.setFitHeight(16);
		this.imageView.setFitWidth(16);
		this.imageView.maxHeight(16);
		this.imageView.maxWidth(16);
		this.imageView.setUserData(this);
	}
	
	/**
	 * Retourne le nom de l'item.
	 * 
	 * @return Le nom de l'item.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * D�finit le nom de l'item.
	 * 
	 * @param name Le nouveau nom de l'item.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Retourne la description de l'item.
	 * 
	 * @return La description de l'item.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * D�finit la description de l'item.
	 * 
	 * @param description La nouvelle description de l'item.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Retourne l'image associ�e � l'item.
	 * 
	 * @return L'image associ�e � l'item.
	 */
	public ImageView getImageView() {
		return imageView;
	}
	
	/**
	 * D�finit l'image associ�e � l'item.
	 * 
	 * @param imagePath Le chemin vers la nouvelle image de l'item.
	 */
	public void setImageView(String imagePath) {
		this.imageView = new ImageView(new Image(imagePath));
	}
	
	/**
	 * Retourne le texte affich� sur le bouton associ� � l'item.
	 * 
	 * @return Le texte affich� sur le bouton associ� � l'item.
	 */
	public String getBtnText() {
		return btnText;
	}

	/**
	 * D�finit le texte affich� sur le bouton associ� � l'item.
	 * 
	 * @param btnText Le nouveau texte affich� sur le bouton associ� � l'item.
	 */
	public void setBtnText(String btnText) {
		this.btnText = btnText;
	}
}
