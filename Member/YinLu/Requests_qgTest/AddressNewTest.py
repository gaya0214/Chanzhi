import unittest
from api2018.Sendhttp import SendHttp
from api2018 import Common

class addressnew(unittest.TestCase):

    def setUp(self):
        self.url = "/fgadmin/address/new"
        self.user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "netease123"}

    def test_addnew1(self):
        adddata={"receiverName": "张三","cellPhone" : "12345678901","addressDetail" : "浙江大学",
            "province" :"浙江省","city" : "杭州市","area":"滨江区"}
        result=SendHttp().send_post_bycookies(self.url,Common.getcookies(self.user),adddata)
        print(result)

    def test_addnew2(self):
        adddata = {"receiverName": 123, "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew3(self):
        adddata = {"receiverName": "张三", "cellPhone": 12345678901, "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew4(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": 123,
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew5(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": 571, "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew6(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": 571, "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew7(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": 571}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew8(self):
        adddata = {"cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew9(self):
        adddata = {"receiverName": "张三","addressDetail": "浙江大学",
                    "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew10(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew11(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                    "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew12(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省","area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew13(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew14(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew15(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学",
                   "province": "江苏省", "city": "南京市", "area": "西湖区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew16(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学",
                   "province": "浙江省", "city": "南京市", "area": "西湖区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew17(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学",
                   "province": "江苏省", "city": "杭州市", "area": "西湖区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew18(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学",
                   "province": "安徽省", "city": "南京市", "area": "西湖区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew19(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew20(self):
        adddata = {"receiverName": "李四", "cellPhone": "12345678901", "addressDetail": "浙江工业大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew21(self):
        adddata = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url,adddata)
        print(result)

    def test_addnew22(self):
        adddata = {"receiverName": "", "cellPhone": "12345678901", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)

    def test_addnew23(self):
        adddata = {"receiverName": "张三", "cellPhone": "null", "addressDetail": "浙江大学",
                   "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), adddata)
        print(result)
if __name__=='__main__':
    unittest.main()