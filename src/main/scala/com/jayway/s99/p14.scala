package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 14: Duplicate the elements of a list.
 */

object p14 {
	def duplicate[A](list:List[A]):List[A] = list match {
	  case head :: tail => List(head) ::: List(head) ::: duplicate(tail)
	  case Nil => Nil
	}
}