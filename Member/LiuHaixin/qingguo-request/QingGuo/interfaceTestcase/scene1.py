import unittest

from Utils.Sendhttp import SendHttp


class scene1(unittest.TestCase):
    def setUp(self):
        self.url = "/common/skuList"
    def test_skulist_success1(self):
        result = SendHttp().sent_get(self.url)
        print(result)
    def test_skulist_success2(self):
        Id = {"goodsId": 1}
        result = SendHttp().sent_get(self.url, Id)
        print(result)
    def test_skulist_success3(self):
        Id = {"goodsId": 2}
        result = SendHttp().sent_get(self.url, Id)
        print(result)
    def test_skulist_success4(self):
        Id = {"goodsId": 3}
        result = SendHttp().sent_get(self.url, Id)
        print(result)
if __name__=='__main__':
    unittest.main()