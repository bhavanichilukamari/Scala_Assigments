import org.scalatest.funsuite.AnyFunSuite

class test_2  extends AnyFunSuite{

    test("solution_2"){
      assert(solution_2.test_2("scala",0) ==="cala")
      assert(solution_2.test_2("scala",1) ==="sala")
      assert(solution_2.test_2("scala",4) ==="scal")


    }
}

