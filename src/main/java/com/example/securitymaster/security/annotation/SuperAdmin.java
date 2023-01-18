package com.example.securitymaster.security.annotation;

import static com.example.securitymaster.security.SecurityRoles.*;
import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLES_PREFIX+ROLES_ADMIN)
public @interface SuperAdmin {
}
