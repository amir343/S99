package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 18: Extract a slice from a list.
 *
 */

object p18 {
	def slice[A](from:Int, to:Int, list:List[A]):List[A] = {
	  list take to-1 drop from-1
	}
}