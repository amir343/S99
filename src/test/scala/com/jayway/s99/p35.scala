package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p35Spec extends FlatSpec with ShouldMatchers {
  "primeFactors" should "return the prime factors of an integer" in {
    import com.jayway.s99.p35._
    (315 primeFactors) should equal (List(3, 3, 5, 7))
  }
}