import org.scalatest.FunSuite
import data_coding.Coding


class Test extends FunSuite {
  test("Coding.Code5Bin6B"){
    assert(Coding.Code5Bin6B( 31) == "010100")
    intercept[IllegalArgumentException](Coding.Code5Bin6B( 32))
  }
}
