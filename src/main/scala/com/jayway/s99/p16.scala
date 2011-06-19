package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 16: Drop every Nth element from a list.
 *
 */

object p16 {
	def drop[A](n:Int, list:List[A]):List[A] = list match {
	  case head :: tail => if (n == 1) tail else List(head) ::: drop (n-1, tail)
	  case Nil => Nil
	}
}