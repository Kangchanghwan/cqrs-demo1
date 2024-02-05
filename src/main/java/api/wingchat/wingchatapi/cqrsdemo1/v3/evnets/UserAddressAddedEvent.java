package api.wingchat.wingchatapi.cqrsdemo1.v3.evnets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
public class UserAddressAddedEvent extends Event {

    private String city;
    private String state;
    private String postCode;

}