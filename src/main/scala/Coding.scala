package data_coding

object Coding {
  def Code5Bin6B(dataBefore: Int):String = {
      if (dataBefore > 31 || dataBefore<0) {
        throw new IllegalArgumentException
      }
      dataBefore match {
        case 0 =>"100111"
        case 1 =>"011101"
        case 2 =>"101101"
        case 3 =>"110001"
        case 4 =>"110101"
        case 5 =>"101001"
        case 6 =>"011001"
        case 7 =>"000111"
        case 8 =>"111001"
        case 9 =>"100101"
        case 10 =>"010101"
        case 11=>"110100"
        case 12 =>"001101"
        case 13 =>"101100"
        case 14 =>"011100"
        case 15 =>"101000"
        case 16 =>"100100"
        case 17 =>"100011"
        case 18 =>"010011"
        case 19 =>"110010"
        case 20 =>"001011"
        case 21 =>"101010"
        case 22 =>"011010"
        case 23 =>"000101"
        case 24 =>"110011"
        case 25 =>"100110"
        case 26 =>"010110"
        case 27 =>"001001"
        case 28 =>"001110"
        case 29 =>"010001"
        case 30 =>"100001"
        case 31 =>"010100"
      }
  }

}
