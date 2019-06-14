import java.util.*;
import java.lang.*;

import java.io.*;

class AVGSPEED
{
	
public static void main (String[] args) {

	      double km=14,miles;

	      double time_in_sec,time_in_hr,avg_speed;
	
              miles=14/1.6;
	      
              time_in_sec=45*60+30;
              time_in_hr=time_in_sec/60;

	      avg_speed=miles*time_in_hr;

	      System.out.println("The average speed is="+avg_speed+"miles/hour");

	}

}