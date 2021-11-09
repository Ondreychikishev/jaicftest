package com.justai.jaicf.template.connections

import com.justai.jaicf.channel.jaicp.JaicpPollingConnector
import com.justai.jaicf.channel.jaicp.channels.ChatApiChannel
import com.justai.jaicf.channel.jaicp.channels.ChatWidgetChannel
import com.justai.jaicf.channel.jaicp.channels.TelephonyChannel
import com.justai.jaicf.channel.telegram.TelegramChannel
import com.justai.jaicf.template.accessToken
import com.justai.jaicf.template.templateBot

/*
fun main() {
    JaicpPollingConnector(
        templateBot,
        accessToken,
        channels = listOf(
            ChatApiChannel,
            ChatWidgetChannel,
            TelegramChannel
        )
    ).runBlocking()
}*/

fun main() {
    TelegramChannel(templateBot, "581588245:AAFs1DXKJOs2dlFvb0BlyLzd2nT8fm3u6IQ").run()
}