

type Refined = [X, P] =>> Any


class Greater[S <: Int: ValueOf] {
    def greater(i: Int): Boolean = valueOf[S] > i  
} 