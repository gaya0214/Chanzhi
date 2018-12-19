import unittest
from QingGuo.Utils.Sendhttp import SendHttp
from QingGuo.Utils import Common
class addressNew(unittest.TestCase):
    def setUp(self):
        self.url="/fgadmin/address/new"
    def test_addressnew_suceess(self):
        addressnew = {"receiverName":"张三",
                      "cellPhone":"12345678901",
                      "addressDetail":"浙江大学",
                      "province":"浙江省",
                      "city":"杭州市",
                      "area":"滨江区"}
        result = SendHttp().send_post_bycookies( self.url,Common.getcookies(addressnew), addressnew )
        print(result)
    def test_addressnew_fail1(self):
        addressnew = {"receiverName":123,
                      "cellPhone":"12345678901",
                      "addressDetail":"浙江大学",
                      "province":"浙江省",
                      "city":"杭州市",
                      "area":"滨江区"}
        result = SendHttp().send_post_bycookies( self.url,Common.getcookies(addressnew), addressnew )
        print(result)

    def test_addressnew_fail2(self):
        addressnew = {"receiverName": "张三", "cellPhone": 12345678901, "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail3(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": 123, "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail1(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail4(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": 571,
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail5(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": 571, "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail6(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": 571}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail7(self):
        addressnew = { "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail8(self):
        addressnew = {"receiverName": "张三",  "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail9(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901",  "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail10(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail1(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail12(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail13(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "复旦大学", "province": "上海市",
                      "city": "上海市", "area": "黄埔区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )
    def test_addressnew_fail14(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "江苏省",
                      "city": "南京市", "area": "西湖区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )
    def test_addressnew_fail15(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "浙江省",
                      "city": "南京市", "area": "西湖区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )
    def test_addressnew_fail16(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "安徽省",
                      "city": "杭州市", "area": "西湖区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )
    def test_addressnew_fail17(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail18(self):
        addressnew = {"receiverName": "李四", "cellPhone": "12345678902", "addressDetail": "浙江工业大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail19(self):
        addressnew = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail20(self):
        addressnew = {"receiverName": "", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )

    def test_addressnew_fail21(self):
        addressnew = {"receiverName": "李四", "cellPhone": "null", "addressDetail": "浙江工业大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( addressnew ), addressnew )
        print ( result )
if __name__=='__main__':
    unittest.main()