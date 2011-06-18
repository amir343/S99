/**
* @author Amir Moulavi
* Problem 11: Modified run-length encoding.
*/

object p11 {
        def encodeModified[A](list:List[A]):List[Any] = {
                def encodeRec[A](list:List[A]):List[Any] = list match {
                        case head :: tail => {
                                val (a, b) = list span {_ == head}
                                if (a.length == 1) List(a.head) ::: encodeRec(b)
				else List((a.length, a.head)) ::: encodeRec(b)
                        }
                        case Nil => Nil
                }
                encodeRec(list)
        }
}       
