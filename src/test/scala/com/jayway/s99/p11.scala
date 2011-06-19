package com.jayway.s99

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class p11Spec extends FlatSpec with ShouldMatchers {
        "encode" should "return the encoded version of list" in {
                p11.encodeModified(List(1,1,1,2,2,2,3,4)) should equal (List((3, 1),(3,2),3,4))
        }
}

