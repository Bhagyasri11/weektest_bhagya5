package com.epam.task5;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simple  {
	private static final Logger LOGGER = LogManager.getLogger(Simple.class);
	Simple(double price,double rate,double time)
	{
       double  sim=(price*rate*time)/100;
        double com=price*Math.pow(1.0+rate/100.0,time);
        LOGGER.error("simple interest="+sim);
        LOGGER.error("compound interest="+com);
        
	}
}

