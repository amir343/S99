package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 17: Split a list into two parts.
 *
 */

object p17 {
	def split[A](n:Int, list:List[A]):(List[A], List[A]) =  {
	  def splitRec[A](n:Int, part1:List[A], part2:List[A]):(List[A], List[A]) = part2 match {
	    case head :: tail => if (n==0) (part1, part2) else splitRec(n-1, part1:::List(part2.head), part2.tail)
	    case Nil => (Nil, Nil)
	  }
	  splitRec(n, List(), list)
	}
}