from code.Sendhttp import SendHttp
import code.Common

class getTransportfee():
    def setUp(self):
        self.url='/common/getTransportFee'

    def getFee_test(self):
        user = {
            "phoneArea": "86",
            "phoneNumber": "20000000009",
            "password": "netease123"
        }
        detail={
            "id":"1",
            "addressDetail":"河北省_石家庄_裕华区_河北师范大学"
        }
        result = SendHttp().sent_post_bycookies(self.url, code.Common.getcookies(user))
        print(result)
        self.assertEqule(result['code'], 200)