object Fibonacci {
  def fib(n: Int): Int = if(n == 0) 0 else if(n == 1) 1 else fib(n-1) + fib(n-2)


  def MatrixFib(n: Int){
    println("Macierz Fibonacciego : [ "+fib(n+3)+", "+fib(n+2)+", "+fib(n+2)+", "+fib(n+1)+" ]")
  }

  def GoldFib(n: Int): Double = if(n == 1) 1.0 else 1.0 + 1.0 / GoldFib(n-1)


  def lucas(n: Int): Int = if(n == 0) 2 else if(n == 1) 1 else lucas(n-1) + lucas(n-2)

  def main(args: Array[String]): Unit = {
    print("Podaj liczbę : ")
    var n = readInt()
    println("Ciąg Fibonacciego : "+fib(n))
    MatrixFib(n)
    println("Zloty podział Fibonaciego : "+GoldFib(n))
    println("Ciąg Lucasa : "+lucas(n))
  }
}
