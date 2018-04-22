package test;

import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controleur implements ActionListener, KeyListener, PropertyChangeListener{
	//public Pile pile = new Pile();
	public JLabel resultat0 = new JLabel();
	public JLabel resultat1 = new JLabel();
	public JLabel resultat2 = new JLabel();
	public JLabel resultat3 = new JLabel();
	private Accumulateur accum;
	private Pile memoire;

	public Controleur()
	{
			accum = null;
		}

		/*public void setResult(JTextField t) {
			this.champAffichage = t ;
		}*/	
		
		/*public void setResult(JLabel d){
			this.resultat0 = d;
			this.resultat1 = d;
			this.resultat2 = d;
			this.resultat3 = d;
		}*/

		public void setAccum(Accumulateur accumc) {
			this.accum = accumc ;
		}	
		
		public void setMemoire(Pile memc){
			this.memoire = memc;
		}
		
		/*public void setPile (Pile memoire){
			this.memoire = 
		}*/
	
	public void actionPerformed (ActionEvent e){
		
	   System.out.println(e.getActionCommand());
	   if (e.getActionCommand().equals("+")){
		   accum.add();
		   accum.afficher();
		   //memoire.affiche();
	   }
	   
	   else if (e.getActionCommand().equals("-")){
		   accum.sub();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("*")){
		   accum.mult();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("/")){
		   accum.div();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("(-)")){
		   accum.neg();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("suppr")){
		   accum.drop();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("C")){
		   accum.clear();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("S")){
		   accum.swap();
		   accum.afficher();
	   }
	   
	   else if (e.getActionCommand().equals("<>")){
		   accum.push();
		   accum.afficher();
	   }
	   
	   else {
			System.out.println("non");
			accum.addNombre((e.getActionCommand()));
			accum.afficher();
	   }
			
	   /*if ("+".equals(e.getActionCommand())) {
			accum.add();
			accum.afficher();
		}
		if (e.getActionCommand().equals("-")) {
			accum.sub();
		}
		if (e.getActionCommand().equals("*")) {
			accum.mult();
		}
		if (e.getActionCommand().equals("/")) {
			accum.div();
		}
		if (e.getActionCommand().equals("C.A")) {
			accum.clear();
		}
		if (e.getActionCommand().equals("C")) {
			accum.swap();
		}
		if (e.getActionCommand().equals("(-)")) {
			accum.neg();
		}*/
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println("hihihi");
		resultat0.setText(Float.toString(accum.getMemoire(3)));
		resultat1.setText(Float.toString(accum.getMemoire(2)));
		resultat2.setText(Float.toString(accum.getMemoire(1)));
		resultat3.setText(Float.toString(accum.getMemoire(0)));
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	} 
	
}
