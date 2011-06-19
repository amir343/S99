package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p15Spec extends FlatSpec with ShouldMatchers {
  "duplicateN" should "duplicate the elements N time" in {
    p15.duplicateN(2, List(1,2,3)) should equal (List(1,1,2,2,3,3))
  }
}