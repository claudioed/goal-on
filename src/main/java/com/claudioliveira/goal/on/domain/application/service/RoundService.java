package com.claudioliveira.goal.on.domain.application.service;

import com.claudioliveira.goal.on.domain.application.Round;
import com.claudioliveira.goal.on.domain.application.api.data.NewRoundRequest;
import com.claudioliveira.goal.on.domain.application.repository.RoundRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
@Service
public class RoundService {

  private final RoundRepository roundRepository;

  public RoundService(RoundRepository roundRepository) {
    this.roundRepository = roundRepository;
  }

  public Mono<Round> create(@NonNull NewRoundRequest newRoundRequest){
    return null;
  }

}
