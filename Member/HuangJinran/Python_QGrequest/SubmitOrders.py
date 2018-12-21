import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgSubmitOrders(unittest.TestCase):

    def setUp(self):
        self.url="/fgadmin/orders/submit"

#提交订单成功
    def test_submit_success(self):
        user={"id":"","receiverName": "张三", "cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'],200)
        self.assertEqual(result['message'], 'success')

if __name__=='__main__':
    unittest.main()