package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Promelm 24: Lotto: Draw N different random numbers from the set 1..M.
 *
 */

object p24 {
	def lotto[A](n:Int, m:Int):List[Int] = {
	  p23.randomSelect(n, p22.range(1, m))
	}
}