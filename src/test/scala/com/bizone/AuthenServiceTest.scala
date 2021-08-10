//package com.bizone
//
//import common.{AbstractApiTest, GsonUtils}
//import org.junit.Assert.assertEquals
//import org.scalatest.BeforeAndAfter
//
//class AuthenServiceTest extends AbstractApiTest  with BeforeAndAfter  {
//
//  val CREATE_USER_RESOURCE = "create-user.json"
//  var service: LoginService = _
//  var logic: Logic = _
//  var authenService: AuthenService = _
//  var user: User = _
//
//  before {
//    resourceInitialize()
//
//    val jsonString = requestResource(CREATE_USER_RESOURCE)
//    user = GsonUtils.json2Class(jsonString, classOf[User])
//
//    service = new RealLoginService()
//    logic = new Logic()
//    authenService = new AuthenService(service, logic)
//  }
//
//  after {
//    println("Cleanup")
//    resourceCleanup()
//    // clean user
//    user = new User(null, null)
//  }
//
//  test("TestAuthWithUserRoot") {
//
//    println(s"TestAuthWithUserAdmin ${user}")
//    // (3) access the service
//    val johndoe = authenService.auth(user.name, user.password)
//
//    // (4) verify the results
//    assertEquals("OK", johndoe)
//
//  }
//}
