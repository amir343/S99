package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p12Spec extends FlatSpec with ShouldMatchers {
  "decode" should "expand the list to its original mode" in {
    p12.decode(List((1,'a), (2,'b))) should equal(List('a, 'b, 'b))
  }
}
