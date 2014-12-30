import upickle._

package object forceit {
  //implicit def YOU_FUCKED_IT[T]: Reader[T] = { assert(false,"FUCKIT EXECUTED!") ; ??? }; implicit def STAB_WRITER[T]: Writer[T] = { assert(false,"FUCKIT EXECUTED!") ; ??? }
}
