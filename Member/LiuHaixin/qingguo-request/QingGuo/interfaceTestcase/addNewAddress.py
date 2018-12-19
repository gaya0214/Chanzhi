import unittest

from Utils import Common
from Utils.Sendhttp import SendHttp


class addNewAddress(unittest.TestCase):
    def setUp(self):
        self.url="/fgadmin/address/new"
    def test_newaddress_suceess(self):
        newaddress = {"receiverName":"张三",
                      "cellPhone":"12345678901",
                      "addressDetail":"浙江大学",
                      "province":"浙江省",
                      "city":"杭州市",
                      "area":"滨江区"}
        result = SendHttp().send_post_bycookies( self.url,Common.getcookies(newaddress), newaddress )
        print(result)
    def test_newaddress_fail1(self):
        newaddress = {"receiverName":123,
                      "cellPhone":"12345678901",
                      "addressDetail":"浙江大学",
                      "province":"浙江省",
                      "city":"杭州市",
                      "area":"滨江区"}
        result = SendHttp().send_post_bycookies( self.url,Common.getcookies(newaddress), newaddress )
        print(result)

    def test_newaddress_fail2(self):
        newaddress = {"receiverName": "张三", "cellPhone": 12345678901, "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )

    def test_newaddress_fail3(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": 123, "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )

    def test_newaddress_fail1(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail4(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": 571,
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail5(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": 571, "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail6(self):
        newaddress= {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": 571}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail7(self):
        newaddress = { "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )

    def test_newaddress_fail8(self):
        newaddress = {"receiverName": "张三",  "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail9(self):
        newaddress= {"receiverName": "张三", "cellPhone": "12345678901",  "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )

    def test_newaddress_fail10(self):
        newaddress= {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail1(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )

    def test_newaddress_fail12(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail13(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "复旦大学", "province": "上海市",
                      "city": "上海市", "area": "黄埔区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )
    def test_newaddress_fail14(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "江苏省",
                      "city": "南京市", "area": "西湖区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )
    def test_newaddress_fail15(self):
        newaddress= {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "浙江省",
                      "city": "南京市", "area": "西湖区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )
    def test_newaddress_fail16(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "安徽省",
                      "city": "杭州市", "area": "西湖区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress),newaddress )
        print ( result )
    def test_newaddress_fail17(self):
        newaddress= {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail18(self):
        newaddress = {"receiverName": "李四", "cellPhone": "12345678902", "addressDetail": "浙江工业大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail19(self):
        newaddress = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail20(self):
        newaddress = {"receiverName": "", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress ), newaddress )
        print ( result )

    def test_newaddress_fail21(self):
        newaddress = {"receiverName": "李四", "cellPhone": "null", "addressDetail": "浙江工业大学", "province": "浙江省",
                      "city": "杭州市", "area": "滨江区"}
        result = SendHttp ( ).send_post_bycookies ( self.url, Common.getcookies ( newaddress), newaddress )
        print ( result )
if __name__=='__main__':
    unittest.main()