package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 34: Calculate Euler's totient function phi(m).
 *
 */

object p34 {

  def main (args:Array[String]) = {
    10 totient
  }
  
  class totientInt(n:Int) {
    import com.jayway.s99.p33._
    def totient:Int = {
      (for (i <- 1 to n if n.coPrime(i) ) yield i ) length
    }
  }
  
  implicit def fromIntConversion(n:Int):totientInt = new totientInt(n)
}