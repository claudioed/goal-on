package com.claudioliveira.goal.on.domain.application;

import com.claudioliveira.goal.on.domain.template.Question;
import lombok.Data;

/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
@Data
public class Answer {

  Question question;

  String answer;

}
