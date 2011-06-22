package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p25Spec extends FlatSpec with ShouldMatchers {
  "randomPermute" should "return a random permutation of a list" in {
    p25.randomPermute(List(1,2,3,4)).length should equal (4)
  }
}