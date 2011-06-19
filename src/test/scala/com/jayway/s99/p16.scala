package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p16Spec extends FlatSpec with ShouldMatchers {
  "drop" should "drop the Nth element of a list" in {
    p16.drop(3, List(1,2,3,4)) should equal (List(1,2,4))
  }
}