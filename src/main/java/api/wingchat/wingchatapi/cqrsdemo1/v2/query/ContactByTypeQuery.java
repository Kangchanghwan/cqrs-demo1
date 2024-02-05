package api.wingchat.wingchatapi.cqrsdemo1.v2.query;


import lombok.Data;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.query 
  File Name    : ContactByTypeQuery 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class ContactByTypeQuery {
  private String userId;
  private String contactType;
}
