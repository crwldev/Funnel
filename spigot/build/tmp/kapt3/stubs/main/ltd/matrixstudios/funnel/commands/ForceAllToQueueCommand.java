package ltd.matrixstudios.funnel.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/funnel/commands/ForceAllToQueueCommand;", "Lco/aikar/commands/BaseCommand;", "()V", "forceAll", "", "player", "Lorg/bukkit/entity/Player;", "queueId", "", "spigot"})
public final class ForceAllToQueueCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.funnel.commands.ForceAllToQueueCommand INSTANCE = null;
    
    private ForceAllToQueueCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "funnel.queue.forceall")
    @co.aikar.commands.annotation.CommandAlias(value = "queueforceall")
    public final void forceAll(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    @co.aikar.commands.annotation.Name(value = "queue")
    java.lang.String queueId) {
    }
}