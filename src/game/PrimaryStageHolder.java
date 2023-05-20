package game;

import javafx.stage.Stage;

/**
 * Classe utilitaire pour stocker la r�f�rence de la fen�tre principale de l'application.
 */
public class PrimaryStageHolder {
    private static Stage primaryStage;

    /**
     * D�finit la fen�tre principale.
     *
     * @param stage La fen�tre principale � d�finir.
     */
    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    /**
     * R�cup�re la r�f�rence de la fen�tre principale.
     *
     * @return La r�f�rence de la fen�tre principale.
     */
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
