package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p01Spec extends FlatSpec with ShouldMatchers {

  "last method" should "returns the last element of a list" in {
    p01.last(List(1,2,3)) should equal (3)
  }
}
