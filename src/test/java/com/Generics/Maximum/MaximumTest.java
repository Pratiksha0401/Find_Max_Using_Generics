package com.Generics.Maximum;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaximumTest 
{
    
    @Test
    public void shouldReturnTrue_WhenMaxStringAt1stPosition ()
    {
    	String max=Maximum.maxString("Good","Better","Bad");
        assertEquals( "Good" , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxStringAt2ndPosition()
    {
    	String max=Maximum.maxString("Bad","Good","Better");
        assertEquals( "Good" , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxStringAt3rdPosition()
    {
    	String max=Maximum.maxString("Bad","Better","Good");
        assertEquals( "Good" , max );
    }
}
