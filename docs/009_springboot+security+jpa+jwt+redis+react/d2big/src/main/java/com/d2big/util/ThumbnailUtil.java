package com.d2big.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ThumbnailUtil {

    public static void createThumbnail(String originalPath, String thumbnailPath, int width, int height) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File(originalPath));
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g = resized.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        ImageIO.write(resized, "jpg", new File(thumbnailPath));
    }
}
