package com.jayway.s99

/**
* @author Amir Moulavi
* Problem 8: Eliminate consecutive duplicates of list elements.
*/

object p08 {
	def compress[A](list:List[A]):List[A] = 
		list.foldRight(List[A]())({ (a,b) =>
			if ( b.isEmpty || a != b.head) a :: b
			else b
		})
}
