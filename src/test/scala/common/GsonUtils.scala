package common

import com.google.gson.GsonBuilder

object GsonUtils {
  val GSON = new GsonBuilder().create()

  //convert object to json
  def java2Json(obj: Object) = GSON.toJson(obj)

  // convert json to object
  def json2Class[T](json: String, tyze: Class[T]) = GSON.fromJson(json, tyze)

  //  val dataclass = classOf[util.ArrayList[Data]]
  //  val obj2:util.ArrayList[Data] = GsonUtils.json2Java(json2, dataclass)
}
