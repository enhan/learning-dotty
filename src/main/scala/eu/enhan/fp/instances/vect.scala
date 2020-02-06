package eu.enhan.fp.instances
import eu.enhan.fp.tc._
import eu.enhan.fp.Vect
import eu.enhan.fp.Vect._

given emptyVectFunctor as Functor[[X] =>> Vect[X, 0]] {
    def [A, B] (x: Vect[A, 0]) map (f: A => B): Vect[B, 0] = Vect.Empty
}

given vectFunctor[S <: Int] as Functor[ [X] =>> Vect[X, S] ] {

    def [A, B] (x: Vect[A, S]) map (f: A => B): Vect[B, S] =  {
    
        x match {
            case Empty =>  x.map(f)
            case Cons(h, t): Vect[A, S] =>  
                //val aA: A = h 
                //val headTranformed: B = f(h)
                //val tailMapped = t.map(f)
                ???
        }


    }

}