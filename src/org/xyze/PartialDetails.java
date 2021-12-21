package org.xyze;

public class PartialDetails extends PartiallyAbstraction{

	@Override
	public void name1() {
		System.out.println("abilash");
		
	}
	public static void main(String[] args) {
		PartialDetails v=new PartialDetails();
		v.name();
		v.name1();
	}
}
