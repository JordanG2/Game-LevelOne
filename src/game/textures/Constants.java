package game.textures;

/**
 * Cette classe contient les constantes li�es aux textures utilis�es dans le jeu.
 */
public class Constants {
    // Initialisation des textures :
    
    /** Texture du sol. */
    public static final Texture sol = new Texture("ground1.png");
    
    /** Texture noire. */
    public static final Texture black = new Texture("black.png");
    
    /** Texture d'un pi�ge. */
    public static final Texture trap = new Texture("trap.png");
    
    // Bordures ext�rieures
    
    /** Texture de la bordure sup�rieure. */
    public static final Texture topBorder = new Texture("topBorder.png");
    
    /** Texture de la bordure gauche. */
    public static final Texture leftBorder = new Texture("leftBorder.png");
    
    /** Texture de la bordure droite. */
    public static final Texture rightBorder = new Texture("rightBorder.png");
    
    /** Texture de la bordure inf�rieure. */
    public static final Texture bottomBorder = new Texture("bottomBorder.png");
    
    /** Texture du coin inf�rieur gauche. */
    public static final Texture bottomLeftCorner = new Texture("bottomLeftCorner.png");
    
    /** Texture du coin inf�rieur droit. */
    public static final Texture bottomRightCorner = new Texture("bottomRightCorner.png");
    
    /** Texture du coin sup�rieur droit. */
    public static final Texture topRightCorner = new Texture("topRightCorner.png");
    
    /** Texture du coin sup�rieur gauche. */
    public static final Texture topLeftCorner = new Texture("topLeftCorner.png");
    
    // Lignes et blocs int�rieurs
    
    /** Texture de la ligne verticale sup�rieure. */
    public static final Texture topVerticalLine = new Texture("topVerticalLine.png");
    
    /** Texture d'une ligne verticale. */
    public static final Texture verticalLine = new Texture("verticalLine.png");
    
    /** Texture d'une ligne verticale avec une cassure. */
    public static final Texture verticalLineBreak = new Texture("verticalLineBreak.png");
    
    /** Texture de la ligne verticale inf�rieure. */
    public static final Texture bottomVerticalLine = new Texture("bottomVerticalLine.png");
    
    /** Texture de la ligne horizontale gauche. */
    public static final Texture leftHorizontalLine = new Texture("leftHorizontalLine.png");
    
    /** Texture d'une ligne horizontale. */
    public static final Texture horizontalLine = new Texture("horizontalLine.png");
    
    /** Texture d'une ligne horizontale avec une cassure. */
    public static final Texture horizontalLineBreak = new Texture("horizontalLineBreak.png");
    
    /** Texture du coin gauche. */
    public static final Texture cornerLeft = new Texture("cornerLeft.png");
    
    /** Texture du coin droit. */
    public static final Texture cornerRight = new Texture("cornerRight.png");
    
    /** Texture du coin inf�rieur droit. */
    public static final Texture cornerRightBottom = new Texture("cornerRightBottom.png");
    
    /** Texture du coin inf�rieur gauche. */
    public static final Texture cornerLeftBottom = new Texture("cornerLeftBottom.png");
    
    /** Texture d'un bloc. */
    public static final Texture block = new Texture("block.png");
    
    /** Texture d'un c�ur plein. */
    public static final Texture fullHeart = new Texture("fullHeart.png");
    
    /** Texture d'un c�ur � moiti�. */
    public static final Texture semiHeart = new Texture("semiHeart.png");
    
    /** Texture d'un c�ur vide. */
    public static final Texture emptyHeart = new Texture("emptyHeart.png");
    
    /** Texture transparente. */
    public static final Texture transparent = new Texture("transparent.png");
    
    /** Texture de la porte ouverte 1. */
    public static final Texture doorOpen1 = new Texture("doorOpen1.png");
    
    /** Texture de la porte ouverte 2. */
    public static final Texture doorOpen2 = new Texture("doorOpen2.png");
    
    /** Texture de la porte ouverte 3. */
    public static final Texture doorOpen3 = new Texture("doorOpen3.png");
    
    /** Texture de la porte ouverte 4. */
    public static final Texture doorOpen4 = new Texture("doorOpen4.png");
    
    /** Texture de la porte ferm�e 1. */
    public static final Texture door1 = new Texture("door1.png");
    
    /** Texture de la porte ferm�e 2. */
    public static final Texture door2 = new Texture("door2.png");
    
    /** Texture de la porte ferm�e 3. */
    public static final Texture door3 = new Texture("door3.png");
    
    /** Texture de la porte ferm�e 4. */
    public static final Texture door4 = new Texture("door4.png");
    
    // Objets ramassables
    
    /** Texture d'un diamant. */
    public static final Texture diamond = new Texture("diamond.png", 25, 25);
    
    /** Texture d'une �p�e. */
    public static final Texture �p�e = new Texture("�p�e.png");
    
    /** Texture d'une dague. */
    public static final Texture dague = new Texture("dague.png");
    
    /** Texture d'une potion bleue. */
    public static final Texture potionBlue = new Texture("potionBlue.png", 18, 22);
    
    /** Texture d'une potion rouge. */
    public static final Texture potionRed = new Texture("potionRed.png", 18, 22);
    
    /** Texture d'une potion verte. */
    public static final Texture potionGreen = new Texture("potionGreen.png", 18, 22);
    
    /** Texture d'une potion violette. */
    public static final Texture potionPurple = new Texture("potionPurple.png", 18, 22);
    
    /** Texture d'une potion jaune. */
    public static final Texture potionYellow = new Texture("potionYellow.png", 18, 22);
    
    /** Texture d'une potion grise. */
    public static final Texture potionGray = new Texture("potionGray.png", 18, 22);
    
    /** Texture d'une cl�. */
    public static final Texture key = new Texture("key.png", 18, 22);
    
    // Ennemis
    
    /** Texture du Roi des cochons. */
    public static final Texture pigKing = new Texture("pigKing.png");
    
    /** Texture d'un cochon. */
    public static final Texture pigMob = new Texture("pigMob.png");
    
    /** Texture d'un drapeau. */
    public static final Texture flag = new Texture("flag.png", 18, 22);
    
    /** Texture du marchand. */
    public static final Texture merchant = new Texture("merchant.png");
    
    /** Texture du second marchand. */
    public static final Texture merchant2 = new Texture("merchant2.png");
    
    /** Texture d'un dialogue avec un PNJ. */
    public static final Texture dialogPnj = new Texture("dialogPnj.png");
    
    // Armes
    
    /** Texture d'un marteau. */
    public static final Texture hammer = new Texture("hammer.png");
    
    /** Texture d'un marteau am�lior�. */
    public static final Texture hammerBoosted = new Texture("hammerBoosted.png", 32, 20);
}
