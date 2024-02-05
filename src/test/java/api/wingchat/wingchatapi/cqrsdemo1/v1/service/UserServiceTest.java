package api.wingchat.wingchatapi.cqrsdemo1.v1.service;

import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.UserV1;
import api.wingchat.wingchatapi.cqrsdemo1.v1.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v1.service 
  File Name    : UserServiceTest 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
class UserServiceTest {

  private final UserRepository userRepository =  new UserRepository();
  private final UserService userService = new UserService(userRepository);

  @Test
  @DisplayName("유저 생성 테스트")
  void createUser(){
    String firstName = "강";
    String lastName = "창환";
    String userId = "1";
    userService.createUser(userId, firstName, lastName);

    UserV1 user = userRepository.getUser(userId);
    Assertions.assertEquals(user.getFirstName(), firstName);
    Assertions.assertEquals(user.getLastName(), lastName);
  }

}