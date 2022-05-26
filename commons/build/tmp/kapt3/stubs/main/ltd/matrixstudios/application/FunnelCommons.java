package ltd.matrixstudios.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010&\u001a\u0002H\'\"\u0004\b\u0000\u0010\'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\'0)\u00a2\u0006\u0002\u0010*J%\u0010+\u001a\u0002H\'\"\u0004\b\u0000\u0010\'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\'0)\u00a2\u0006\u0002\u0010*J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u000203R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000e\u00a8\u00064"}, d2 = {"Lltd/matrixstudios/application/FunnelCommons;", "", "()V", "globalJedis", "Lredis/clients/jedis/JedisPool;", "getGlobalJedis", "()Lredis/clients/jedis/JedisPool;", "setGlobalJedis", "(Lredis/clients/jedis/JedisPool;)V", "globalJedisResource", "Lredis/clients/jedis/Jedis;", "getGlobalJedisResource", "()Lredis/clients/jedis/Jedis;", "setGlobalJedisResource", "(Lredis/clients/jedis/Jedis;)V", "globalQueueForInstance", "Lltd/matrixstudios/application/queues/Queue;", "getGlobalQueueForInstance", "()Lltd/matrixstudios/application/queues/Queue;", "setGlobalQueueForInstance", "(Lltd/matrixstudios/application/queues/Queue;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "instance", "getInstance", "()Lltd/matrixstudios/application/FunnelCommons;", "setInstance", "(Lltd/matrixstudios/application/FunnelCommons;)V", "pubsubJedisPool", "getPubsubJedisPool", "setPubsubJedisPool", "pubsubJedisResource", "getPubsubJedisResource", "setPubsubJedisResource", "runPubsubRedisCommand", "T", "runnable", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runRedisCommand", "start", "", "jedisURI", "", "queueId", "destination", "console", "", "commons"})
public final class FunnelCommons {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.application.FunnelCommons INSTANCE = null;
    public static ltd.matrixstudios.application.FunnelCommons instance;
    @org.jetbrains.annotations.NotNull()
    private static com.google.gson.Gson gson;
    public static redis.clients.jedis.JedisPool globalJedis;
    public static redis.clients.jedis.Jedis globalJedisResource;
    public static redis.clients.jedis.JedisPool pubsubJedisPool;
    public static redis.clients.jedis.Jedis pubsubJedisResource;
    public static ltd.matrixstudios.application.queues.Queue globalQueueForInstance;
    
    private FunnelCommons() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.application.FunnelCommons getInstance() {
        return null;
    }
    
    public final void setInstance(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.application.FunnelCommons p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.JedisPool getGlobalJedis() {
        return null;
    }
    
    public final void setGlobalJedis(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.Jedis getGlobalJedisResource() {
        return null;
    }
    
    public final void setGlobalJedisResource(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.Jedis p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.JedisPool getPubsubJedisPool() {
        return null;
    }
    
    public final void setPubsubJedisPool(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.Jedis getPubsubJedisResource() {
        return null;
    }
    
    public final void setPubsubJedisResource(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.Jedis p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.application.queues.Queue getGlobalQueueForInstance() {
        return null;
    }
    
    public final void setGlobalQueueForInstance(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.application.queues.Queue p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    java.lang.String jedisURI, @org.jetbrains.annotations.NotNull()
    java.lang.String queueId, @org.jetbrains.annotations.NotNull()
    java.lang.String destination, boolean console) {
    }
    
    public final <T extends java.lang.Object>T runPubsubRedisCommand(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super redis.clients.jedis.Jedis, ? extends T> runnable) {
        return null;
    }
    
    public final <T extends java.lang.Object>T runRedisCommand(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super redis.clients.jedis.Jedis, ? extends T> runnable) {
        return null;
    }
}