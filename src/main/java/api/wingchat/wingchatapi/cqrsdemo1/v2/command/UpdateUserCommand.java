package api.wingchat.wingchatapi.cqrsdemo1.v2.command;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Address;
import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Contact;
import lombok.Data;

import java.util.Set;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.command
  File Name    : CreateUserCommand 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class UpdateUserCommand {
  private String userId;
  private Set<Address> addresses;
  private Set<Contact> contacts;
}
