//import java.util.List;
//import java.util.Properties;
//
//import javax.mail.*;
//public class Email {
//
//
//    public void send(List<String> mailTo, String subject, String body)
//    {
//        //******From Gmail******//
//        // Need to "Turn on" "Access for less secure apps" of "mailFrom" email
//        // account by following given address below
//        // https://www.google.com/settings/security/lesssecureapps
//        String mailFrom = "rparbez142071@cse.uiu.ac.bd";
//        String mailPassword = "Email Password";
//        // Get the session object
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//
//
//
////		//******From other mail******//
////		String mailFrom = "noreply@ranadepto.com";
////		String mailPassword = "Email Password";
////		String host="smtp.ranadepto.com";
////		Properties props = new Properties();
////		props.put("mail.smtp.host",host);
////		props.put("mail.smtp.auth", "true");
//
//
//
//
//
//        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator()
//        {
//            protected PasswordAuthentication getPasswordAuthentication()
//            {
//                return new PasswordAuthentication(mailFrom, mailPassword);
//            }
//        });
//
//        // Compose Mail
//        try
//        {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(mailFrom));
//            for(String address:mailTo)
//            {
//                message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(address));
//            }
//            message.setSubject(subject);
//            message.setText(body);
//
//            // send message
//            Transport.send(message);
//        }
//        catch (MessagingException e)
//        {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//
//    public void send(String mailTo, String subject, String body)
//    {
//        //******From Gmail******//
//        // Need to "Turn on" "Access for less secure apps" of "mailFrom" email
//        // account by following given address below
//        // https://www.google.com/settings/security/lesssecureapps
//        String mailFrom = "rparbez142071@cse.uiu.ac.bd";
//        String mailPassword = "Email Password";
//        // Get the session object
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//
//
//
////		//******From other mail******//
////		String mailFrom = "noreply@ranadepto.com";
////		String mailPassword = "Email Password";
////		String host="smtp.ranadepto.com";
////		Properties props = new Properties();
////		props.put("mail.smtp.host",host);
////		props.put("mail.smtp.auth", "true");
//
//
//
//
//
//        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator()
//        {
//            protected PasswordAuthentication getPasswordAuthentication()
//            {
//                return new PasswordAuthentication(mailFrom, mailPassword);
//            }
//        });
//
//        // Compose Mail
//        try
//        {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(mailFrom));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo));
//            message.setSubject(subject);
//            message.setText(body);
//
//            // send message
//            Transport.send(message);
//        }
//        catch (MessagingException e)
//        {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//}
