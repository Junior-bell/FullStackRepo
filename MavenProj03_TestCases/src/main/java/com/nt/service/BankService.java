package com.nt.service;

/**
 * Hello world!
 *
 */
public class BankService
{
  public double calclIntrstAmount(double pamt,double rate, double time)
  {
	  if(pamt<=0||rate<=0||time<=0)
	  {
		  throw new IllegalArgumentException("invalid inputs");
	  }
	  try {
		  Thread.sleep(3000);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return (pamt*rate*time)/100.0f;
  }
}
