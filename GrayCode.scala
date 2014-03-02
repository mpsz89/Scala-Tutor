object GrayCode {
  def gray(n: Int) = {
  def getBinary(i: Int, res: String, n: Int): String = {
    if (n == 0) res
    else {
      if(i % 2 == 0) 
        getBinary(i/2, "0" + res, n-1)
      else
        getBinary(i/2, "1" + res, n-1)
    }
  } 
  for (i <- 0 until (1 << n)) println(getBinary(i ^ (i >> 1), "", n))
}
  def main(args: Array[String]): Unit = {
    print("Podaj ilość bitów : ")
    val n = readInt()
    gray(n)
  }
}
