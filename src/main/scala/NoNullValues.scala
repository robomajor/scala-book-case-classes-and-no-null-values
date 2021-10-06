object NoNullValues extends App {

  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }

  toInt("7") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }

  toInt("1").foreach(println)
  toInt("x").foreach(println)

  val someAddress = new Address(
    "1 Main Street",
    None,
    "North Pole",
    "Alaska",
    "99705"
  )

  val otherAddress = new Address(
    "123 Main Street",
    Some("Apt. 2B"),
    "Talkeetna",
    "Alaska",
    "99676"
  )

  val p1 = DifferentPerson(Some("Fred"))
  val p2 = DifferentPerson(None)

  val p3 = DifferentPerson(Some("Wilma"), Some(33))
  val p4 = DifferentPerson(Some("Wilma"), None)

  val result = DifferentPerson.unapply(p3)
  println(result)
}

class Address (
                var street1: String,
                var street2: Option[String],
                var city: String,
                var state: String,
                var zip: String
              )
