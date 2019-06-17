package com.wyq.scala.day0617

/**
  * 关联源码：
  * 下载地址：https://github.com/scala/scala/archive/v2.13.0.tar.gz
  * 解压之后的还是zip压缩包，再解压，关联文件夹即可
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = new Array[Int](10)
    for (item <- arr) {
      println(item)
    }
  }
}
