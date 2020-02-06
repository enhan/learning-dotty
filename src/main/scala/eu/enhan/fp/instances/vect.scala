package eu.enhan.fp.instances
import eu.enhan.fp.tc._
import eu.enhan.fp.Vect


given vectFunctor[S <: Int] as Functor[ [X] =>> Vect[X, S] ] {

    def [A, B] (x: Vect[A, S]) map (f: A => B): Vect[B, S] = Vect.map(x)(f)

}