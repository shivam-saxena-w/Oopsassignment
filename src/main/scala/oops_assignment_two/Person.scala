package oops_assignment_two

class Person(var name:String,var age:Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 =>  if(this.age.equals(that.age))
        println("True \nSame name and age")
      else
        println("False\nOnly names are same")
        0

      case _ =>  if(this.name.length.equals(that.name.length) && this.age.equals(that.age))
        println("True")
      else println("false")
        1

    }
  }
}
object Person extends  App{
  var personOne = new Person("Shivam",22)
  var personTwo = new Person("Shivam",23)
  personOne compare personTwo
}