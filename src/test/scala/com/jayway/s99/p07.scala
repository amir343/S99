package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p07Spec extends FlatSpec with ShouldMatchers {
  "flatten" should "return a flat list" in {
    val list = List(1,2,List(1,2))
    val res = p07.flatten(list)  
    res.asInstanceOf[List[Int]] should equal (List(1,2,1,2))
  }
}
