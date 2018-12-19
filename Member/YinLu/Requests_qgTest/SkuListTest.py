import unittest
from api2018.Sendhttp import SendHttp

class skulist(unittest.TestCase):
    def setUp(self):
        self.url="/common/skuList"

    def test_skulist1(self):
        result=SendHttp().run_http(self.url,"GET")
        print(result)

    def test_skulist2(self):
        result=SendHttp().run_http(self.url+"?goodsId=1","GET")
        print(result)

    def test_skulist3(self):
        result=SendHttp().run_http(self.url+"?goodsId=2147483648","GET")
        print(result)

    def test_skulist4(self):
        result=SendHttp().run_http(self.url+"?goodsId=9999","GET")
        print(result)

    def test_skulist5(self):
        result=SendHttp.run_http(self.url+"?goodsId=\"1\" ","GET")
        print(result)

if __name__=='__main__':
    unittest.main()