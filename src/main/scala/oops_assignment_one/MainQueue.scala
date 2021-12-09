package oops_assignment_one
import scala.collection.mutable.ListBuffer

object MainQueue extends App{

  val list = ListBuffer(1, 3)
  println("Queue : ")
  for( i <- list.indices)
    {
      print(list(i)+" ")
    }

  var doubledList = new DoubleQueue(list)
  println("\nDouble Queue: ")
  for( i <- list.indices)
    {
      print(list(i)+" ")
    }

  var squareQueue = new SquareQueue(list)
  println("\nSquare Queue: ")
  for( i <- list.indices)
    {
      print(list(i)+" ")
    }

  squareQueue.dequeue(list)
  println("\nDequeue: ")
  for( i <- list.indices)
    {
      print(list(i)+" ")
    }

  squareQueue.enqueue(list)
  println("\nEnqueue: ")
  for( i <- list.indices)
    {
      print(list(i)+" ")
    }

}

