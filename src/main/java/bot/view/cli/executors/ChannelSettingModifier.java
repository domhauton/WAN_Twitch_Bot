package bot.view.cli.executors;

import bot.view.cli.BotCommandException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
<<<<<<< f9ac3a962a7c90330d9d44adce2245674b350b67
import bot.channel.ChannelManager;
import twitch.chat.data.OutboundTwitchMessage;
=======

import bot.channel.ChannelManager;
import bot.view.cli.BotCommandException;
>>>>>>> Connected Blacklist Executor

import java.util.Collection;

/**
 * Created by Dominic Hauton on 11/07/2016.
 */
<<<<<<< f9ac3a962a7c90330d9d44adce2245674b350b67
public class ChannelSettingModifier implements CommandExecutor{
    @Override
    public Collection<OutboundTwitchMessage> executeCommand(ImmutableSet<Character> flags, ImmutableList<String> args, ChannelManager channelManager) throws BotCommandException {
        throw new BotCommandException("Command not yet implemented");
        //TODO Add ability to set the show start time and modify settings
    }
=======
public class ChannelSettingModifier implements CommandExecutor {
  @Override
  public BotCommandResult executeCommand(ImmutableSet<Character> flags, ImmutableList<String> args, ChannelManager channelManager) throws BotCommandException {
    throw new BotCommandException("Command not yet implemented");
    //TODO Add ability to set the show start time and modify settings
  }
>>>>>>> Connected Blacklist Executor
}
