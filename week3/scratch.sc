// import week3._

object scratch {
  // new Rational(1, 2)
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  var x  = null                                   //> x  : Null = null
  val y: String = x                               //> y  : String = null
  
  if (false) 1 else false                         //> res0: AnyVal = false
}