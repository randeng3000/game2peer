package game2peer.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtility {
	
	private final static SimpleDateFormat orderSdf = new SimpleDateFormat("yyyyMMdd");
	private final static String SYNC_KEY = "SYNC_KEY";
	
	public String createOrderNumber() {
		synchronized (SYNC_KEY) {
			return orderSdf.format(new Date())
					+ String.valueOf(new Random().nextDouble())
							.substring(2, 13);
		}

	}
	
	public static String generateUuid() {
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replaceAll("-", "");
		return uuid;
	}
	
	public static int getProductCode(String productId)
	{
		if (productId.length() > 7)
		{
			String code = productId.substring(7);
			//System.out.print("code:" + code);
			return Integer.valueOf(code);
		}
		return 0;
	}

	/**
	 * 生成6位的验证码
	 * 
	 * @return
	 */
	public static int generateCaptcha() {
		int result = (int) (Math.random() * (999999 - 100000) + 100000);
		return result;
	}

	public static String getValueWithoutNull(String str) {
		if (str == null) {
			return "";
		}
		return str;
	}

	/**
	 * 是否手机号码
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean isPhoneNO(String phone) {

		if (isEmpty(phone)) {
			return false;
		}

		Pattern p = Pattern
		.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(phone);

		return m.matches();

	}

	/**
	 * 读取指定路径文本信息
	 * 
	 * @param filePath
	 * @param encoding
	 * @param lineFeed
	 * @return
	 */
	public static String readFile2Text(String filePath, String encoding) {
		if (filePath == null) {
			return null;
		}

		StringBuffer result = new StringBuffer();
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String text = null;
				while ((text = bufferedReader.readLine()) != null) {
					result.append(text);
					result.append("\r\n");
				}
				read.close();
			} else {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result.toString();
	}

	/**
	 * 是否空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null || str.trim().equals("")) {
			return true;
		}
		return false;
	}
	

	/**
	 * 邮箱验证
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		if (isEmpty(email)) {
			return false;
		}
		Pattern p = Pattern
				.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
		Matcher m = p.matcher(email);

		return m.matches();
	}

	public static boolean hasEmpty(String... strs){
		if (strs == null || strs.length==0){
			return true;
		}
		boolean result = false;
		for(String str:strs){
			if (str == null || str.trim().equals("")) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public static boolean hasSpecialChar(String str)
	{
		if (str == null)
		{
			return true;
		}
		boolean result = false;
		String[] c = {"%", "$", "*", "\"", "'", "<", ">", "/","\\","?", " "};
		for (int i = 0; i < c.length; i++)
		{
			if (str.contains(c[i])) 
			{
				result = true;
				break;
			}
		}
		return result;
	}
	
	/*
	public static Map<String, Object> json2Map(JSONObject json)
	{
		Map <String, Object> m = new HashMap<String, Object>();
		
		for (Iterator<String> keys = json.keys(); keys.hasNext();)
		{
			String key = keys.next();
			Object o;
			try {
				o = json.get(key);
				m.put(key, o);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return m;
	}*/
	
	public static void main(String arg[]) {
		System.out.println(readFile2Text("c:/aa.txt", "utf-8"));
	}
}
