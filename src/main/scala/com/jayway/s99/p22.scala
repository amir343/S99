package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 22: Create a list containing all integers within a given range
 *
 */

object p22 {
	def range(a:Int, b:Int):List[Int] = {
	  if (a > b) List()
	  else if (a == b) List(a)
	  else List(a) ::: range(a+1, b)
	}
}