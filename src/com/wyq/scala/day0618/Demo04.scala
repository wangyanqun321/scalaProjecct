package com.wyq.scala.day0618

/**
  * 强制类型转换: example 3.5.toInt  return 3
  * 基本类型转String, 直接用+
  * String类型转基本数据类型用toXXX
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    val num1: Int = 10 * 3.5.toInt + 6 * 2.5.toInt
    println(num1)
    println("123".toInt.getClass)
    // println("123.5".toInt) // java.lang.NumberFormatException
  }
}
