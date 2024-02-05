package api.wingchat.wingchatapi.cqrsdemo1.v1.repository;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.UserV1;

import java.util.HashMap;
import java.util.Map;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.repository 
  File Name    : UserRepository 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
public class UserRepository {
  private Map<String, UserV1> store = new HashMap<>();

  public UserV1 getUser(String userId) {
    return store.get(userId);
  }
  public void addUser(String userId, UserV1 userV1) {
    this.store.put(userId, userV1);
  }
}
