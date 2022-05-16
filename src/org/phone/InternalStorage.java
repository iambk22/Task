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
	public static void main(String[] args) {
		InternalStorage b = new InternalStorage();
		b.onePlus();
		b.processorName();
		b.ramSize();
		ExternalStorage a = new ExternalStorage();
		a.size();
		
	}

}
