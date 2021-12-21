package org.xyze;

public class FullyDetails implements FullyAbstraction{

	@Override
	public void name1() {
		System.out.println("lokesh");
	}

	@Override
	public void name2() {
	
		System.out.println("monish");
	}

	@Override
	public void name3() {
		System.out.println("abilash");
		
	}
public static void main(String[] args) {
	FullyDetails g=new FullyDetails();
	g.name1();
	g.name2();
	g.name3();
}
}
