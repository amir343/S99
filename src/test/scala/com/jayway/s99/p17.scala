package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p17Spec extends FlatSpec with ShouldMatchers {
  "split" should "split a list into two lists based on the specified number" in {
    p17.split(3, List(1,2,3,4,5)) should equal ((List(1,2,3),List(4,5)))
  }
} 