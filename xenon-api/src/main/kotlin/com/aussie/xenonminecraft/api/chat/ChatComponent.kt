package com.aussie.xenonminecraft.api.chat

class ChatComponent(var text: String, var bold: Boolean = false, var italic: Boolean = false,
                    var underlined: Boolean = false, var strikethrough: Boolean = false, var obfuscated: Boolean = false,
                    var insertion: String? = null, var clickEvent: ClickEvent? = null, var hoverEvent: HoverEvent? = null,
                    var extra: MutableList<ChatComponent>? = mutableListOf()) {

}