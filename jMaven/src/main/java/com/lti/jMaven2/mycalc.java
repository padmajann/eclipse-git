package com.lti.jMaven2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.jMaven1.calcul;



public class mycalc {
	@Test
		public void test1(){
			assertEquals(10,new calcul().getSum(5, 5));
			
		}
	@Test
	public void test2(){
		assertEquals(15,new calcul().getSum(10, 5));
		
	}
	@Test
	public void test3(){
		assertEquals(5,new calcul().getDiff(10, 5));
		
	}
	@Test
	public void test4(){
		assertEquals(0,new calcul().getDiff(5, 5));
		
	}
	}



