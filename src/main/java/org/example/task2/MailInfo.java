package org.example.task2;

public class MailInfo {
    private Client client;
    private MailCode mailcode;

    public MailInfo(Client client,MailCode mailcode){
        this.client = client;
        this.mailcode = mailcode;
    }
    @Override
    public String toString(){
        return "The information about the email - {"+"client ->"+client+" , the code of the mail->"+ mailcode+"}";
    }
}
