import scala.annotation.switch

object Logika{
  def alt(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(1)
    }
    else if((p == 1) && (q == 0)){
      println(1)
    }
    else if((p == 0) && (q == 1)){
      println(1)
    }
    else if((p == 0) && (q == 0)){
      println(0)
    }
    else{
      println("Logical value error!!!")
    }
  }


  def kon(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(1)
    }
    else if((p == 1) && (q == 0)){
      println(0)
    }
    else if((p == 0) && (q == 1)){
      println(0)
    }
    else if((p == 0) && (q == 0)){
      println(0)
    }
    else{
      println("Logical value error!!!")
    }
  }

  def imp(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(1)
    }
    else if((p == 1) && (q == 0)){
      println(0)
    }
    else if((p == 0) && (q == 1)){
      println(1)
    }
    else if((p == 0) && (q == 0)){
      println(1)
    }
    else{
      println("Logical value error!!!")
    }
  }


  def iff(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(1)
    }
    else if((p == 1) && (q == 0)){
      println(0)
    }
    else if((p == 0) && (q == 1)){
      println(0)
    }
    else if((p == 0) && (q == 0)){
      println(1)
    }
    else{
      println("Logical value error!!!")
    }
  }

  def xor(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(0)
    }
    else if((p == 1) && (q == 0)){
      println(1)
    }
    else if((p == 0) && (q == 1)){
      println(1)
    }
    else if((p == 0) && (q == 0)){
      println(0)
    }
    else{
      println("Logical value error!!!")
    }
  }


  def nand(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(0)
    }
    else if((p == 1) && (q == 0)){
      println(1)
    }
    else if((p == 0) && (q == 1)){
      println(1)
    }
    else if((p == 0) && (q == 0)){
      println(1)
    }
    else{
      println("Logical value error!!!")
    }
  }

  def nor(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(0)
    }
    else if((p == 1) && (q == 0)){
      println(0)
    }
    else if((p == 0) && (q == 1)){
      println(0)
    }
    else if((p == 0) && (q == 0)){
      println(1)
    }
    else{
      println("Logical value error!!!")
    }
  }


  def xnor(p: Int, q: Int){
    if((p == 1) && (q == 1)){
      println(1)
    }
    else if((p == 1) && (q == 0)){
      println(0)
    }
    else if((p == 0) && (q == 1)){
      println(0)
    }
    else if((p == 0) && (q == 0)){
      println(1)
    }
    else{
      println("Logical value error!!!")
    }
  }

   def main(args: Array[String]): Unit = {

     print("podaj typ logiki matematycznej : ")
     val log = readByte()
     if ( log == 1 ){
       println("ALTERNATYWA")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       alt(p,q)
     }
     else if ( log == 2 ){
       println("KONIUNKCJA")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       kon(p,q)
     }
     else if ( log == 3 ){
       println("IMPLIKACJA")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       imp(p,q)
     }
     else if ( log == 4 ){
       println("ROWNOWAZNOSC")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       iff(p,q)
     }
     else if ( log == 5 ){
       println("ALTERNATYWA WYKLUCZAJACA")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       xor(p,q)
     }
     else if ( log == 6 ){
       println("DYSJUNKCJA")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       nand(p,q)
     }
     else if ( log == 7 ){
       println("BINEGACJA")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       nor(p,q)
     }
     else if ( log == 8 ){
       println("XNOR")
       print("podaj pierwsza wartosc logiczna : ")
       var p = readInt()

       print("podaj druga wartosc logiczna : ")
       var q = readInt()

       xnor(p,q)
     }
     else{
       println("Bledny typ logiki matematycznej !!!")
     }
  }
}
