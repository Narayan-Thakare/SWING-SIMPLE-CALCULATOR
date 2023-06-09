package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {

		
		
		JFrame f=new JFrame("CALCULATOR");
		JLabel lb=new JLabel("CALCULATOR");
		lb.setBounds(285,10,120,40);



		JTextField tx=new JTextField();
		//JPasswordField value = new JPasswordField();   
		tx.setBounds(230, 50, 100, 40);
		
		JTextField tx1=new JTextField();
		//JPasswordField value = new JPasswordField();   
		tx1.setBounds(330, 50, 100, 40);

		
		
		//JLabel lb=new JLabel("Enter the number");
		//lb.setBounds(20,50,120,40);

		JButton a=new JButton("ADD");
		a.setBounds(130, 100, 100, 40);
		
		JButton s=new JButton("SUB");
		s.setBounds(230, 100, 100, 40);
		
		JButton m=new JButton("MULTY");
		m.setBounds(330, 100, 100, 40);
		
		JButton d=new JButton("DEVIDE");
		d.setBounds(430, 100, 100, 40);


		JLabel lb1=new JLabel();
		lb1.setBounds(285,150,120,40);
		
		a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int num=Integer.parseInt(tx.getText());
				int num2=Integer.parseInt(tx1.getText());
				lb1.setText("Add:"+(num+num2));
				JOptionPane.showMessageDialog(a,"Zakkas bhai");  



				
				
				
			}
		});
s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int num=Integer.parseInt(tx.getText());
				int num2=Integer.parseInt(tx1.getText());
				lb1.setText("SUB:"+(num-num2));
				JOptionPane.showMessageDialog(s,"Zakkas bhai");  



				
				
				
			}
		});
m.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(tx.getText());
		int num2=Integer.parseInt(tx1.getText());
		lb1.setText("MULTY:"+(num*num2));
		JOptionPane.showMessageDialog(m,"Zakkas bhai");  



		
		
		
	}
});
d.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(tx.getText());
		int num2=Integer.parseInt(tx1.getText());
		lb1.setText("DEVIDE:"+(num/num2));
		JOptionPane.showMessageDialog(d,"Zakkas Bhai");  



		
		
		
	}
});

		
		
		
		
		/*b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int num=Integer.parseInt(tx.getText());
				lb1.setText("Cube:"+(num*num*num));
				JOptionPane.showMessageDialog(b,"Zkkas bhai");  

				
				
				
				
			}
		}
		
				);*/
		    







		//f.add(value);
		f.add(tx);
		f.add(tx1);

		f.add(lb);
		f.add(lb1);
		f.add(a);
		f.add(s);
		f.add(m);
		f.add(d);

		f.setSize(700,300);
		f.setLayout(null);
		f.setVisible(true);


			}

	}


