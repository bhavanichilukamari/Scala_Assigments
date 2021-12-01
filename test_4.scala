import org.scalatest.funsuite.AnyFunSuite

class test_4  extends AnyFunSuite{
  test("solution_4"){
    assert(solution_4.test_4("If I had a bought a ticket that day, I would have won a prize") === "If I had a bought a ticket that day, I would have won a prize")
    assert(solution_4.test_4("you don't drink enough water, you get thirsty") === "If you don't drink enough water, you get thirsty")
  }
}
