
package eu.enhan.fp

import scala.compiletime.ops.int._

enum Vect[+A, S<:Int]{

    type Size = S

    case Empty extends Vect[Nothing, 0] 

    case Cons(h: A, t: Vect[A, S]) extends Vect[A, S + 1] 

    def ::[B >: A](e: B): Vect[B, S + 1] = Cons(e, this)

    /*def headOption: Option[A] = this match {
        case Empty => None
        case Cons(h, t) => Some(h.asInstanceOf[A]) // Weird 
    
    }*/

    def size(using V: ValueOf[S]) = V.value
    
}

object Vect {

    def apply[A](e: A): Vect[A, 1] = e :: Empty

    //def (e: Vect[Nothing, 0]) headOption = None

    def [A, S <: Int] (v: Vect[A, S]) headOption = v match {
        case Empty => None
        case Cons(h, t) => Some(h) // Weird 
    }

    def [A, B, S <: Int] (v: Vect[A, S]) map(f: A => B) : Vect[B, S] = v match {
        case Empty => Empty
        case Cons(h,t) => Cons(f(h), t.map(f))
    }

}

// Fast text + Thread safety


