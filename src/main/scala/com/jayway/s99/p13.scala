package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 13: Run-length encoding of a list (direct solution).
 *
 */

object p13 {
	def pack[A](list:List[A]):List[List[A]] = {
		def packRec[A](list:List[A]):List[List[A]] = list match {
			case head :: tail => {
				val (packed, unpacked) = list span {_ == head}
				packed :: packRec(unpacked)
			}
			case Nil => Nil
		}
		if (list.isEmpty) List(List()) else packRec(list)
	}
}