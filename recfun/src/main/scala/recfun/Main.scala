package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c -1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceInner(string: List[Char], acu: Int): Boolean = {
      if (string.isEmpty) acu == 0
      else if (acu < 0) false
      else if (string.head == '(') balanceInner(string.tail, acu + 1)
      else if (string.head == ')') balanceInner(string.tail, acu - 1)
      else balanceInner(string.tail, acu)
    }
    balanceInner(chars, 0)
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeInner(acu: Int): Int = {
      
    }
    CountChangeInner(0)
  }
}
