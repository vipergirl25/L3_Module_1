package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class MoreAndMoreTests {
	int i;
	int j;
//	String multiply(int i, int j) {
//		int k = i*j;
//		String hi = i + " x " + j + " = " + k;
//		return hi;
//	}
//	@Test
//	  public void MultTest() {
//
//	    assertEquals("10 x 0 = 0", multiply(10, 0));
//	    assertEquals("10 x 10 = 100", multiply(10, 10));
//	    assertEquals("8 x 11 = 88", multiply(8, 11));
//	  }
//	boolean isPrime(int i) {
//		boolean isItPrime = true;
//		if(i%2!=0) {
//			for (int j = 3; j < i/Math.sqrt(i); j+=2) {
//			//for (int j = 2; j < i; j++) {
//				if(i%j==0) {
//					isItPrime = false;
//					break;
//				}
//			}
//		}else if(i==2) {
//			isItPrime = true;
//		}else {
//			isItPrime = false;
//		}
//	
//		return isItPrime;
//	}
//
//	@Test
//	  public void PrimeTest() {
//
//	    assertTrue(isPrime(3));
//	    assertTrue(isPrime(5));
//	    assertTrue(isPrime(541));
//	    assertTrue(isPrime(2));
//	    assertTrue(isPrime(17));
//	    assertFalse(isPrime(4));
//	    assertFalse(isPrime(12));
//	    assertFalse(isPrime(527));
//
//	  }
//	boolean isSquare(int i) {
//		boolean hello = false;
//		for (int j = 1; j <= i; j++) {
//			if(j*j==i) {
//				hello = true;
//				break;
//			}else {
//				hello = false;
//			}
//		}
//		return hello;
//	}
//
//	@Test
//	  public void SquareTest() {
//
//	    assertTrue(isSquare(4));
//	    assertTrue(isSquare(144));
//	    assertTrue(isSquare(64));
//	    assertTrue(isSquare(10201));
//	    assertTrue(isSquare(1));
//	    assertFalse(isSquare(3));
//	    assertFalse(isSquare(22));
//	    assertFalse(isSquare(143));
//
//	  }
//
	boolean isCube(int i) {
		boolean isItCube = false;
		for (int j = 1; j <=i; j++) {
			if(j*j*j==i) {
				isItCube = true;
				break;
			}
		}
		return isItCube;
	}
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
