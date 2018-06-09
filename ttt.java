package game;

import javax.swing.*;
import java.awt.event.*;

class TTT extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,be,bp;
	JLabel l1;
	JTextArea t1;
	
	TTT()
	{
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		be = new JButton("EXIT");
		bp = new JButton("PLAY AGAIN");
		l1 = new JLabel("TIC-TAC-TOE");
		t1 = new JTextArea();
		
		l1.setBounds(70,10,200,50);
		
		b1.setBounds(50,70,50,50);
		b2.setBounds(100,70,50,50);
		b3.setBounds(150,70,50,50);
		
		b4.setBounds(50,120,50,50);
		b5.setBounds(100,120,50,50);
		b6.setBounds(150,120,50,50);
		
		b7.setBounds(50,170,50,50);
		b8.setBounds(100,170,50,50);
		b9.setBounds(150,170,50,50);
		
		t1.setBounds(10,250,150,50);
		
		be.setBounds(10,320,150,50);
		bp.setBounds(10,390,150,50);
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(be);
		add(bp);
		add(t1);
		
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		setTitle("TIC-TAC-TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		be.addActionListener(this);
		bp.addActionListener(this);
		
	}
	
	int c=1;
	public void actionPerformed(ActionEvent e)
	{
		String ch1 = "0";
		String ch2 = "x";
		String s1 = ("PLAYER 1 IS WINNER");
		String s2 = ("PLAYER 2 IS WINNER");
		
		if(e.getSource() == be)
		{
			System.exit(0);
		}
		
		if(e.getSource() == bp)
		{
			this.setVisible(false);
			new TTT();
		}
		
		if(e.getSource() == b1)
		{
			if(b1.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b1.setText(ch1);
					if((b2.getText().equals(ch1))&&(b3.getText().equals(ch1)))
						t1.setText(s1);
					if((b4.getText().equals(ch1))&&(b7.getText().equals(ch1)))
						t1.setText(s1);
					if((b5.getText().equals(ch1))&&(b9.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b1.setText(ch2);
					if((b2.getText().equals(ch2))&&(b3.getText().equals(ch2)))
						t1.setText(s2);
					if((b4.getText().equals(ch2))&&(b7.getText().equals(ch2)))
						t1.setText(s2);
					if((b5.getText().equals(ch2))&&(b9.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		if(e.getSource() == b2)
		{
			if(b2.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b2.setText(ch1);
					if((b1.getText().equals(ch1))&&(b3.getText().equals(ch1)))
						t1.setText(s1);
					if((b5.getText().equals(ch1))&&(b8.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b2.setText(ch2);
					if((b3.getText().equals(ch2))&&(b1.getText().equals(ch2)))
						t1.setText(s2);
					if((b5.getText().equals(ch2))&&(b8.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		if(e.getSource() == b3)
		{
			if(b3.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b3.setText(ch1);
					if((b2.getText().equals(ch1))&&(b1.getText().equals(ch1)))
						t1.setText(s1);
					if((b6.getText().equals(ch1))&&(b9.getText().equals(ch1)))
						t1.setText(s1);
					if((b5.getText().equals(ch1))&&(b7.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b3.setText(ch2);
					if((b2.getText().equals(ch2))&&(b1.getText().equals(ch2)))
						t1.setText(s2);
					if((b6.getText().equals(ch2))&&(b9.getText().equals(ch2)))
						t1.setText(s2);
					if((b5.getText().equals(ch2))&&(b7.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}	
		
		if(e.getSource() == b4)
		{
			if(b4.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b4.setText(ch1);
					if((b1.getText().equals(ch1))&&(b7.getText().equals(ch1)))
						t1.setText(s1);
					if((b5.getText().equals(ch1))&&(b6.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b4.setText(ch2);
					if((b7.getText().equals(ch2))&&(b1.getText().equals(ch2)))
						t1.setText(s2);
					if((b5.getText().equals(ch2))&&(b6.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
	
		if(e.getSource() == b5)
		{
			if(b5.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b5.setText(ch1);
					if((b4.getText().equals(ch1))&&(b6.getText().equals(ch1)))
						t1.setText(s1);
					if((b2.getText().equals(ch1))&&(b8.getText().equals(ch1)))
						t1.setText(s1);
					if((b3.getText().equals(ch1))&&(b7.getText().equals(ch1)))
						t1.setText(s1);
					if((b1.getText().equals(ch1))&&(b9.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b5.setText(ch2);
					if((b4.getText().equals(ch2))&&(b6.getText().equals(ch2)))
						t1.setText(s2);
					if((b2.getText().equals(ch2))&&(b8.getText().equals(ch2)))
						t1.setText(s2);
					if((b3.getText().equals(ch2))&&(b7.getText().equals(ch2)))
						t1.setText(s2);
					if((b9.getText().equals(ch2))&&(b1.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		if(e.getSource() == b6)
		{
			if(b6.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b6.setText(ch1);
					if((b9.getText().equals(ch1))&&(b3.getText().equals(ch1)))
						t1.setText(s1);
					if((b4.getText().equals(ch1))&&(b5.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b6.setText(ch2);
					if((b9.getText().equals(ch2))&(b3.getText().equals(ch2)))
						t1.setText(s2);
					if((b4.getText().equals(ch2))&(b5.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		if(e.getSource() == b7)
		{
			if(b7.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b7.setText(ch1);
					if((b1.getText().equals(ch1))&&(b4.getText().equals(ch1)))
						t1.setText(s1);
					if((b5.getText().equals(ch1))&&(b3.getText().equals(ch1)))
						t1.setText(s1);
					if((b8.getText().equals(ch1))&&(b9.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b7.setText(ch2);
					if((b4.getText().equals(ch2))&&(b1.getText().equals(ch2)))
						t1.setText(s2);
					if((b5.getText().equals(ch2))&&(b3.getText().equals(ch2)))
						t1.setText(s2);
					if((b8.getText().equals(ch2))&&(b9.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		if(e.getSource() == b8)
		{
			if(b8.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b8.setText(ch1);
					if((b7.getText().equals(ch1))&&(b9.getText().equals(ch1)))
						t1.setText(s1);
					if((b2.getText().equals(ch1))&&(b5.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b8.setText(ch2);
					if((b7.getText().equals(ch2))&&(b9.getText().equals(ch2)))
						t1.setText(s2);
					if((b2.getText().equals(ch2))&&(b5.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		if(e.getSource() == b9)
		{
			if(b9.getText().isEmpty())
			{
				if(c%2!=0)
				{
					b9.setText(ch1);
					if((b7.getText().equals(ch1))&&(b8.getText().equals(ch1)))
						t1.setText(s1);
					if((b6.getText().equals(ch1))&&(b3.getText().equals(ch1)))
						t1.setText(s1);
					if((b5.getText().equals(ch1))&&(b1.getText().equals(ch1)))
						t1.setText(s1);
				}
				else
				{
					b9.setText(ch2);
					if((b7.getText().equals(ch2))&&(b8.getText().equals(ch2)))
						t1.setText(s2);
					if((b3.getText().equals(ch2))&&(b6.getText().equals(ch2)))
						t1.setText(s2);
					if((b5.getText().equals(ch2))&&(b1.getText().equals(ch2)))
						t1.setText(s2);
				}
			}
		}
		
		c++;
		
		if(t1.getText().equals(s1))
		{
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		if(t1.getText().equals(s2))
		{
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
	}
	
	public static void main ( String args [] )
	{
		new TTB();
		new TTT();
	}
}