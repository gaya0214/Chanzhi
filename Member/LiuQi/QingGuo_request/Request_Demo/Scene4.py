import unittest
from QingGuo.Utils.Sendhttp import SendHttp
from QingGuo.Utils import Common
class Scence4(unittest.TestCase):
    def test_address_by_Login(self):
        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
        result = SendHttp ( ).sent_get_bycookies ( self.url, Common.getcookies ( user ) )
        print ( result )
    def test_getTransportFee_by_address_success(self):
        self.url = "/common/getTransportFee"
        address = {"id":1,"addressDetail":"浙江省_杭州市_滨江区"}
        result = SendHttp().sent_get_bycookies(self.url, Common.getcookies(address))
        print(result)
    def test_submit_success(self):
        self.url = "/fgadmin/orders/submit"
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().send_post_bycookies(self.url, Common.getcookies(sub),sub)
        print(result)
if __name__=='__main__':
    unittest.main()