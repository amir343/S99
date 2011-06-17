/**
*
* @author Amir Moulavi
* Problem 7: Flatten a nested list structure.
**/

object p07 {
  def flatten(list:List[Any]):List[Any] = list flatMap {
    case element: List[_] => flatten(element)
    case element => List(element) 
  }
}
