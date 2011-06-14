/**
*
* @author Amir Moulavi
* Problem 6: Find out whether a list is a palindrome.
*/

object p06 {
        def main(args:Array[String]) {
                println(isPalindrome(List(1, 2, 3, 2, 1)))
        }

        def isPalindrome[T](list:List[T]) = list == list.reverse
}
