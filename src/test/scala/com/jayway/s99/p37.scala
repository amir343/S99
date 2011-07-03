package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p37Spec extends FlatSpec with ShouldMatchers {
  "phi" should "return the phi number of an integer" in {
    p37.phi (315) should equal (144)
  }
}