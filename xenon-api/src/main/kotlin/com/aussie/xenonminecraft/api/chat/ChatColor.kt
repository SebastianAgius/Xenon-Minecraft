package com.aussie.xenonminecraft.api.chat

enum class ChatColor(val code: Char) {
    BLACK('0'),
    DARK_BLUE('1'),
    DARK_GREEN('2'),
    DARK_AQUA('3'),
    DARK_RED('4'),
    DARK_PURPLE('5'),
    GOLD('6'),
    GRAY('7'),
    DARK_GRAY('8'),
    BLUE('9'),
    GREEN('a'),
    AQUA('b'),
    RED('c'),
    LIGHT_PURPLE('d'),
    YELLOW('e'),
    WHITE('f'),
    OBFUSCATED('k'),
    BOLD('l'),
    STRIKETHROUGH('m'),
    UNDERLINE('n'),
    ITALIC('o'),
    RESET('r');

    override fun toString() = name.toLowerCase()

    companion object {
        val COLOR_CODE = '§'
        val ALL_COLOURS = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr".toCharArray()

        fun translateAlternateColorCode(code: Char, text: String): String {
            val c = text.toCharArray()
            c.withIndex().forEach { if(it.value == code && ALL_COLOURS.contains(c[it.index+1])) c[it.index] = COLOR_CODE }
            return String(c)
        }
    }
}