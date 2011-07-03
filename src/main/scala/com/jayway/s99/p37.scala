package com.jayway.s99

/**
 * 
 * @author Amir Moulavi
 *
 */

object p37 {
    
  def phi(n:Int):Int = {
     import com.jayway.s99.p36._
     (n primeFactorMultiplicity).foldLeft(1){ case (a, (b, c)) => 
       a * (b-1) * math.pow(b.asInstanceOf[Double], c.asInstanceOf[Double]-1).asInstanceOf[Int]
     }
  }

}