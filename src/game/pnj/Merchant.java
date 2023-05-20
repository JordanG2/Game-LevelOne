package game.pnj;

import game.textures.Texture;
import javafx.scene.image.ImageView;

/**
 * Classe repr�sentant un PNJ marchand.
 */
public class Merchant extends AbstractPnj {
	private ImageView imageView;

	/**
	 * Constructeur de la classe Merchant.
	 *
	 * @param name  Nom du marchand.
	 * @param image Texture/image repr�sentant le marchand.
	 */
	public Merchant(String name, Texture image) {
		super(name, image, false);
		this.imageView = image.getImageView();
		this.imageView.setFitHeight(30);
		this.imageView.setFitWidth(30);
		this.imageView.setUserData(this);
	}

	/**
	 * Retourne l'objet ImageView associ� au marchand.
	 *
	 * @return L'objet ImageView repr�sentant le marchand.
	 */
	public ImageView getImageView() {
		return imageView;
	}

	/**
	 * Modifie l'objet ImageView associ� au marchand.
	 *
	 * @param imageView Le nouvel objet ImageView repr�sentant le marchand.
	 */
	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
	}
}
