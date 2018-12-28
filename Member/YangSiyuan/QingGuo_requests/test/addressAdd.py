from code.Sendhttp import SendHttp
from code import Common
class addressAdd():
    def setUp(self):
        self.url='/fgadmin/address/new'

    def add_test(self):
        user = {
            "phoneArea": "86",
            "phoneNumber": "20000000009",
            "password": "netease123"
        }
        detail = {
            "id":"",
            "receiverName":"杨san",
            "cellPhone":"123456789",
            "addressDetail":"河北师范大学",
            "province":"河北省",
            "city":"石家庄",
            "area":"裕华区"
        }
        result=SendHttp().send_post_bycookies(self.url,Common.getcookies(),detail)
        print(result)
        self.assertEqule(result['code'],200)
