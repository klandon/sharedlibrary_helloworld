package org.helloworld.test;
import java.util.*;

class Hello implements Serializable
{
  String messageToSay = 'Default Hello World Message';


  Hello(String newMessage)
  {
    this.messageToSay = newMessage;
  }

  void SayHello()
  {
    System.out.print(messageToSay);
  }

}
