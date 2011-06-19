package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p18Spec extends FlatSpec with ShouldMatchers {
  "slice" should "slice the list from an index to an index" in {
    p18.slice(1, 3, List(1,2,3,4,5)) should equal (List(1,2))
  }
}