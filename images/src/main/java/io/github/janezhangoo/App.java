package io.github.janezhangoo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedImage toAdd = getBufferedImage("add.jpg");

        File folder = new File("C:\\desktop\\");
        Arrays.stream(folder.list()).sequential().forEach(x -> {
            if ("add.jpg".equalsIgnoreCase(x) || x.startsWith("tagged")) {
                return;
            }
            try {
                combine(getBufferedImage(x), toAdd, "tagged\\tagged-" + x);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


    private static BufferedImage getBufferedImage(String fileName) throws IOException {
        System.out.println("Start process " + fileName);
        File img = new File(fileName);
        // For storing image in RAM
        BufferedImage image = null;

        // READ IMAGE
        try {
            // Reading input file
            image = ImageIO.read(img);
            System.out.println("Reading complete.");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        return image;
    }

    private static void combine(BufferedImage image, BufferedImage toAdd, String targetName) {
        // WRITE IMAGE
        try {
            // Output file path
            File output_file = new File(targetName);

            // create the new image, canvas size is the max. of both image sizes
            int w = Math.max(image.getWidth(), toAdd.getWidth());
            int h = Math.max(image.getHeight(), toAdd.getHeight());

            BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

            System.out.println("X="+image.getWidth());
            System.out.println("Y="+image.getHeight());

            int x = image.getWidth() - toAdd.getWidth();
            //stretched height
            int y = Math.max(0, ((1080 * image.getWidth()) / 1920 - 1080) / 2);
            // paint both images, preserving the alpha channels

            System.out.println("x="+x);
            System.out.println("y="+y);

            Graphics g = combined.getGraphics();
            g.drawImage(image, 0, 0, null);
            g.drawImage(toAdd, x, y, null);

            g.dispose();

            // Save as new image
            ImageIO.write(combined, "PNG", output_file);

            System.out.println("Writing complete.");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }

}

