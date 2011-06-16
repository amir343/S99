import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p02Spec extends FlatSpec with ShouldMatchers {

  "penultimate method" should "return the last - 1 element of a list" in {
    p02.penultimate(List(1,2,3,4)) should equal (3)
  }

}
