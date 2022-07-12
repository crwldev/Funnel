package ltd.matrixstudios.application.queues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\f\u00a8\u0006\u0012"}, d2 = {"Lltd/matrixstudios/application/queues/QueueService;", "", "()V", "addPlayerToQueue", "", "queue", "Lltd/matrixstudios/application/queues/Queue;", "player", "Ljava/util/UUID;", "priority", "", "findQueue", "Ljava/util/concurrent/CompletableFuture;", "queueId", "", "findQueueByPlayer", "getAllQueues", "", "commons"})
public final class QueueService {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.application.queues.QueueService INSTANCE = null;
    
    private QueueService() {
        super();
    }
    
    public final void addPlayerToQueue(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.application.queues.Queue queue, @org.jetbrains.annotations.NotNull()
    java.util.UUID player, int priority) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<ltd.matrixstudios.application.queues.Queue> findQueueByPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<ltd.matrixstudios.application.queues.Queue>> getAllQueues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<ltd.matrixstudios.application.queues.Queue> findQueue(@org.jetbrains.annotations.NotNull()
    java.lang.String queueId) {
        return null;
    }
}