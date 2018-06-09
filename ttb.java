package game;

import javax.swing.*;
import java.awt.event.*;

class TTB extends JFrame implements ActionListener 
{
	JButton b1,b2;
	JLabel l1,l2;
	
	TTB()
	{
		b2 = new JButton(" TIC - TAC - TOE ");
		b1 = new JButton("START");
		l1 = new JLabel(" PLAYER 1 ==> 0 ");
		l2 = new JLabel(" PLAYER 2 ==> x ");
		
		b2.setBounds(50,50,200,50);
		b1.setBounds(50,120,200,50);
		l1.setBounds(80,200,100,50);
		l2.setBounds(80,260,100,50);
		
		this.add(b1);
		this.add(b2);
		this.add(l1);
		this.add(l2);
		
		this.setLayout(null);
		this.setTitle(" WELCOME ");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1);
		{
		this.setVisible(false);
		//this.dispose();
		new TTT().setVisible(true);
		}
	}
}
		
	