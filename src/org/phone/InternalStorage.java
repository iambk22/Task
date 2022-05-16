package org.phone;

public class InternalStorage {
	private void processorName() {
	  System.out.println("Processor Name : Snapdragon 772");

	}
	private void ramSize() {
	    System.out.println("Ram Size: 8GB");

	}
	private void onePlus() {
		System.out.println("Name: Oneplus");

	}
	private void mobileCost() {
		System.out.println("Price: 40000");

	}
	public static void main(String[] args) {
		InternalStorage b = new InternalStorage();
		b.onePlus();
		b.mobileCost();
		b.processorName();
		b.ramSize();
		ExternalStorage a = new ExternalStorage();
		a.size();
		
	}

}
