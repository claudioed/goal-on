package com.claudioliveira.goal.on.domain.application.repository;

import com.claudioliveira.goal.on.domain.application.Round;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
public interface RoundRepository extends ReactiveCrudRepository<Round,String> {
}
