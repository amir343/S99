package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p36Spec extends FlatSpec with ShouldMatchers {
  "primeFactorMultiplicity" should "return the prime factors in a (a -> b) fashion" in {
    import com.jayway.s99.p36._
    (315 primeFactorMultiplicity) should equal (Map(3 -> 2, 5 -> 1 , 7 -> 1 ))
  }
}