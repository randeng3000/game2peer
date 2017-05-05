package gameserver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;

import game2peer.utility.MD5;
import game2peer.utility.StringUtility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
        test.sendPayment();
	}

	public void sendPayment()
	{
       StringBuffer url = new StringBuffer();
       //url.append("http://localhost:8080/greeting");
       url.append("http://localhost:8080/paymentCallback");
	   MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
	   HttpClient httpClient = new HttpClient(connectionManager);
	   
	   httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
	   PostMethod postMethod = null;
	   try {
		 postMethod = new PostMethod(url.toString());
		 
		 String orderId = StringUtility.generateUuid();
		 String gameCode = "55b461fb8f0a439f90edeceb719da0cb";
		 String loginName = "test";
		 
		 DateFormat fmt = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		 fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		 String createTime = fmt.format(new Date());
		 
		 String amount = "500.01";
		 String currency = "CNY";
		 String key = "bbd3d22d0c734414b834df91b74e18f9";
		 String signature = this.getSignature(orderId, gameCode, loginName, createTime, amount, currency, key);
		 
		 postMethod.addParameter("orderId", orderId);
		 postMethod.addParameter("gameCode", gameCode);
		 postMethod.addParameter("loginName", loginName);
		 postMethod.addParameter("createTime", createTime);
		 postMethod.addParameter("amount", amount);
		 postMethod.addParameter("currency", currency);
		 postMethod.addParameter("signature", signature);
		 
		 httpClient.executeMethod(postMethod);

		 String response = postMethod.getResponseBodyAsString();
		 response = response.trim();
		 System.out.println(response);
	   }
	   catch (Exception e)
	   {
		   
	   }
    }
	
	public String getSignature(String orderId, String gameCode, String loginName, String createTime, String amount, String currency, String key)
	{
		String s = orderId+gameCode+loginName+createTime+amount+currency+key; 
		return MD5.getMD5String(s);
	}
}
