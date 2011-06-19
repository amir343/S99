package com.jayway.s99

/**
* @author Amir Moulavi
* Problem 10: Run-length encoding of a list.
*/

object p10 {
	def encode[A](list:List[A]):List[(Int, A)] = {
		def encodeRec[A](list:List[A]):List[(Int, A)] = list match {
			case head :: tail => {
				val (a, b) = list span {_ == head}
				List((a.length, a.head)) ::: encodeRec(b)
			}
			case Nil => Nil
		}
		encodeRec(list)
	}
}
