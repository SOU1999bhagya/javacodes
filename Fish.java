package com.xworkz.override.objectClasses;

public class Fish {

	private String name;
	private String color;
	private int price;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "trr";//super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 99;//super.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			if(obj instanceof Fish) {
				Fish fish=(Fish)obj;
				String fish1=fish.getColor();
				String fish2=fish.getName();
				if(this.color.equals(fish1) && this.name.equals(fish2)){
					System.out.println("Colour and name is matched");
					return true;
				}
				else {
					System.err.println("Not matched");
				}
				
				
			}
			
			
			
			
		}
		return super.equals(obj);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
