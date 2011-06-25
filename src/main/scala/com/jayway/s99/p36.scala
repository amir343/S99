package com.jayway.s99

/**
 *
 * @author Amir Moulavi
 * Problem 36: Determine the prime factors of a given positive integer (2).
 *
 */

object p36 {
  
  class newInt(n:Int) {
    def primeFactorMultiplicity():Map[Int, Int] = {
      import com.jayway.s99.p35._
      val pf = n primeFactors
      val ans = Map[Int, Int]()
      pf.sort( (a,b) => a < b).foldLeft(ans) { (result:Map[Int, Int], current:Int) => 
        if (result.contains(current)) {
          val newVal = (result(current) + 1)
          (result + (current -> newVal))
        } else {
          (result + (current -> 1))
        }
      }
    }
  }
  
  implicit def fromInt(n:Int):newInt = new newInt(n) 
	
}