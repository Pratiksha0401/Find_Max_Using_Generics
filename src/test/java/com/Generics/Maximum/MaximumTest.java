package com.Generics.Maximum;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaximumTest 
{
    
    @Test
    public void shouldReturnTrue_WhenMaxDoubleAt1stPosition ()
    {
    	double max=Maximum.maxDouble(5.1,1.3,2.8);
        assertEquals( 5.1 , max , 0);
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxDoubleAt2ndPosition()
    {
    	double max=Maximum.maxDouble(1.3,5.1,2.8);
        assertEquals( 5.1 , max , 0 );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxDoubleAt3rdPosition()
    {
    	double max=Maximum.maxDouble(1.3,2.8,5.1);
        assertEquals( 5.1 , max , 0 );
    }
}
