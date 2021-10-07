case class BaseballTeam(name: String, lastWorldSeriesWin: Int) {
  override def toString: String = s"This is team named $name which won World Series Cup last time in $lastWorldSeriesWin"
}