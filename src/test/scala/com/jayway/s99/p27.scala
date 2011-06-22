package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p27Spec extends FlatSpec with ShouldMatchers {
  "group3" should "return all possibilities" in {
    p27.group3(List(1,2,3,4,5)).apply(0).length should equal (3)
  }
}