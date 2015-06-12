package java_study;

import java.util.Date;

import org.junit.*;

public class TestStrings {
	@Test
	//True (Reference)
	public void test01() {
		String a = "hello";
		String b = "hello";
		System.out.println(a == b);
	}
	
	@Test
	//True (Comparison)
	public void test02() {
		String a = "hello";
		String b = "hello";
		System.out.println(a.equals(b));
	}
	
	@Test
	//True (Reference)
	public void test03() {
		String a = "hello";
		String b = "hello";
		System.out.println(a == (b.toLowerCase()));
	}
	
	@Test
	//True (Comparison)
	public void test04() {
		String a = "hello";
		String b = "hello";
		System.out.println(a.equals(b.toLowerCase()));
	}
	
	@Test
	//True (Comparison)
	public void test05() {
		String b = "hello";
		System.out.println(b.equals(b.toLowerCase()));
	}
	
	@Test
	//True (!!!! Shouldn't these be different Objects if Strings are immutable?) (Reference)
	public void test06() {
		String b = "hello";
		System.out.println(b == (b.toLowerCase()));
	}
	
	@Test
	//False (Comparison)
	public void test07() {
		String b = "hello";
		System.out.println(b.equals(b.toUpperCase()));
	}
		
	@Test
	//Reverse String
	public void test08() {
		String a = "hello";
		String b = "";
		int l = a.length();
		
		for (int i = (l-1); i >= 0; i--)
			b = b + a.charAt(i);

		System.out.println("Reversed String is: " + b);
	}
	
	@Test
	//Reverse using StringBuilder
	public void test09() {
		StringBuilder a = new StringBuilder("hello");
		System.out.println("StringBuilder: " + a.reverse());
	}
	
	@Test
	//Reverse String using StringBuffer class. Why not print(?)
	public void test10() {
	      StringBuffer a = new StringBuffer("hello5");
	      System.out.println("StringBuffer: " + a.reverse());
	}
	
	@Test
	public void test11() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		Date dateNow = new Date();
	    StringBuilder result = new StringBuilder();
	    
	    String NEW_LINE = System.getProperty("line.separator");

	    result.append(this.getClass().getName() + " Object {" + NEW_LINE);
	    result.append(" Date: " + dateNow + NEW_LINE);
	    result.append(" Fruit: " + fruitAttribute + NEW_LINE);
	    result.append("Vegetable: " + vegetableAttribute + NEW_LINE);
	    result.append("}");
	    
	    return result.toString();
	}
	
	private String fruitAttribute = "banana";
	private String vegetableAttribute = "rutabaga";
}
