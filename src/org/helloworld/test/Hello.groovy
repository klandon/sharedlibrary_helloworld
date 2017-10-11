package org.helloworld;

class SayHello implements Serializable
{
  String messageToSay = "Default Hello World Message";


  Hello(string newMessage)
  {
    this.messageToSay = newMessage;
  }

  SayHello()
  {
    println(messageToSay);
  }

}
