package game.utils;

import game.character.Player;
import game.map.Map;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 * La classe MinuteurInvincibility repr�sente un minuteur pour l'invincibilit� du joueur.
 * Il affiche un compte � rebours et rend le joueur invincible pendant cette p�riode.
 */
public class MinuteurInvincibility extends GridPane{
	private static Timeline timeline;
    private static Label timeLabel;
    
    /**
     * Construit un objet MinuteurInvincibility.
     *
     * @param map La carte associ�e au minuteur.
     */
    public MinuteurInvincibility(Map map) {
    	Player player = map.getPlayer();
        // Cr�er un label pour afficher le temps
        timeLabel = new Label();
        timeLabel.setFont(new Font("Arial", 24));
        timeLabel.setTextFill(Paint.valueOf("#FFF")); // d�finit la couleur du texte en rouge
        timeLabel.setTextFill(Color.web("#FFFF00"));
        timeLabel.setAlignment(Pos.CENTER);
        timeLabel.setPrefSize(64,32);

        // Ajouter le label � la GridPane
        this.add(timeLabel, 0, 0);

        // Configurer la GridPane
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(10));
        this.setHgap(10);

        // Cr�er la timeline pour le minuteur
        timeline = new Timeline();
        timeline.setCycleCount(Animation.INDEFINITE);
        
        // Ajouter une KeyFrame toutes les secondes
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Mettre � jour le label avec le temps restant
            	player.setCanBeHurt(false);
                int remainingTime = Integer.parseInt(timeLabel.getText()) - 1;
                timeLabel.setText(Integer.toString(remainingTime));
                if (remainingTime <= 0) {
                	player.setCanBeHurt(true);
                	player.getSprite().setEffect(null);
                	timeline.stop(); // Arr�ter la timeline lorsque le temps est �coul�
                	getChildren().remove(timeLabel); 
                }
            }
        }));
    }
    
    /**
     * D�marre le minuteur d'invincibilit� avec la dur�e sp�cifi�e en secondes.
     *
     * @param durationInSeconds La dur�e de l'invincibilit� en secondes.
     */
    public void start(int durationInSeconds) {
        timeLabel.setText(Integer.toString(durationInSeconds));
        timeline.playFromStart();
    }
}
