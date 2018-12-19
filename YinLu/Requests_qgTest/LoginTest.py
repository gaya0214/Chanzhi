import  unittest
from api2018.Sendhttp import SendHttp
class qgLogin(unittest.TestCase):

    def setUp(self):
        self.url="/common/fgadmin/login"

    def test_login_success(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 200)
        self.assertEqual(result['message'], 'success')
    def test_login_fail1(self):
        user = {"phoneArea": 86, "phoneNumber": "200000000042", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail2(self):
        user = {"phoneArea": "86", "phoneNumber": 200000000042, "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail3(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": 123456}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail4(self):
        user = {"phoneNumber": "200000000042", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail5(self):
        user = {"phoneArea": "86", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail6(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail7(self):
        user = {"phoneArea": "86", "phoneNumber": "123456789012", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail8(self):
        user = {"phoneArea": "86", "phoneNumber": "200000000042", "password": "wrong"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


    def test_login_fail9(self):
        user = {"phoneArea": "86", "phoneNumber": "10086", "password": "netease123"}
        result = SendHttp().run_http(self.url, "POST", user)
        print(result)
        self.assertEqual(result['code'], 400)


if __name__=='__main__':
    unittest.main()