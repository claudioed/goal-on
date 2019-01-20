package com.claudioliveira.goal.on.domain.user;

import com.claudioliveira.goal.on.domain.application.Application;
import java.util.Set;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
@Data
public class User {

  @Id
  String id;

  String username;

  String name;

  Role role;

  Set<Application> evaluations;

}
