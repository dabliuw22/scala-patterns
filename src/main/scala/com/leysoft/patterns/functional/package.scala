package com.leysoft.patterns.functional

package object monoids {

  trait Monoid[A] {

    // op(op(x, y), z) == op(x, op(y, z))
    def op(x: A, y: A): A

    //  op(x, zero) == x o op(zero, x)
    def zero: A
  }

  val addition = new Monoid[Int] {

    override def op(x: Int, y: Int): Int = x + y

    override def zero: Int = 0
  }

  val multiplication = new Monoid[Int] {

    override def op(x: Int, y: Int): Int = x * y

    override def zero: Int = 0
  }
}

package object functors {

  trait Functor[C[_]] {

    def map[A, B](collection: C[A])(f: A => B): C[B]
  }

  val list = new Functor[List] {

    override def map[A, B](collection: List[A])(f: A => B): List[B] = collection.map(f)
  }
}
