package test;

import java.util.Stack;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import test.Controleur;

public class Accumulateur {
	Pile memoire; 
	PropertyChangeSupport help ; 
	Controleur ctrl;
	String nombre = "";
	
	
	
	public Accumulateur(Controleur ctlra)
	{
		memoire = new Pile();
		help = new PropertyChangeSupport(this); 
		ctrl=ctlra;
		help.addPropertyChangeListener(ctrl);
	}
	
	public float getMemoire (int i){
		if (memoire.indexOf(memoire.lastElement()) >= i) {
			return memoire.get(i);
		}
		else {
			return 0;
		}
				
	}

    public void addNombre(String chiffre)	{
    	nombre = nombre + chiffre;
    }
    
	
	
	public void push()
	{
		memoire.push(Float.parseFloat(nombre));
		help.firePropertyChange("", 0,Float.parseFloat(nombre) );
		nombre = "";
	}
	
	
	public void add()
	{
		float a = memoire.pop(); 
		float b = memoire.pop();
		memoire.push(a+b);
		help.firePropertyChange("", 0, (a+b));
		
	}
	
	public void sub()
	{
		float a = memoire.pop();
		float b = memoire.pop();
		memoire.push(b-a);
		help.firePropertyChange("", 0, (b-a));
	}
	
	public void mult()
	{
		float a = memoire.pop();
		float b = memoire.pop();
		memoire.push(a*b);
		help.firePropertyChange("", 0, (a*b));
	}
	
	public void div()
	{
		float a = memoire.pop();
		float b = memoire.pop();
		memoire.push(b/a);
		help.firePropertyChange("", 0, (b/a));
	}
	
	public void neg()
	{
		float a = memoire.pop();
		memoire.push(-(a));
		help.firePropertyChange("", 0, (-(a)));
	}
	
	 public void swap()
	 {
			Float a = memoire.pop();
			Float b = memoire.pop();
			memoire.push(a);
			memoire.push(b);
			//help.firePropertyChange("", 0, (b,a));
	}
	 
	 public void drop()
	 {
		 memoire.pop();
		 //help.firePropertyChange("", 0, Float.parseFloat(nombre =""));
	 }
	  
	 public void clear()
	 {
		 memoire.clear();
		 help.firePropertyChange("", 0, Float.parseFloat(nombre ="0"));
	 }
	 
	 public void afficher()
		{
			System.out.println(memoire);
		}

}
