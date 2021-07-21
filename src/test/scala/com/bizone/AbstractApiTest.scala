package com.bizone

import org.scalatest.FunSuite

abstract class AbstractApiTest extends FunSuite{
  protected def resourceInitialize(){
    //load config
    // clean data old
    resourceCleanup()
  }

  /**
   * Delete the default data created by #resourceInitialize ().
   */
  protected def resourceCleanup(){

  }

  protected def requestResource(cls: Class[_], resourceName: String): String = {
    return ApiTestUtil.requestResource(cls, resourceName)
  }

  protected def requestResource(resourceName: String): String = {
    return ApiTestUtil.requestResource(this.getClass(), resourceName)
  }
}
