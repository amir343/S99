/**
*
* @author Amir Moulavi
* Problem 5: Reverse a list.
*/

object p05 {
        def main (args:Array[String]) {
                println(reverse(List(1, 1, 2, 3, 5, 8)))        
        }

        def reverse[T](list:List[T]):List[T] = list match {
                case head :: tail => reverse(tail) ::: List(head)
                case _ => Nil

        }
}
