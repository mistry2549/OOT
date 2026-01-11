package oot.b6709624.week10.lab.lab1;

import java.util.Scanner;

class Phone {
  private String phoneNumber;
  private String password;

  public Phone(String phoneNumber, String password){
      this.phoneNumber = phoneNumber;
      this.password = password;
  }

  public String getphoneNumber(){
    return phoneNumber;

  }

  public String getpassword(){
    return password;
  }

  public String getMaskedPhoneNumber(){
    return "XXX-XXX-" + phoneNumber.substring(6);
  }
}
