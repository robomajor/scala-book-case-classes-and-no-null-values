object CaseClasses extends App {

  def getPrintableString(p: Person): String = p match {
    case Student(name, year) =>
      s"$name is a student in Year $year."
    case Teacher(name, whatTheyTeach) =>
      s"$name teaches $whatTheyTeach."
  }

  val s = Student("Al", 1)
  val t = Teacher("Bob Donnan", "Mathematics")
  val t2 = t.copy(name = "Ted Bundy")

  println(getPrintableString(s))
  println(getPrintableString(t))

  val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
  val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)

  println(cubs1908)
  println(cubs2016)

  println(t == t2)
}
