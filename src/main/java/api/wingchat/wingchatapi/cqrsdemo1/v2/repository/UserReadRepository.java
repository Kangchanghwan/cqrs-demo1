package api.wingchat.wingchatapi.cqrsdemo1.v2.repository;


import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserAddress;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserContact;

import java.util.HashMap;
import java.util.Map;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.repository 
  File Name    : UserReadRepository 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */

public class UserReadRepository {
  private Map<String, UserAddress> userAddress = new HashMap<>();
  private Map<String, UserContact> userContact = new HashMap<>();
  // accessors and mutators


  public Map<String, UserAddress> getUserAddress() {
    return userAddress;
  }

  public Map<String, UserContact> getUserContact() {
    return userContact;
  }
  public UserContact getUserContact(String userId) {
    return userContact.get(userId);
  }
  public UserAddress getUserAddress(String userId) {
    return userAddress.get(userId);
  }

  public void addUserContact(String userId, UserContact userContact) {
    this.userContact.put(userId,userContact);
  }

  public void addUserAddress(String userId, UserAddress userAddress) {
    this.userAddress.put(userId,userAddress);
  }
}
