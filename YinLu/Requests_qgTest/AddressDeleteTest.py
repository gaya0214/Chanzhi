import unittest
from api2018.Sendhttp import SendHttp
from api2018 import Common

class addressdelete(unittest.TestCase):
    def setUp(self):
        self.url = "/fgadmin/address/delete"

    def test_addressdelete1(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "netease123"}
        deletedata={"id":82316353}
        result=SendHttp().send_post_bycookies(self.url,Common.getcookies(user),deletedata)
        print(result)

    def test_addressdelete2(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "netease123"}
        deletedata = {"id":82316354}
        result = SendHttp().send_post_bycookies(self.url, Common.getcookies(user), deletedata)
        print(result)
if __name__=='__main__':
    unittest.main()