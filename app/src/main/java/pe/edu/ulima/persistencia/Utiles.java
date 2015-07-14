package pe.edu.ulima.persistencia;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by hquintana on 14/07/15.
 */
public class Utiles {
    public static String convertFisToString(FileInputStream fis) throws IOException {
        StringBuilder builder = new StringBuilder();
        int ch;
        while((ch = fis.read()) != -1){
            builder.append((char)ch);
        }
        return builder.toString();
    }
}
