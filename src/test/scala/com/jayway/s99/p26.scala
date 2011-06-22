package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p26Spec extends FlatSpec with ShouldMatchers {
  "bionomial coefficients" should "calculate the combination of distinct elements" in {
    p26.combinations(3, List(1,2,3,4,5)).length should equal (10)
    p26.combinations(5, List(1,2,3,4,5,6,7,8,9)).length should equal (126)
  }
}