/*	Create Class Laptop which has variables noOfUSBPort,
 	processorSpeed of type int. 
  	Create getter, setter methods for the variables. 
  	In main method, 
  	1> create Laptop object
  	2> set values of variables noOfUSBPort, processorSpeed using setter methods.
  	3> print variables noOfUSBPort, processorSpeed using getter methods.
 */


package com.assignmentinheritancepoly;

class Laptop{
	int noOfUSBPort;
	int processorSpeed;
	
	
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	
	public void setNoOfUSBPort(int noOfUSBPort)
	{
		this.noOfUSBPort = noOfUSBPort;
	}
	
	public int getProcessorSpeed()
	{
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed)
	{
		this.processorSpeed = processorSpeed;
	}
	
	public String toString() {
		return "Number of USB port : "+noOfUSBPort+"\nProcessor speed : "+processorSpeed;
	}
}


public class Assignment4 {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setNoOfUSBPort(3);
		l.getNoOfUSBPort();
		l.setProcessorSpeed(5);
		l.getProcessorSpeed();
		System.out.println(l);
		
		System.out.println("-------------------------");
		
		l.setNoOfUSBPort(4);
		l.setProcessorSpeed(7);
		System.out.println("USB port : "+l.getNoOfUSBPort());
		System.out.println("Pro Speed : "+l.getProcessorSpeed());
		
		
		

	}

}
