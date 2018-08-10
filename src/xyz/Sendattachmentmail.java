  package xyz;
  
import java.util.*;  
    import javax.mail.*;  
    import javax.mail.internet.*;  
    import javax.activation.*;  
      
    class Sendattachmentmail{  
     public static void main(String [] args){ 
    	 String to="eima.ahmad@techtreeit.com";//change accordingly  
    	  final String user="chandan.roy@techtreeit.com";//change accordingly  
    	  final String password="chndnroy123*";//change accordingly  
      
    	 Properties properties = System.getProperties();  
    	 properties.put("mail.smtp.host", "smtp.gmail.com");    
         properties.put("mail.smtp.socketFactory.port", "465");    
         properties.put("mail.smtp.socketFactory.class",    
                   "javax.net.ssl.SSLSocketFactory");    
         properties.put("mail.smtp.auth", "true");    
         properties.put("mail.smtp.port", "465");
    	  
    	  Session session = Session.getDefaultInstance(properties,  
    			   new javax.mail.Authenticator() {  
    			   protected PasswordAuthentication getPasswordAuthentication() {  
    			   return new PasswordAuthentication(user,password);  
    			   }  
    	  });  
    	  try{  
    		    MimeMessage message = new MimeMessage(session);  
    		    message.setFrom(new InternetAddress(user));  
    		    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
    		    message.setSubject("Selenium result");  
    		    
    		    
    		    BodyPart messageBodyPart1 = new MimeBodyPart();  
  
    		    messageBodyPart1.setText("Hi sir, please find the status ");  

    		    
    		    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
    		    
    		    String filename = "/home/ttuser10/workspace/TTNC/test-output/emailable-report.html";//change accordingly  
    		    DataSource source = new FileDataSource(filename);  
    		    messageBodyPart2.setDataHandler(new DataHandler(source));  
    		    messageBodyPart2.setFileName(filename);  
    		    
    		    Multipart multipart = new MimeMultipart();  
    		    multipart.addBodyPart(messageBodyPart1);  
    		    multipart.addBodyPart(messageBodyPart2);  
    		    
    		    message.setContent(multipart );  
    		    
    		    Transport.send(message);  
    		    
    		    System.out.println("message sent....");  
    		    }catch (MessagingException ex) {ex.printStackTrace();}  
     }
     
     
    }