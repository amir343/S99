import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p04Spec extends FlatSpec with ShouldMatchers {

  "lngth method" should "return the lenfth of a list that has some elements" in {
    p04.length(List(1,2,3,4)) should equal (4)
  }

  "length method" should "return 0 for a list that has no elements" in {
    p04.length(List()) should equal (0)
  }
}
