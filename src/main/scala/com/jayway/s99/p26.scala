package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 26: Generate the combinations of K distinct objects chosen from the N elements of a list.
 */

object p26 {

    def main(args:Array[String]) {
	  println(combinations(3, List(1,2,3,4,5)))
	}
  
  	def combinations[A](n: Int, ls: List[A]): List[List[A]] =
	    if (n == 0) List(Nil)
	    else flatMapSublists(ls) { sublist =>
	      combinations(n - 1, sublist.tail) map {sublist.head :: _}
	    }
  	
  	def flatMapSublists[A,B](ls: List[A])(f: (List[A]) => List[B]): List[B] = ls match {
  		case Nil => Nil
  		case rest@(_ :: tail) => f(rest) ::: flatMapSublists(tail)(f)
  	}
}