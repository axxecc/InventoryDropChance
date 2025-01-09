package me.playgamesgo.inventorydropchance.configs;

import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Comment;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LangConfig extends OkaeriConfig {
    private String noPermission = "&e[&6InventoryDropChance&e] &cYou don't have permission to use this command!";
    private String noDropGiven = "&e[&6InventoryDropChance&e] &aNow this item is not droppable!";
    private String noItemInHand = "&e[&6InventoryDropChance&e] &cYou don't have any item in your hand!";
    private String reloaded = "&e[&6InventoryDropChance&e] &aConfig reloaded!";
    private String invalidArgument = "&e[&6InventoryDropChance&e] &cInvalid argument! Use /idc help for help!";
    private String noArgument = "&e[&6InventoryDropChance&e] &cYou need to specify an argument! Use /idc help for help!";
    private String scrollGiven = "&e[&6InventoryDropChance&e] &aScroll given!";

    private List<String> help = List.of(
            "&e[&6InventoryDropChance&e] &aCommands:",
            "&a/idc reload - Reloads the config",
            "&a/mnd &7- &eMake the item in your hand not drop on death",
            "&a/mnd <addLore> <chance> &7- &eMake the item in your hand not drop on death with a specific chance",
            "&a/idc help &7- &eShows this help message"
    );

    @Comment()
    @Comment("Appends to the item lore when the item has a 100% chance to not drop on death")
    private List<String> noDropLore = List.of("&6This item will not drop on death!");

    @Comment()
    @Comment("Appends to the item lore when the item has a specific chance to not drop on death")
    private List<String> noDropChanceLore = List.of("&6This item has a %chance%% chance to not drop on death!");

    private List<String> scrollsLore = List.of(
            "&6This item is a scroll!",
            "It put a %chance% chance to not drop the item on death!"
    );
}
