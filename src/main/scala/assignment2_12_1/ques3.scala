package assignment2_12_1

object ques3 extends App {

  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int = f(a,b)
  val square = (a :Int, b:Int )=> (a*a+b*b)
  val cube = (a:Int ,b:Int)=> (a*a*a+b*b*b)
  val int = (a:Int ,b:Int)=> (a+b)
  val square1 =sum(square ,1 ,2)
  val cube1 = sum(cube ,1,2)
  val int1 = sum(int,1,2)
  println(square1)
  println(cube1)
  println(int1)

}
