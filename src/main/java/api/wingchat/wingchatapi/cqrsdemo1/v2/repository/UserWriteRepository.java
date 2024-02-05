package api.wingchat.wingchatapi.cqrsdemo1.v2.repository;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.UserV1;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserV2;

import java.util.HashMap;
import java.util.Map;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.repository 
  File Name    : UserWriteRepository 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
public class UserWriteRepository {

  private Map<String, UserV2> store = new HashMap<>();

  public UserV2 getUser(String userId) {
    return store.get(userId);
  }
  public void addUser(String userId, UserV2 userV2) {
    this.store.put(userId, userV2);
  }
}
