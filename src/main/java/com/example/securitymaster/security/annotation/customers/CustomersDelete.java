package com.example.securitymaster.security.annotation.customers;
import org.springframework.security.access.annotation.Secured;

import static com.example.securitymaster.security.SecurityRoles.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLES_PREFIX+CUSTOMERS_DELETE)
public @interface CustomersDelete {
}
