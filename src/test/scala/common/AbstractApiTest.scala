package common

import org.scalatest.FunSuite

import java.io.IOException

abstract class AbstractApiTest extends FunSuite{

  @throws[Exception]
  protected def resourceInitialize(){
    //load config environment
    //TODO
    println("resourceInitialize")

    // clean data before init db for new class test
    resourceCleanup()

    // init dummy db
    //TODO
  }

  /**
   * Delete the default data created by #resourceInitialize ().
   */
  @throws[Exception]
  protected def resourceCleanup(){
    println("resourceCleanup")
  }

  @throws[IOException]
  protected def requestResource(cls: Class[_], resourceName: String): String = {
    return ApiTestUtil.requestResource(cls, resourceName)
  }

  @throws[IOException]
  protected def requestResource(resourceName: String): String = {
    return ApiTestUtil.requestResource(this.getClass(), resourceName)
  }
}
