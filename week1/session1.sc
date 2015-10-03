package week1

object session1 {
  1+3                                             //> res0: Int(4) = 4
  def abs(x: Double) = if (x<0) -x else x         //> abs: (x: Double)Double
  
  def sqrt(x: Double) = {
  
	  def sqrtIter(guess: Double): Double =
	  	if (isGoodEnough(guess)) guess
	  	else sqrtIter(improve(guess))
	  	
	  def isGoodEnough(guess: Double) =
	  	abs(guess * guess - x) / x < 0.001
	  	
	  	//v1 - slow with small and big number
	  	//abs(guess * guess - x) < 0.001
	  
	  def improve(guess: Double) =
	  	(guess + x / guess) / 2
	  
	  sqrtIter(1.0)
	  
  }                                               //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res1: Double = 1.4142156862745097
  sqrt(0.001)                                     //> res2: Double = 0.03162278245070105
  sqrt(0.1e-20)                                   //> res3: Double = 3.1633394544890125E-11
  sqrt(0.1e20)                                    //> res4: Double = 3.162398500014881E9
  sqrt(0.1e50)                                    //> res5: Double = 3.162308428500741E24
}