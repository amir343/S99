package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 15: Duplicate the elements of a list a given number of times.
 *
 */

object p15 {
	def duplicateN[A](n:Int, list:List[A]):List[A] = {
	  list flatMap { e => List.make(n, e) }
	}
}