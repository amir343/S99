package com.jayway.s99

/**
 * @author Amir Moulavi
 * Problem 27:Group the elements of a set into disjoint subsets.
 */

object p27 {

  import p26.combinations

  def main(args:Array[String]) {
    println(group3(List('a,'b,'c,'d, 'e)).apply(0).length)
  }
  
  def group3[A](ls: List[A]): List[List[List[A]]] =
    for {
      a <- combinations(2, ls)
      noA = ls filterNot (a contains)
      b <- combinations(3, noA)
    } yield List(a, b, noA -- b)

}