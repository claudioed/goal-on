package com.claudioliveira.goal.on.domain.template.repository;

import com.claudioliveira.goal.on.domain.template.Template;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
public interface TemplateRepository extends ReactiveCrudRepository<Template,String> {

}
