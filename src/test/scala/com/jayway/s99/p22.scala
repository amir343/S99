package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p22Spec extends FlatSpec with ShouldMatchers {
  "range" should "return a range between two integers" in {
    p22.range(1,4) should equal (List(1,2,3,4))
  }
}