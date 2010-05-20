/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Support;

import javax.swing.ImageIcon;

/**
 *
 * @author  Irwan Faturahman
 *          13508100
 */
public class ImageSupport {
    public static final int IMAGE_WIDTH = 50;
    public static final int IMAGE_HEIGHT = 50;

    public static ImageIcon createImageIcon(String path, String description) {
       java.net.URL imgURL = ImageSupport.class.getResource("/Image/"+path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            imgURL = ImageSupport.class.getResource("\\Image\\"+path);
            if (imgURL != null) {
                return new ImageIcon(imgURL, description);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }
    }
}
