package api.wingchat.wingchatapi.cqrsdemo1.v1.domain;


import lombok.Data;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.domain 
  File Name    : Contact 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class Contact  {

  private String type;
  private String detail;

  public Contact(String type, String detail) {
    this.type = type;
    this.detail = detail;
  }
}
