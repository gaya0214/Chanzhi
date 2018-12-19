import os
import smtplib
from email.header import Header
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText


def send_email(send_from,send_to,auth_code,att_file,server="smtp.126.com"):
    subject = '最新的测试报告'
    sendfile = open(att_file, 'rb').read()
    #邮件附件的内容
    att = MIMEText(sendfile, 'base64', 'utf-8')
    att["Content-Type"] = 'application/octet-stream'
    #定义附件的名称
    att["Content-Disposition"] = 'attachment; filename="result.html"'

    # 邮件正文的内容
    msg = MIMEMultipart('related')
    msg['Subject'] = Header(subject, 'utf-8')
    msg.attach(att)
    msg.attach(MIMEText('<html><h1>请查收测试报告！</h1></html>', 'html', 'utf-8'))
    msg['from'] = send_from
    msg['to'] = send_to
    smtp = smtplib.SMTP()
    smtp.connect(server)
    smtp.login(send_from, auth_code)
    smtp.sendmail(send_from, send_to, msg.as_string())
    smtp.quit()




def send_report():
    send_f = "13180686518@163.com"
    send_t = "1138322644@qq.com"
    auth_code="woshiliuqi0214"
    files="D:\\pythonCode\\RequestsDemo1112\\report"
    #根据修改日期找到最新生成的文件，作为附件上传
    lists = os.listdir(files)
    lists.sort(key=lambda fn: os.path.getmtime(files+"\\"+fn))
    file_new = os.path.join(files,lists[-1])
    send_email(send_f, send_t, auth_code, file_new)

if __name__=="__main__":
    send_report()







