package com.claudioliveira.goal.on.infra.web.application.api;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author claudioed on 2019-01-20.
 * Project goal-on
 */
@Configuration
public class RoundResourcesConfiguration {

  @Bean
  public RouterFunction<ServerResponse> roundRoutes(RoundHandler roundHandler){
    return RouterFunctions.route(POST("/rounds").and(accept(APPLICATION_JSON)),
        roundHandler::create);
  }


}
