package game.pnj;

import java.util.Random;

import game.character.Player;
import game.inventory.Inventory;
import game.item.AbstractItem;
import game.map.Map;
import game.textures.Texture;
import javafx.animation.PauseTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.BoundingBox;
import javafx.geometry.Bounds;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * Classe repr�sentant les monstres du jeu.
 */
public class Monster extends AbstractPnj {
    private int health;
    private int strength;
    private int speed;
    private boolean hasVision;
    private ImageView imageView;
    //private AbstractItem itemOnDeath;
    private Timeline randomM;
    private Inventory inventory;
    private int x;
    private int y;
    private int newX;
    private int newY;

    /**
     * Constructeur de la classe Monster.
     *
     * @param name      Le nom du monstre.
     * @param health    La sant� du monstre.
     * @param strength  La force du monstre.
     * @param hasVision Indique si le monstre a une vision.
     * @param image     La texture/image repr�sentant le monstre.
     * @param drop      L'objet � droper lorsque le monstre est vaincu.
     * @param map       La carte du jeu.
     * @param x         La position en X du monstre sur la carte.
     * @param y         La position en Y du monstre sur la carte.
     */
    public Monster(String name, int health, int strength, boolean hasVision, Texture image, AbstractItem drop, Map map, int x, int y) {
        super(name, image, true);
        this.health = health;
        this.strength = strength;
        this.hasVision = hasVision;
        this.speed = 30;
        this.imageView = image.getImageView();
        this.imageView.setFitHeight(30);
        this.imageView.setFitWidth(30);
        //this.itemOnDeath = drop;
        this.inventory = new Inventory();
        this.inventory.push(drop);
        this.imageView.setUserData(this);

        this.x = x;
        this.y = y;
        this.newX = x;
        this.newY = y;
        this.randomM = new Timeline();
        this.randomM.getKeyFrames().add(new KeyFrame(Duration.seconds(1), event -> {
            this.randomMove(map);
        }));
        this.randomM.setCycleCount(Timeline.INDEFINITE);
    }

    /**
     * Getter pour l'inventaire du monstre.
     *
     * @return L'inventaire du monstre.
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Setter pour l'inventaire du monstre.
     *
     * @param inventory L'inventaire du monstre.
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * Getter pour la timeline de d�placement al�atoire du monstre.
     *
     * @return La timeline de d�placement al�atoire du monstre.
     */
    public Timeline getRandomM() {
        return randomM;
    }

    /**
     * Setter pour la timeline de d�placement al�atoire du monstre.
     *
     * @param randomM La timeline de d�placement al�atoire du monstre.
     */
    public void setRandomM(Timeline randomM) {
        this.randomM = randomM;
    }

    /**
     * Getter pour l'ImageView du monstre.
     *
     * @return L'ImageView du monstre.
     */
    public ImageView getImageView() {
        return imageView;
    }

    /**
     * Setter pour l'ImageView du monstre.
     *
     * @param imageView L'ImageView du monstre.
     */
    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    /**
     * Getter pour la sant� du monstre.
     *
     * @return La sant� du monstre.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Setter pour la sant� du monstre.
     *
     * @param health La sant� du monstre.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Getter pour la force du monstre.
     *
     * @return La force du monstre.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Getter pour la vitesse du monstre.
     *
     * @return La vitesse du monstre.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter pour la vitesse du monstre.
     *
     * @param speed La vitesse du monstre.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Setter pour la force du monstre.
     *
     * @param strength La force du monstre.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * V�rifie si le monstre a une vision.
     *
     * @return true si le monstre a une vision, false sinon.
     */
    public boolean hasVision() {
        return hasVision;
    }

    /**
     * Setter pour la vision du monstre.
     *
     * @param hasVision Indique si le monstre a une vision.
     */
    public void setHasVision(boolean hasVision) {
        this.hasVision = hasVision;
    }

    /**
     * Getter pour la position en X du monstre sur la carte.
     *
     * @return La position en X du monstre sur la carte.
     */
    public int getX() {
        return x;
    }

    /**
     * Setter pour la position en X du monstre sur la carte.
     *
     * @param x La position en X du monstre sur la carte.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter pour la position en Y du monstre sur la carte.
     *
     * @return La position en Y du monstre sur la carte.
     */
    public int getY() {
        return y;
    }

    /**
     * Setter pour la position en Y du monstre sur la carte.
     *
     * @param y La position en Y du monstre sur la carte.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter pour la nouvelle position en X du monstre sur la carte.
     *
     * @return La nouvelle position en X du monstre sur la carte.
     */
    public int getNewX() {
        return newX;
    }

    /**
     * Setter pour la nouvelle position en X du monstre sur la carte.
     *
     * @param newX La nouvelle position en X du monstre sur la carte.
     */
    public void setNewX(int newX) {
        this.newX = newX;
    }

    /**
     * Getter pour la nouvelle position en Y du monstre sur la carte.
     *
     * @return La nouvelle position en Y du monstre sur la carte.
     */
    public int getNewY() {
        return newY;
    }

    /**
     * Setter pour la nouvelle position en Y du monstre sur la carte.
     *
     * @param newY La nouvelle position en Y du monstre sur la carte.
     */
    public void setNewY(int newY) {
        this.newY = newY;
    }

    /**
     * Fait tomber l'objet du monstre sur la carte.
     *
     * @param map la carte du jeu
     */
    public void drop(Map map) {
        // R�cup�ration des coordonn�es x et y
        int x = (int)this.getNewX();
        int y = (int)this.getNewY();
        
        // Arr�t de la timeline de d�placement al�atoire du monstre
        this.randomM.stop();
        
        // Suppression de l'image du monstre du conteneur parent
        map.getGridpanePnj().getChildren().remove(this.getImageView());
        
        // Suppression du monstre du tableau de monstres de la carte
        map.getTableauDeMonstres().remove(this);
        
        // Boucle sur les objets de l'inventaire du monstre
        for(AbstractItem item : this.getInventory().getItem()) {
            if(item != null) {
                // Ajout de l'image de l'objet � l'emplacement (x, y) du conteneur d'interaction de la carte
                map.getGridpaneInteract().add(item.getImageView(), x, y);
            }
        }
    }
    
    /**
     * Anime le monstre lorsqu'il subit des d�g�ts.
     * Le monstre clignote pendant une courte p�riode pour indiquer qu'il est touch�.
     */
    public void takingDamage() {
        // Cr�ation d'une timeline pour animer le monstre lorsqu'il subit des d�g�ts
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), event -> {
            this.getImageView().setVisible(!this.getImageView().isVisible());
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        
        // D�sactivation de la possibilit� de subir des d�g�ts pendant l'animation
        this.setCanBeHurt(false);
        
        // Cr�ation d'une pause de 1 seconde
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(event -> {
            // Arr�t de l'animation et r�apparition du monstre
            timeline.stop();
            this.getImageView().setVisible(true);
            
            // R�activation de la possibilit� de subir des d�g�ts
            this.setCanBeHurt(true);
        });
        
        // Lancement de l'animation et de la pause
        timeline.play();
        pause.play();
    }

    /**
     * D�place le monstre dans une direction sp�cifi�e.
     * 
     * @param direction la direction du d�placement (UP, DOWN, LEFT, RIGHT)
     * @param map la carte du jeu
     * @return true si le d�placement a �t� effectu�, sinon false
     */
    public boolean move(String direction, Map map) {
        boolean hasMoved = false;

        switch(direction) {
            case "UP":
                hasMoved = this.moveIfPossible(map, 0, -1, "Up");
                break;
            case "DOWN":
                hasMoved = this.moveIfPossible(map, 0, 1, "Down");
                break;
            case "LEFT":
                hasMoved = this.moveIfPossible(map, -1, 0, "Left");
                break;
            case "RIGHT":
                hasMoved = this.moveIfPossible(map, 1, 0, "Right");
                break;
        }

        return hasMoved;
    }

    /**
     * D�place le monstre dans une direction sp�cifi�e si le d�placement est possible.
     * 
     * @param map la carte du jeu
     * @param newX la nouvelle position en x du monstre
     * @param newY la nouvelle position en y du monstre
     * @param direction la direction du d�placement (Up, Down, Left, Right)
     * @return true si le d�placement a �t� effectu�, sinon false
     */
    private boolean moveIfPossible(Map map, int newX, int newY, String direction) {
        // V�rification des collisions avec les objets interactifs et les obstacles
        if (!PnjCollision.testCollision(this, map.getGridpaneInteract(), newX, newY, map, direction) && 
            !PnjCollision.testCollision(this, map.getGridpaneObstacle(), newX, newY, map, direction)) {
            
            // Animation du d�placement du monstre
            MonsterAnimation.animatedMove(map.getGridpanePnj(), this.getImageView(), direction, this.getX(), this.getY(), this.getNewX() + newX, this.getNewY() + newY);
            
            // Mise � jour des nouvelles coordonn�es du monstre
            this.setNewX(this.getNewX() + newX);
            this.setNewY(this.getNewY() + newY);
            
            return true;
        }
        
        return false;
     }

    /**
     * Effectue un d�placement al�atoire du monstre sur la carte.
     * Si le monstre a d�j� rep�r� le joueur, il ne se d�place pas.
     * Le d�placement est effectu� en choisissant une direction al�atoire parmi les 4 possibles (haut, bas, gauche, droite).
     * Si le d�placement n'est pas possible dans la direction choisie, une nouvelle direction est s�lectionn�e jusqu'� ce que le d�placement soit possible.
     * @param map La carte du jeu.
     */
    public void randomMove(Map map) {
        this.playerInVision(map);
        if (this.hasVision()) {
            return;
        }

        boolean hasMoved;
        int direction;
        Random random = new Random();
        direction = random.nextInt(4);

        switch (direction) {
            case 0:
                hasMoved = this.moveIfPossible(map, 0, -1, "Up");
                break;
            case 1:
                hasMoved = this.moveIfPossible(map, -1, 0, "Left");
                break;
            case 2:
                hasMoved = this.moveIfPossible(map, 1, 0, "Right");
                break;
            case 3:
                hasMoved = this.moveIfPossible(map, 0, 1, "Down");
                break;
            default:
                hasMoved = false;
                break;
        }
        if(!hasMoved) {
            randomMove(map);
        }
    }

    /**
     * V�rifie si le monstre a rep�r� le joueur et effectue un d�placement dans la direction sp�cifi�e si possible.
     * La vision du monstre est v�rifi�e en comparant les coordonn�es du monstre avec celles du joueur.
     * Si le monstre a une vision claire du joueur (aucun obstacle), il se d�place vers le joueur dans la direction sp�cifi�e.
     * @param sortX Coordonn�e X du point sup�rieur gauche de la vision rapproch�e du monstre.
     * @param sortY Coordonn�e Y du point sup�rieur gauche de la vision rapproch�e du monstre.
     * @param shortWidth Largeur de la vision rapproch�e du monstre.
     * @param sortHeight Hauteur de la vision rapproch�e du monstre.
     * @param longX Coordonn�e X du point sup�rieur gauche de la vision �loign�e du monstre.
     * @param longY Coordonn�e Y du point sup�rieur gauche de la vision �loign�e du monstre.
     * @param longWidth Largeur de la vision �loign�e du monstre.
     * @param longHeight Hauteur de la vision �loign�e du monstre.
     * @param playerBounds Les limites du joueur.
     * @param direction La direction dans laquelle le monstre doit se d�placer.
     * @param map La carte du jeu.
     * @return true si le monstre a pu effectuer le d�placement, sinon false.
     */
    private boolean checkVisionAndMoveIfPossible(double sortX, double sortY, double shortWidth, double sortHeight, double longX, double longY, double longWidth, double longHeight, Bounds playerBounds, String direction, Map map) {
        if (!PnjCollision.testVision(new BoundingBox(sortX,sortY,shortWidth,sortHeight), map) && playerBounds.intersects(longX, longY, longWidth, longHeight)) {
            this.setHasVision(true);
            return this.move(direction, map);
        }
        return false;
    }

    /**
     * Effectue le d�placement du monstre en fonction de la vision du joueur.
     * Cette m�thode est appel�e lorsque le monstre n'a pas encore rep�r� le joueur.
     * Le monstre v�rifie diff�rentes positions autour de lui pour d�tecter le joueur.
     * Si le joueur est d�tect�, le monstre se d�place dans la direction du joueur.
     * @param map La carte du jeu.
     */
    public void playerInVision(Map map) {
        this.setHasVision(false);
        Bounds playerBounds = map.getPlayer().getSprite().getBoundsInParent();
        Bounds monsterBounds = this.getImageView().getBoundsInParent();

        if (!checkVisionAndMoveIfPossible(monsterBounds.getMinX() - 30, monsterBounds.getMinY() - 30, monsterBounds.getWidth(), monsterBounds.getHeight() + 30, monsterBounds.getMinX() - 64, monsterBounds.getMinY() - 64, 64, 94, playerBounds, "LEFT", map)) {
            if (!checkVisionAndMoveIfPossible(monsterBounds.getMinX(), monsterBounds.getMinY() - 30, monsterBounds.getWidth() + 30, monsterBounds.getHeight(), monsterBounds.getMinX(), monsterBounds.getMinY() - 64, 94, 64, playerBounds, "UP", map)) {
                if (!checkVisionAndMoveIfPossible(monsterBounds.getMinX() + 30, monsterBounds.getMinY(), monsterBounds.getWidth(), monsterBounds.getHeight() + 30, monsterBounds.getMinX() + 30, monsterBounds.getMinY(), 64, 94, playerBounds, "RIGHT", map)) {
                    checkVisionAndMoveIfPossible(monsterBounds.getMinX() - 30, monsterBounds.getMinY() + 30, monsterBounds.getWidth() + 30, monsterBounds.getHeight(), monsterBounds.getMinX() - 64, monsterBounds.getMinY() + 30, 94, 64, playerBounds, "DOWN", map);
                }
            }
        }
    }

    /**
     * Effectue une attaque du monstre sur le joueur dans la direction sp�cifi�e.
     * L'animation d'attaque du monstre est d�clench�e.
     * La sant� du joueur est r�duite en fonction de la force du monstre.
     * Si la sant� du joueur atteint 0 ou moins, l'image du joueur est chang�e pour indiquer qu'il est mort.
     * @param player Le joueur.
     * @param map La carte du jeu.
     * @param direction La direction de l'attaque.
     */
    public void attack(Player player, Map map, String direction) {
        MonsterAnimation.animatedAttack(this.getImageView(), direction);
        player.setHealth(player.getHealth() - this.getStrength(), map);

        // Le monstre vole un item au joueur quand il le frappe
        //this.getInventory().push(player.getInventory().getItem()[1]);
        //player.getInventory().remove(player.getInventory().getItem()[1], player, map);

        if(player.getHealth() <= 0) {
            player.getSprite().setImage(new Image("file:res/images/dead.png"));
        }
    }
}
