package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p21Spec extends FlatSpec with ShouldMatchers {
  "insertAt" should "insert an element at pos specified" in {
    p21.insertAt('a, 1, List('a,'b,'c)) should equal (List('a,'a,'b,'c))
  }
} 