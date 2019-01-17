package assignmen1_10_1

object ques1 extends App{
    val list =List(10,20,30,40)
    val result = for {i <- list.indices
    }yield s"$i = ${list(i)}"
  println(result)

}
