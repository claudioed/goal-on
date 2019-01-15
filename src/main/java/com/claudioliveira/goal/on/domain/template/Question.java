package com.claudioliveira.goal.on.domain.template;

import java.util.Set;
import lombok.Data;

/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
@Data
public class Question {

  Integer order;

  String question;

  Set<String> options;

}
