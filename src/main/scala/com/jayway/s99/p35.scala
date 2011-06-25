package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 35: Determine the prime factors of a given positive integer.
 */

object p35 {
	
  class PrimeFactor(n:Int) {
    
    import com.jayway.s99.p31._
    
    def primeFactors():List[Int] = {
      def primeFactorsRec(v:Int, primes:Stream[Int]):List[Int] = {
        if (v isPrime) List(v)
        else if (v % primes.head == 0) primes.head :: primeFactorsRec(v/primes.head, primes)
        else primeFactorsRec(v, primes.tail)
      }
      primeFactorsRec(n, Stream(2,3,5,7,11,13,17,19,23))  
    }
  }
  
  implicit def toPrimeFactor(n:Int) = new PrimeFactor(n)
  
  def main (args:Array[String]) = println(315 primeFactors)
  
}