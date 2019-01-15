package com.claudioliveira.goal.on.domain.template;

import java.util.Set;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
@Data
public class Template {

  @Id
  String id;

  String name;

  Set<Question> questions;

}
