package api.wingchat.wingchatapi.cqrsdemo1.v2.domain;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Address;
import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Contact;
import lombok.Data;

import java.util.Set;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.domain 
  File Name    : User 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class UserV2 {

  private String userId;
  private String firstName;
  private String lastName;
  private Set<Contact> contacts;
  private Set<Address> addresses;

  public UserV2(String userId, String firstName, String lastName) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
