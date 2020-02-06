
package eu.enhan.fp

import scala.compiletime.ops.int._

enum Vect[+A, S<:Int]{
    case Empty extends Vect[Nothing, 0] 
    case Cons(h: A, t: Vect[A, S]) extends Vect[A, S + 1]

    def ::[B >: A](e: B): Vect[B, S + 1] = Cons(e, this)

    /*def headOption: Option[A] = this match {
        case Empty  => Option.empty[A]
        case h :: t => Some(h)
    }*/
}

object Vect {

    def apply[A](e: A): Vect[A, 1] = e :: Empty
}

// Fast text + Thread safety


