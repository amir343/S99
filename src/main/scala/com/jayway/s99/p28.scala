package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 28: Sorting a list of lists according to length of sublists.
 */

object p28 {
	def lsort[A](list:List[List[A]]):List[List[A]] = 
	  list sortWith ( (x:List[A], y:List[A]) => x.length < y.length )
}