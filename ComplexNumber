object ComplexNumber{
  def complex(re: Int, im: Int){
    if(re == 0 && im >= 0) println(im+"j")
    else if(re == 0 && im < 0) println(im+"j")
    else if(re > 0 && im < 0) println(re+""+im+"j")
    else if(re < 0 && im<0) println(re+""+im+"j")
    else println(re+"+"+im+"j")
  }

  def modulus(re: Int, im: Int){
    if(re >= 0 && im >= 0) println(math.sqrt((re*re)+(im*im)))
    else println(0)
  }

   def argument(re: Int, im: Int){
     if(re > 0) println(math.atan(im/re))
     else if(re < 0 && im >= 0 ) println(math.atan(im/re) + math.Pi)
     else if(re < 0 && im < 0 ) println(math.atan(im/re) - math.Pi)
     else if(re == 0 && im > 0 ) println(math.Pi/2)
     else if(re == 0 && im < 0 ) println(- math.Pi/2)
     else println("Independent")
  }

  def main(args: Array[String]): Unit = {
    print("Podaj wartosc rzeczywista : ")
    var re = readInt()
    print("Podaj wartosc urojona : ")
    var im = readInt()
    complex(re, im)
    modulus(re, im)
    argument(re, im)
  }
}
