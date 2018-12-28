from code.Sendhttp import SendHttp
from code import Common
class addressDelete():
    def setUp(self):
        self.url='/fgadmin/address/delete'

    def delete_test(self):
        user = {
            "phoneArea": "86",
            "phoneNumber": "20000000009",
            "password": "netease123"
        }

        detail={
            "id":"1"
        }
        result=SendHttp().send_post_bycookies(self.url,Common.getcookies(),detail)
        print(result)
        self.assertEqule(result['code'], 200)