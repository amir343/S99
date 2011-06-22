package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p28Spec extends FlatSpec with ShouldMatchers {
  "lsort" should "sort the list based on the frequency of their sublists" in {
    p28.lsort(List(List(1,2,3), List(1,2))) should equal (List(List(1,2), List(1,2,3)))
  }
}