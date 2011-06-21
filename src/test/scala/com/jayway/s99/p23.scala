package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p23Spec extends FlatSpec with ShouldMatchers {
  "selectRandom" should "return a number of randomly selected elements from a list" in {
	  p23.randomSelect(3, List(1,2,3,4,5)).length should equal (3)
  }
}