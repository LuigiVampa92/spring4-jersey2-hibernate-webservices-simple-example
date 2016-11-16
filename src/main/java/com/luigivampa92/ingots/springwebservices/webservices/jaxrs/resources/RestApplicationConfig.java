package com.luigivampa92.ingots.springwebservices.webservices.jaxrs.resources;

import com.luigivampa92.ingots.springwebservices.webservices.jaxrs.resources.user.UserResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class RestApplicationConfig extends ResourceConfig {

    public RestApplicationConfig() {
        register(RequestContextFilter.class);
        register(JacksonFeature.class);
        register(UserResource.class);
    }
}
