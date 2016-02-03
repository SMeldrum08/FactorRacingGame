
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;


import java.lang.Math;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;




public class factorqs extends JFrame{
	private JPanel background1;
	public JPanel questionbar;
	private JLabel carA;
	private JLabel carB;
	private JLabel grassA;
	public JLabel question;
	public JTextField textField;
	public JTextField textField2;
	public JTextField textField3;
	public JTextField textField4;
	
	int score = 0;
	public int q1;
	public int q2;
	int ans1;
	int ans2;
	int ans3;
	int ans4;
	Toolkit toolkit;
	Timer timer;
	int[] questionArray = {
		6,8,10,12,14,15,16,18,20,21,22,
		24,26,27,28,30,32,33,34,35,36,38,39,40,42,
		44,45,46,48,50,52,54,55,56,57,58,60,70,80,90,100
	};
	int CarAPos;
	int CarBPos;
	int distanceB;
	private int progress=1;
	private int potProgress;
	private int currentCashF;
	private int cashPrizeF;
	int currentCarF;
	int jumpDistance;
	int prevProgressF;
	public int v1;
	public int v2;
	public int v3;
	public int v4;
	public int v5;
	public int v6;
	public int v7;
	public int v8;
	public int v9;
	public int v10;
	public int v11;
	public int v12;
	
	storageCenter store = new storageCenter();

	
	public factorqs(int speed, int distance, int progressA, int currentCash, int cashPrize, int currentCar, int prevProgress, int cr1, int cr2, int cr3, int cr4, int cr5){
		super("Factor Racing");
		setLayout(null);
		
		background1 = new JPanel();
		background1.setBackground(Color.lightGray);
		add(background1);
		background1.setBounds(0,0,1350,500);
		
		questionbar = new JPanel();
		questionbar.setBackground(Color.GRAY);
		add(questionbar);
		questionbar.setBounds(0,500,1350,250);
		
		v1 = speed;
		v2 = distance;
		v3 = progressA;
		v4 = currentCash;
		v5 = cashPrize;
		v6 = currentCar;
		v7 = prevProgress;
		v8 = cr1;
		v9 = cr2;
		v10 = cr3;
		v11 = cr4;
		v12 = cr5;
		
		//**************************BACKGROUND CHANGER ATTEMPT**********************************************************
		
		if(progressA <=6){
		Icon grass1 = new ImageIcon (getClass().getResource("grass.png"));
		grassA = new JLabel(grass1);
		background1.add(grassA);
		background1.setLayout(null);
		Dimension sizeG = grassA.getPreferredSize();
		grassA.setBounds(0,0,sizeG.width, sizeG.height);
		}
		else if(progressA <=11 && progressA> 6){
		Icon grass1 = new ImageIcon (getClass().getResource("Road.png"));
		grassA = new JLabel(grass1);
		background1.add(grassA);
		background1.setLayout(null);
		Dimension sizeG = grassA.getPreferredSize();
		grassA.setBounds(0,0,sizeG.width, sizeG.height);
		}
		else if(progressA <=16 && progressA> 11){
		Icon grass1 = new ImageIcon (getClass().getResource("Sky.png"));
		grassA = new JLabel(grass1);
		background1.add(grassA);
		background1.setLayout(null);
		Dimension sizeG = grassA.getPreferredSize();
		grassA.setBounds(0,0,sizeG.width, sizeG.height);
		}
		else if(progressA <=21 && progressA> 16){
		Icon grass1 = new ImageIcon (getClass().getResource("Space.png"));
		grassA = new JLabel(grass1);
		background1.add(grassA);
		background1.setLayout(null);
		Dimension sizeG = grassA.getPreferredSize();
		grassA.setBounds(0,0,sizeG.width, sizeG.height);
		}
		
		
		
		//***********************************************************************************************8
		//Icon car1 = new ImageIcon (getClass().getResource("car1.png"));
		//carA = new JLabel(car1);
		//background1.add(carA);
		//background1.setLayout(null);
		//Dimension size = carA.getPreferredSize();
		//carA.setBounds(0,100,size.width, size.height);
		
		//Icon car2 = new ImageIcon (getClass().getResource("car2.png"));
		//carB = new JLabel(car2);
		//background1.add(carB);
		//Dimension sizeB = carB.getPreferredSize();
		//carB.setBounds(0,300,sizeB.width, sizeB.height);
		
		
		
		ImageFilter filter = new RGBImageFilter() {
	         int transparentColor = Color.white.getRGB() | 0xFF000000;

	         public final int filterRGB(int x, int y, int rgb) {
	            if ((rgb | 0xFF000000) == transparentColor) {
	               return 0x00FFFFFF & rgb;
	            } else {
	               return rgb;
	            }
	         }
	      };
	      
	      
	      
	      
	//------------------Car1 Changer Attempt-----------------------------------------------------     
	//******************Transparent Attempt*******************************************************      
	   
	      if(progressA <=6){
	      ImageIcon car1 = new ImageIcon (getClass().getResource("turtle1.png"));

	      ImageProducer filteredImgProd = new FilteredImageSource(car1.getImage().getSource(), filter);
	      Image transparentImg = Toolkit.getDefaultToolkit().createImage(filteredImgProd);
	      ImageIcon transparentImg1 = new ImageIcon(transparentImg);
			carA = new JLabel(transparentImg1);
			grassA.add(carA);
			grassA.setLayout(null);
			Dimension size = carA.getPreferredSize();
			carA.setBounds(0,100,size.width, size.height);
	      }
	      else if(progressA > 6 && progressA<=11){
		    ImageIcon car1 = new ImageIcon (getClass().getResource("car1.png"));

		    ImageProducer filteredImgProd = new FilteredImageSource(car1.getImage().getSource(), filter);
		    Image transparentImg = Toolkit.getDefaultToolkit().createImage(filteredImgProd);
		    ImageIcon transparentImg1 = new ImageIcon(transparentImg);
			carA = new JLabel(transparentImg1);
			grassA.add(carA);
			grassA.setLayout(null);
			Dimension size = carA.getPreferredSize();
			carA.setBounds(0,100,size.width, size.height);  
	      }
	      else if(progressA > 11 && progressA<=16){
		    ImageIcon car1 = new ImageIcon (getClass().getResource("plane1.png"));

		    ImageProducer filteredImgProd = new FilteredImageSource(car1.getImage().getSource(), filter);
		    Image transparentImg = Toolkit.getDefaultToolkit().createImage(filteredImgProd);
		    ImageIcon transparentImg1 = new ImageIcon(transparentImg);
			carA = new JLabel(transparentImg1);
			grassA.add(carA);
			grassA.setLayout(null);
			Dimension size = carA.getPreferredSize();
			carA.setBounds(0,100,size.width, size.height);  
	      }
	      else if(progressA > 16 && progressA<=25){
		    ImageIcon car1 = new ImageIcon (getClass().getResource("spaceship1.png"));

		    ImageProducer filteredImgProd = new FilteredImageSource(car1.getImage().getSource(), filter);
		    Image transparentImg = Toolkit.getDefaultToolkit().createImage(filteredImgProd);
		    ImageIcon transparentImg1 = new ImageIcon(transparentImg);
			carA = new JLabel(transparentImg1);
			grassA.add(carA);
			grassA.setLayout(null);
			Dimension size = carA.getPreferredSize();
			carA.setBounds(0,100,size.width, size.height);  
	      }
	 //***********************************************************************************************     
	      
	      currentCarF = currentCar;
	      
	      
	 //***********************************CAR 2 CHANGER**************************************************     
	      
	      if(currentCarF == 1){
			ImageIcon car2 = new ImageIcon (getClass().getResource("turtle2.png"));

		      ImageProducer filteredImgProd2 = new FilteredImageSource(car2.getImage().getSource(), filter);
		      Image transparentImg2 = Toolkit.getDefaultToolkit().createImage(filteredImgProd2);
		      ImageIcon transparentImg12 = new ImageIcon(transparentImg2);
				carB = new JLabel(transparentImg12);
				grassA.add(carB);
				Dimension sizeB = carB.getPreferredSize();
				carB.setBounds(0,300,sizeB.width, sizeB.height);
	      }
	      if(currentCarF == 2){
			ImageIcon car2 = new ImageIcon (getClass().getResource("car2.png"));

		      ImageProducer filteredImgProd2 = new FilteredImageSource(car2.getImage().getSource(), filter);
		      Image transparentImg2 = Toolkit.getDefaultToolkit().createImage(filteredImgProd2);
		      ImageIcon transparentImg12 = new ImageIcon(transparentImg2);
				carB = new JLabel(transparentImg12);
				grassA.add(carB);
				Dimension sizeB = carB.getPreferredSize();
				carB.setBounds(0,300,sizeB.width, sizeB.height);
	      }
	      if(currentCarF == 3){
			ImageIcon car2 = new ImageIcon (getClass().getResource("plane2.png"));

		      ImageProducer filteredImgProd2 = new FilteredImageSource(car2.getImage().getSource(), filter);
		      Image transparentImg2 = Toolkit.getDefaultToolkit().createImage(filteredImgProd2);
		      ImageIcon transparentImg12 = new ImageIcon(transparentImg2);
				carB = new JLabel(transparentImg12);
				grassA.add(carB);
				Dimension sizeB = carB.getPreferredSize();
				carB.setBounds(0,300,sizeB.width, sizeB.height);
	      }
	      if(currentCarF == 4){
			ImageIcon car2 = new ImageIcon (getClass().getResource("spaceship2.png"));

		      ImageProducer filteredImgProd2 = new FilteredImageSource(car2.getImage().getSource(), filter);
		      Image transparentImg2 = Toolkit.getDefaultToolkit().createImage(filteredImgProd2);
		      ImageIcon transparentImg12 = new ImageIcon(transparentImg2);
				carB = new JLabel(transparentImg12);
				grassA.add(carB);
				Dimension sizeB = carB.getPreferredSize();
				carB.setBounds(0,300,sizeB.width, sizeB.height);
	      }
	      if(currentCarF == 5){
			ImageIcon car2 = new ImageIcon (getClass().getResource("spaceship3.png"));

		      ImageProducer filteredImgProd2 = new FilteredImageSource(car2.getImage().getSource(), filter);
		      Image transparentImg2 = Toolkit.getDefaultToolkit().createImage(filteredImgProd2);
		      ImageIcon transparentImg12 = new ImageIcon(transparentImg2);
				carB = new JLabel(transparentImg12);
				grassA.add(carB);
				Dimension sizeB = carB.getPreferredSize();
				carB.setBounds(0,300,sizeB.width, sizeB.height);
	      }
	      
	      
	      
	//*******************************JUMP DISTANCE CHANGER*****************************************************
	      
	      if(progressA <=6){
	    	  if(currentCar == 1){
	    		  jumpDistance = 120;
	    	  }
	    	  else if(currentCar == 2){
	    		  jumpDistance = 300;
	    	  }
	    	  else if(currentCar == 3){
	    		  jumpDistance = 800;
	    	  }
	    	  else if(currentCar == 4){
	    		  jumpDistance = 1200;
	    	  }
	    	  else if(currentCar == 5){
	    		  jumpDistance = 2000;
	    	  }
	      }
	      if(progressA > 6 && progressA<=11){
	    	  if(currentCar == 1){
	    		  jumpDistance = 50;
	    	  }
	    	  if(currentCar == 2){
	    		  jumpDistance = 120;
	    	  }
	    	  if(currentCar == 3){
	    		  jumpDistance = 300;
	    	  }
	    	  if(currentCar == 4){
	    		  jumpDistance = 700;
	    	  }
	    	  if(currentCar == 5){
	    		  jumpDistance = 1500;
	    	  }
	      }
	      if(progressA > 11 && progressA<=16){
	    	  if(currentCar == 1){
	    		  jumpDistance = 10;
	    	  }
	    	  if(currentCar == 2){
	    		  jumpDistance = 50;
	    	  }
	    	  if(currentCar == 3){
	    		  jumpDistance = 130;
	    	  }
	    	  if(currentCar == 4){
	    		  jumpDistance = 500;
	    	  }
	    	  if(currentCar == 5){
	    		  jumpDistance = 1200;
	    	  }
	      }
	      if(progressA > 16 && progressA<=21){
	    	  if(currentCar == 1){
	    		  jumpDistance = 1;
	    	  }
	    	  if(currentCar == 2){
	    		  jumpDistance = 5;
	    	  }
	    	  if(currentCar == 3){
	    		  jumpDistance = 40;
	    	  }
	    	  if(currentCar == 4){
	    		  jumpDistance = 120;
	    	  }
	    	  if(currentCar == 5){
	    		  jumpDistance = 200;
	    	  }
	      }
	      
			
			
	//***************************************************************************		
		
		questionbar.setLayout(null);
		question = new JLabel();
		questionbar.add(question);
		question.setBounds(10, 10, 1315, 75);
		question.setOpaque(true);
		question.setBackground(Color.lightGray);
		question.setVisible(true);
		
		
			//this.q1 = 3 + (int )(Math.random()*49);
			//question.setText("What are the factors of "+q1);
			this.q1 = (int )(Math.random()*41);
    		question.setText("What are the factors of "+ questionArray[q1]);
		
    	HandlerClass handler = new HandlerClass();
		textField = new JTextField(10);
		questionbar.add(textField);
		Dimension sizeT1 = textField.getPreferredSize();
		textField.setBounds(10,100,sizeT1.width,sizeT1.height);
		textField.addActionListener( handler );
		
		textField2 = new JTextField(10);
		questionbar.add(textField2);
		textField2.setBounds( (sizeT1.width + 10)+10,100,sizeT1.width,sizeT1.height);
		textField2.addActionListener( handler );
		
		textField3 = new JTextField(10);
		questionbar.add(textField3);
		textField3.setBounds((sizeT1.width + 10)*2 + 10,100,sizeT1.width,sizeT1.height);
		textField3.addActionListener( handler );
		
		textField4 = new JTextField(10);
		questionbar.add(textField4);
		textField4.setBounds((sizeT1.width + 10)*3 + 10,100,sizeT1.width,sizeT1.height);
		textField4.addActionListener( handler );
		//**************************ANSWER BUTTON********************************************
		JButton button = new JButton("Submit");
		questionbar.add(button);
		Dimension sizeBut = button.getPreferredSize();
		button.setBounds(520,100,sizeBut.width, sizeBut.height);
		
		//************************RESET BUTTON***********************************************
		JButton reset = new JButton("Reset");
		questionbar.add(reset);
		Dimension sizeResetBut = reset.getPreferredSize();
		reset.setBounds(1000,100,sizeResetBut.width, sizeResetBut.height);
		
		
		
		
		
		
		ReminderBeep(speed);
		
		//HandlerClass handler = new HandlerClass();
		ResetClass resetHandler = new ResetClass();
		
		button.addActionListener(handler);
		reset.addActionListener(resetHandler);
		
		//timer = new Timer();
	    //timer.schedule(new RemindTask(),1000, seconds * 1000);
		
		this.distanceB = distance;
		
		if(prevProgress < progressA){
		this.potProgress = progressA;
		}
		else{
		this.potProgress = prevProgress;
		}
		currentCashF = currentCash;
		cashPrizeF = cashPrize;
				
		
		
	}

	
	public class HandlerClass implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
					

			int ans1 = Integer.parseInt(textField.getText());
			int ans2 = Integer.parseInt(textField2.getText());
			int ans3 = Integer.parseInt(textField3.getText());
			int ans4 = Integer.parseInt(textField4.getText());
			//int check1 = ans1 - ans2;
			//int check2 = ans3 - ans4;
			//int check3 = ans1 - ans3;
			//int check4 = ans2 - ans4;
				
			
			
	        if(questionArray[q1] % ans1 == 0 && questionArray[q1] % ans2 == 0 && questionArray[q1] % ans3 == 0 && questionArray[q1] % ans4 == 0
	        		&& ans1 - ans2 != 0 && ans3 - ans4 != 0 && ans1 - ans3 != 0 && ans2 - ans4 != 0 ){
	        		Dimension sizeB = carB.getPreferredSize();
	        		carB.setBounds(carB.getX() + jumpDistance,300,sizeB.width, sizeB.height);
	        		
	        		textField.setText("");
	        		textField2.setText("");
	        		textField3.setText("");
	        		textField4.setText("");
	        		textField.requestFocus(true);
	        		
	        		q2 = (int )(Math.random()*41);
	        		while(q2 == q1){
	        			q2 = (int )(Math.random()*41);
	        		}
	        		
	        		q1 = q2;
	        		
	        		//q1 = (int )(Math.random()*41);
	        		question.setText("What are the factors of "+ questionArray[q1]);
	        		CarBPos = carB.getX();
		    		System.out.println(CarAPos);
	        		if(CarBPos >1050){
		    			timer.cancel();
		                timer.purge();
		    			JOptionPane.showMessageDialog(null,  "You win!");
		    			dispose();
		    			homeScreen home = new homeScreen(potProgress,cashPrizeF,currentCashF,currentCarF,v8,v9,v10,v11,v12);	
		    		}
	        	//}
	        }
		}
		
	}
		public void ReminderBeep(int seconds) {
		    toolkit = Toolkit.getDefaultToolkit();
		    timer = new Timer();
		    timer.schedule(new RemindTask(),1000, seconds * 10);
		  }
	  
		
	  
	  class RemindTask  extends TimerTask {
		    public void run() {
		    	Dimension sizeA = carA.getPreferredSize();
	    		carA.setBounds(carA.getX() + distanceB,100,sizeA.width, sizeA.height);
	    		CarAPos = carA.getX();
	    		System.out.println(CarAPos);
	    		if(CarAPos >1050){
	    			JOptionPane.showMessageDialog(null,  "You lose sucka!");
	    			timer.cancel();
	                timer.purge();
	    			dispose();
	    			homeScreen home = new homeScreen(potProgress -1,0,currentCashF,currentCarF,v8,v9,v10,v11,v12);
	    			
	    			//homeScreen.progress6 = potProgress;
	    			//System.out.println(storageCenter.progress7);
	    			
	    		}
	    		
		    }
	  
	  
		  
		
	}
	  
	  
	  public class ResetClass implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				dispose();
    			timer.cancel();
                timer.purge();
				factorqs go = new factorqs(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12);
				go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    go.setSize(1350,700);
				go.setVisible(true);
				
				
			}
	  }

	
}


//if((ans1 - ans2 < 0 && ans2 - ans3 < 0 && ans3 - ans4 < 0) {
//q1 = 3 + (int )(Math.random()*49);
//q1.setInt(q2);
//System.out.println(check1);
//&& ans1 - ans2 != 0 && ans3 - ans4 != 0 && ans1 - ans3 != 0 && ans2 - ans4 != 0
//if((ans1 - ans2 > 0 && ans3 - ans4 > 0 && ans1 - ans3 > 0 && ans2 - ans4 > 0) ||  (ans1 - ans2 < 0 && ans3 - ans4 < 0 && ans1 - ans3 < 0 && ans2 - ans4 < 0)){