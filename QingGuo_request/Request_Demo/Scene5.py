import unittest
from QingGuo.Utils.Sendhttp import SendHttp
from QingGuo.Utils import Common
#作者：刘琪
class Scence5(unittest.TestCase):
    def test_login_success(self):
        self.url = "/common/fgadmin/login"
        user={"phoneArea":"86","phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url, "POST", user)
        print ( result )
    def test_address(self):
        self.url = "/fgadmin/address/list"
        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
        result = SendHttp().sent_get(self.url,user)
        print(result)
    def test_addressnew_suceess(self):
        self.url = "/fgadmin/address/new"
        addressnew = {"receiverName":"张三",
                      "cellPhone":"12345678901",
                      "addressDetail":"浙江大学",
                      "province":"浙江省",
                      "city":"杭州市",
                      "area":"滨江区"}
        result = SendHttp().send_post_bycookies( self.url,Common.getcookies(addressnew), addressnew )
        print(result)
    def test_getTransportFee_by_address_success(self):
        self.url = "/common/getTransportFee"
        address = {"id":1,"addressDetail":"浙江省_杭州市_滨江区"}
        result = SendHttp().sent_get(self.url, address)
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
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
if __name__=='__main__':
    unittest.main()