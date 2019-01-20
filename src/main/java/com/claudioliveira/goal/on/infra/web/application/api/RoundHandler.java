package com.claudioliveira.goal.on.infra.web.application.api;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.created;

import com.claudioliveira.goal.on.domain.application.Round;
import com.claudioliveira.goal.on.domain.application.api.data.NewRoundRequest;
import com.claudioliveira.goal.on.domain.application.service.RoundService;
import java.util.UUID;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
@Component
public class RoundHandler {

  private final RoundService roundService;

  public RoundHandler(RoundService roundService) {
    this.roundService = roundService;
  }

  public Mono<ServerResponse> create(ServerRequest request) {
    final UUID id = UUID.randomUUID();
    final Mono<NewRoundRequest> newRoundRequest = request.bodyToMono(NewRoundRequest.class);
    return created(UriComponentsBuilder.fromPath("rounds/" + id).build().toUri())
        .contentType(APPLICATION_JSON)
        .body(fromPublisher(
            newRoundRequest.map(roundRequest -> roundRequest).flatMap(this.roundService::create),
            Round.class));
  }

}
