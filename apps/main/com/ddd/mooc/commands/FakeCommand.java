package com.ddd.mooc.commands;

public class FakeCommand extends  ConsoleCommand {
    @Override
    public void execute(String[] args) {
        info("Fake command");
    }
}
