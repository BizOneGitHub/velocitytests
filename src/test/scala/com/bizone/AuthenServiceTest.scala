package com.bizone

import com.bizone.{AuthenService, Logic, LoginService, User}
import org.codehaus.jackson.map.ObjectMapper
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.mockito.MockitoSugar
import org.scalatest.{BeforeAndAfter, FunSuite}

class AuthenServiceTest extends AbstractApiTest  with BeforeAndAfter  {

  val CREATE_USER_RESOURCE = "create-user.json"
  var service: LoginService = _
  var logic: Logic = _
  var authenService: AuthenService = _

  before {
    service = new RealLoginService()
    logic = new Logic()
    authenService = new AuthenService(service, logic)
  }

  test("test loginServiceReturnBoolean") {
    val jsonString = requestResource(CREATE_USER_RESOURCE)
    val user:User = GsonUtils.json2Class(jsonString, classOf[User])
//
//    // (3) access the service
    val johndoe = authenService.auth(user.name, user.password)

    // (4) verify the results
    assertEquals("OK", johndoe)

  }
}
