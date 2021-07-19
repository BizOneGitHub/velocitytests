package demo

import org.mockito.MockitoSugar
import org.scalatest.{BeforeAndAfter, FunSuite}
import com.bizone.App
class AppTests extends FunSuite with BeforeAndAfter with MockitoSugar {


  test("test loadConfig") {
    App.main(null)
  }

}
