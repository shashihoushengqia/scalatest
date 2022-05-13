package com.xu.objectoriented

import scala.beans.BeanProperty

object Test04_Class {
  def main(args: Array[String]): Unit = {
    val student: Student = new Student(18, "xu")
    println(student.getAge)

  }
}

class Student(@BeanProperty var age: Int, @BeanProperty var name: String)

class Student2()
