package com.mildlyskilled

import org.scalatest.FunSuite

/**
  * Test class for camera object
  */
class CameraTest extends FunSuite {
  val cam = new Camera(Vector.origin, 90f)

  test("Should construct camera object correctly") {
    assert(cam.position == Vector.origin)
    assert(cam.viewAngle == 90f)
  }
}
