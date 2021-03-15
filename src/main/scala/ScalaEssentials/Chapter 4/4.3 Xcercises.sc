// q). We started developing an abstraction over sum, length and product as in section 4.3. Rename this to fold and finish the implementation.

// a).

sealed trait IntList {
  def fold(end: Int, f: (Int, Int) => Int): Int =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }
}

case object End extends IntList
final case class Pair(hd: Int, tl: IntList) extends IntList