
    
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class BMWG80HDSharpViewer extends JPanel {
    private BufferedImage originalImage;
    private BufferedImage hdImage;

    public BMWG80HDSharpViewer() {
        try {
            originalImage = ImageIO.read(new File("BMWG80.jpg"));
            hdImage = getSmoothScaledInstance(originalImage, 1200, 800);
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }

    // Multi-step scaling for high clarity
    private BufferedImage getSmoothScaledInstance(BufferedImage img, int targetWidth, int targetHeight) {
        int w = img.getWidth();
        int h = img.getHeight();

        BufferedImage temp = img;

        // Downscale in multiple steps
        do {
            if (w > targetWidth) w /= 2;
            if (h > targetHeight) h /= 2;

            if (w < targetWidth) w = targetWidth;
            if (h < targetHeight) h = targetHeight;

            BufferedImage tmp = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = tmp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawImage(temp, 0, 0, w, h, null);
            g2.dispose();

            temp = tmp;
        } while (w != targetWidth || h != targetHeight);

        return temp;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (hdImage != null) {
            g.drawImage(hdImage, 0, 0, this);
        } else {
            g.drawString("HD Image not found", 50, 50);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMW G80 HD Sharp Viewer - 1200x800");
        BMWG80HDSharpViewer panel = new BMWG80HDSharpViewer();

        frame.setSize(1200, 840); // Slight padding for borders
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
