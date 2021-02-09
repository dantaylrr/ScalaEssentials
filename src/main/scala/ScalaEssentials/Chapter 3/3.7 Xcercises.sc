// q). Using the trafficLight example from the previous exercises, use both polymorphism & pattern matching to implement
//     the traffic light pattern Red -> Yellow -> Green

// a).

sealed trait trafficLight
case object Red extends trafficLight
case object Yellow extends trafficLight
case object Green extends trafficLight

// Polymorphism
sealed trait trafficLight {
  def Sequence: trafficLight
}
case object Red extends trafficLight {
  def Sequence: trafficLight = Yellow
}
case object Yellow extends trafficLight {
  def Sequence: trafficLight = Green
}
case object Green extends trafficLight {
  def Sequence: trafficLight = Red
}

Red.Sequence

// Pattern matching
object sequence {
  def ryg(TL: trafficLight): trafficLight =
  TL match {
      case Red => Yellow
      case Yellow => Green
      case Green => Red
    }
}

sequence.ryg(Red)