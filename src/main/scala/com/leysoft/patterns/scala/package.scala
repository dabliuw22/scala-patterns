package com.leysoft.patterns.scala

package object pimp_my_library {

  implicit class StringExtension(val chain: String) {

    def toOption: Option[String] = {
      Option(chain)
    }
  }
}
