package dev.risas.commands;

import dev.panda.chat.ChatUtil;
import dev.panda.command.BaseCommand;
import dev.panda.command.Command;
import dev.panda.command.CommandArgs;

/**
 * Created by Risas
 * Project: rEssentials
 * Date: 08-11-2021 - 23:27
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */
public class rEssentialCommand extends BaseCommand {

    @Command(name = "ressentials", aliases = {"ressential", "essentials", "essential"}, description = "Main Command", inGameOnly = false)
    @Override
    public void onCommand(CommandArgs command) {
        ChatUtil.sender(command.getSender(), "&cestamos empezando pa!");
    }
}
