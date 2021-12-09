package oops_assignment_one
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

class DoubleQueue(list:ListBuffer[Int]){
  println("\nEnter a value to add after doubling it")
  var num: Int = readInt()
  num = num*2
  list.addOne(num)
  println("Number queued after doubling is :"+num)

}
