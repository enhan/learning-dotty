import eu.enhan.fp.{given, _}
import eu.enhan.fp.tc._
import eu.enhan.fp.instances.given

object Main {

  def main(args: Array[String]): Unit = 
  
    val l = LkList.Cons(3, LkList.Nil)
    val r = plus3(l)
    println(r)
      
    val s0 = "hello"
    val s1 = "from dotty"

    println(s0 |+| " " |+| s1)

    val vect = 4 :: 3 :: 2 :: Vect(2)

    println(vect.size)
    println(plus3[[X] =>> Vect[X, vect.Size]](vect))
  
  def plus2[F[_]](l: F[Int])(using FF: Functor[F]): F[Int] = l.map(_+ 2)

  def plus3[F[_]: Functor](l: F[Int]) = l.map(_+3)
}
