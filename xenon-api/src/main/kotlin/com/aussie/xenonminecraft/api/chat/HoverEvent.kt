package com.aussie.xenonminecraft.api.chat

class HoverEvent(var action: Action, var value: Any) {
    enum class Action {
        SHOW_TEXT,
        SHOW_ITEM,
        SHOW_ENTITY,
        @Deprecated("Removed in 1.12 use SHOW_TEXT with `advancement.<name>`") SHOW_ACHIEVEMENT;

        override fun toString() = name.toLowerCase()
    }
}