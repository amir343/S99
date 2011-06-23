package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 * Problem 33: Determine whether two positive integer numbers are coprime.
 *
 */

object p33 {

  class ConvertFromInt(n:Int) {
    def coPrime(m:Int):Boolean = p32.gcd(n,m) == 1
  }
  
  implicit def convertFromInt(n:Int):ConvertFromInt = new ConvertFromInt(n)
  
}