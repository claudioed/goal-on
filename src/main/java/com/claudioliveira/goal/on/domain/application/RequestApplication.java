package com.claudioliveira.goal.on.domain.application;

import com.claudioliveira.goal.on.domain.user.User;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
@Data
public class RequestApplication {

  private String id;

  private LocalDateTime requestedAt;

  private User forUser;

  private User requester;

  private String withTemplate;

}
