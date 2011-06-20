package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p20Spec extends FlatSpec with ShouldMatchers {
  "removeAt" should "remove the element K at the list and return the removed element together with the list as a tuple" in {
    p20.removeAt(2, List(1,2,3,4,5)) should equal ((List(1,2,4,5),3))
    p20.removeAt(0, List(1)) should equal ((List(), 1))
  }
}