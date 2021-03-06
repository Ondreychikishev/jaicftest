package com.justai.jaicf.template.connections

import com.justai.jaicf.channel.jaicp.JaicpServer
import com.justai.jaicf.channel.jaicp.channels.ChatApiChannel
import com.justai.jaicf.channel.jaicp.channels.ChatWidgetChannel
import com.justai.jaicf.channel.jaicp.channels.TelephonyChannel
import com.justai.jaicf.channel.telegram.TelegramChannel
import com.justai.jaicf.template.accessToken
import com.justai.jaicf.template.templateBot

fun main() {
    JaicpServer(
        botApi = templateBot,
        accessToken = accessToken,
        channels = listOf(
            ChatApiChannel,
            ChatWidgetChannel,
            TelegramChannel
        )
    ).start(wait = true)
}
/*
fun main() {
    TelegramChannel(templateBot, "581588245:AAGMNUZIO2CYCY78nGmzYBA9NJ2RQlNwz2M").run()
}*/
