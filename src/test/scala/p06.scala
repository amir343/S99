import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p06Spec extends FlatSpec with ShouldMatchers {

  "isPalindrome method" should "return the palindrome of a list" in {
    p06.isPalindrome(List(1,2,1)) should equal(true)  
    p06.isPalindrome(List(1,2,3)) should equal(false)
    p06.isPalindrome(List(1,2,2,1)) should equal(true)
  }

}
