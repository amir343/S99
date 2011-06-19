package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p05Spec extends FlatSpec with ShouldMatchers {

  "reverse method" should "reverse a non-empty list" in {
    p05.reverse(List(1,2,3)) should equal(List(3,2,1))
  }

  "reverse method" should "reverse an empty list" in {
    p05.reverse(List()) should equal(List())
  }
}
