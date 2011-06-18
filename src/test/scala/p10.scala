import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class p10Spec extends FlatSpec with ShouldMatchers {
	"encode" should "return the encoded version of list" in {
		p10.encode(List(1,1,1,2,2,2,3,4)) should equal (List((3, 1),(3,2),(1,3),(1,4)))
	}
}
