package com.aussie.xenonminecraft.api.chat

class ClickEvent(var action: Action, var value: Any) {

    enum class Action {
        OPEN_URL,
        RUN_COMMAND,
        SUGGEST_COMMAND,
        CHANGE_PAGE;

        override fun toString() = name.toLowerCase()
    }
}