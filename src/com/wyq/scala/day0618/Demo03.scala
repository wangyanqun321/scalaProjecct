package com.wyq.scala.day0618

/**
  * Any: 相当于java的Object
  * AnyVal: 值类型
  * AnyRef: 引用类型，所有引用类型的基类
  * Unit: 相当于Void
  * null：相当于null, 只能赋值给AnyRef类型，不能给AnyVal赋值
  * Nothing: 是任何类型的子类
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    // val value: Int = null  错误
    val value2: Null = null
    println(value2)
    val value3: AnyRef = new Dog
    // val value4: AnyVal = new Dog 错误
    println(value3)
    val value5: Any = new Dog
    println(value5)
    val value6: AnyVal = true
    println(value6)
  }
  final class Dog {

  }
}


