import unittest

import self as self

from Utils.Sendhttp import SendHttp


class getskuList(unittest.TestCase):
    def setUp(self):
        self.url = "/common/skuList"

    def test_skulist_success1(self):
        result = SendHttp().sent_get(self.url)
        print(result)
    def test_skulist_success2(self):
        Id = {"goodsId": 1}
        result = SendHttp().sent_get(self.url, Id)
        print(result)
    def test_skulist_fail1(self):
        Id = {"goodsId": 2147483648}
        result = SendHttp().sent_get(self.url, Id)
        print(result)
    def test_skulist_fail2(self):
        Id = {"goodsId": 9999}
        result = SendHttp().sent_get(self.url, Id)
        print (result)
    def test_skulist_fail3(self):
        Id = {"goodsId":"1"}
        result = SendHttp().sent_get(self.url, Id)
        print(result)

if __name__=='__main__':
    unittest.main()