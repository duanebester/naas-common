package common

case class Location(lat:Double, long:Double)
case object Stop
case class Start(loc:Location)
case class Message(message:String)

