package com.claudioliveira.goal.on.domain.application;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.Data;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
@Data
public class Round {

  private String id;

  private Set<Application> evaluations;

  private Set<RequestApplication> requests;

  private Application myEvaluation;

  private LocalDateTime createdAt;

}
