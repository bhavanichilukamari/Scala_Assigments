import org.scalatest.funsuite.AnyFunSuite

class test_6  extends AnyFunSuite{
  test("solution_6"){
    assert(solution_6.test_6(25,60) === false)
    assert(solution_6.test_6(25,25) === true)
  }

}
