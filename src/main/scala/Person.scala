trait Person {
  def name: String
}

case class Student(name: String, year: Int) extends Person
case class Teacher(name: String, speciality: String) extends Person
