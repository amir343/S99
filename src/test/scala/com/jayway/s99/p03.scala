package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p03Spec extends FlatSpec with ShouldMatchers {
  
  "nth method" should "return the nth element of a list" in {
    p03.nth(0, List(1,2,3,4)) should equal (1)
  }

  "nth method" should "when asked for an element that is greater than the size of the list, then it should return the last element" in {
    p03.nth(11212323, List(1,2,3)) should equal (3)  
  }

}
