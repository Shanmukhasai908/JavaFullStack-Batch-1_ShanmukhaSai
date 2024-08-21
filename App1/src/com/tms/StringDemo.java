package com.tms;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Verizon";
		String name1=new String("Verizon");
		System.out.println(name1.compareTo(name));
		System.out.println(name1.length());
		System.out.println(name.toUpperCase());
		
		//stringbuffer
		
		StringBuffer sb= new StringBuffer("Javatech");
		sb.append(4009222);
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
		//stringbuilder
		
		StringBuilder sbr= new StringBuilder("Javatech");
		sbr.append(4009222);
		System.out.println(sbr.capacity());
		System.out.println(sbr);
		System.out.println(sbr.reverse());
		sbr.ensureCapacity(40);
		System.out.println(sbr.capacity());
		
		

		//StringTokenizer
		String line= "Verizon,BuildNo,RahejMindSpace,Hyderabad,Telangana";
		StringTokenizer st=new StringTokenizer(line,",");
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.hashCode());
		System.out.println(st.hasMoreElements());
		System.out.println(st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
