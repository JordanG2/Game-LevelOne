package game;

import game.map.Map;
import game.popUp.ActionEchap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * Classe principale du jeu.
 * Cette classe �tend la classe Application de JavaFX pour cr�er et g�rer la fen�tre du jeu.
 */
public class Game extends Application {

    private static final int SCENE_WIDTH = 1216;
    private static final int SCENE_HEIGHT = 704;

    /**
     * M�thode principale de l'application JavaFX.
     * Elle est appel�e lors du lancement de l'application et initialise la fen�tre du jeu.
     *
     * @param primaryStage la fen�tre principale de l'application
     * @throws Exception en cas d'erreur lors de l'initialisation de la fen�tre
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cr�ation de la carte
        Map map = new Map(SCENE_WIDTH, SCENE_HEIGHT);
        // Cr�ation de la sc�ne � partir de la carte
        Scene scene = map.createMap();

        // Gestion des �v�nements clavier
        scene.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            // V�rification si le joueur est en train d'attaquer pour emp�cher les actions suppl�mentaires
            if (!map.getPlayer().isAttacking()) {
                switch (keyCode) {
                    case Z:
                        map.getPlayer().getAnimationUp().play();
                        break;
                    case S:
                        map.getPlayer().getAnimationDown().play();
                        break;
                    case Q:
                        map.getPlayer().getAnimationLeft().play();
                        break;
                    case D:
                        map.getPlayer().getAnimationRight().play();
                        break;
                    case I:
                        map.getPlayer().stopAnimation();
                        map.getPlayer().getInventory().updateStageInventory(map.getPlayer(), map);
                        map.getPlayer().getInventory().getStage().show();
                        break;
                    case ESCAPE:
                        map.stopMonster();
                        ActionEchap.displayPause(map);
                    default:
                        break;
                }
            }
        });

        scene.setOnKeyReleased(event -> {
            KeyCode keyCode = event.getCode();
            switch (keyCode) {
                case Z:
                    map.getPlayer().getAnimationUp().stop();
                    break;
                case S:
                    map.getPlayer().getAnimationDown().stop();
                    break;
                case Q:
                    map.getPlayer().getAnimationLeft().stop();
                    break;
                case D:
                    map.getPlayer().getAnimationRight().stop();
                    break;
                default:
                    break;
            }
        });

        scene.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown() && !map.getPlayer().isAttacking()) {
                if (!map.getPlayer().getWeapon().equals(null)) {
                    map.getPlayer().setAttacking(true);
                    map.getPlayer().attack(map);
                }
                map.getPlayer().setAttacking(false);
            }
        });

        primaryStage.setTitle("LEVELONE");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        PrimaryStageHolder.setPrimaryStage(primaryStage);
        primaryStage.show();
    }

    /**
     * M�thode principale de lancement du jeu.
     *
     * @param args les arguments de ligne de commande
     */
    public static void main(String[] args) {
        launch(args);
    }
}
