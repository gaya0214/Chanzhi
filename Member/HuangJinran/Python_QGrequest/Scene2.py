import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgScene2(unittest.TestCase):

    def setUp(self):
        self.url="/common/fgadmin/login"

#登录成功
    def test_login_success(self):
        user={"phoneArea":"86","phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'],200)
        self.assertEqual(result['message'], 'success')

#查询收货地址
    user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
    result = SendHttp().sent_get_bycookies("/fgadmin/address/list", Common.getcookies(user))
    print(result)

#计算运费
    user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
    result = SendHttp().sent_get_bycookies("/common/getTransportFee?id=%d&addressDetail=%s", Common.getcookies(user))
    print(result)
#提交订单
    user = {"id": "", "receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
            "city": "杭州市", "area": "滨江区"}
    result = SendHttp().run_http("/fgadmin/orders/submit", "POST", user)
    print(result)
if __name__=='__main__':
    unittest.main()