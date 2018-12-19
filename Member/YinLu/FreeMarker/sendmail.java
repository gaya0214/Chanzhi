package com.mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

public class sendmail {
	
	@Test
     public void send() throws Exception{
         //0.1 确定连接位置
         Properties props = new Properties();
         //获取163邮箱smtp服务器的地址，
         props.setProperty("mail.host", "smtp.126.com");
         //是否进行权限验证。
         props.setProperty("mail.smtp.auth", "true");               
         //0.2确定权限（账号和密码）
         Authenticator authenticator = new Authenticator() {
             @Override
             public PasswordAuthentication getPasswordAuthentication() {
                 //填写自己的163邮箱的登录帐号和授权密码，授权密码的获取，在后面会进行讲解。
                 return new PasswordAuthentication("yl1998@126.com","yl1998");
             }
         };
         Session session = Session.getDefaultInstance(props, authenticator);
         //2 创建消息
         Message message = new MimeMessage(session);
         // 2.1 发件人        xxx@163.com 我们自己的邮箱地址，就是名称
         message.setFrom(new InternetAddress("yl1998@126.com"));

         message.setRecipient(RecipientType.TO, new InternetAddress("1981183186@qq.com"));
         // 2.3 主题（标题）
         message.setSubject("邮件的标题");
          
         String spath="D:\\java1\\auto2018\\auto2018\\src\\com\\freemark\\test.html";
         InputStreamReader isReader = null;
         BufferedReader bufReader = null;
         StringBuffer buf = new StringBuffer();
         try {
            File file = new File(spath);
            isReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            bufReader = new BufferedReader(isReader);
            String data = null;
            while((data=bufReader.readLine()) != null){
                 buf.append(data).append("\n");
             }
         } catch (Exception e) {
           //TODO 处理异常
            } finally {
             //TODO 关闭流
            	if(isReader!=null){
    				try {
    					isReader.close();
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
    			}
    			if(bufReader!=null){
    				try {
    					bufReader.close();
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
    			}
            }
         
//           return buf.toString(); 


         message.setContent(buf.toString(), "text/html;charset=UTF-8");               
         //3发送消息
         Transport.send(message);
         System.out.println("success");
        }
}
       

