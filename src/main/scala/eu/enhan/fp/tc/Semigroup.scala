package eu.enhan.fp.tc

trait Semigroup[A]{

    def (a: A) combine(b: A): A

    final def (a: A) |+| (b: A): A = a.combine(b)

}