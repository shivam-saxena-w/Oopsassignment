package oops_assignment_one
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

trait Queue {
  def enqueue(list: ListBuffer[Int]): Unit = {
    println("\nEnter value to enqueue: ")
    val num = readInt()
    list.addOne(num)
    println(num+" is queued")
  }
  def dequeue( list: ListBuffer[Int]): Unit = {
    list.remove(0)
  }
}

