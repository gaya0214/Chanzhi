import unittest

from Sendhttp import SendHttp
from DataProvider import readExcel
# import api2018.Common
import Common

class qgLoginTest(unittest.TestCase):

    def setUp(self):
        self.url="/common/fgadmin/login"

    # def test_login_by_para(self):
    #     sheet=readExcel(r"D:\demo\userdata.xlsx", 0)
    #     for i in range(sheet.nrows):
    #         user = {"phoneArea": "86", "phoneNumber": sheet.cell_value(i, 0), "password": "netease123"}
    #         result = SendHttp().run_http(self.url, "POST", user)
    #         print(result)
    #         self.assertEqual(result['code'], 200)

#登录成功
    def test_login_success(self):
        user={"phoneArea":"86","phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'],200)
        self.assertEqual(result['message'], 'success')

#登录失败（phoneArea参数类型不正确）
    def test_login_fail1(self):

        user={"phoneArea":86,"phoneNumber":"20000000000","password":"netease1231"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#登录失败（phoneNumber参数类型不正确）
    def test_login_fail2(self):

        user={"phoneArea":"86","phoneNumber":20000000000,"password":"netease1231"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

# 登录失败（password参数类型不正确）
    def test_login_fail3(self):

        user = {"phoneArea": "86", "phoneNumber": "20000000000", "password": 123456}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#登录失败（缺少phoneArea参数）
    def test_login_fail4(self):
        user={"phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#登录失败（缺少phoneNumber参数）
    def test_login_fail5(self):
        user={"phoneArea":"86","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#登录失败（缺少password参数）
    def test_login_fail6(self):
        user={"phoneArea":"86","phoneNumber":"20000000000"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

#登录失败（电话号码超过11位）
    def test_login_fail7(self):
        user={"phoneArea":"86","phoneNumber":"200000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

# 登录失败（用户不存在）
    def test_login_fail8(self):
        user = {"phoneArea": "86", "phoneNumber": "10086", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)

#登录失败（密码错误）
    def test_login_fail9(self):

        user={"phoneArea":"86","phoneNumber":"20000000000","password":"netease1231"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
        self.assertEqual(result['code'], 400)

if __name__=='__main__':
    unittest.main()