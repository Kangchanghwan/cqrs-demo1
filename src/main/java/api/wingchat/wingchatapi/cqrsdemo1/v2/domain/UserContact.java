package api.wingchat.wingchatapi.cqrsdemo1.v2.domain;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Contact;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.repository 
  File Name    : UserContact 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class UserContact {
  private Map<String, Set<Contact>> contactByType = new HashMap<>();
}
