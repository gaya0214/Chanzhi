import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgGetFee(unittest.TestCase):

    def setUp(self):
        self.url1="/common/getTransportFee?id=%d&addressDetail=%s"    #计算运费成功
        self.url2 = "/common/getTransportFee?id=hhh"  # 计算运费失败（收货地址编号不存在）
        self.url3 = "/common/getTransportFee?id='%d&addressDetail=%s'"  # 计算运费失败（收货地址编号类型不正确）

    def test_address_by_Login(self):
        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
        result = SendHttp().sent_get_bycookies(self.url1, Common.getcookies(user))
        print(result)

if __name__=='__main__':
    unittest.main()