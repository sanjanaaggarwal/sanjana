package assignmen1_10_1
import java.util.Scanner

class ques3c {
  def fibonnacci (number :Int):Unit={
    var array=  new Array[Int](5)
    array(0)=0
    array(1)=1
    for( arrayindex <- 2 to array.size-1)
      array(arrayindex)= array(arrayindex-2)+array(arrayindex-1)
    for(i <- 0 to array.length )
    {
      if(i == number) println("i th element is "+ array(i))
    }
  }



}
