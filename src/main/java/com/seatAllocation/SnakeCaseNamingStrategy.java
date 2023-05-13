package com.seatAllocation;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class SnakeCaseNamingStrategy extends PhysicalNamingStrategyStandardImpl {
    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        return Identifier.toIdentifier(toSnakeCase(name.getText()));
    }

    private String toSnakeCase(String input) {
        // Convert camel case to snake case
        // Example: camelCase -> camel_case
        return input.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }
}