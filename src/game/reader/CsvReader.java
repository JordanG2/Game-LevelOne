package game.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe utilitaire pour lire un fichier CSV.
 */
public class CsvReader {
	
    /**
     * Lit un fichier CSV et renvoie une matrice de cha�nes de caract�res repr�sentant les donn�es.
     *
     * @param filePath Chemin du fichier CSV � lire.
     * @return Matrice de cha�nes de caract�res repr�sentant les donn�es du fichier CSV.
     */
    public static String[][] ReadFile(String filePath) {
        String line;
        String cvsSplitBy = ",";

        String[][] matrix = new String[22][38];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            int row = 0;
            while ((line = br.readLine()) != null && row < matrix.length) {

                // Utiliser la virgule comme s�parateur pour diviser la ligne en valeurs individuelles
                String[] values = line.split(cvsSplitBy);
            	
            	for(int col = 0 ; col < 38; col++) {
            		matrix[row][col] = values[col];
            	}
            	row++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }
}
