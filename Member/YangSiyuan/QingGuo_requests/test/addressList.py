
from code import Common

from code.Sendhttp import SendHttp
#提交订单

class addressList():
    def setUp(self):
        self.url="/fgadmin/address/list"
    def addresslist_test(self):
        result = SendHttp().sent_get(self.url)
        print(result)