/**
* @author Amir Moulavi
* Problem 4: Find the number of elements of a list.
*/

object p04 {
        def main (args:Array[String]) {
                println(length(List(1, 1, 2, 3, 5, 8)))
        }

        def length[T](list:List[T]):Int = list match {
                case head :: Nil => 1
                case head :: tail => 1 + length(tail)
                case _ => 0
        }
}
