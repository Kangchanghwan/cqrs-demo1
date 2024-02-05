package api.wingchat.wingchatapi.cqrsdemo1.v2.projector;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Address;
import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Contact;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserAddress;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserContact;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserV2;
import api.wingchat.wingchatapi.cqrsdemo1.v2.repository.UserReadRepository;
import org.apache.catalina.User;

import java.util.*;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.projector 
  File Name    : UserProjector 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
public class UserProjector {
  UserReadRepository readRepository = new UserReadRepository();
  public UserProjector(UserReadRepository readRepository) {
    this.readRepository = readRepository;
  }

  public void project(UserV2 user) {
    UserContact userContact = Optional.ofNullable(
            readRepository.getUserContact(user.getUserId()))
        .orElse(new UserContact());
    Map<String, Set<Contact>> contactByType = new HashMap<>();
    for (Contact contact : user.getContacts()) {
      Set<Contact> contacts = Optional.ofNullable(
              contactByType.get(contact.getType()))
          .orElse(new HashSet<>());
      contacts.add(contact);
      contactByType.put(contact.getType(), contacts);
    }
    userContact.setContactByType(contactByType);
    readRepository.addUserContact(user.getUserId(), userContact);

    UserAddress userAddress = Optional.ofNullable(
            readRepository.getUserAddress(user.getUserId()))
        .orElse(new UserAddress());
    Map<String, Set<Address>> addressByRegion = new HashMap<>();
    for (Address address : user.getAddresses()) {
      Set<Address> addresses = Optional.ofNullable(
              addressByRegion.get(address.getState()))
          .orElse(new HashSet<>());
      addresses.add(address);
      addressByRegion.put(address.getState(), addresses);
    }
    userAddress.setAddressByRegion(addressByRegion);
    readRepository.addUserAddress(user.getUserId(), userAddress);
  }
}
