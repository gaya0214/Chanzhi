from code.Sendhttp import SendHttp
import code.Common

class Login():
    def setup(self):
        self.url="/common/fgadmin/login"
    def submit_test(self):
#接口的参数
        user={
    "phoneArea":"86",
    "phoneNumber":"20000000009",
    "password":"netease123"
    }
        result=SendHttp().sent_post_bycookies(self.url,code.Common.getcookies(user))
        print(result)
        self.assertEqule(result['code'],200)

