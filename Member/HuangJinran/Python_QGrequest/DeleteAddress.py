import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgDeleteAddress(unittest.TestCase):

    def setUp(self):
        self.url = "/fgadmin/address/delete"

# 添加收货地址成功
    def test_add_success(self):
        user = {"id":77243286}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 200)
        self.assertEqual(result['message'], 'success')

# 添加收货地址失败（删除的收货地址id不存在）
    def test_add_success(self):
        user = {"id":000}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

# 添加收货地址失败（删除的收货地址id类型错误）
    def test_add_success(self):
        user = {"id":"77243286"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

if __name__=='__main__':
    unittest.main()