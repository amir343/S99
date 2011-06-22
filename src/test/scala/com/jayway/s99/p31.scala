package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import com.jayway.s99.p31.toInt

class p31Spec extends FlatSpec with ShouldMatchers {
  "isPrime" should "check if the integer is prime" in {
	  (7 isPrime()) should equal (true)
  }
}