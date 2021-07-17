package web

import io.vertx.core.Vertx
import service.openApi.OpenApiServiceVerticle
import service.openApi.validator.OpenApiMessageValidator
import storage.BugsStorage

fun main(args: Array<String>) {
    val vertx = Vertx.vertx();
    vertx.deployVerticle(ServerVerticle())
    vertx.deployVerticle(OpenApiServiceVerticle(OpenApiMessageValidator(), BugsStorage()))
}