package api.wingchat.wingchatapi.cqrsdemo1.v2.aggregate;


import api.wingchat.wingchatapi.cqrsdemo1.v2.command.CreateUserCommand;
import api.wingchat.wingchatapi.cqrsdemo1.v2.command.UpdateUserCommand;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserV2;
import api.wingchat.wingchatapi.cqrsdemo1.v2.repository.UserWriteRepository;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.aggregate 
  File Name    : UserAggregate 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
public class UserAggregate {

  private UserWriteRepository userWriteRepository;

  public UserV2 handleCreateUsersCommand(CreateUserCommand command) {
    UserV2 userV2 = new UserV2(command.getUserId(), command.getFirstName(), command.getLastName());
    userWriteRepository.addUser(userV2.getUserId(), userV2);
    return userV2;
  }
  public UserV2 handleUpdateUserCommand(UpdateUserCommand command) {
    UserV2 userV2 = userWriteRepository.getUser(command.getUserId());
    userV2.setAddresses(command.getAddresses());
    userV2.setContacts(command.getContacts());
    userWriteRepository.addUser(userV2.getUserId(), userV2);
    return userV2;
  }
}
