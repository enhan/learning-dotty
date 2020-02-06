package eu.enhan.fp.tc

trait Functor[F[_]] {

    def [A,B] (x: F[A]) map (f: A => B): F[B]
}

