package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class EmailTest {

    @Test
    public void testSendEmailReturnsEmailBody(){

       // EmailClient emailClient = new EmailClient();
        Email emailInterface = Mockito.mock(Email.class);
        Mockito.when(emailInterface.getEmailBody()).thenReturn("I have a great time with my students");

       // String bodySendBackFromServer = emailClient.sendEmail(emailInterface);
        String body =emailInterface.getEmailBody();
        Assert.assertEquals("I have a great time with my student",body);

    }

}