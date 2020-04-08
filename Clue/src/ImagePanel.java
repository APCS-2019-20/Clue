//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.*;
//
//import javax.imageio.ImageIO;
//import javax.swing.JPanel;
//
//public class ImagePanel extends JPanel 
//{
//	private static final long serialVersionUID = 1L;
//	private BufferedImage image;
//	private String name;
//	
//	public ImagePanel(BufferedImage image) {
//		this.name = name;
//		this.image = image;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public BufferedImage getImage() {
//		return image;
//	}
//	
//	public void paint(Graphics g) {
//		g.drawImage(image, 0, 0, this);
//	}
//	
//	public void loadOriginalImage(File file) {
//		try {
//			image = ImageIO.read(new File(name + "jpg"));
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//}
