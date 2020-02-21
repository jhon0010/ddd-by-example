package com.ddd.apps;

import com.ddd.mooc.commands.ConsoleCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.HashMap;

/**
 * This class allow us to get starter different applications by context and allow us execute
 * custom commands in this applications, loading only the classes and context necessary for
 * this application name.
 */
public class Starter {

    public static void main(String[] args) {

        if (args.length < 2) {
            throw new RuntimeException("There are not enough arguments");
        }

        String applicationName = args[0];
        String commandName = args[1];
        boolean isApiCommand = commandName.equalsIgnoreCase("api");

        ensureApplicationExist(applicationName);
        ensureCommandExist(applicationName, commandName);

        Class<?> applicationClass = applications().get(applicationName);
        SpringApplication app = new SpringApplication(applicationClass);

        /**
         * If is not a api command we don't need the web application context of spring and should be a
         * command
         */
        if (!isApiCommand) {
            app.setWebApplicationType(WebApplicationType.NONE);
            ConfigurableApplicationContext context = app.run(args);
            ConsoleCommand consoleCommand = (ConsoleCommand) context.getBean(commands().get(applicationName).get(commandName));
            consoleCommand.execute(Arrays.copyOfRange(args, 2, args.length));
        }

    }

    private static void ensureApplicationExist(String applicationName) {

        if (!applications().containsKey(applicationName)) {
            throw new RuntimeException(String.format(
                    "The application <%s> doesn't exist. Valid applications : \n - %s",
                    applicationName,
                    String.join("\n-", applications().keySet())
            ));
        }

    }

    private static void ensureCommandExist(String applicationName, String commandName) {

        if (!"api".equals(commandName) && !existCommand(applicationName, commandName)) {
            throw new RuntimeException(String.format(
                    "Then command <%s> for the  application <%s> doesn't exist. Valid (application.command)) : \n - %s",
                    commandName,
                    String.join("\n-", commands().get(applicationName).keySet())
            ));
        }

    }

    private static Boolean existCommand(String applicationName, String commandName) {
        HashMap<String, HashMap<String, Class<?>>> commands = commands();

        return commands.containsKey(applicationName) && commands.get(applicationName).containsKey(commandName);
    }

    private static HashMap<String, Class<?>> applications() {
        return new HashMap<>() {{
            put("mooc_backend", MoocBackendApplication.class);
        }};
    }

    private static HashMap<String, HashMap<String, Class<?>>> commands() {
        return new HashMap<>() {{
            put("mooc_backend", MoocBackendApplication.commands());
        }};
    }


}
