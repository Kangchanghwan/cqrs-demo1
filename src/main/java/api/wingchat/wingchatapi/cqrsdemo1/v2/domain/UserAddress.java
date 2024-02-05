package api.wingchat.wingchatapi.cqrsdemo1.v2.domain;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Address;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.repository 
  File Name    : UserAddress 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class UserAddress {

  private Map<String, Set<Address>> addressByRegion = new HashMap<>();

}
