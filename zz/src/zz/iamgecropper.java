package zz;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class iamgecropper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X axis: ");
		int x=sc.nextInt();
		System.out.println("Enter the Y axis: ");
		int y= sc.nextInt();
		System.out.println("Enter image height: ");
		int height = sc.nextInt();
		System.out.println("Enter image Length:");
		int length=sc.nextInt();
		sc.close();
		try {
			BufferedImage originalImg = ImageIO.read(new File("C:/Users/YOGEGH/OneDrive - Capgemini/Desktop/Logo.png"));
			System.out.println("o i Dimension"+originalImg.getWidth()+"X"+originalImg.getHeight());
		
		BufferedImage SubImg=originalImg.getSubimage(x,y,height,length);
		System.out.println("n i Dimension"+SubImg.getWidth()+"x"+SubImg.getHeight());
		File Outputfile = new File("C:/Users/YOGEGH/OneDrive - Capgemini/Desktop/Logocropped.png");
		ImageIO.write(SubImg, "png", Outputfile);
		System.out.println("c i c s");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
