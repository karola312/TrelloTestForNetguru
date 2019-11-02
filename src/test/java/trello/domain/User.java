package trello.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User
{
   private String emailAddress;
   private String name;
   private String password;
}
