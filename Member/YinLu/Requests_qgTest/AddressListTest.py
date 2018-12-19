import unittest
from api2018.Sendhttp import SendHttp
from api2018 import Common
class addresslist(unittest.TestCase):

    def setUp(self):
        self.url="/fgadmin/address/list"

    def test_addresslist(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "netease123"}
        result = SendHttp().sent_get_bycookies(self.url,Common.getcookies(user) )
        print(result)

if __name__=='__main__':
    unittest.main()