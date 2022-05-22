package ltd.matrixstudios.funnel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lltd/matrixstudios/funnel/FunnelSpigotPlugin;", "Lorg/bukkit/plugin/java/JavaPlugin;", "()V", "createQueue", "", "getPriorityForPlayer", "", "player", "Lorg/bukkit/entity/Player;", "loadPriorities", "onEnable", "Companion", "spigot"})
public final class FunnelSpigotPlugin extends org.bukkit.plugin.java.JavaPlugin {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.funnel.FunnelSpigotPlugin.Companion Companion = null;
    public static ltd.matrixstudios.funnel.FunnelSpigotPlugin instance;
    
    public FunnelSpigotPlugin() {
        super();
    }
    
    @java.lang.Override()
    public void onEnable() {
    }
    
    public final int getPriorityForPlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return 0;
    }
    
    public final void createQueue() {
    }
    
    public final void loadPriorities() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/funnel/FunnelSpigotPlugin$Companion;", "", "()V", "instance", "Lltd/matrixstudios/funnel/FunnelSpigotPlugin;", "getInstance", "()Lltd/matrixstudios/funnel/FunnelSpigotPlugin;", "setInstance", "(Lltd/matrixstudios/funnel/FunnelSpigotPlugin;)V", "spigot"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.funnel.FunnelSpigotPlugin getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.funnel.FunnelSpigotPlugin p0) {
        }
    }
}