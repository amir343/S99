package com.jayway.s99

/**
* @author Amir Moulavi
* Problem 12: Decode a run-length encoded list.
*
*/

object p12 {

  def decode[A](list:List[(Int,A)]):List[A] = list match {
    case head :: tail => expand(head) ::: decode(tail)
    case Nil => Nil
  }

  def expand[A](element:(Int, A)):List[A] = element match {
    case (0, _) => Nil
    case (n, symbol) => List(symbol) ::: expand(n-1, symbol)
  }
}
