package com.jayway.s99

/**
* @author Amir Moulavi
* Problem 4: Find the number of elements of a list.
*/

object p04 {
        def length[T](list:List[T]):Int = list match {
                case head :: Nil => 1
                case head :: tail => 1 + length(tail)
                case _ => 0
        }
}
