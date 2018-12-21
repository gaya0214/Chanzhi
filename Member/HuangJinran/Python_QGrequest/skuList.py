import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgSkulistTest(unittest.TestCase):

    def setUp(self):
        self.url1="/common/skuList"    #获取所有商品sku列表成功
        self.url2="/common/skuList?goodsId=1"    #获取goodsId=1的商品sku信息成功
        self.url3="/common/skuList?goodsId=2147483648"    #获取goodsId=2147483648的商品sku信息失败(超过int最大取值范围)
        self.url4 = "/common/skuList?goodsId=9999"    #获取goodsId不存在的商品失败
        self.url4 = "/common/skuList?goodsId='1'"    #goodsId类型不正确

    def test_address_by_Login(self):
        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": "netease123"}
        result = SendHttp().sent_get_bycookies(self.url1, Common.getcookies(user))
        print(result)

if __name__=='__main__':
    unittest.main()