package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import com.jayway.s99.p31.toInt

class p31Spec extends FlatSpec with ShouldMatchers {
	import com.jayway.s99.p31._
	"isPrime" should "check if the integer is prime" in {
	  (7 isPrime) should equal (true)
	}
	"isPrime" should "check if the integer is not prime" in {
		(8 isPrime) should equal (false)
		
	}
}