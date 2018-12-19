package qgtest;

import org.testng.annotations.Test;

public class GetTransportFeeTest {
	@Test
	public void fee1() throws Exception {
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_滨江区";
		String result=HtmlUnit.doGet(url);
		System.out.println(result);
	}
	@Test
	public void fee2() throws Exception {
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=\'1\'&addressDetail=浙江省_杭州市_滨江区";
		String result=HtmlUnit.doGet(url);
		System.out.println(result);
	}
}
