package lec10;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UserTest {
    public static void main(String[] args) throws AWTException, IOException {
        //creen();
        Robot r = new Robot();
        r.mouseMove(0,0);
        //r.keyPress();

    }

    private static void creen() throws AWTException, IOException {
        Robot r = new Robot();
        BufferedImage img = r.createScreenCapture(new Rectangle(0, 0, 500, 500));
        int height =  img.getHeight();
        int width = img.getWidth();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int rgb = img.getRGB(x,y);
                img.setRGB(x,y,~rgb);

            }

        }
        ImageIO.write(img,"png",new File("D:/JavaProject/Javatest/screen.png"));
    }
}
