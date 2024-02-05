package api.wingchat.wingchatapi.cqrsdemo1.v2.command;


import lombok.Data;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.command
  File Name    : CreateUserCommand 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@Data
public class CreateUserCommand {
  private String userId;
  private String firstName;
  private String lastName;
}
