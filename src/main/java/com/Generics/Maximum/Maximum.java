package com.Generics.Maximum;

public class Maximum 
{

	public static int maxInteger(Integer i, Integer j, Integer k) {
		int max=i;
		if(j.compareTo(max) > 0 )
			max=j;
		if(k.compareTo(max) > 0 )
			max=k;
			
	return max;
	}
}