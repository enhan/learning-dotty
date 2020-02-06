package eu.enhan.fp.instances

import eu.enhan.fp.tc._


given stringMonoid: Monoid[String] {
    def empty: String = ""

    def (a: String) combine (b: String): String = a + b
}

