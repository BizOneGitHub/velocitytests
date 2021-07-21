package com.bizone

import com.google.common.base.CaseFormat
import org.apache.commons.lang3.StringUtils

import scala.io.Source

object ApiTestUtil {
  def requestResource(cls: Class[_], resourceName: String): String = {
    if (cls == null || StringUtils.isEmpty(resourceName)) {
      throw new IllegalArgumentException
    }
    val pkgName = cls.getPackage.getName
    val clsName = cls.getSimpleName
    val prefix = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, clsName).replaceAll("_", "-")
    val structName = String.format("%s/input/%s-%s", pkgName.replaceAll("\\.", "/"), prefix, resourceName)
    return loadResource(structName)
  }

  def loadResource(structName: String): String = {
    val source: String = Source.fromResource(structName).getLines.mkString
    return source
  }
}
