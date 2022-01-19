import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession

fun main() {
    TelegramBotsApi(DefaultBotSession::class.java).registerBot(object: TelegramLongPollingBot() {
        override fun getBotToken(): String  = TOKEN
        override fun getBotUsername(): String = "Her"
        override fun onUpdateReceived(update: Update?) {
            execute(SendMessage(update?.message?.chatId.toString(), "ass"))
            println(update?.message?.text)

        }
    })
}


