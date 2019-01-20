package com.claudioliveira.goal.on.domain.application.api.data;

import lombok.Data;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
@Data
public class NewRoundRequest {

  private String refTemplateId;

  private String forUser;

}
