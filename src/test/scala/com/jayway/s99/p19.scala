package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p19Spec extends FlatSpec with ShouldMatchers {
  "rotate" should "rotate the list N times with different directions" in {
    p19.rotate(2, List(1,2,3,4,5)) should equal (List(3,4,5,1,2))
    p19.rotate(-2, List(1,2,3,4,5)) should equal (List(4,5,1,2,3))
  }
}