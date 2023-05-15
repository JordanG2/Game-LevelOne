package game.pnj;

import game.character.Player;
import game.map.Map;
import game.textures.Constants;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class PnjCollision {
	public static boolean testCollision(Monster monster,GridPane gridpane,double diffX, double diffY, Map map) {		
			Player player = map.getPlayer();
			monster.getImageView().setLayoutX(monster.getImageView().getLayoutX()+diffX);
			monster.getImageView().setLayoutY(monster.getImageView().getLayoutY()+diffY);
	
		    Bounds monsterBounds = monster.getImageView().getBoundsInParent();
		     
		    monster.getImageView().setLayoutX(monster.getImageView().getLayoutX()-diffX);
		    monster.getImageView().setLayoutY(monster.getImageView().getLayoutY()-diffY);
			for (Node obstacle : gridpane.getChildren()) {
				
				    //V�rifier si le joueur est en collision avec l'obstacle
					 if (obstacle instanceof ImageView ) {
			 
						 //creation des bounds de l'obstacle et du player our verif les collisions
						 Bounds obstacleBounds = obstacle.getBoundsInParent();
	
					    //s'il y a collision
					    if (obstacleBounds.intersects(monsterBounds)) {

					    	//recuperation de l'url de l'image dde l'obstacle 
					    	Image obstacleImage = ((ImageView) obstacle).getImage();
					        String obstacleImagePath = obstacleImage.getUrl();
					        
					        //Switch selon le nom de l'img (via l'URL)
					        switch(obstacleImagePath.substring(16)) {
					        case "diamond.png":   
								return false;
					        case "�p�e.png":   
								return false;
					        case "potionBlue.png":
								return false;
					        case "potionRed.png":
								return false;
					        case "key.png":
								return false;
					        default:
					        	
					        break;
					        }
					    	return true;
					    }
					 }
				}
	
		     Bounds playerBounds = player.getSprite().getBoundsInParent();
		     if (playerBounds.intersects(monsterBounds)) {
		    	 //animation de d�placement avant puis arri�re tr�s rapide pour faire un semblant d'attaque
		    	 System.out.println("PV avant collision :"+player.getHealth());
		    	 player.setHealth(player.getHealth()-monster.getStrength(),map);
		    	 System.out.println("PV apres collision :"+player.getHealth());
		    	 return true;
		     }
			return false;
	}
	
	public static boolean testVision(Bounds bound, Map map) {	
		for (Node obstacle : map.getGridpaneObstacle().getChildren()) {
			
			 if (obstacle instanceof ImageView ) { // On v�rifie si le joueur est coll� � un mur, si c est le cas alors il ne pourra pas voir � travers
				 Bounds obstacleBounds = obstacle.getBoundsInParent();
				 if (obstacleBounds.intersects(bound)) {
					 return true;
				 }
			 }
		}
		return false;
	}
}
