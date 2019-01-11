package assignmen1_10_1

class ques4c {
  def  factorial (num:Int):Unit={
    var multiply =1
    var sum=0
    for( i <- 1 to num) multiply *=  i
    println(multiply)
    while(multiply != 0)
    {
      sum += multiply % 10
      multiply /=10
    }
    println(sum)
  }

}
