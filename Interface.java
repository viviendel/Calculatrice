package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField; 



import test.Controleur.*;
import test.Accumulateur.*;
import test.Pile.*;
import java.awt.Font;

public class Interface {
	private static Controleur ctlr;
	private static Accumulateur accum;
	private static Pile memoire;
	
	public Interface (Controleur ctlri){
		ctlr=ctlri;
	}
	
	public Interface (Accumulateur accumi){
		accum=accumi;
	}
	
	public Interface (Pile memi){
		memoire = memi;
	}

	
	public void design(){
		
		//String resultat1;
		

		JFrame monInterface = new JFrame("Calculette");
		monInterface.setSize(800, 600);
		monInterface.setResizable (false);
		
		JPanel espaceNord = new JPanel();
		JLabel ecran1 = ctlr.resultat0;
		JLabel ecran2 = ctlr.resultat1;
		JLabel ecran3 = ctlr.resultat2;
		JLabel ecran4 = ctlr.resultat3;
		
		monInterface.getContentPane().add(espaceNord, BorderLayout.NORTH);//Création d'un panneauNord
		
		//memoire.setResult(champAffichage);
		espaceNord.setLayout(new GridLayout(4,1));
		//resultat.setBackground(Color.green);
		espaceNord.add(ecran1);
		espaceNord.add(ecran2);
		espaceNord.add(ecran3);
		espaceNord.add(ecran4);
	
		

		JPanel espaceCentre = new JPanel();
		monInterface.getContentPane().add(espaceCentre, BorderLayout.CENTER);//Création d'un panneauOuest
		JButton BoutonDrop = new JButton("suppr");
		BoutonDrop.addActionListener (ctlr);
		JButton BoutonClear = new JButton("C");
		BoutonClear.addActionListener(ctlr);
		JButton BoutonSwap = new JButton ("S");
		BoutonSwap.addActionListener(ctlr);
		JButton BoutonDiv = new JButton("/");
		//BoutonDiv.setBackground(Color.lightGray);
		BoutonDiv.addActionListener (ctlr);
		JButton Bouton7 = new JButton("7");
		Bouton7.setBackground(Color.white);
		Bouton7.addActionListener(ctlr);
		JButton Bouton8 = new JButton("8");
		Bouton8.setBackground(Color.white);
		Bouton8.addActionListener (ctlr);
		JButton Bouton9 = new JButton("9");
		Bouton9.setBackground(Color.white);
		Bouton9.addActionListener (ctlr);
		JButton BoutonMult = new JButton("*");
		//BoutonMult.setBackground(Color.lightGray);
		BoutonMult.addActionListener(ctlr);
		JButton Bouton4 = new JButton("4");
		Bouton4.setBackground(Color.white);
		Bouton4.addActionListener (ctlr);
		JButton Bouton5 = new JButton("5");
		Bouton5.setBackground(Color.white);
		Bouton5.addActionListener (ctlr);
		JButton Bouton6 = new JButton("6");
		Bouton6.setBackground(Color.white);
		Bouton6.addActionListener (ctlr);
		JButton BoutonSub = new JButton("-");
		//BoutonSub.setBackground(Color.cyan);
		BoutonSub.addActionListener(ctlr);
		JButton Bouton1 = new JButton("1");
		Bouton1.setBackground(Color.white);
		Bouton1.addActionListener (ctlr);
		JButton Bouton2 = new JButton("2");
		Bouton2.setBackground(Color.white);
		Bouton2.addActionListener (ctlr);
		JButton Bouton3 = new JButton("3");
		Bouton3.setBackground(Color.white);
		Bouton3.addActionListener (ctlr);
		JButton BoutonAdd = new JButton ("+");
		//BoutonAdd.setBackground(Color.lightGray);
		BoutonAdd.addActionListener(ctlr);
		JButton Bouton0 = new JButton("0");
		Bouton0.setBackground(Color.white);
		Bouton0.addActionListener (ctlr);
		JButton BoutonPoint = new JButton(".");
		BoutonPoint.setBackground(Color.white);
		BoutonPoint.addActionListener (ctlr);
		JButton BoutonNeg = new JButton ("(-)");
		BoutonNeg.setBackground(Color.white);
		BoutonNeg.addActionListener(ctlr);
		JButton BoutonPush = new JButton ("<>");
		//BoutonPush.setBackground(Color.white);
		BoutonPush.setForeground(Color.red);
		BoutonPush.addActionListener(ctlr);

		espaceCentre.setLayout(new GridLayout(5,6));
		espaceCentre.add(BoutonDrop);
		espaceCentre.add(BoutonClear);
		espaceCentre.add(BoutonSwap);
		espaceCentre.add(BoutonDiv);
		espaceCentre.add(Bouton7);
		espaceCentre.add(Bouton8);
		espaceCentre.add(Bouton9);
		espaceCentre.add(BoutonMult);
		espaceCentre.add(Bouton4);
		espaceCentre.add(Bouton5);
		espaceCentre.add(Bouton6);
		espaceCentre.add(BoutonSub);
		espaceCentre.add(Bouton1);
		espaceCentre.add(Bouton2);
		espaceCentre.add(Bouton3);
		espaceCentre.add(BoutonAdd);
		espaceCentre.add(Bouton0);
		espaceCentre.add(BoutonPoint);
		espaceCentre.add(BoutonNeg);
		espaceCentre.add(BoutonPush);
		//Affectation des bouton au panneauEst 
		
		
		

		

		
		// Boutton égal au centre 
		/*JPanel panneauCentre = new JPanel();
		fenetre.getContentPane().add(panneauCentre, BorderLayout.CENTER);//Création d'un panneauCentre
		JButton boutonVide =new JButton("");//Déclaration du bouton =
		boutonVide.setBackground(Color.black);
		ButtonGroup vide = new ButtonGroup();
		vide.add(boutonEgal);
		panneauCentre.setLayout(new GridLayout(1, 1));//Affectation du bouton vide dans le panneauCentre
		panneauCentre.add(boutonVide);*/
		
		//Résultats en haut
		
		
        monInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		monInterface.pack();
		monInterface.setVisible(true);
	}
}
