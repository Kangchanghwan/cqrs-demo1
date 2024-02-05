package api.wingchat.wingchatapi.cqrsdemo1.v2.projection;


import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Address;
import api.wingchat.wingchatapi.cqrsdemo1.v1.domain.Contact;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserAddress;
import api.wingchat.wingchatapi.cqrsdemo1.v2.domain.UserContact;
import api.wingchat.wingchatapi.cqrsdemo1.v2.query.AddressByRegionQuery;
import api.wingchat.wingchatapi.cqrsdemo1.v2.query.ContactByTypeQuery;
import api.wingchat.wingchatapi.cqrsdemo1.v2.repository.UserReadRepository;
import lombok.AllArgsConstructor;

import java.util.Set;

/*
  Package Name : api.wingchat.wingchatapi.cqrsdemo1.v2.projection 
  File Name    : UserProjection 
  Author       : gangchanghwan 
  Created Date : 2024/02/05 
  Description  : 
 */
@AllArgsConstructor
public class UserProjection {
  private UserReadRepository userReadRepository;

  public Set<Contact> handle(ContactByTypeQuery query){
    UserContact userContact = userReadRepository.getUserContact().get(query.getUserId());
    return userContact.getContactByType().get(query.getContactType());
  }
  public Set<Address> handle(AddressByRegionQuery query) {
    UserAddress userAddress = userReadRepository.getUserAddress().get(query.getUserId());
    return userAddress.getAddressByRegion().get(query.getState());
  }
}
