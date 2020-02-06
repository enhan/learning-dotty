package eu.enhan.fp.tc

trait Monoid[A] extends Semigroup[A] {
    
    def empty: A

}