import unittest
from QingGuo.Utils.Sendhttp import SendHttp
from QingGuo.Utils import Common
import json
#作者：杨斯媛
class qgLoginTest(unittest.TestCase):
    def setUp(self):
        self.url="/fgadmin/orders/submit"
    def test_submit_success(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail1(self):
        sub={"skuIds":1,
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail2(self):
        sub={"skuIds":"1",
             "receiverName":571,
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail3(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":20000000004,
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail4(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":571,
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail5(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":571,
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail6(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":571,
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail7(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":571,
             "area":"鼓楼区",
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail8(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":571,
             "transportFee":"7.0"}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
    def test_submit_fail9(self):
        sub={"skuIds":"1",
             "receiverName":"李四",
             "cellPhone":"20000000004",
             "addressDetail":"南京大学",
             "province":"江苏省",
             "city":"南京市",
             "area":"鼓楼区",
             "transportFee":7.0}
        result=SendHttp().run_http(self.url,"POST",sub)
        print(result)
if __name__=='__main__':
    unittest.main()