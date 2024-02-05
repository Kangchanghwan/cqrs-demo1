package api.wingchat.wingchatapi.cqrsdemo1.v1.service;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Address;
import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Contact;
import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.UserV1;
import api.wingchat.wingchatapi.cqrsdemo1.v1.repository.UserRepository;
import lombok.AllArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.service 
  File Name    : UserService 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@AllArgsConstructor
public class UserService {
  private UserRepository repository;

  public void createUser(String userId, String firstName, String lastName) {
    UserV1 userV1 = new UserV1(userId, firstName, lastName);
    repository.addUser(userId, userV1);
  }

  public void updateUser(String userId, Set<Contact> contacts, Set<Address> addresses) {
    UserV1 userV1 = repository.getUser(userId);
    userV1.setContacts(contacts);
    userV1.setAddresses(addresses);
    repository.addUser(userId, userV1);
  }

  public Set<Contact> getContactByType(String userId, String contactType) {
    UserV1 userV1 = repository.getUser(userId);
    Set<Contact> contacts = userV1.getContacts();
    return contacts.stream()
        .filter(c -> c.getType().equals(contactType))
        .collect(Collectors.toSet());
  }

  public Set<Address> getAddressByRegion(String userId, String state) {
    UserV1 userV1 = repository.getUser(userId);
    Set<Address> addresses = userV1.getAddresses();
    return addresses.stream()
        .filter(a -> a.getState().equals(state))
        .collect(Collectors.toSet());
  }

}
