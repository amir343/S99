package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 23: Extract a given number of randomly selected elements from a list.
 *
 */

import scala.util.Random

object p23 {
	def randomSelect[A](n:Int, list:List[A]):List[A] = (n, list) match {
	  case (0, _) => Nil
	  case (_, Nil) => Nil
	  case (_, head :: tail) => {
		    val rnd = new Random
		    val (restOfList, selected) = p20.removeAt(rnd.nextInt(list length), list)
		    List(selected) ::: randomSelect(n-1, restOfList)
	  	}
	}
	
}