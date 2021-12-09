package oops_assignment_one


import scala.collection.mutable.ListBuffer

class SquareQueue(list:ListBuffer[Int]) extends Queue {
  for( i <- list.indices) {
    list.update(i, list(i) * list(i))
  }
}