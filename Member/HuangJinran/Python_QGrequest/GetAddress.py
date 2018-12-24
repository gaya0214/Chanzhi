import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgGetAddress(unittest.TestCase):

    def setUp(self):
        self.url1="/fgadmin/address/list"    #获取收货地址列表成功

    def test_address_by_Login(self):
        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
        result = SendHttp().sent_get_bycookies(self.url1, Common.getcookies(user))
        print(result)

if __name__=='__main__':
    unittest.main()