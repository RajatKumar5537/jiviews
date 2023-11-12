package com.facebook.generic;

public class Demo {
public static void main(String[] args) {
	String s="12080120100100101001013929380101";
	int a=0;
	int b=0;
	char [] ch=s.toCharArray();
	for (int i=0;i<ch.length;i++)
	{
		if(ch[i]=='0')
		{
			a++;
		}
		else if(ch[i]=='1')
		{
			b++;
		}
	}
	System.out.println(a);
	System.out.println(b);
	System.out.println(ch.length);
}
}