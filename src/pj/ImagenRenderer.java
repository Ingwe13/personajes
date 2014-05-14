/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import java.awt.image.BufferedImage;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class ImagenRenderer extends DefaultTableCellRenderer {

    public ImagenRenderer() {

        setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public void setValue(Object aValue) {

        if (aValue != null) {
            boolean result = (boolean) aValue;

            if (result == true) {
                try {
                    BufferedImage imgAlianza = ImageIO.read(getClass().getResource("/imagenes/alianza.png"));
                    ImageIcon imagen = new ImageIcon(imgAlianza);
                    setIcon(imagen);

                } catch (Exception e) {
                    System.out.println("se ha detectado un error");
                }

            } else {
                try {
                    BufferedImage imgMordor = ImageIO.read(getClass().getResource("/imagenes/mordor.png"));
                    ImageIcon imagen = new ImageIcon(imgMordor);
                    setIcon(imagen);

                } catch (Exception e) {
                    System.out.println("se ha detectado un error");
                }
            }
        }
    }
}
