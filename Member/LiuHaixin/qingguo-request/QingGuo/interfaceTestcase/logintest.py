import unittest

from Utils.DataProvider import readExcel
from Utils.Sendhttp import SendHttp


class logintest(unittest.TestCase):
    def setUp(self):
        self.url="/common/fgadmin/login"
    def test_login_by_para(self):
        sheet =readExcel(r"D:\demo\userdata.xlsx", 0)
        for i in range(sheet.nrows):
            user = {"phoneArea": "86", "phoneNumber": sheet.cell_value(i, 0), "password": "netease123"}
            result = SendHttp().run_http(self.url, "POST", user)
            print(result)

    def test_login_success(self):
        user={"phoneArea":"86","phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url, "POST", user)
        print ( result )
    def test_login_fail1(self):
        user={"phoneArea":86,"phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
    def test_login_fail2(self):
        user={"phoneArea":"86","phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print ( result )
    def test_login_fail2(self):
        user={"phoneArea":"86","phoneNumber":20000000000,"password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
    def test_login_fail3(self):
        user={"phoneArea":"86","phoneNumber":"20000000000","password":123456}
        result=SendHttp().run_http(self.url,"POST",user)
        print ( result )
    def test_login_fail4(self):
        user={"phoneNumber":"20000000000","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print(result)
    def test_login_fail5(self):
        user={"phoneArea":"86","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print ( result )
    def test_login_fail6(self):
        user={"phoneArea":"86","phoneNumber":"20000000000"}
        result=SendHttp().run_http(self.url,"POST",user)
        print ( result )
    def test_login_fail7(self):
        user={"phoneArea":"86","phoneNumber":"123456789012","password":"netease123"}
        result=SendHttp().run_http(self.url,"POST",user)
        print ( result )
    def test_login_fail8(self):
        user={"phoneArea":"86","phoneNumber":"20000000000","password":"wrong"}
        result=SendHttp().run_http(self.url,"POST",user)
        print ( result )
    def test_login_fail9(self):
        user = {"phoneArea": "86", "phoneNumber": "10086", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user )
        print ( result )
if __name__=='__main__':
    unittest.main()