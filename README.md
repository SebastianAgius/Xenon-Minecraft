# Xenon Minecraft
Xenon Minecraft is a Minecraft Server implementation written in kotlin. It doesn't use any of Mojang's code whatsoever so nothing is complicated to communicate with. It's API is planned to be very easy to use. You do not need to use our API if you do not want to though :). 

Our server will support all of Bukkit & spigot's API so almost all plugin should be able to work quite well with our server software. There are some things that may not be completely available, plugins that access OBC (CraftBukkit) or NMS (Minecraft) code will struggle as that code does not exist in our implementation. If you're wondering what that is, let me explain. Spigot/CraftBukkit are NOT APIs. Mojang has made our vanilla server, then the Bukkit API was created, a collection of interfaces and classes. CraftBukkit was made for this, it's the implementation of Bukkit. It connects Bukkit to the Vanilla Minecraft server, crafts it together. Spigot then makes addons and optimizations to CraftBukkit, bringing better performance to the server. There are a few other forks of spigot which bring even more optimizations and more options to tinker with for your server. Another Note, Spigot also has an API which are just a few extensions for Bukkit, thus Spigot-API is also a thing here. Xenon Minecraft also strives to support multiple minecraft versions and types. 

Having builtin support for allowing multiple versions to connect to your server. This would usually require a plugin like ViaVersion. We're also adding support for allowing both the Java edition and Bedrock addition to connect! Obviously certain features would need to be restricted, such as redstone possibly and other things, especially since the versions are different in a few areas and mechanics.

We also plan to include a separate sub-project which is a proxy, it'll be almost exactly like BungeeCord and its forks except it'll be made specifically for the Xenon Minecraft Server Software. It will allow you to keep your servers in online mode. When enabled in the settings of the actual game server software you can set it to specifically only allow proxy connections. Although there are better ways which would be setting up firewall rules properly so those servers can't be accessed and only the proxy can be connected to.

You can find information on these references here:

* [Spigot](https://www.spigotmc.org/)
* [Bukkit](https://bukkit.org/)
* [Vanilla Minecraft Server](https://minecraft.net/en-us/download/server)
* [ViaVersion](https://www.spigotmc.org/resources/.19254/)
* [Minecraft](https://minecraft.net/)
* [Mojang](https://mojang.com/)
* [NMS](https://www.spigotmc.org/wiki/glossary/#nms) and [OBC](https://www.spigotmc.org/wiki/glossary/#obc)
* [MC Bedrock](https://minecraft.gamepedia.com/Bedrock_Edition)
* [BungeeCord](https://www.spigotmc.org/wiki/bungeecord/)