import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgSkulistScene(unittest.TestCase):

    def setUp(self):
        self.url1="/common/skuList"    #获取所有商品sku列表成功
        self.url2="/common/skuList?goodsId=1"    #id=1
        self.url3="/common/skuList?goodsId=2"    #id=2
        self.url4="/common/skuList?goodsId=3"    #id=3

    def test_address_by_Login(self):
        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
        result = SendHttp().sent_get_bycookies(self.url1, Common.getcookies(user))
        print(result)
        result = SendHttp().sent_get_bycookies(self.url2, Common.getcookies(user))
        print(result)
        result = SendHttp().sent_get_bycookies(self.url3, Common.getcookies(user))
        print(result)
        result = SendHttp().sent_get_bycookies(self.url4, Common.getcookies(user))
        print(result)

if __name__=='__main__':
    unittest.main()