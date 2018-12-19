import unittest
from api2018.Sendhttp import SendHttp
from api2018 import Common

class fee(unittest.TestCase):

    def fee(self):
        self.url="/common/getTransportFee"

    def test_gettransportfee1(self):
        fee_url = "/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_滨江区"
        fee_result = SendHttp().sent_get(fee_url)
        print(fee_result)
    def test_gettransportfee2(self):
        fee_url = "/common/getTransportFee?id=\'1\'&addressDetail=浙江省_杭州市_滨江区"
        fee_result = SendHttp().sent_get(fee_url)
        print(fee_result)


if __name__ == '__main__':
    unittest.main()