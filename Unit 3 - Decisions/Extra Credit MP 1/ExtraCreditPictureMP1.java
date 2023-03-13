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

public class ExtraCreditPictureMP1 extends Canvas
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
	
	public ExtraCreditPictureMP1()
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
		
		//Turkey 
		
		window.setColor(turkeyTail);
		window.fillOval(235, 323, 408, 381);
		
		window.setColor(newGrass);
		window.fillOval(270, 600, 300, 300);
		window.fillRect(225, 576, 100, 100);
		window.fillOval(319, 625, 10, 10);
		
		window.setColor(daySky);
		window.fillOval(165, 250, 300, 300);
		window.fillRect(200, 475, 200, 100);
		
		//window.setColor(Color.BLACK);
		int [] skyRectangleX = {400, 425, 450};
		int [] skyRectangleY = {350, 400, 325};
		window.fillPolygon(skyRectangleX, skyRectangleY, 3);
		
		window.setColor(daySky);
		window.fillOval(441, 320, 10, 10);
		
		window.setColor(turkeyTail);
		int [] tailX = {425, 450, 550, 471};
		int [] tailY = {400, 325, 675, 625};
		window.fillPolygon(tailX, tailY, 4);
		
		window.setColor(Color.BLACK);
		window.fillOval(258, 375, 302, 302);
		window.fillOval(273, 250, 129, 129);
		window.fillOval(261, 200, 125, 125);
		
		window.setColor(turkeyTail);
		int [] legTwoX = {350, 375, 425, 450};
		int [] legTwoY = {650, 700, 700, 650};
		window.fillPolygon(legTwoX, legTwoY, 4);

		window.fillRect(393, 702, 15, 30);
		window.fillOval(343, 725, 70, 10);
		window.fillOval(385, 728, 70, 10);
		window.fillOval(360, 735, 70, 7);
		
		window.setColor(Color.BLACK);
		int [] legOneXBlack = {338, 363, 413, 438};
		int [] legOneYBlack = {650, 700, 700, 650};
		window.fillPolygon(legOneXBlack, legOneYBlack, 4);
		int [] legOneXBlackBottom = {340, 365, 415, 440};
		int [] legOneYBlackBottom = {652, 702, 702, 652};
		window.fillPolygon(legOneXBlackBottom, legOneYBlackBottom, 4);
		int [] legOneXBlackRight = {342, 367, 417, 442};
		int [] legOneYBlackRight = {650, 700, 700, 650};
		window.fillPolygon(legOneXBlackRight, legOneYBlackRight, 4);
		
		window.setColor(Color.BLACK);
		window.fillOval(260, 198, 125, 125);
		window.fillOval(262, 198, 125, 125);
		window.fillOval(275, 240, 125, 250);
		window.fillOval(260, 374, 300, 300);
		
		window.setColor(turkeyBody);
		window.fillOval(260, 375, 300, 300);
		window.fillOval(275, 250, 125, 125);
		window.fillOval(261, 200, 125, 125);
		window.fillOval(275, 240, 125, 250);
		
		window.setColor(daySky);
		int [] neckX = {375, 390, 430, 415};
		int [] neckY = {375, 225, 225, 375};
		window.fillPolygon(neckX, neckY, 4);
		window.setColor(Color.BLACK);
		window.drawPolygon(neckX, neckY, 4);
		
		window.setColor(daySky);
		int [] neckXTop = {376, 391, 431, 416};
		int [] neckYTop = {370, 220, 220, 370};
		window.fillPolygon(neckXTop, neckYTop, 4);
		int [] neckXBottom = {376, 391, 431, 416};
		int [] neckYBottom = {375, 225, 225, 375};
		window.fillPolygon(neckXBottom, neckYBottom, 4);
		int [] neckXTopTwo = {386, 385, 445, 425};
		int [] neckYTopTwo = {250, 225, 225, 300};
		window.fillPolygon(neckXTopTwo, neckYTopTwo, 4);
		
		window.setColor(Color.BLACK);
		window.fillOval(252, 285, 50, 50);
		window.fillRect(248, 315, 50, 54);
		window.fillRect(252, 315, 50, 50);
		int [] thingyXTwo = {222, 248, 298, 288};
		int [] thingyYTwo = {400, 360, 360, 400};
		window.fillPolygon(thingyXTwo, thingyYTwo, 4);
		int [] thingyXThree = {226, 252, 302, 292};
		int [] thingyYThree = {400, 360, 360, 400};
		window.fillPolygon(thingyXThree, thingyYThree, 4);
		window.fillOval(222, 377, 69, 65);
		window.fillRect(223, 400, 69, 75);
		window.fillOval(223, 500, 69, 77);
		window.fillRect(223, 460, 69, 75);
		
		window.setColor(roosterRed);
		window.fillOval(250, 285, 50, 50);
		window.fillRect(250, 315, 50, 50);
		window.fillOval(225, 500, 65, 75);
		window.fillRect(225, 460, 65, 75);
		window.fillOval(224, 377, 65, 65);
		window.fillRect(225, 400, 65, 75);
		int [] thingyX = {224, 250, 300, 290};
		int [] thingyY = {400, 360, 360, 400};
		window.fillPolygon(thingyX, thingyY, 4);
		
		window.setColor(Color.BLACK);
		window.fillOval(273, 215, 54, 54);
		window.fillOval(238, 215, 54, 54);
		window.setColor(whiteOne);
		window.fillOval(240, 217, 50, 50);
		window.fillOval(275, 217, 50, 50);
		window.setColor(Color.BLACK);
		window.drawOval(275, 217, 50, 50);
		window.drawOval(276, 217, 50, 50);
		
		window.setColor(Color.BLACK);
		window.fillOval(225, 273, 15, 53);
		window.fillOval(225, 275, 15, 53);
		window.fillOval(230, 275, 15, 53);
		window.fillOval(227, 277, 15, 53);
		int [] beakXBottom = {232, 237, 282, 297};
		int [] beakYBottom = {328, 276, 263, 303};
		window.fillPolygon(beakXBottom, beakYBottom, 4);
		int [] beakXTop = {232, 237, 282, 297};
		int [] beakYTop = {324, 272, 259, 299};
		window.fillPolygon(beakXTop, beakYTop, 4);
		int [] beakXTopTwo = {227, 232, 277, 292};
		int [] beakYTopTwo = {324, 272, 259, 299};
		window.fillPolygon(beakXTopTwo, beakYTopTwo, 4);
		int [] beakXRight = {234, 239, 284, 299};
		int [] beakYRight = {324, 272, 259, 299};
		window.fillPolygon(beakXRight, beakYRight, 4);
		int [] beakXRightTwo = {234, 239, 284, 299};
		int [] beakYRightTwo = {327, 275, 262, 302};
		window.fillPolygon(beakXRightTwo, beakYRightTwo, 4);
		int [] beakXRightThree = {234, 239, 284, 299};
		int [] beakYRightThree = {323, 272, 258, 298};
		window.fillPolygon(beakXRightThree, beakYRightThree, 4);
		window.setColor(beak);
		window.fillOval(228, 273, 15, 53);
		int [] beakX = {232, 237, 282, 297};
		int [] beakY = {325, 273, 260, 300};
		window.fillPolygon(beakX, beakY, 4);
		
		window.setColor(Color.BLACK);
		window.fillOval(260, 240, 10, 10);
		window.fillOval(285, 245, 10, 10);
		//int [] mouthXOne = {230, 250};
		//int [] mouthYOne = {324, 310};
		//window.fillPolygon(mouthXOne, mouthYOne, 2);
		
		window.setColor(Color.BLACK);
		window.drawOval(350, 475, 100, 100);
		window.drawOval(363, 500, 100, 100);
		window.drawOval(380, 525, 100, 100);
		
		window.setColor(turkeyBody);
		window.fillOval(355, 477, 100, 100);
		window.fillOval(370, 502, 100, 100);
		window.fillOval(385, 526, 100, 100);
		window.fillOval(350, 450, 100, 100);
		
		window.setColor(turkeyBody);
		int [] legOneX = {340, 365, 415, 440};
		int [] legOneY = {650, 700, 700, 650};
		window.fillPolygon(legOneX, legOneY, 4);
		
		window.setColor(Color.BLACK);
		window.fillRect(381, 702, 15, 30);
		window.fillRect(385, 702, 15, 30);
		window.fillOval(330, 725, 70, 10);
		window.fillOval(372, 728, 70, 10);
		window.fillOval(346, 735, 70, 7);
		window.fillOval(333, 723, 70, 10);
		window.fillOval(375, 726, 70, 10);
		window.fillOval(350, 733, 70, 7);
		window.fillOval(333, 727, 70, 10);
		window.fillOval(375, 730, 70, 10);
		window.fillOval(350, 737, 70, 7);
		window.fillOval(335, 725, 70, 10);
		window.fillOval(377, 728, 70, 10);
		window.fillOval(352, 735, 70, 7);
		
		window.setColor(feet);
		window.fillRect(383, 702, 15, 30);
		window.fillOval(333, 725, 70, 10);
		window.fillOval(375, 728, 70, 10);
		window.fillOval(350, 735, 70, 7);
		
		//Black Borders. 
		
		window.setColor(Color.BLACK);
		window.fillRect(0, 800, 800, 100);
		window.fillRect(800, 0, 100, 900);
		
		Font thanksgiving = new Font("Happy Thanksgiving 2021!", Font.PLAIN, 24);
		window.setFont(thanksgiving);
		window.drawString("Happy Thanksgiving 2021!", 475, 250);
		
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
