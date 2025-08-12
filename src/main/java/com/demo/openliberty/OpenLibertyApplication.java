package com.demo.openliberty;

import com.demo.openliberty.rest.HelloResource;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class OpenLibertyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> s = new HashSet<>();
        s.add(HelloResource.class);
        return s;
    }
}
