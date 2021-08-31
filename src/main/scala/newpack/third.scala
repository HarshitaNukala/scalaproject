package newpack

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

import java.io.File
case class walmartdata(var crawled_at:String, var verified:Boolean, var reviewed_at:String, var reviewed_by:String, var helpful_count: String, var not_helpful_count:String, var content:String, var raw_content:String, var average_rating:String, var review_heading:String, var product_url:String, var review_page_url:String, var rating:Float, var images:String )
case class my(var rating:Float)
object third extends App {
  val mapper = new ObjectMapper() with ScalaObjectMapper
  mapper.registerModule(com.fasterxml.jackson.module.scala.DefaultScalaModule)
  val json = new File("C:\\Users\\LVS\\IdeaProjects\\js\\src\\main\\resources\\fashion_products_reviews_dataset.json\\fashion_products_reviews_dataset.json")
  //val jso = scala.io.Source.fromFile("C:\\Users\\LVS\\IdeaProjects\\js\\src\\main\\resources\\fashion_products_reviews_dataset.json\\fashion_products_reviews_dataset.json")
  val p = mapper.readValue[Seq[walmartdata]](json)
 //var j =p(0).rating
  val a = scala.collection.mutable.Map[Float,Int]()
  for (x<- p){
    if(!a.contains(x.rating))
      a(x.rating)=1
    else {
      val b=a.get(x.rating)
      a.update(x.rating,b.get+1)
    }
  }
  for((k,v)<- a){
    println(s"The rating $k occured $v times")
  }

}









