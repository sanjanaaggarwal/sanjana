package assignmen1_10_1
import java.util.Scanner

object ques4 {
  def main(args: Array[String]):Unit ={
    println("enter the number of elements")
    val Scanner= new Scanner(System.in)
    val number = Scanner.nextInt()
    var multiply =1
    var sum=0
    for( i <- 1 until number+1) multiply *=  i
    println(multiply)
    while(multiply != 0)
      {
        sum += multiply % 10
        multiply /=10
      }
      println(sum)
  }

}
