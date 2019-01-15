package com.claudioliveira.goal.on.domain.application;

import com.claudioliveira.goal.on.domain.user.User;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
@Data
public class Application {

  @Id
  String id;

  User owner;

  User to;

  Set<Answer> answers;

  String refTemplate;

  LocalDateTime at;

}
