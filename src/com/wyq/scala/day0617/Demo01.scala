package com.wyq.scala.day0617

/**
  * scala的格式化输出
  * 1. 普通输出
  * 2. printf格式化输出
  * 3. 单变量可用$,多变量用${} 类似于el表达式（可做运算）,注意，字符串前面要加s
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val str1: String = "hello"
    val str2: String = " world"
    println(str1 + str2)
    val name: String = "tom"
    val age: Int = 17
    val salary: Float = 100000.68f
    val height: Double = 180.15

    printf("名字=%s 年龄=%d 薪水%.3f 身高%.2f", name, age, salary, height)
    println(s"\n个人信息如下：\n姓名：${name} \n年龄：${age + 1}薪水：$salary \n身高${height}")
  }
}
