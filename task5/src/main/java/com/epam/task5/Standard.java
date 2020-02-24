package com.epam.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Standard {
private static final Logger LOGGER = LogManager.getLogger(Standard.class);
	void standard(double amount)
	{
	    double total_cost=(double)amount*1200;
	    LOGGER.error("the total cost of construction is=  "+total_cost);
	}
	void above_standard(double amount)
	{
		double total_cost=(double)amount*1500;
	    LOGGER.error("the total cost of construction is=  "+total_cost);
	}
	void high_standard(double amount)
	{
    double total_cost=(double)amount*1800;
      LOGGER.error("the total cost of construction is=  "+total_cost);
		
	}
	void automated_home(double amount)
	{
    double total_cost=(double)amount*2500;
    LOGGER.error("the total cost of construction is=  "+total_cost);
		
	}
	

}
