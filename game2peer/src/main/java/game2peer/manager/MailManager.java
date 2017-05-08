package game2peer.manager;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailManager 
{
	@Autowired
	private GlobalValueManager globalValueManager;
	private final static String SYNC_KEY = "SYNC_KEY";
	
	
	public boolean sendMailTo(String emailaddr, String title, String content) {
		boolean flag = true;
        
		// 建立邮件会话
		Properties pro = new Properties();
	
		pro.put("mail.smtp.host", "smtp.mailgun.org");
		pro.put("mail.smtp.starttls.enable", "true");
	    pro.put("mail.smtp.auth", "true"); // 通过服务器验证
	    pro.put("mail.smtp.port", "587");
		pro.setProperty("mail.smtp.timeout", "60000");
		pro.setProperty("mail.smtp.connectiontimeout", "60000");
		
		Session s = Session.getInstance(pro); // 根据属性新建一个邮件会话
	    
		// s.setDebug(true);

		// 由邮件会话新建一个消息对象
		MimeMessage message = new MimeMessage(s);

		// 设置邮件
		InternetAddress fromAddr = null;
		InternetAddress toAddr = null;
		Transport transport = null;
		try {
		    fromAddr = new InternetAddress(globalValueManager.getValue("sendmail.user")); // 邮件发送地址
			message.setFrom(fromAddr); // 设置发送地址

			toAddr = new InternetAddress(emailaddr); // 邮件接收地址
			message.setRecipient(Message.RecipientType.TO, toAddr); // 设置接收地址

			message.setSubject(title); // 设置邮件标题
			StringBuffer sb = new StringBuffer();
			sb.append(content);
			
			// sb.append(url.trim());
			message.setText(sb.toString(), "UTF-8", "HTML"); // 设置邮件正文
			message.setSentDate(new Date()); // 设置邮件日期
			message.saveChanges(); // 保存邮件更改信息
			transport = s.getTransport("smtp");

		    transport.connect(globalValueManager.getValue("sendmail.user"), globalValueManager.getValue("sendmail.password"));
			transport.sendMessage(message, message.getAllRecipients()); // 发送邮件
			
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;// 发送失败
		}
		finally
		{
			if (transport != null)
			{	
				try {
					transport.close();  // 关闭
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					flag = false;// 发送失败
				}
			}	
		}
		
		return flag;
	}
}
