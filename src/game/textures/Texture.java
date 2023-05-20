package game.textures;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * La classe Texture repr�sente une texture d'image utilis�e dans le jeu.
 * Elle charge une image � partir d'un chemin donn� et cr�e une ImageView correspondante.
 */
public class Texture {
	private String imagePath;
	private ImageView imageView;
	
	/**
	 * Construit un objet Texture � partir du chemin de l'image.
	 * L'image est charg�e et une ImageView est cr��e avec une taille par d�faut de 32x32 pixels.
	 *
	 * @param image Le nom de l'image (chemin relatif).
	 */
	public Texture(String image) {
		this.imagePath = "file:res/images/" + image;
		this.imageView = new ImageView(new Image(this.imagePath));
		imageView.setFitWidth(32);
		imageView.setFitHeight(32);
	}
	
	/**
	 * Construit un objet Texture � partir du chemin de l'image et des dimensions sp�cifi�es.
	 * L'image est charg�e et une ImageView est cr��e avec les dimensions donn�es.
	 *
	 * @param image  Le nom de l'image (chemin relatif).
	 * @param width  La largeur de l'ImageView.
	 * @param height La hauteur de l'ImageView.
	 */
	public Texture(String image, int width, int height) {
		this.imagePath = "file:res/images/" + image;
		this.imageView = new ImageView(new Image(this.imagePath));
		imageView.minWidth((double) height);
		imageView.minHeight((double) width);
		imageView.setFitWidth(width);
		imageView.setFitHeight(height);
	}

	/**
	 * Retourne l'ImageView associ�e � la texture.
	 * 
	 * @return L'ImageView de la texture.
	 */
	public ImageView getImageView() {
		ImageView imageView = new ImageView(new Image(this.imagePath));
		imageView.setFitWidth(this.imageView.getFitWidth());
		imageView.setFitHeight(this.imageView.getFitHeight());
		return imageView;
	}

	/**
	 * Retourne le chemin de l'image.
	 *
	 * @return Le chemin de l'image.
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * D�finit le chemin de l'image.
	 *
	 * @param imagePath Le chemin de l'image.
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
