package com.epam.task5;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.error("enter price");
		double p=sc.nextDouble();
		LOGGER.error("enter rate of interest");
		double r=sc.nextDouble();
		LOGGER.error("enter time in years");
		double ti=sc.nextDouble();
		Simple s=new Simple(p,r,ti);
	 LOGGER.error("choose the constuction type you want");
	 LOGGER.error("1.standard material");
	 LOGGER.error("2.above standard material");
	 LOGGER.error("3.high standard material");
	 LOGGER.error("4.automated home");
	 int choice=sc.nextInt();
	
	    LOGGER.error("enter the area of land in sqfeet");
	    double bal = sc.nextDouble();
	 
	 switch(choice)
	 {
	 case 1:
		 Standard si=new Standard();
		 si.standard(bal);
     	break;
     case 2:
    	 Standard t=new Standard();
		 t.above_standard(bal);
     	break;
     case 3:
    	 Standard o=new Standard();
		 o.high_standard(bal);
     	break;
     case 4:
    	 Standard pe=new Standard();
		 pe.automated_home(bal);
     	break;
	 }
	 sc.close();
	}
}


