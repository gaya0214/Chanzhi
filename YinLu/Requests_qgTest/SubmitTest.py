import unittest
from api2018.Sendhttp import SendHttp
from api2018 import Common

class submit(unittest.TestCase):

    def setUp(self):
        self.url="/fgadmin/orders/submit"
        self.user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "netease123"}

    def test_submit1(self):
        submitdata={"skuIds":"2,3","skuNumbers":"1,1","stockIds":"74966312,74966313","receiverName":"张三","cellPhone":"12345678901"
,"addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区","voiceStatus":0,"needInvoice":0,"invoiceHead"
:"","transportFee":0,"logisticsCompanyId":1,"accessSource":"noSource","accessDevice":0}
        result=SendHttp().send_post_bycookies(self.url,Common.getcookies(self.user),submitdata)
        print(result)
    def test_submit2(self):
        submitdata = {"skuIds": "2,3", "skuNumbers": "1,1", "stockIds": "74966312,74966313", "receiverName": "李四",
                      "cellPhone": "12345678901"
            , "addressDetail": "浙江大学", "province": "浙江省", "city": "杭州市", "area": "滨江区", "voiceStatus": 0,
                      "needInvoice": 0, "invoiceHead"
                      : "", "transportFee": 0, "logisticsCompanyId": 1, "accessSource": "noSource", "accessDevice": 0}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(self.user), submitdata)
        print(result)
    def test_submit3(self):
        submitdata = {"skuIds": "2,3", "skuNumbers": "1,1", "stockIds": "74966312,74966313", "receiverName": "张三",
                  "cellPhone": "12345678901"
                    , "addressDetail": "浙江大学", "province": "浙江省", "city": "杭州市", "area": "滨江区", "voiceStatus": 0, "needInvoice": 0,
                  "invoiceHead"
                  : "", "transportFee": 0, "logisticsCompanyId": 1, "accessSource": "noSource", "accessDevice": 0}
        result = SendHttp().send_post_bycookies(self.url, submitdata)
        print(result)
if __name__=='__main__':
    unittest.main()