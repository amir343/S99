package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 19: Rotate a list N places to the left.
 *
 */

object p19 {
	def rotate[A](n:Int, list:List[A]):List[A] = (n, list) match {
	  case (0, _) => list
	  case (m, head :: tail) => {
	    if (m > 0) rotate(m-1, tail ::: List(head)) 
	    else rotate(m+1, List(tail.last) ::: List(head) ::: tail.init)
	  }
	}
}