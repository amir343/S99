/**
* @author Amir Moulavi
* Problem 9: Pack consecutive duplicates of list elements into sublists.
*
*/

object p09 {
	def pack[A](list:List[A]):List[List[A]] = {
		def packRec[A](list:List[A]):List[List[A]] = list match {
			case head :: tail => {
				val (packed, unpacked) = list span {_ == head}
				packed :: packRec(unpacked)
			}
			case Nil => Nil
		}
		if (list.isEmpty) List(List()) else packRec(list)
	}
}
