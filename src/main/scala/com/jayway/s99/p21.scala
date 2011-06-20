package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 21: Insert an element at a given position into a list
 *
 */

object p21 {
	def insertAt[A](elem:A, pos:Int, list:List[A]):List[A] = (list take pos) ::: List(elem) ::: (list drop pos)
}