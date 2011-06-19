package com.jayway.s99

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class p08Spec extends FlatSpec with ShouldMatchers {
	"consecutive compress" should "return no duplicate elements" in {
		p08.compress(List(1,1,1,2,3,3,3)) should equal (List(1,2,3))
	}
}
