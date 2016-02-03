import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;







public class homeScreen extends JFrame {
	
	private int progress;
	public static int progress6 ;
	public int currentCash;
	public int currentCarHS;
	public JLabel cashLabel;
	public JLabel currentCarTextLabel;
	public static int c1;
	public static int c2;
	public static int c3;
	public static int c4;
	public static int c5;
	public static JButton buyTurtle;
	public static JButton buyCar;
	public static JButton buyPlane;
	public static JButton buySpaceShip;
	public static JButton buySpaceShip2;
	
	public homeScreen(int prog, int addedCash, int previousCash, int currentCar, int car1, int car2, int car3, int car4, int car5){
		
		
		setTitle("Home Screen");
		setSize(1350,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//factorqs objectF = new factorqs(1,1,1);
		//int progCheck = objectF.getProgress();
		//storageCenter store = new storageCenter();
		//progress = store.getProgress();
		
		
		progress6= prog;
		currentCash = addedCash + previousCash;
		currentCarHS = currentCar;
		
		c1 = car1;
		c2 = car2;
		c3 = car3;
		c4 = car4;
		c5 = car5;
		
		
	//******************************Instructions Label*******************************************************
		
		JLabel instructionLabel = new JLabel("<html>Welcome to Maths Racer!<br><br>To Play the game enter factors in the "
				+ "4 spaces <br>provided. You can press TAB to move from one <br>to the other. Press submit or ENTER "
				+ "when you <br>are happy with your choices to move.</html>");
		add(instructionLabel);
		Dimension sizeInstructionLabel = instructionLabel.getPreferredSize();
		instructionLabel.setBounds(50,50,sizeInstructionLabel.width, sizeInstructionLabel.height);
		
		
		
	//******************************CURRENT CASH LABEL*********************************************************
		cashLabel = new JLabel("Your current funds are £" + currentCash);
		add(cashLabel);
		Dimension sizeCashLabel = cashLabel.getPreferredSize();
		cashLabel.setBounds(50,200,sizeCashLabel.width, sizeCashLabel.height);
		
	//******************************CURRENT VEHICLE LABEL****************************************
		
		currentCarTextLabel = new JLabel();
		
		if (currentCarHS == 1){
		currentCarTextLabel.setText("You have the Turtle");
		add(currentCarTextLabel);
		Dimension sizeCurrentCarTextLabel = currentCarTextLabel.getPreferredSize();
		currentCarTextLabel.setBounds(50,230,sizeCurrentCarTextLabel.width,sizeCurrentCarTextLabel.height);
		}
		if (currentCarHS == 2){
		currentCarTextLabel.setText("You have the Car");
		add(currentCarTextLabel);
		Dimension sizeCurrentCarTextLabel = currentCarTextLabel.getPreferredSize();
		currentCarTextLabel.setBounds(50,230,sizeCurrentCarTextLabel.width,sizeCurrentCarTextLabel.height);
		}
		if (currentCarHS == 3){
		currentCarTextLabel.setText("You have the Plane");
		add(currentCarTextLabel);
		Dimension sizeCurrentCarTextLabel = currentCarTextLabel.getPreferredSize();
		currentCarTextLabel.setBounds(50,230,sizeCurrentCarTextLabel.width,sizeCurrentCarTextLabel.height);
		}
		if (currentCarHS == 4){
		currentCarTextLabel.setText("You have the Spaceship");
		add(currentCarTextLabel);
		Dimension sizeCurrentCarTextLabel = currentCarTextLabel.getPreferredSize();
		currentCarTextLabel.setBounds(50,230,sizeCurrentCarTextLabel.width,sizeCurrentCarTextLabel.height);
		}
		if (currentCarHS == 5){
		currentCarTextLabel.setText("You have the Super Extreme Spaceship");
		add(currentCarTextLabel);
		Dimension sizeCurrentCarTextLabel = currentCarTextLabel.getPreferredSize();
		currentCarTextLabel.setBounds(50,230,sizeCurrentCarTextLabel.width,sizeCurrentCarTextLabel.height);
		}
		
		
		
		
		
	//******************************SHOP*******************************************************
		JLabel shopTextLabel = new JLabel("Welcome to the super amazing shop!!");
		add(shopTextLabel);
		Dimension sizeShopTextLabel = shopTextLabel.getPreferredSize();
		shopTextLabel.setBounds(50,300,sizeShopTextLabel.width,sizeShopTextLabel.height);
		
		JLabel shopTextLabel2 = new JLabel("Trade in your vehicle for one of the following...");
		add(shopTextLabel2);
		Dimension sizeShopTextLabel2 = shopTextLabel2.getPreferredSize();
		shopTextLabel2.setBounds(50,330,sizeShopTextLabel2.width,sizeShopTextLabel2.height);
		
		buyTurtle = new JButton("Buy Turtle Bad Boy Extreme, £1");
		//buyTurtle.setText("Buy Turtle Bad Boy Extreme, £1");
		add(buyTurtle);
		Dimension sizeBuyTBut = buyTurtle.getPreferredSize();
		buyTurtle.setBounds(50,360,sizeBuyTBut.width, sizeBuyTBut.height);
		ShopClass1 shop1 = new ShopClass1();
		buyTurtle.addActionListener(shop1);
		
		buyCar = new JButton("Buy Super Turbo Hot Rod, £300");
		add(buyCar);
		Dimension sizeBuyCBut = buyCar.getPreferredSize();
		buyCar.setBounds(50,390,sizeBuyCBut.width, sizeBuyCBut.height);
		ShopClass2 shop2 = new ShopClass2();
		buyCar.addActionListener(shop2);
		
		buyPlane = new JButton("Buy Extreme Flying Machine, £2000");
		add(buyPlane);
		Dimension sizeBuyPBut = buyPlane.getPreferredSize();
		buyPlane.setBounds(50,420,sizeBuyPBut.width, sizeBuyPBut.height);
		ShopClass3 shop3 = new ShopClass3();
		buyPlane.addActionListener(shop3);
		
		buySpaceShip = new JButton("Buy Space Ship Blitzer, £10,000");
		add(buySpaceShip);
		Dimension sizeBuySSBut = buySpaceShip.getPreferredSize();
		buySpaceShip.setBounds(50,450,sizeBuySSBut.width, sizeBuySSBut.height);
		ShopClass4 shop4 = new ShopClass4();
		buySpaceShip.addActionListener(shop4);
		
		buySpaceShip2 = new JButton("Buy Unicorn Space Ship, £1,000,000");
		add(buySpaceShip2);
		Dimension sizeBuySS2But = buySpaceShip2.getPreferredSize();
		buySpaceShip2.setBounds(50,480,sizeBuySS2But.width, sizeBuySS2But.height);
		ShopClass5 shop5 = new ShopClass5();
		buySpaceShip2.addActionListener(shop5);
		

		
		
	//*******************************SHOP CURRENT CAR DISABLER****************************************
		
		if (currentCarHS == 1){
			buyTurtle.setEnabled(false);
		}
		if (currentCarHS == 2){
			buyCar.setEnabled(false);
		}
		if (currentCarHS == 3){
			buyPlane.setEnabled(false);
		}
		if (currentCarHS == 4){
			buySpaceShip.setEnabled(false);
		}
		if (currentCarHS == 5){
			buySpaceShip2.setEnabled(false);
		}
		
		
		
	//**********************************************************************************************************
		JButton gameButton = new JButton("Level 1");
		add(gameButton);
		Dimension sizeGBut = gameButton.getPreferredSize();
		gameButton.setBounds(520,150,sizeGBut.width+30, sizeGBut.height);
		
		
		MoverClass mover = new MoverClass();
		gameButton.addActionListener(mover);
	//**********************************************************************************************************	
		JButton level2 = new JButton("Level 2");
		add(level2);
		Dimension sizeL2But = level2.getPreferredSize();
		level2.setBounds(520,200,sizeL2But.width+30, sizeL2But.height);
		
		
		MoverClass2 mover2 = new MoverClass2();
		level2.addActionListener(mover2);
		
		System.out.println(storageCenter.progress7);
		if(progress6<2){
		level2.setEnabled(false);
		}
		else{
			level2.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level3 = new JButton("Level 3");
		add(level3);
		Dimension sizeL3But = level3.getPreferredSize();
		level3.setBounds(520,250,sizeL3But.width+30, sizeL3But.height);
		
		
		MoverClass3 mover3 = new MoverClass3();
		level3.addActionListener(mover3);
		
		if(progress6<3){
		level3.setEnabled(false);
		}
		else{
			level3.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level4 = new JButton("Level 4");
		add(level4);
		Dimension sizeL4But = level4.getPreferredSize();
		level4.setBounds(520,300,sizeL4But.width+30, sizeL4But.height);
		
		
		MoverClass4 mover4 = new MoverClass4();
		level4.addActionListener(mover4);
		
		if(progress6<4){
		level4.setEnabled(false);
		}
		else{
			level4.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level5 = new JButton("Level 5");
		add(level5);
		Dimension sizeL5But = level5.getPreferredSize();
		level5.setBounds(520,350,sizeL5But.width+30, sizeL5But.height);
		
		
		MoverClass5 mover5 = new MoverClass5();
		level5.addActionListener(mover5);
		
		if(progress6<5){
		level5.setEnabled(false);
		}
		else{
			level5.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level6 = new JButton("Level 6");
		add(level6);
		level6.setBounds(620,150,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass6 mover6 = new MoverClass6();
		level6.addActionListener(mover6);
		
		if(progress6<6){
		level6.setEnabled(false);
		}
		else{
			level6.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level7 = new JButton("Level 7");
		add(level7);
		level7.setBounds(620,200,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass7 mover7 = new MoverClass7();
		level7.addActionListener(mover7);
		
		if(progress6<7){
		level7.setEnabled(false);
		}
		else{
			level7.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level8 = new JButton("Level 8");
		add(level8);
		level8.setBounds(620,250,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass8 mover8 = new MoverClass8();
		level8.addActionListener(mover8);
		
		if(progress6<8){
		level8.setEnabled(false);
		}
		else{
			level8.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level9 = new JButton("Level 9");
		add(level9);
		level9.setBounds(620,300,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass9 mover9 = new MoverClass9();
		level9.addActionListener(mover9);
		
		if(progress6<9){
		level9.setEnabled(false);
		}
		else{
			level9.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level10 = new JButton("Level 10");
		add(level10);
		level10.setBounds(620,350,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass10 mover10 = new MoverClass10();
		level10.addActionListener(mover10);
		
		if(progress6<10){
		level10.setEnabled(false);
		}
		else{
			level10.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level11 = new JButton("Level 11");
		add(level11);
		level11.setBounds(720,150,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass11 mover11 = new MoverClass11();
		level11.addActionListener(mover11);
		
		if(progress6<11){
		level11.setEnabled(false);
		}
		else{
			level11.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level12 = new JButton("Level 12");
		add(level12);
		level12.setBounds(720,200,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass12 mover12 = new MoverClass12();
		level12.addActionListener(mover12);
		
		if(progress6<12){
		level12.setEnabled(false);
		}
		else{
			level12.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level13 = new JButton("Level 13");
		add(level13);
		level13.setBounds(720,250,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass13 mover13 = new MoverClass13();
		level13.addActionListener(mover13);
		
		if(progress6<13){
		level13.setEnabled(false);
		}
		else{
			level13.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level14 = new JButton("Level 14");
		add(level14);
		level14.setBounds(720,300,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass14 mover14 = new MoverClass14();
		level14.addActionListener(mover14);
		
		if(progress6<14){
		level14.setEnabled(false);
		}
		else{
			level14.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level15 = new JButton("Level 15");
		add(level15);
		level15.setBounds(720,350,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass15 mover15 = new MoverClass15();
		level15.addActionListener(mover15);
		
		if(progress6<15){
		level15.setEnabled(false);
		}
		else{
			level15.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level16 = new JButton("Level 16");
		add(level16);
		level16.setBounds(820,150,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass16 mover16 = new MoverClass16();
		level16.addActionListener(mover16);
		
		if(progress6<16){
		level16.setEnabled(false);
		}
		else{
			level16.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level17 = new JButton("Level 17");
		add(level17);
		level17.setBounds(820,200,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass17 mover17 = new MoverClass17();
		level17.addActionListener(mover17);
		
		if(progress6<17){
		level17.setEnabled(false);
		}
		else{
			level17.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level18 = new JButton("Level 18");
		add(level18);
		level18.setBounds(820,250,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass18 mover18 = new MoverClass18();
		level18.addActionListener(mover18);
		
		if(progress6<18){
		level18.setEnabled(false);
		}
		else{
			level18.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level19 = new JButton("Level 19");
		add(level19);
		level19.setBounds(820,300,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass19 mover19 = new MoverClass19();
		level19.addActionListener(mover19);
		
		if(progress6<19){
		level19.setEnabled(false);
		}
		else{
			level19.setEnabled(true);
		}
	//**********************************************************************************************************
		JButton level20 = new JButton("Level 20");
		add(level20);
		level20.setBounds(820,350,sizeL2But.width+30, sizeL2But.height);
		
		MoverClass20 mover20 = new MoverClass20();
		level20.addActionListener(mover20);
		
		if(progress6<20){
		level20.setEnabled(false);
		}
		else{
			level20.setEnabled(true);
		}
	//**********************************************************************************************************
	}
	
	
//*******************************SHOP CLASSES*****************************************************************
	
	
public class ShopClass1 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		if(c1 == 0){
			if(currentCash <1){
			JOptionPane.showMessageDialog(null,  "Get mo' money!");
			}
			else{
				currentCash = currentCash -1;
				currentCarHS = 1;
				cashLabel.setText("£" + currentCash);
				currentCarTextLabel.setText("You have the Turtle");
				c1 = 1;
				buyTurtle.setEnabled(false);
				buyCar.setEnabled(true);
				buyPlane.setEnabled(true);
				buySpaceShip.setEnabled(true);
				buySpaceShip2.setEnabled(true);
				}//else
			}//if
		else{
			currentCarHS = 1;
			currentCarTextLabel.setText("You have the Turtle");
			buyTurtle.setEnabled(false);
			buyCar.setEnabled(true);
			buyPlane.setEnabled(true);
			buySpaceShip.setEnabled(true);
			buySpaceShip2.setEnabled(true);
		}//else
	}//action
}//class

public class ShopClass2 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		if(c2 == 0){
			if(currentCash <300){
				JOptionPane.showMessageDialog(null,  "Get mo' money!");
			}
			else{
				currentCash = currentCash -300;
				currentCarHS = 2;
				cashLabel.setText("Your current funds are £" + currentCash);
				currentCarTextLabel.setText("You have the Car");
				c2 = c2+1;
				buyTurtle.setEnabled(true);
				buyCar.setEnabled(false);
				buyPlane.setEnabled(true);
				buySpaceShip.setEnabled(true);
				buySpaceShip2.setEnabled(true);
			
		}
	}
		else{
			currentCarHS = 2;
			currentCarTextLabel.setText("You have the Car");
			buyTurtle.setEnabled(true);
			buyCar.setEnabled(false);
			buyPlane.setEnabled(true);
			buySpaceShip.setEnabled(true);
			buySpaceShip2.setEnabled(true);
		}
	}
	
}
public class ShopClass3 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		if(c3 == 0){
			if(currentCash <2000){
				JOptionPane.showMessageDialog(null,  "Get mo' money!");
			}
			else{
				currentCash = currentCash -2000;
				currentCarHS = 3;
				cashLabel.setText("Your current funds are £" + currentCash);
				currentCarTextLabel.setText("You have the Plane");
				c3 = c3+1;
				buyTurtle.setEnabled(true);
				buyCar.setEnabled(true);
				buyPlane.setEnabled(false);
				buySpaceShip.setEnabled(true);
				buySpaceShip2.setEnabled(true);
				}
			}
		else{
			currentCarHS = 3;
			currentCarTextLabel.setText("You have the Plane");
			buyTurtle.setEnabled(true);
			buyCar.setEnabled(true);
			buyPlane.setEnabled(false);
			buySpaceShip.setEnabled(true);
			buySpaceShip2.setEnabled(true);
		}
	
	}
	
}
public class ShopClass4 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		if(c4 == 0){
			if(currentCash <10000){
				JOptionPane.showMessageDialog(null,  "Get mo' money!");
				}
			else{
				currentCash = currentCash -10000;
				currentCarHS = 4;
				cashLabel.setText("Your current funds are £" + currentCash);
				currentCarTextLabel.setText("You have the Spaceship");
				c4 = 1;
				buyTurtle.setEnabled(true);
				buyCar.setEnabled(true);
				buyPlane.setEnabled(true);
				buySpaceShip.setEnabled(false);
				buySpaceShip2.setEnabled(true);
				}
		}
			else{
				currentCarHS = 4;
				currentCarTextLabel.setText("You have the Spaceship");
				buyTurtle.setEnabled(true);
				buyCar.setEnabled(true);
				buyPlane.setEnabled(true);
				buySpaceShip.setEnabled(false);
				buySpaceShip2.setEnabled(true);
			
		}
	}
	
}
public class ShopClass5 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		if(c5 == 0){
			if(currentCash <1000000){
				JOptionPane.showMessageDialog(null,  "Get mo' money!");
				}
			else{
				currentCash = currentCash -1000000;
				currentCarHS = 5;
				cashLabel.setText("Your current funds are £" + currentCash);
				currentCarTextLabel.setText("You have the Super Extreme Spaceship");
				c5 = 1;
				buyTurtle.setEnabled(true);
				buyCar.setEnabled(true);
				buyPlane.setEnabled(true);
				buySpaceShip.setEnabled(true);
				buySpaceShip2.setEnabled(false);
			}
		}
		else{
			currentCarHS = 5;
			currentCarTextLabel.setText("You have the Super Extreme Spaceship");
			buyTurtle.setEnabled(true);
			buyCar.setEnabled(true);
			buyPlane.setEnabled(true);
			buySpaceShip.setEnabled(true);
			buySpaceShip2.setEnabled(false);
		}
	}
	
}
	
		
	
//**************************LEVEL 1****************************************************************************
public class MoverClass implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			factorqs go = new factorqs(300,30,2,currentCash,1,currentCarHS,progress6,c1,c2,c3,c4,c5);
			go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    go.setSize(1350,700);
			go.setVisible(true);
			
			//go.ReminderBeep(100);
			dispose();
			//setVisible(false);
			
			
			
		}
	
}
//****************************LEVEL 2***************************************************************************
public class MoverClass2 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(230,40,3,currentCash,5,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 3***************************************************************************
public class MoverClass3 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(200,30,4,currentCash,10,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}

//****************************LEVEL 4***************************************************************************
public class MoverClass4 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(150,30,5,currentCash,40,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}

//****************************LEVEL 5***************************************************************************
public class MoverClass5 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(120,30,6,currentCash,80,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}

//****************************LEVEL 6***************************************************************************
public class MoverClass6 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(250,30,7,currentCash,150,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 7***************************************************************************
public class MoverClass7 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(180,30,8,currentCash,300,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 8***************************************************************************
public class MoverClass8 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(150,30,9,currentCash,500,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 9***************************************************************************
public class MoverClass9 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(130,40,10,currentCash,800,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 10***************************************************************************
public class MoverClass10 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(100,30,11,currentCash,1500,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//**************************LEVEL 11****************************************************************************
public class MoverClass11 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			factorqs go = new factorqs(190,33,12,currentCash,5000,currentCarHS,progress6,c1,c2,c3,c4,c5);
			go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    go.setSize(1350,700);
			go.setVisible(true);
			
			//go.ReminderBeep(100);
			dispose();
			//setVisible(false);
			
			
			
		}
	
}
//****************************LEVEL 12***************************************************************************
public class MoverClass12 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(170,30,13,currentCash,8000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 13***************************************************************************
public class MoverClass13 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(150,40,14,currentCash,12000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}

//****************************LEVEL 14***************************************************************************
public class MoverClass14 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(120,30,15,currentCash,20000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}

//****************************LEVEL 15***************************************************************************
public class MoverClass15 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(100,30,16,currentCash,30000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}

//****************************LEVEL 16***************************************************************************
public class MoverClass16 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(160,30,17,currentCash,50000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 17***************************************************************************
public class MoverClass17 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(140,30,18,currentCash,60000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 18***************************************************************************
public class MoverClass18 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(120,30,19,currentCash,70000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 19***************************************************************************
public class MoverClass19 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(110,30,20,currentCash,100000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}
//****************************LEVEL 20***************************************************************************
public class MoverClass20 implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		factorqs go = new factorqs(90,30,21,currentCash,1000000,currentCarHS,progress6,c1,c2,c3,c4,c5);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    go.setSize(1350,700);
		go.setVisible(true);

		dispose();
		
	}
}



}
		
		
		
		
