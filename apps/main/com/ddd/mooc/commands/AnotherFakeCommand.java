package com.ddd.mooc.commands;

public class AnotherFakeCommand extends ConsoleCommand {
    @Override
    public void execute(String[] args) {
        info("Another command");
    }
}
