import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgAddAddress(unittest.TestCase):

    def setUp(self):
        self.url="/fgadmin/address/new"

    def test_Add_by_para(self):
        sheet=readExcel(r"D:\demo\userdata.xlsx", 0)
        for i in range(sheet.nrows):
            user = {"receiverName": "sheet.cell_value(i,0)", "cellPhone": sheet.cell_value(i, 1), "addressDetail": sheet.cell_value(i, 2),"province":sheet.cell_value(i, 3),"city":sheet.cell_value(i, 4),"area":sheet.cell_value(i,5)}
            result = SendHttp().run_http(self.url, "POST", user)
            print(result)
            self.assertEqual(result['code'], 200)

#添加收货地址成功
    def test_add_success(self):
        user={"receiverName": "张三", "cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'],200)
        self.assertEqual(result['message'], 'success')

#添加收货地址失败（receiveName参数类型不正确）
    def test_add_fail1(self):
        user={"receiverName": 123, "cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'],400)

#添加收货地址失败（cellPhone参数类型不正确）
    def test_add_fail2(self):
        user={"receiverName": "张三", "cellPhone":12345678901, "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（addressDetail参数类型不正确）
    def test_add_fail3(self):
        user={"receiverName": 123, "cellPhone":"12345678901", "addressDetail":123,"province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（province参数类型不正确）
    def test_add_fail4(self):
        user={"receiverName": 123, "cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（city参数类型不正确）
    def test_add_fail5(self):
        user={"receiverName": 123, "cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":123,"area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（area参数类型不正确）
    def test_add_fail6(self):
        user={"receiverName": 123, "cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":123}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（缺少receiverName参数）
    def test_add_fail7(self):
        user={"cellPhone":"12345678901", "addressDetail":"浙江大学","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

# 添加收货地址失败（缺少cellPhone参数）
    def test_add_fail8(self):
        user = {"receiverName": "张三", "addressDetail": "浙江大学", "province": "浙江省", "city": "杭州市", "area": "滨江区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

    #添加收货地址失败（缺少addressDetail参数）
    def test_add_fail9(self):
        user={"receiverName":"张三","cellPhone":"12345678901","province":"浙江省","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（缺少province参数）
    def test_add_fail10(self):
        user={"receiverName":"张三","cellPhone":"12345678901","addressDetail":"浙江大学","city":"杭州市","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（缺少city参数）
    def test_add_fail11(self):
        user={"receiverName":"张三","cellPhone":"12345678901","addressDetail":"浙江大学","province":"浙江省","area":"滨江区"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（缺少area参数）
    def test_add_fail12(self):
        user={"receiverName":"张三","cellPhone":"12345678901","addressDetail":"浙江大学","province":"浙江省","city":"杭州市"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址成功，直辖市
    def test_add_success2(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "复旦大学", "province": "上海市","city": "上海市", "area": "黄埔区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 200)
        self.assertEqual(result['message'], 'success')

#添加收货地址失败（区不匹配）
    def test_add_fail13(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "江苏省","city": "南京市", "area": "西湖区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（市不匹配）
    def test_add_fail14(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "浙江省","city": "南京市", "area": "西湖区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（市、区不匹配）
    def test_add_fail15(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "江苏省","city": "杭州市", "area": "西湖区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（省、市、区不匹配）
    def test_add_fail16(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "南京大学", "province": "安徽省","city": "南京市", "area": "西湖区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加已存在收货地址
    def test_add_fail17(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result1 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result2 = SendHttp().run_http(self.url, "POST", user)
        print(result2)
        self.assertEqual(result2['code'], 400)

#添加超过6个收货地址
    def test_add_fail18(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result1 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "李四", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result2 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "王五", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result3 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "章大", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result4 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "李二", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result5 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "王六", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result6 = SendHttp().run_http(self.url, "POST", user)
        user = {"receiverName": "赵七", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省","city": "杭州市", "area": "滨江区"}
        result7 = SendHttp().run_http(self.url, "POST", user)
        print(result7)
        self.assertEqual(result7['code'], 400)

#未登录时添加收货地址失败
    def test_add_fail19(self):
        user = {"receiverName": "张三", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                "city": "杭州市", "area": "滨江区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（receiverName参数为""）
    def test_add_fail20(self):
        user = {"receiverName": "", "cellPhone": "12345678901", "addressDetail": "浙江大学", "province": "浙江省",
                "city": "杭州市", "area": "滨江区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#添加收货地址失败（cellPhone参数为null）
    def test_add_fail21(self):
        user = {"receiverName": "张三", "cellPhone":"", "addressDetail": "浙江大学", "province": "浙江省",
                "city": "杭州市", "area": "滨江区"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

if __name__=='__main__':
    unittest.main()