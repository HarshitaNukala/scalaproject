package testtt
import junit.framework.TestCase.assertEquals
import newpack.{third, walmartdata}
import org.junit.Test
import org.mockito.MockitoSugar.mock
class testingscala {
 @Test
 def checking1: Unit = {
  var a= third
  var p=a.f()
  assertEquals(p(1.0F),289)
 }
 @Test
 def checking2: Unit ={
  var b=third.f()
  assertEquals(b(2.0F),153)
 }
 @Test
 def check3(): Unit ={
  var c=third.f()
  assertEquals(c(3.0F),224)
 }
 @Test
 def check4(): Unit ={
  var c=third.f()
  assertEquals(c(4.0F),346)
 }
 @Test
 def check5(): Unit ={
  var d=third.f()
  assertEquals(d(5.0F),2007)
 }
 }
  //var c = mock[walmartdata]
  //var cc = th
 /* var cc = third
  //println(cc.json)
  try {
   assertEquals(third.a(1.0F), null)
  }
  catch{
   case e:NullPointerException => println("null pointer exception")
  }
  /*assertEquals(cc.a(2.0F), 153)
  assertEquals(cc.a(3.0F), 224)
  assertEquals(cc.a(4.0F), 346)
  assertEquals(cc.a(5.0F), 2007)*/
 }
}
*/