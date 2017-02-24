import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CallTheMethod {
	JFrame window;
	
	public static void main(String[] args) {
		new CallTheMethod().start();
	}
	
	void start(){
		
		//1. Call the singASong method
		singASong();
		//2. Call the calculateAreaOfACircle method and print the result to the screen
		double area = calculateAreaOfACirle(3.14);
		
	System.out.println(area);
		
		//3. Call the drawASquare method
		//drawASquare(5,5,5,5);
		//4. Call the printEntireEnglishDictionary method
		//printEntireEnglishDictionary();
		//5. Call the reverseString method and print the results to the screen
		String bill = reverseString("LOL");
		
		System.out.println(bill);
		//6. Call the showASurprise method
		showASurprise
	}
	
	void singASong(){
		String words = "I'll have two number 9's, a number 9 large, a number 6 with extra dip, a number 7, two number 45's, one with cheese, and a large soda.﻿";
		
		 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }

	}
	
	void drawASquare(int x, int y, int w, int h){
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(700, 700);
		window.setVisible(true);
		
		JPanel p = new JPanel(){
			private static final long serialVersionUID = 1L;
			@Override
			public void paintComponent(Graphics g){
				g.fillRect(x, y, w, h);
			}
		};
		window.add(p);
		window.revalidate();
		window.repaint();
	}
	
	String reverseString(String in){
		String s = "";
		
		for(int i = in.length() - 1; i >= 0; i--){
			s += in.charAt(i);
		}
		
		return s;
	}
	
	void printEntireEnglishDictionary(){
		String s = "";
		
		try{
			URL url = new URL("https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt");
			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = "";
			while((line = bf.readLine()) != null){
				System.out.println(line);
				s += line;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	double calculateAreaOfACirle(double radius){
		return Math.PI * radius * radius;
	}
	
	void showASurprise(){
		URL url;
		BufferedImage img;
		ImageIcon icon;
		JLabel l = new JLabel();
		
		try {
			url = new URL("https://s-media-cache-ak0.pinimg.com/originals/ad/20/f9/ad20f92b25014aaf59cced7e169e6871.jpg");
			img = ImageIO.read(url);
			icon = new ImageIcon(img);
			l.setIcon(icon);
			JOptionPane.showMessageDialog(null, icon);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

