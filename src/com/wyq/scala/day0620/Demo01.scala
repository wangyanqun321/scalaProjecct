package com.wyq.scala.day0620

import scala.util.control.Breaks._
/**
  * scala循环
  * 1. to 闭区间
  * 2. until 前闭后开
  * 3. 用循环守卫代替continue(for(... if ...))
  * 4. 使用scala.util.control.Breaks.break()结束循环
  * 5. 使用breakable方法包装循环体
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    breakable {
      for (i <- 1 to 3 if i != 2) {
        println("i: " + i)
        break()
      }
    }
  }
}
