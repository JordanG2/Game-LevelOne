package game.pnj;

import game.textures.Texture;

/**
 * Classe abstraite repr�sentant un personnage non-joueur (PNJ) dans le jeu.
 */
public abstract class AbstractPnj {
	protected String name;
	protected boolean isMoving;
	protected boolean canBeHurt;	
	
	
	 /**
     * Constructeur de la classe AbstractPnj.
     *
     * @param name     Le nom du PNJ.
     * @param image    La texture repr�sentant le PNJ.
     * @param hurt     Indique si le PNJ peut �tre bless�.
     */
	public AbstractPnj(String name, Texture image, boolean hurt) {
		this.name = name;
		this.isMoving = false;
		this.canBeHurt = hurt;
	}

	/**
     * Retourne le nom du PNJ.
     *
     * @return Le nom du PNJ.
     */
	public String getName() {
		return name;
	}

	/**
     * Modifie le nom du PNJ.
     *
     * @param name Le nouveau nom du PNJ.
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * V�rifie si le PNJ est en mouvement.
     *
     * @return true si le PNJ est en mouvement, false sinon.
     */
	public boolean isMoving() {
		return isMoving;
	}

	/**
     * D�finit si le PNJ est en mouvement.
     *
     * @param isMoving true pour indiquer que le PNJ est en mouvement, false sinon.
     */
	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	/**
     * V�rifie si le PNJ peut �tre bless�.
     *
     * @return true si le PNJ peut �tre bless�, false sinon.
     */
	public boolean CanBeHurt() {
		return canBeHurt;
	}

	/**
     * D�finit si le PNJ peut �tre bless�.
     *
     * @param canBeHurt true pour indiquer que le PNJ peut �tre bless�, false sinon.
     */
	public void setCanBeHurt(boolean canBeHurt) {
		this.canBeHurt = canBeHurt;
	}
	
	

}
