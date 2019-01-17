package assignment2_12_1

object ques2 extends App {

  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String= {
    shape match {
      case "rectangle" => val arearec = arearectangle(first, second)
                          s" area of rectangle is $arearec"
      case "rhombus" => val arearoh = arearohbus(first, second)
                          s"area of rhombus is $arearoh"
      case "parallelogram" => val areapar = areaparallo(first, second)
                          s"area of parallelogram is $areapar"
      case _=> s"no such pattern matched"
    }
  }

  val arearectangle = (first:Int ,second:Int )=> (first*second)
  val arearohbus =(first:Int,second:Int)=>((first*second)/2)
  val areaparallo =(first:Int,second:Int)=> (first*second)
  println(area("rectangle" , 2 ,2 ,arearectangle))

}
