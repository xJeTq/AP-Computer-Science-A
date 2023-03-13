import javax.swing.Timer;

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

public class HalloweenPicture extends Canvas
{
	
	private Timer timer;
	final double SLEEP = 100;
	int ticks = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	
	// Gathering all colors. 
	
			Color pumpkinOrange = new Color(255, 117, 24);
			Color pumpkinStem = new Color(0, 82, 33);
			//Color midnightSky = new Color(56, 67, 104);
			Color midnightSky = new Color(42, 42, 53);
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
	
	public HalloweenPicture()
	{
		
		//Setting Background. 
		
		setBackground(midnightSky);
		
		ActionListener paintIt = new ActionListener()
		{
			 public void actionPerformed(ActionEvent event)
				{
				 repaint();
				}

		};
		timer = new Timer((int)SLEEP, paintIt);
		timer.setRepeats(true);
				
	}

	public void paint( Graphics window )
	{
		
		timer.start();
		
		b ++;
		c ++;
		d ++;
		ticks ++;
		
		if (b == 100) {
			
			b = 0;

		}
		
		if (c == 100) {
		
			c = 0;
			
		}
		
		if (d == 100) {
			
			d = 0;
			
		}
		
		//Lightning. 
		
		if (c >= 5 && c <= 6) {
				
		window.setColor(lightning);
		int [] lightningBoltHalfOneX = {600, 625, 613, 587};
		int [] lightningBoltHalfOneY = {0, 0, 225, 225};
		window.fillPolygon(lightningBoltHalfOneX, lightningBoltHalfOneY, 4);

		int [] lightningBoltOneX = {587, 613, 601, 574};
		int [] lightningBoltOneY = {225, 225, 450, 450};
		window.fillPolygon(lightningBoltOneX, lightningBoltOneY, 4);
			
		}
						
		if (c >= 11.5 && c <= 12) {
								
		window.setColor(lightning);
		int [] lightningBoltHalfTwoX = {450, 475, 463, 437};
		int [] lightningBoltHalfTwoY = {0, 0, 375, 375};
		window.fillPolygon(lightningBoltHalfTwoX, lightningBoltHalfTwoY, 4);

		int [] lightningBoltTwoX = {437, 463, 450, 424};
		int [] lightningBoltTwoY = {375, 375, 450, 450};
		window.fillPolygon(lightningBoltTwoX, lightningBoltTwoY, 4);
		
		}
						
		if (c >= 10 && c <= 10.5) {
		
		window.setColor(lightning);
		int [] lightningBoltHalfThreeX = {300, 325, 313, 287};
		int [] lightningBoltHalfThreeY = {0, 0, 325, 325};
		window.fillPolygon(lightningBoltHalfThreeX, lightningBoltHalfThreeY, 4);

		int [] lightningBoltThreeX = {287, 313, 300, 284};
		int [] lightningBoltThreeY = {325, 325, 450, 450};
		window.fillPolygon(lightningBoltThreeX, lightningBoltThreeY, 4);
			
		}
					
		//Grass.  
		
		window.setColor(newGreen);
		//window.setColor(otherDarkGreen);
		window.fillOval(-75, 500, 150, 100);
		window.fillOval(-25, 525, 150, 100);
		window.fillOval(725, 500, 150, 100);
		window.fillOval(675, 525, 150, 100);
		
		window.setColor(Color.BLACK);
		window.drawOval(-75, 500, 150, 100);
		window.drawOval(725, 500, 150, 100);
		
		window.setColor(otherNewGreen);
		window.fillRect(0, 575, 800, 325);
		
		window.setColor(Color.BLACK);
		window.drawRect(0, 575, 800, 325);
		
		window.setColor(darkGreen);
		window.fillOval(275, 650, 450, 125);
		
		// Scare Crow. (Cut) 
		
		//window.setColor(woodStick);
		//window.fillRect(650, 550, 10, 75);
		//window.setColor(jeanBlue);
		//int [] scareCrowDressX = {530, 775, 635, 670};
		//int [] scareCrowDressY = {580, 580, 350, 350};
		//window.fillPolygon(scareCrowDressX, scareCrowDressY, 4);
		//window.setColor(jeanBlueTwo);
		//window.fillRect(630, 405, 10, 50);
		//window.fillRect(667, 405, 10, 50);
		
		//Pumpkin #1. 
		
		//window.setColor(Color.BLACK);
		//window.drawRect(375, 350, 50, 100);
		
		window.setColor(Color.BLACK);
		window.drawArc(370, 350, 50, 125, 180, -180);
		window.setColor(pumpkinStem);
		window.fillArc(370, 350, 50, 125, 180, -180);
		window.setColor(midnightSky);
		window.fillArc(350, 350, 58, 125, 180, -180);
		
		//window.fillRect(375, 350, 50, 100);
		//int[] x = {200,150,175,100};
		//int[] y = {150,175,100,200};
		//window.drawPolygon(x, y, 4); 4 Points. - Polygon 
		//int[] x = {200,150,175,100};
		//int[] y = {150,175,100,200};
		//window.drawPolygon(x, y, 3); 3 Points. - Triangle 
		
		window.setColor(pumpkinOrange);
		window.fillOval(300, 400, 200, 300);
		window.fillOval(225, 400, 200, 300);
		window.fillOval(175, 400, 200, 300);
		window.fillOval(375, 400, 200, 300);
		window.fillOval(425, 400, 200, 300);
		
		window.setColor(Color.BLACK);
		window.drawOval(225, 400, 200, 300);
		window.drawOval(175, 400, 200, 300);
		window.drawOval(375, 400, 200, 300);
		window.drawOval(425, 400, 200, 300);
		window.drawOval(300, 400, 200, 300);
		
		window.setColor(pumpkinOrange);
		window.fillOval(300, 400, 200, 300);
		window.fillOval(225, 400, 200, 300);
		window.fillOval(375, 400, 200, 300);
		
		window.setColor(Color.BLACK);
		window.drawOval(300, 400, 200, 300);
		
		window.setColor(pumpkinOrange);
		window.fillOval(300, 400, 200, 300);
		
		// Cut. 
		
		//window.setColor(Color.BLACK);
		//int [] cutOneX = {250, 255, 295, 290};
		//int [] cutOneY = {405, 405, 420, 420};
		//window.fillPolygon(cutOneX, cutOneY, 4);
		//int [] cutTwoX = {290, 285, 300, 295};
		//int [] cutTwoY = {405, 405, 420, 420};
		//window.fillPolygon(cutTwoX, cutTwoY, 4);
		
		window.setColor(darkBrown);
		window.drawLine(260, 403, 290, 425);
		window.drawLine(290, 425, 320, 415);
		window.drawLine(320, 415, 352, 425);
		window.drawLine(352, 425, 377, 415);
		window.drawLine(377, 415, 402, 425);
		window.drawLine(402, 425, 427, 415);
		window.drawLine(427, 415, 452, 425);
		window.drawLine(452, 425, 485, 415);
		window.drawLine(485, 415, 515, 425);
		window.drawLine(515, 425, 545, 403);

		window.drawLine(259, 403, 289, 425);
		window.drawLine(516, 425, 545, 404);
		window.drawLine(289, 425, 319, 415);
		window.drawLine(319, 415, 351, 425);
		window.drawLine(351, 425, 376, 415);
		window.drawLine(376, 415, 401, 425);
		window.drawLine(401, 425, 426, 415);
		window.drawLine(426, 415, 451, 425);
		window.drawLine(451, 425, 484, 415);
		window.drawLine(484, 415, 514, 425);
				
		//Pumpkin Face. 
		
		window.setColor(pumpkinWall);
		window.fillArc(225, 400, 350, 275, 0, -180);
		
		window.setColor(darkBrown);
		window.fillArc(240, 400, 335, 275, 0, -180);
		
		window.setColor(pumpkinOrange);
		window.fillOval(225, 475, 350, 100);
		
		//window.fillRect(325, 565, 35, 35);
		//window.fillRect(442, 565, 35, 35);
		
		window.fillRect(385, 655, 40, 35);
		
		int [] leftToothX = {310, 325, 355, 370};
		int [] leftToothY = {565, 600, 600, 565};
		window.fillPolygon(leftToothX, leftToothY, 4);
		
		int [] rightToothX = {427, 442, 472, 487}; 
		int [] rightToothY = {565, 600, 600, 565};
		window.fillPolygon(rightToothX, rightToothY, 4);
		
		int [] bottomToothX = {369, 384, 422, 436};
		int [] bottomToothY = {675, 650, 650, 675};
		window.fillPolygon(bottomToothX, bottomToothY, 4);
		
		window.setColor(pumpkinWall);
		int [] leftEyeWallX = {282, 362, 322};
		int [] leftEyeWallY = {510, 510, 450}; 
		window.fillPolygon(leftEyeWallX, leftEyeWallY, 3);
		
		window.setColor(darkBrown);
		int [] leftEyeX = {290, 362, 322};
		int [] leftEyeY = {510, 510, 450}; 
		window.fillPolygon(leftEyeX, leftEyeY, 3);
		
		window.setColor(pumpkinWall);
		int [] rightEyeWallX = {438, 518, 478};
		int [] rightEyeWallY = {510, 510, 450}; 
		window.fillPolygon(rightEyeWallX, rightEyeWallY, 3);
		
		window.setColor(darkBrown);
		int [] rightEyeX = {446, 518, 478};
		int [] rightEyeY = {510, 510, 450};
		window.fillPolygon(rightEyeX, rightEyeY, 3);
		
		window.setColor(pumpkinWall);
		int [] NoseWallX = {360, 440, 400};
		int [] NoseWallY = {560, 560, 500}; 
		window.fillPolygon(NoseWallX, NoseWallY, 3);
		
		window.setColor(darkBrown);
		int [] noseX = {368, 440, 400};
		int [] noseY = {560, 560, 500};
		window.fillPolygon(noseX, noseY, 3);
		
		//int [] leftMouthX = {250, 270, 260};
		//int [] leftMouthY = {570, 580, 530};
		//window.fillPolygon(leftMouthX, leftMouthY, 3);
		
		//int [] rightMouthX = {550, 530, 540};
		//int [] rightMouthY = {570, 580, 530};
		//window.fillPolygon(rightMouthX, rightMouthY, 3);
		
		//window.fillOval(300, 615, 200, 50);
		
		//int [] leftMouthRectangleX = {250, 267, 300, 270};
		//int [] leftMouthRectangleY = {570, 570, 650, 650};
		//window.fillPolygon(leftMouthRectangleX, leftMouthRectangleY, 4);
		
		//window.fillOval(270, 635, 250, 35);
		
		//window.fillOval(263, 631, 250, 35);
		
		//window.fillOval(263, 630, 250, 40);
		
		//window.fillRect(270, 580, 250, 70);
		
		//window.fillOval(255, 565, 75, 25);
		
		//int [] leftMouthRectangleTwoX = {250, 300, 260};
		//int [] leftMouthRectangleTwoY = {580, 580, 530};
		//window.fillPolygon(leftMouthRectangleTwoX, leftMouthRectangleTwoY, 3);
		
		//window.fillOval(249, 552, 50, 100);
		
		//window.fillOval(250, 558, 50, 100);
		
		//window.fillOval(248, 556, 50, 100);
		
		//window.fillOval(246, 531, 30, 100);
		
		//int [] leftMouthRectangleThreeX = {256, 265, 261}; 
		//int [] leftMouthRectangleThreY = {540, 535, 530};
		//window.fillPolygon(leftMouthRectangleThreeX, leftMouthRectangleThreY, 3);
		
		//int [] leftMouthRectangleFourX = {263, 252, 375};
		//int [] leftMouthRectangleFourY = {532, 600, 600};
		//window.fillPolygon(leftMouthRectangleFourX, leftMouthRectangleFourY, 3);
		
		//window.fillOval(488, 554, 50, 100);
		
		//int [] rightMouthRectangleOneX = {425, 540, 540};
		//int [] rightMouthRectangleOneY = {600, 650, 530};
		//window.fillPolygon(rightMouthRectangleOneX, rightMouthRectangleOneY, 3);
		
		//window.fillOval(503, 545, 50, 100);
		
		//window.fillOval(501, 556, 50, 100);
		
		//window.fillOval(480, 646, 50, 15);
		
		//window.setColor(woodStick);
		//window.fillOval(310, 633, 225, 35);
		
		//window.fillOval(525, 531, 30, 100);
		
		//int [] rightMouthRectangleTwoX = {500, 500, 603, 603};
		//int [] rightMouthRectangleTwoY = {575, 575, 603, 603};
		//window.fillPolygon(rightMouthRectangleTwoX, rightMouthRectangleTwoY, 4);
		
		//Stars. (Cut) 
		
		//window.setColor(Color.RED);
		//window.fillRect(0, 100, 800, 150);
		
		//window.setColor(starOne);
		//window.fillOval(300, 200, 5, 5);
		//window.fillOval(300, 201, 5, 5);
		//window.fillOval(305, 203, 5, 5);
		//window.fillOval(303, 205, 5, 5);
		//window.fillOval(307, 207, 5, 5);
		//window.fillOval(309, 209, 5, 5);
		//window.fillOval(311, 211, 5, 5);
		//window.fillOval(313, 213, 5, 5);
		//window.fillOval(315, 215, 5, 5);
		//window.fillOval(317, 217, 5, 5);
		//window.fillOval(319, 219, 5, 5);
		//window.fillOval(321, 221, 5, 5);
		//window.fillOval(325, 223, 5, 5);
		//window.fillOval(323, 225, 5, 5);
		//window.fillOval(327, 227, 5, 5);
		//window.fillOval(331, 229, 5, 5);
		//window.fillOval(329, 231, 5, 5);
		//window.fillOval(333, 233, 5, 5);
		//window.fillOval(335, 235, 5, 5);
		
		//Black Borders. 
		
		window.setColor(Color.BLACK);
		window.fillRect(0, 800, 800, 100);
		window.fillRect(800, 0, 100, 900);
		
		//Animation (Face Flickering). 
					
			if ((b >= 5 && b <= 9)) {
				
				b ++;
									
			window.setColor(newPumpkinWall);
			window.fillArc(225, 400, 350, 275, 0, -180);
			
			window.setColor(insidePumpkin);
			window.fillArc(240, 400, 335, 275, 0, -180);
			
			window.setColor(pumpkinOrange);
			window.fillOval(225, 475, 350, 100);
			
			//window.fillRect(325, 565, 35, 35);
			//window.fillRect(442, 565, 35, 35);
			
			window.fillRect(385, 655, 40, 35);
			
			int [] leftToothTwoX = {310, 325, 355, 370};
			int [] leftToothTwoY = {565, 600, 600, 565};
			window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
			
			int [] rightToothTwoX = {427, 442, 472, 487}; 
			int [] rightToothTwoY = {565, 600, 600, 565};
			window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
			
			int [] bottomToothTwoX = {369, 384, 422, 436};
			int [] bottomToothTwoY = {675, 650, 650, 675};
			window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
			
			window.setColor(newPumpkinWall);
			int [] leftEyeWallTwoX = {282, 362, 322};
			int [] leftEyeWallTwoY = {510, 510, 450}; 
			window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] leftEyeTwoX = {290, 362, 322};
			int [] leftEyeTwoY = {510, 510, 450}; 
			window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
			
			window.setColor(newPumpkinWall);
			int [] rightEyeWallTwoX = {438, 518, 478};
			int [] rightEyeWallTwoY = {510, 510, 450}; 
			window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] rightEyeTwoX = {446, 518, 478};
			int [] rightEyeTwoY = {510, 510, 450};
			window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
			
			window.setColor(newPumpkinWall);
			int [] NoseWallTwoX = {360, 440, 400};
			int [] NoseWallTwoY = {560, 560, 500}; 
			window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] noseTwoX = {368, 440, 400};
			int [] noseTwoY = {560, 560, 500};
			window.fillPolygon(noseTwoX, noseTwoY, 3);
			
			}
		
			if ((b >= 15 && b <= 19)) {
										
			window.setColor(newPumpkinWall);
			window.fillArc(225, 400, 350, 275, 0, -180);
			
			window.setColor(insidePumpkin);
			window.fillArc(240, 400, 335, 275, 0, -180);
			
			window.setColor(pumpkinOrange);
			window.fillOval(225, 475, 350, 100);
			
			//window.fillRect(325, 565, 35, 35);
			//window.fillRect(442, 565, 35, 35);
			
			window.fillRect(385, 655, 40, 35);
			
			int [] leftToothTwoX = {310, 325, 355, 370};
			int [] leftToothTwoY = {565, 600, 600, 565};
			window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
			
			int [] rightToothTwoX = {427, 442, 472, 487}; 
			int [] rightToothTwoY = {565, 600, 600, 565};
			window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
			
			int [] bottomToothTwoX = {369, 384, 422, 436};
			int [] bottomToothTwoY = {675, 650, 650, 675};
			window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
			
			window.setColor(newPumpkinWall);
			int [] leftEyeWallTwoX = {282, 362, 322};
			int [] leftEyeWallTwoY = {510, 510, 450}; 
			window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] leftEyeTwoX = {290, 362, 322};
			int [] leftEyeTwoY = {510, 510, 450}; 
			window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
			
			window.setColor(newPumpkinWall);
			int [] rightEyeWallTwoX = {438, 518, 478};
			int [] rightEyeWallTwoY = {510, 510, 450}; 
			window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] rightEyeTwoX = {446, 518, 478};
			int [] rightEyeTwoY = {510, 510, 450};
			window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
			
			window.setColor(newPumpkinWall);
			int [] NoseWallTwoX = {360, 440, 400};
			int [] NoseWallTwoY = {560, 560, 500}; 
			window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] noseTwoX = {368, 440, 400};
			int [] noseTwoY = {560, 560, 500};
			window.fillPolygon(noseTwoX, noseTwoY, 3);
			
			}
					
			if ((b >= 25 && b <= 29)) {
						
			window.setColor(newPumpkinWall);
			window.fillArc(225, 400, 350, 275, 0, -180);
			
			window.setColor(insidePumpkin);
			window.fillArc(240, 400, 335, 275, 0, -180);
			
			window.setColor(pumpkinOrange);
			window.fillOval(225, 475, 350, 100);
			
			//window.fillRect(325, 565, 35, 35);
			//window.fillRect(442, 565, 35, 35);
			
			window.fillRect(385, 655, 40, 35);
			
			int [] leftToothTwoX = {310, 325, 355, 370};
			int [] leftToothTwoY = {565, 600, 600, 565};
			window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
			
			int [] rightToothTwoX = {427, 442, 472, 487}; 
			int [] rightToothTwoY = {565, 600, 600, 565};
			window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
			
			int [] bottomToothTwoX = {369, 384, 422, 436};
			int [] bottomToothTwoY = {675, 650, 650, 675};
			window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
			
			window.setColor(newPumpkinWall);
			int [] leftEyeWallTwoX = {282, 362, 322};
			int [] leftEyeWallTwoY = {510, 510, 450}; 
			window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] leftEyeTwoX = {290, 362, 322};
			int [] leftEyeTwoY = {510, 510, 450}; 
			window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
			
			window.setColor(newPumpkinWall);
			int [] rightEyeWallTwoX = {438, 518, 478};
			int [] rightEyeWallTwoY = {510, 510, 450}; 
			window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] rightEyeTwoX = {446, 518, 478};
			int [] rightEyeTwoY = {510, 510, 450};
			window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
			
			window.setColor(newPumpkinWall);
			int [] NoseWallTwoX = {360, 440, 400};
			int [] NoseWallTwoY = {560, 560, 500}; 
			window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
			
			window.setColor(insidePumpkin);
			int [] noseTwoX = {368, 440, 400};
			int [] noseTwoY = {560, 560, 500};
			window.fillPolygon(noseTwoX, noseTwoY, 3);
			
			}
			
			if ((b >= 35 && b <= 39)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
				if ((b >= 45 && b <= 49)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
			if ((b >= 55 && b <= 59)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
			if ((b >= 65 && b <= 69)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
			if ((b >= 75 && b <= 79)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
			if ((b >= 85 && b <= 89)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
			if ((b >= 95 && b <= 100)) {
				
				window.setColor(newPumpkinWall);
				window.fillArc(225, 400, 350, 275, 0, -180);
				
				window.setColor(insidePumpkin);
				window.fillArc(240, 400, 335, 275, 0, -180);
				
				window.setColor(pumpkinOrange);
				window.fillOval(225, 475, 350, 100);
				
				//window.fillRect(325, 565, 35, 35);
				//window.fillRect(442, 565, 35, 35);
				
				window.fillRect(385, 655, 40, 35);
				
				int [] leftToothTwoX = {310, 325, 355, 370};
				int [] leftToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(leftToothTwoX, leftToothTwoY, 4);
				
				int [] rightToothTwoX = {427, 442, 472, 487}; 
				int [] rightToothTwoY = {565, 600, 600, 565};
				window.fillPolygon(rightToothTwoX, rightToothTwoY, 4);
				
				int [] bottomToothTwoX = {369, 384, 422, 436};
				int [] bottomToothTwoY = {675, 650, 650, 675};
				window.fillPolygon(bottomToothTwoX, bottomToothTwoY, 4);
				
				window.setColor(newPumpkinWall);
				int [] leftEyeWallTwoX = {282, 362, 322};
				int [] leftEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeWallTwoX, leftEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] leftEyeTwoX = {290, 362, 322};
				int [] leftEyeTwoY = {510, 510, 450}; 
				window.fillPolygon(leftEyeTwoX, leftEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] rightEyeWallTwoX = {438, 518, 478};
				int [] rightEyeWallTwoY = {510, 510, 450}; 
				window.fillPolygon(rightEyeWallTwoX, rightEyeWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] rightEyeTwoX = {446, 518, 478};
				int [] rightEyeTwoY = {510, 510, 450};
				window.fillPolygon(rightEyeTwoX, rightEyeTwoY, 3);
				
				window.setColor(newPumpkinWall);
				int [] NoseWallTwoX = {360, 440, 400};
				int [] NoseWallTwoY = {560, 560, 500}; 
				window.fillPolygon(NoseWallTwoX, NoseWallTwoY, 3);
				
				window.setColor(insidePumpkin);
				int [] noseTwoX = {368, 440, 400};
				int [] noseTwoY = {560, 560, 500};
				window.fillPolygon(noseTwoX, noseTwoY, 3);
				
				}
			
		//Text in mouth. 
		
		window.setColor(darkBrown);
		Font halloween = new Font("Happy Halloween 2021",Font.PLAIN, 24);
		window.setFont(halloween);
		window.drawString("Happy Halloween 2021", 280, 627);
		
		//Moon. 		
					
		window.setColor(moon);
		window.fillOval(-50, -50, 300, 300);
		
		window.setColor(moonFour);
		window.fillOval(-50, -50, 290, 290);
		
		window.setColor(moonThree);
		window.fillOval(140, 130, 80, 80);
		window.fillOval(85, 115, 85, 80);
		window.fillOval(13, 155, 85, 80);
		window.fillOval(0, 110, 85, 80);
		window.fillOval(0, 95, 85, 80);
		window.fillOval(55, 170, 85, 80);
		window.fillOval(155, 75, 95, 82);
		window.fillOval(0, 135, 95, 82);
		
		window.setColor(moonTwo);
		window.fillOval(137, 137, 75, 80);
		window.fillOval(85, 115, 80, 75);
		window.fillOval(13, 155, 80, 75);
		window.fillOval(0, 110, 80, 75);
		window.fillOval(0, 95, 80, 75);
		window.fillOval(50, 170, 80, 75);
		window.fillOval(155, 75, 90, 77);
		
		window.setColor(Color.BLACK);
		window.drawOval(-50, -50, 300, 300);
		
		window.setColor(craterOne);
		window.fillOval(150, 150, 55, 60);
		
		//window.setColor(Color.BLACK);
		//window.drawOval(150, 150, 55, 60);
		
		window.setColor(craterOne);
		window.fillOval(105, 125, 60, 55);
		
		//window.setColor(Color.BLACK);
		//window.drawOval(105, 125, 60, 55);
		
		window.setColor(craterOne);
		window.fillOval(20, 165, 60, 55);
		
		//window.setColor(Color.BLACK);
		//window.drawOval(20, 165, 60, 55);
		
		window.setColor(craterOne);
		window.fillOval(10, 125, 60, 55);
		
		//window.setColor(Color.BLACK);
		//window.drawOval(10, 125, 60, 55);
		
		window.setColor(craterOne);
		window.fillRect(152, 165, 15, 15);
		
		window.setColor(craterOne);
		window.fillRect(27, 167, 38, 15);
		
		window.setColor(craterOne);
		window.fillOval(60, 180, 60, 55);
		
		window.setColor(craterOne);
		window.fillOval(165, 85, 60, 55);
		
		window.setColor(craterOne);
		window.fillOval(-5, 95, 50, 45);
		
		window.setColor(craterTwo);
		window.fillOval(35, 155, 25, 35);
		
		//window.setColor(Color.BLACK);
		//window.drawOval(35, 155, 25, 35);
		
		window.setColor(craterTwo);
		window.fillOval(150, 150, 25, 25);
		
		//window.setColor(Color.BLACK);
		//window.drawOval(150, 150, 25, 25);
		
		window.setColor(craterTwo);
		window.fillOval(75, 190, 35, 30);
		
		window.setColor(craterTwo);
		window.fillOval(120, 120, 25, 25);
		
		window.setColor(craterTwo);
		window.fillOval(7, 105, 25, 25);
		
		//Clouds. 
		
		window.setColor(darkClouds);
		window.fillOval(-50, -65, 300, 200);
		window.fillOval(150, -65, 300, 200);
		window.fillOval(350, -65, 300, 200);
		window.fillOval(550, -65, 300, 200);
		
		window.setColor(middleClouds);
		window.fillOval(-25, -90, 300, 200);
		window.fillOval(175, -90, 300, 200);
		window.fillOval(375, -90, 300, 200);
		window.fillOval(575, -90, 300, 200);
		
		window.setColor(lightClouds);
		window.fillOval(-75, -115, 300, 200);
		window.fillOval(125, -115, 300, 200);
		window.fillOval(325, -115, 300, 200);
		window.fillOval(525, -115, 300, 200);
		
		//Animation (Lightning Flash).
		
		if (d >= 0 && d <= 2) {
								
		window.setColor(flashBangLightning);
		window.fillRect(0, 0, 800, 800);
			
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
	
}