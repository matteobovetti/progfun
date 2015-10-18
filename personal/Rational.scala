package personal

/**
 * @author matteobovetti
 */
class Rational (x: Int, y: Int) {
  require( y != 0 , "denominator must be nonzero")
  
  // Contructor in Scala
  def this(x: Int) = this(x, 1)
  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  // private val g = gcd(x, y)
  def numer = x // / g
  def denom = y // / g

  /**
  in Scala is possible to substitute the name of function with the
  mathematical expression + - * /
    
    def less(that: Rational) = numer * that.denom < that.numer * denom
    
  */
  def - (that: Rational) = numer * that.denom < that.numer * denom
  
  /**
  This substitution is made when I have redefined the less functions.
    
    def max(that: Rational) = if (this.less(that)) that else this
  
  */
  def max(that: Rational) = if (this - that) that else this
  
  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
      
  def neg: Rational = new Rational(-numer, denom)
  
  def sub(that: Rational) = add(that.neg)
  
  override def toString = {
    var g = gcd(numer, denom)
    numer / g + "/" + denom / g
  }
}