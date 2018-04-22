package test;


	import java.util.Stack;
	import javax.swing.JTextField;
	import test.Controleur;
	import test.Interface;
	import java.beans.PropertyChangeSupport;
	import java.util.Scanner;

	public class Main {
		
		/*public static void main(String[] args)
		{
			test1();
			test2();
			test3();
			test4();
			test5();
			test6();
			test7();
			test8();
		}
		*/
		
		/*public static void test1() //addition 
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.add();
			a.afficher();
		}
		
		public static void test2() //soustraction
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.sub();
			a.afficher();
		}
		
		public static void test3() //multiplication
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.mult();
			a.afficher();
		}
		
		public static void test4() //division
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.div();
			a.afficher();
		}
		
		public static void test5() //opposé
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.afficher();
			a.neg();
			a.afficher();
		}
		
		public static void test6() //swap
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.swap();
			a.afficher();
		}
		
		public static void test7() //drop
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.drop();
			a.afficher();
		}
		
		public static void test8() //clear
		{
			Accumulateur a = new Accumulateur();
			a.push(10);
			a.push(20);
			a.afficher();
			a.clear();
			a.afficher();
		}*/
		
		public static void main(String[] args){
		Controleur cont = new Controleur();
		Accumulateur accum = new Accumulateur(cont);
		cont.setAccum(accum);
		Interface calcul = new Interface(cont);
		calcul.design();
		}
}
