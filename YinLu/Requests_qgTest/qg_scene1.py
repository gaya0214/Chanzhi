import unittest
from api2018 import Common
from api2018.Sendhttp import SendHttp

class qgTest(unittest.TestCase):

    def test_scene1(self):
        sku_url="/common/skuList"

        sku1_result=SendHttp().sent_get(sku_url)
        print(sku1_result)
        sku2_rusult=SendHttp().sent_get(sku_url,"goodsId=1")
        print(sku2_rusult)
        sku3_rusult=SendHttp().sent_get(sku_url,"goodsId=2")
        print(sku3_rusult)
        sku4_result=SendHttp().sent_get(sku_url,"goodsId=3")
        print(sku4_result)

if __name__ == '__main__':
    unittest.main()