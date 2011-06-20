package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 20: Remove the Kth element from a list.
 *
 */

object p20 {
	def removeAt[A](n:Int, list:List[A]):(List[A], A) = ((list take n) ::: (list drop n+1), list take n+1 last)
}