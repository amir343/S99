package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p14Spec extends FlatSpec with ShouldMatchers {
  "duplicate" should "duplicate every element in a list" in {
    p14.duplicate(List('a, 'b, 'c)) should equal(List('a, 'a, 'b, 'b, 'c, 'c))
  }
}