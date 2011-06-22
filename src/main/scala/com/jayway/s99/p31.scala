package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 31: Determine whether a given integer number is prime
 */

import java.lang.Math

object p31 {
  
	class toInt(n:Int) {
		def isPrime():Boolean = {
				for (i <- 1 until Math.sqrt(n).asInstanceOf[Int] )
					if ( n % i == 0) false
					true  
		}
	}
	
	implicit def toInt(n:Int):toInt = new toInt(n)

	def main(args:Array[String]) = {
	  7 isPrime
	}
  
}