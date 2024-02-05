package api.wingchat.wingchatapi.cqrsdemo1.v1.domain;


import lombok.Data;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.domain 
  File Name    : Address 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class Address {

  private String city;
  private String state;
  private String postCode;

  public Address(String city, String state, String postCode) {
    this.city = city;
    this.state = state;
    this.postCode = postCode;
  }

  public String getPostcode() {
    return this.postCode;
  }
}
