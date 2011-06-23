package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 32: Determine the greatest common divisor of two positive integer numbers.
 *
 */

object p32 {
  

	def gcd(a:Int, b:Int):Int = {
	  (divisor(a).intersect(divisor(b))).max
	}
	
	def divisor(n:Int) = {
	  val m = (n/2).asInstanceOf[Int]
	  for (i <- 1 until m if n % i == 0 ) yield(i)
	}
}