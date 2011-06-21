package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p24Spec extends FlatSpec with ShouldMatchers {
  "lotto" should "return N random element between 1..M" in {
    p24.lotto(6, 49).length should equal (6)
  }
}