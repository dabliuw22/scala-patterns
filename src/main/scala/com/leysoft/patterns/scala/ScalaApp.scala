package com.leysoft.patterns.scala

object ScalaApp extends App {
  import com.leysoft.patterns.scala.pimp_my_library._
  val chain: String = null

  chain.toOption match {
    case Some(value) => println(s"Value $value")
    case _ => println("Error")
  }
}
