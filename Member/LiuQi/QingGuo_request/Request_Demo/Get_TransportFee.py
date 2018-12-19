import unittest
from QingGuo.Utils.Sendhttp import SendHttp

class getTransportFee(unittest.TestCase):
    def setUp(self):
        self.url= "/common/getTransportFee"

    def test_getTransportFee_by_address_success(self):
        address = {"id":1,"addressDetail":"浙江省_杭州市_滨江区"}
        result = SendHttp().sent_get(self.url, address)
        print(result)
    def test_getTransportFee_by_address_fail1(self):
        address = {"id": "1", "addressDetail": "浙江省_杭州市_滨江区"}
        result = SendHttp ( ).sent_get ( self.url, address )
        print(result)
    def test_getTransportFee_by_address_fail2(self):
        address = {"id": "null", "addressDetail": "浙江省_杭州市_滨江区"}
        result = SendHttp ( ).sent_get ( self.url, address )
        print(result)
    def test_getTransportFee_by_address_fail3(self):
        address = {"id": 1, "addressDetail": "123", }
        result = SendHttp ( ).sent_get ( self.url, address)
        print(result)

if __name__ == '__main__':
    unittest.main ( )