
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.color.*;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

public class ExtraCreditPictureMP2 extends Canvas
{
	
	// Gathering all colors. 
	
			Color pumpkinOrange = new Color(255, 117, 24);
			Color pumpkinStem = new Color(0, 82, 33);
			//Color midnightSky = new Color(56, 67, 104);
			Color daySky = new Color(142, 193, 233);
			//Color greenGrass = new Color(51, 133, 72); 
			Color greenGrass = new Color(98, 149, 55);
			Color darkClouds = new Color(183, 183, 178);
			Color middleClouds = new Color(200, 198, 190);
			Color lightClouds = new Color(216, 212, 202);
			//Color moon = new Color(238, 239, 234);
			Color moon = new Color(165, 165, 165);
			Color moonTwo = new Color(155, 155, 155);
			//Color craterTwo = new Color(183, 183, 178);
			//Color craterTwo = new Color(96,95,103,255);
			//Color craterOne = new Color(128, 132, 143);
			//Color craterOne = new Color(112,105,110,255);
			//Color moonTwo = new Color(150,149,157,255);
			Color moonThree = new Color(160, 160, 160);
			Color moonFour = new Color(162, 162, 162, 162);
			Color craterOne = new Color(145, 145, 145);
			Color craterTwo = new Color(135, 135, 135);
			Color woodStick = new Color(80, 73, 59);
			Color jeanBlue = new Color(123, 144, 164);
			Color jeanBlueTwo = new Color(136, 182, 204);
			Color darkGreen = new Color(27, 65, 37);
			Color darkBrown = new Color(28, 13, 1);
			Color transparent = new Color(0, 128, 0);
			Color starOne = new Color(205, 187, 183);
			Color otherDarkGreen = new Color(84, 121, 42);
			Color insidePumpkin = new Color(255,211,8,255);
			Color lightning = new Color(229, 220, 204);
			Color newGreen = new Color(65, 100, 36);
			Color otherNewGreen = new Color(93, 135, 54);
			Color pumpkinWall = new Color(96, 43, 9);
			Color flashBangLightning = new Color(241, 237, 233);
			Color newPumpkinWall = new Color(193, 91, 22);
			Color newGrass = new Color(138, 189, 29);
			Color newBush = new Color(90, 119, 24);
			Color sun = new Color(255, 204, 97);
			Color whiteOne = new Color(234,235,237,255); 
			Color whiteTwo = new Color(222, 223, 227);
			Color whiteThree = new Color(232, 232, 232);
			Color turkeyBody = new Color(195,155,123); 
			Color turkeyTail = new Color(48,31,18);
			Color beak = new Color(232,122,6);
			Color roosterRed = new Color(245, 5, 4);
			Color backLeg = new Color(122, 75, 25);
			Color feet = new Color(254, 129, 0);
			
			Color groundhogOne = new Color(176,97,41,255);
			Color groundhogTwo = new Color(140, 76, 30);
			Color groundhogThree = new Color(244,178,102,255);
			Color groundhogFour = new Color(196,154,108,255);
			Color teeth = new Color(255,255,255,255);
			Color hatOne = new Color(58,58,60,255);
			Color shadow = new Color(45, 45, 45);
			
	public ExtraCreditPictureMP2()
	{
		
		//Setting Background. 
		
		setBackground(daySky);
	
	}

	public void paint( Graphics window )
	{
		
		//Grass. 
		
		window.setColor(newBush);
		//window.setColor(otherDarkGreen);
		window.fillOval(-75, 500, 150, 100);
		window.fillOval(-25, 525, 150, 100);
		window.fillOval(725, 500, 150, 100);
		window.fillOval(675, 525, 150, 100);
				
		window.setColor(Color.BLACK);
		window.drawOval(-75, 500, 150, 100);
		window.drawOval(725, 500, 150, 100);
		
		window.setColor(newGrass);
		window.fillRect(0, 575, 800, 325);
				
		window.setColor(Color.BLACK);
		window.drawRect(0, 575, 800, 325);
		
		//Sun. 
					
		window.setColor(Color.BLACK);
		window.fillOval(-50, -48, 302, 300);
		window.setColor(sun);
		window.fillOval(-50, -50, 300, 300);
		
		//Clouds. 
		
		window.setColor(whiteThree);
		window.fillOval(-50, -65, 300, 200);
		window.fillOval(150, -65, 300, 200);
		window.fillOval(350, -65, 300, 200);
		window.fillOval(550, -65, 300, 200);
		
		window.setColor(whiteTwo);
		window.fillOval(-25, -90, 300, 200);
		window.fillOval(175, -90, 300, 200);
		window.fillOval(375, -90, 300, 200);
		window.fillOval(575, -90, 300, 200);
		
		window.setColor(whiteOne);
		window.fillOval(-75, -115, 300, 200);
		window.fillOval(125, -115, 300, 200);
		window.fillOval(325, -115, 300, 200);
		window.fillOval(525, -115, 300, 200);
		
		//Shadow. 
		
//		window.setColor(newBush);
//		window.fillOval(375, 650, 175, 200);
		
		//Hole in the ground. 
		
		window.setColor(Color.BLACK);
		window.fillOval(250, 625, 302, 75);
		
		//Groundhog. 
		
		window.setColor(groundhogOne);
		window.drawOval(425, 600, 60, 30);
		window.fillOval(425, 610, 60, 30);
		window.drawOval(425, 613, 65, 30);
		window.fillOval(425, 623, 65, 30);
		window.fillOval(425, 650, 60, 30);
		window.drawOval(425, 660, 60, 30);
		
		window.drawOval(315, 600, 60, 30);
		window.fillOval(315, 610, 60, 30);
		window.drawOval(315, 613, 65, 30);
		window.fillOval(315, 625, 65, 30);
		window.fillOval(315, 650, 60, 30);
		window.drawOval(315, 660, 60, 30);
		
		window.setColor(Color.BLACK);
		window.drawOval(425, 600, 60, 30);
		window.drawOval(425, 610, 60, 30);
		window.fillOval(426, 613, 65, 30);
		window.fillOval(430, 665, 60, 30);
		
		window.drawOval(315, 600, 60, 30);
		window.drawOval(424, 610, 60, 30);
		window.fillOval(315, 617, 65, 30);
		window.fillOval(320, 665, 60, 30);
		
		window.fillOval(315, 675, 20, 10);
		window.fillOval(300, 670, 20, 10);
		
		window.setColor(groundhogOne);
		window.drawOval(425, 600, 60, 30);
		window.fillOval(425, 610, 60, 30);
		
		window.drawOval(315, 600, 60, 30);
		window.fillOval(315, 610, 60, 30);
		
		window.setColor(newGrass);
		window.fillRect(457, 590, 30, 30);
		window.fillOval(425, 600, 60, 30);
		window.fillOval(485, 604, 30, 30);
		window.fillOval(484, 628, 15, 5);
		window.fillOval(484, 626, 15, 5);
		window.fillOval(485, 624, 15, 5);
		window.fillOval(483, 617, 15, 5);
		
		window.fillRect(347, 590, 30, 30);
		window.fillOval(315, 600, 60, 30);
		window.fillOval(375, 604, 30, 30);
		window.fillOval(374, 628, 15, 5);
		window.fillOval(374, 626, 15, 5);
		window.fillOval(375, 624, 15, 5);
		window.fillOval(373, 617, 15, 5);
		window.fillOval(314, 600, 60, 30);
		
		window.setColor(groundhogOne);
		window.fillOval(325, 585, 150, 125);
		window.fillOval(335, 687, 15, 25);
		window.fillOval(345, 687, 15, 25);
		window.fillOval(325, 687, 15, 25);
		window.fillOval(450, 687, 15, 25);
		window.fillOval(440, 687, 15, 25);
		window.fillOval(460, 687, 15, 25);
		
		window.setColor(Color.BLACK);
		window.drawOval(351, 635, 50, 50);
		window.drawOval(400, 635, 50, 50);
		window.drawOval(325, 585, 150, 125);
		window.drawOval(325, 585, 150, 125);
		window.drawOval(345, 687, 15, 25);
		window.drawOval(325, 687, 15, 25);
		window.drawOval(335, 687, 15, 25);
		window.drawOval(450, 687, 15, 25);
		window.drawOval(440, 687, 15, 25);
		window.drawOval(460, 687, 15, 25);
		
		window.setColor(groundhogOne);
		window.fillOval(335, 687, 15, 25);
		window.fillOval(450, 687, 15, 25);
		
		window.setColor(groundhogOne);
		window.fillOval(325, 585, 150, 125);
		
		window.setColor(Color.BLACK);
		window.drawOval(325, 585, 150, 125);
		
		window.setColor(groundhogOne);
		window.fillRect(325, 615, 150, 25);
		window.fillOval(325, 575, 150, 75);
		
		window.setColor(Color.BLACK);
		window.drawRect(325, 615, 150, 25);
		
		window.setColor(groundhogOne);
		window.fillOval(325, 575, 150, 75);
		
		window.setColor(Color.BLACK);
		window.drawOval(325, 575, 150, 75);
		
		window.setColor(groundhogOne);
		window.fillOval(325, 580, 150, 75);
		
		window.setColor(teeth);
		window.fillRect(394, 667, 15, 25);
		window.setColor(Color.BLACK);
		window.drawRect(394, 667, 15, 25);
		window.fillRect(401, 670, 1, 15);
		
		window.setColor(Color.BLACK);
		window.drawOval(351, 635, 50, 50);
		window.drawOval(400, 635, 50, 50);
		
		window.setColor(groundhogOne);
		window.fillOval(325, 615, 150, 50);
		window.fillOval(345, 645, 25, 25);
		window.fillOval(435, 645, 25, 25);
		window.fillOval(403, 662, 15, 15);
		window.fillOval(402, 661, 15, 15);
		window.fillOval(404, 664, 15, 15);
		window.fillOval(403, 662, 15, 15);
		window.fillOval(385, 660, 15, 15);
		window.fillOval(383, 661, 15, 15);
		window.fillOval(384, 662, 15, 15);
		
		window.setColor(Color.BLACK);
		window.fillOval(379, 630, 45, 45);
		
		window.setColor(Color.BLACK);
		window.fillOval(365, 600, 25, 25);
		window.fillOval(414, 600, 25, 25);
		window.setColor(teeth);
		window.fillOval(367, 602, 21, 21);
		window.fillOval(416, 602, 21, 21);
		window.setColor(Color.BLACK);
		window.fillOval(424, 610, 5, 5);
		window.fillOval(375, 610, 5, 5);
		
		window.setColor(hatOne);
		window.fillOval(325, 558, 150, 50);
		window.setColor(Color.BLACK);
		window.fillOval(350, 560, 100, 30);
		window.fillRect(350, 475, 100, 100);
		window.setColor(hatOne);
		window.fillOval(350, 520, 100, 30);
		window.fillRect(350, 475, 100, 63);
		window.fillOval(350, 460, 100, 30);
		window.setColor(Color.BLACK);
		window.drawOval(350, 460, 100, 30);
		
		window.setColor(hatOne);
		window.fillRect(425, 550, 1, 37);
		window.fillRect(430, 549, 1, 37);
		
		window.setColor(groundhogOne);
		window.fillRect(470, 628, 7, 8);
		window.fillRect(470, 643, 7, 8);
		window.fillRect(472, 655, 7, 10);
		
		window.fillRect(323, 628, 7, 8);
		window.fillRect(325, 643, 7, 8);
		window.fillRect(325, 654, 7, 16);
		
		//Black Borders. 
		
		window.setColor(Color.BLACK);
		window.fillRect(0, 800, 800, 100);
		window.fillRect(800, 0, 100, 900);
		
//		window.fillOval(315, 630, 25, 50);
//		window.fillOval(460, 630, 25, 50);
		
		Font thanksgiving = new Font("Happy Groundhog Day 2022!", Font.PLAIN, 24);
		window.setFont(thanksgiving);
		window.drawString("Happy Groundhog Day 2022!", 425, 250);
		
		}
				
		//EXAMPLES! 
		
		//window.setColor(pumpkinOrange);
		//window.drawString("Circles - Ovals", 400, 300);

		//window.setColor(Color.BLUE);

		//drawOval(int x1, int y1, int width, int height)
		//window.drawOval(500,300,40,40);

		//window.setColor(Color.GREEN);
		//window.drawOval(400,100,100,50);

		//window.setColor(Color.YELLOW);
		//window.fillOval(250,250,90,90);

		//window.setColor(Color.black);
		//window.drawRect(340,250,90,90);
		
		//window.setColor(Color.RED);
		//window.fillOval(220,340,150,150);

		//window.setColor(Color.BLUE);
		//window.fillOval(250,340,120,80);
}	
