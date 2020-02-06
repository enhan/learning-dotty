package eu.enhan.fp
import tc._

enum LkList[+A] {
    case Cons(head: A, tail: LkList[A]) 
    case Nil

    def ::[B >: A] (e: B): LkList[B] = Cons(e, this)

}


given listFunctor as Functor[LkList] {

    def [A, B] (l: LkList[A]) map (f: A => B) = l match {
        case LkList.Nil => LkList.Nil
        case LkList.Cons(h, t) => LkList.Cons(f(h), t.map(f))
    }

}

