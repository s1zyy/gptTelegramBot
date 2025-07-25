package selfprojects.my_telegram_gpt_bot.Commands;

import lombok.Getter;

@Getter
public enum TelegramCommands {
    START_COMMAND("/start"),
    CLEAR_COMMAND("/clear"),
    NUMBERFACT_COMMAND("/number"),
    QUOTES_COMMAND("/quote");

    private final String commandValue;

    TelegramCommands(String commandValue) {
        this.commandValue = commandValue;
    }
}
