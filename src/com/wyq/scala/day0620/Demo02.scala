package com.wyq.scala.day0620

/**
  * 函数式编程
  * 1. 函数定义 （） => {}
  * 2. 方法可以赋值给函数，后面加上下划线 例如：val f = dog.sum _
  * 3. 函数不依赖对象，函数是一等功名
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    val f = dog.sum _
    println(f(1, 2))
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2
    }
    println(f2(1, 2))
  }

}


class Dog {
  def sum(a: Int, b: Int): Int = {
    a + b
  }
}