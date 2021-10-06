class DifferentPerson {
  var name: Option[String] = None
  var age: Option[Int] = None
  override def toString = s"$name, $age"
}

object DifferentPerson {

  // a one-arg constructor
  def apply(name: Option[String]): DifferentPerson = {
    var p = new DifferentPerson
    p.name = name
    p
  }

  // a two-arg constructor
  def apply(name: Option[String], age: Option[Int]): DifferentPerson = {
    var p = new DifferentPerson
    p.name = name
    p.age = age
    p
  }

  def unapply(p: DifferentPerson): String = s"${p.name}, ${p.age}"

  //  def unapply(p: Person): Tuple2[Option[String], Option[Int]] = (p.name, p.age)
}