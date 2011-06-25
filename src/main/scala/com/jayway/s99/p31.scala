package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 31: Determine whether a given integer number is prime
 */

import java.lang.Math

object p31 {
  
	implicit def convertFromInt(n:Int):toInt = new toInt(n)
	
	class toInt(n:Int) {
		def isPrime():Boolean = {
		  val m = Math.sqrt(n).asInstanceOf[Int]
		  val result = for (i <- 2 to m if n % i == 0) yield i
		  (result.length == 0)
		}
	}
}
