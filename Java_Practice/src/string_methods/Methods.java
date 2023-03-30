package string_methods;

public class Methods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		System.out.println("touppercase: "+s1.toUpperCase());
		System.out.println("tolowercase: "+s1.toLowerCase());
		System.out.println("StartsWith: "+s1.startsWith("he"));
		System.out.println("EndsWith: "+s1.endsWith("l"));
		System.out.println("Length: "+s1.length());
		System.out.println("charAt: "+s1.charAt(0));
		
		String s2="java";
		System.out.println("concat: "+s1.concat(s2));
		
		String s3="Java";
		System.out.println("equals: "+s2.equals(s3));
		
		System.out.println("equalsignorecase: "+s2.equalsIgnoreCase(s3));
		
		System.out.println("compareto: "+s2.compareTo(s3));
		
		System.out.println("indexof:" +s3.indexOf("a"));
		
		
		System.out.println("lastindexof:" +s3.lastIndexOf("a"));
		
		String s4="   guddi";
		System.out.println(s4.trim());
		
		//StringBuffer Methods
		StringBuffer s=new StringBuffer(s1);
		s.append(s2);
		System.out.print(s);
		StringBuffer str=new StringBuffer(s1);
		str.insert(0, "easy");
		System.out.println(str);
		
		


	}

}
