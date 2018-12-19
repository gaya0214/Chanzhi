import unittest
from QingGuo.Utils.Sendhttp import SendHttp
from QingGuo.Utils import Common
#作者：尹璐
class qgDelete(unittest.TestCase):
    def setUp(self):
        self.url="/fgadmin/address/delete"
    def test_delete_success(self):
        delete_id={"id":82178900}
        result = SendHttp().send_post_bycookies ( self.url, Common.getcookies (delete_id ),delete_id )
        print(result)
    def test_delete_fail1(self):
        delete_id={"id":821789}
        result = SendHttp().send_post_bycookies ( self.url, Common.getcookies (delete_id ),delete_id )
        print(result)
if __name__=='__main__':
    unittest.main()