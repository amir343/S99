object p01 {
	def main (args:Array[String]) {
		println(last(List[Int](1,2,3,4)))
	}

	def last[T](l:List[T]): T = {
		l.last
	}
}
