package com.wyq.scala.day0618

/**
  * 首字符为操作符（比如+*-/）,后续字符也要跟操作符
  * 关键字用反引号可以作为变量名
  * int/Int/double/Double...等不是关键字，但是不推荐作为变量名
  */
object Demo05 {
  def main(args: Array[String]): Unit = {
    val ++ = "hello"
    println(++)
    // val +1 = "hello"  错误
    val ++- = "haha"
    println(++-)
    val `true` = "true"
    println(`true`)
    val int = 18
    println(int)
  }
}
