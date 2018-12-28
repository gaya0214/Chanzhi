from code import Common

from code.Sendhttp import SendHttp
#提交订单

class orderSubmit():
    def setUp(self):
        self.url="/fgadmin/orders/submit"
    def submit_test(self):
        user = {
            "phoneArea": "86",
            "phoneNumber": "200000000096",
            "password": "netease123"
        }
        detial={"skuIds":"3",
                "skuNumbers":"1",
                "stockIds":"74966313",
                "receiverName":"杨san",
                "cellPhone":"12345678909",
                "addressDetail":"河北师范",
                "province":"河北省",
                "city":"石家庄",
                "area":"裕华区",
                "voiceStatus":0,
                "needInvoice":0,
                "invoiceHead":"",
                "transportFee":6,
                "logisticsCompanyId":1,
                "accessSource":"noSource",
                "accessDevice":0}
        result=SendHttp().sent_post_bycookies(self.url,Common.getcookies(user),detial)
        print(result)
        self.assertEqual(result['code'], 200)