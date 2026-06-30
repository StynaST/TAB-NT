dependencies {
    api(projects.shared)
    implementation("org.bstats:bstats-bukkit:3.1.0")
    compileOnly("org.purpurmc.purpur:purpur-api:1.16.5-R0.1-SNAPSHOT")
    compileOnly("me.clip:placeholderapi:2.11.6")
    compileOnly("com.mojang:authlib:1.5.25")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7") {
        exclude("org.bukkit", "bukkit")
    }
    compileOnly("me.libraryaddict.disguises:libsdisguises:11.0.0") {
        exclude("org.spigotmc", "spigot")
        exclude("org.spigotmc", "spigot-api")
        exclude("com.github.retrooper", "packetevents")
        exclude("org.ow2.asm", "asm")
        exclude("net.md-5", "bungeecord-chat")
    }
    compileOnly("com.github.LeonMangler:PremiumVanishAPI:2.8.8")
    compileOnly(files("../libs/necrotempus-1.3.3-api.jar"))

}
