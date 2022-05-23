package ltd.matrixstudios.application.queues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\u0010\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\'\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0006\u0010)\u001a\u00020(J\t\u0010*\u001a\u00020(H\u00d6\u0001J\u000e\u0010+\u001a\u00020,2\u0006\u0010\"\u001a\u00020#J\u0006\u0010-\u001a\u00020,J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006/"}, d2 = {"Lltd/matrixstudios/application/queues/Queue;", "", "id", "", "players", "Ljava/util/PriorityQueue;", "Lltd/matrixstudios/application/players/FunnelPlayer;", "destination", "fancyName", "paused", "", "(Ljava/lang/String;Ljava/util/PriorityQueue;Ljava/lang/String;Ljava/lang/String;Z)V", "getDestination", "()Ljava/lang/String;", "setDestination", "(Ljava/lang/String;)V", "getFancyName", "setFancyName", "getId", "setId", "getPaused", "()Z", "setPaused", "(Z)V", "getPlayers", "()Ljava/util/PriorityQueue;", "setPlayers", "(Ljava/util/PriorityQueue;)V", "component1", "component2", "component3", "component4", "component5", "containsPlayer", "uuid", "Ljava/util/UUID;", "copy", "equals", "other", "getPosition", "", "getTotalPlayersQueued", "hashCode", "remove", "", "save", "toString", "commons"})
public final class Queue {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.util.PriorityQueue<ltd.matrixstudios.application.players.FunnelPlayer> players;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String destination;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fancyName;
    private boolean paused;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.application.queues.Queue copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.PriorityQueue<ltd.matrixstudios.application.players.FunnelPlayer> players, @org.jetbrains.annotations.NotNull()
    java.lang.String destination, @org.jetbrains.annotations.NotNull()
    java.lang.String fancyName, boolean paused) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Queue(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.PriorityQueue<ltd.matrixstudios.application.players.FunnelPlayer> players, @org.jetbrains.annotations.NotNull()
    java.lang.String destination, @org.jetbrains.annotations.NotNull()
    java.lang.String fancyName, boolean paused) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.PriorityQueue<ltd.matrixstudios.application.players.FunnelPlayer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.PriorityQueue<ltd.matrixstudios.application.players.FunnelPlayer> getPlayers() {
        return null;
    }
    
    public final void setPlayers(@org.jetbrains.annotations.NotNull()
    java.util.PriorityQueue<ltd.matrixstudios.application.players.FunnelPlayer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDestination() {
        return null;
    }
    
    public final void setDestination(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFancyName() {
        return null;
    }
    
    public final void setFancyName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getPaused() {
        return false;
    }
    
    public final void setPaused(boolean p0) {
    }
    
    public final void save() {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
    }
    
    public final boolean containsPlayer(@org.jetbrains.annotations.Nullable()
    java.util.UUID uuid) {
        return false;
    }
    
    public final int getPosition(@org.jetbrains.annotations.Nullable()
    java.util.UUID uuid) {
        return 0;
    }
    
    public final int getTotalPlayersQueued() {
        return 0;
    }
}