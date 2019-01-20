/**
 * @author claudioed on 2019-01-14.
 * Project goal-on
 */
open module goal.on {

  requires jdk.unsupported;
  requires spring.boot.autoconfigure;
  requires spring.boot;
  requires spring.data.commons;
  requires spring.beans;
  requires spring.context;
  requires spring.core;
  requires spring.web;
  requires spring.webflux;
  requires spring.boot.starter.webflux;
  requires lombok;
  requires reactor.core;
  requires spring.boot.starter.reactor.netty;
  requires spring.boot.starter.data.mongodb.reactive;
  requires spring.data.mongodb;

}