package com.jayway.s99

/**
*
* @author Amir Moulavi
* Problem 6: Find out whether a list is a palindrome.
*/

object p06 {
        def isPalindrome[T](list:List[T]) = list == list.reverse
}
