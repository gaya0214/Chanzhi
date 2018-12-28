from code.Sendhttp import SendHttp


class skulist():
    def setUp(self):
        self.url="/common/skuList"
    def skulist_test(self):
        result=SendHttp().sent_get(self.url)
        print(result)
