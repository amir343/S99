object p02 {
	def main (args:Array[String]) {
		println(penultimate(List(1,2,3,4)))
	}
	
	def penultimate[A](l:List[A]):A = l match {
		case x :: _ :: Nil => x
		case _ :: tail => penultimate(tail)
		case _ => throw new NoSuchElementException()
	}

}
