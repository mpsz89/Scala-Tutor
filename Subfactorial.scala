object Subfactorial {
  def fact(n: Int): Int = if (n == 0) 1 else n * fact(n - 1)
  def subfact(n: Int): Double = math.round(fact(n) / 2.719)

  def main(args: Array[String]): Unit = {
    print("Podaj liczbe : ")
    var n = readInt()
    print(subfact(n))
  }
}
