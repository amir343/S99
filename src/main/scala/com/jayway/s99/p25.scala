package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 25: Generate a random permutation of the elements of a list. 
 */

object p25 {
	def randomPermute[A](list:List[A]):List[A] = p23.randomSelect(list.length, list)
}