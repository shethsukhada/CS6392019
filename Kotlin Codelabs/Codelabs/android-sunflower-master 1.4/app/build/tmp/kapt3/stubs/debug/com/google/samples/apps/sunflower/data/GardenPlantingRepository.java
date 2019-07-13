package com.google.samples.apps.sunflower.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u000bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e0\u000bJ\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/google/samples/apps/sunflower/data/GardenPlantingRepository;", "", "gardenPlantingDao", "Lcom/google/samples/apps/sunflower/data/GardenPlantingDao;", "(Lcom/google/samples/apps/sunflower/data/GardenPlantingDao;)V", "createGardenPlanting", "", "plantId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGardenPlantingForPlant", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/sunflower/data/GardenPlanting;", "getGardenPlantings", "", "getPlantAndGardenPlantings", "Lcom/google/samples/apps/sunflower/data/PlantAndGardenPlantings;", "removeGardenPlanting", "gardenPlanting", "(Lcom/google/samples/apps/sunflower/data/GardenPlanting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class GardenPlantingRepository {
    private final com.google.samples.apps.sunflower.data.GardenPlantingDao gardenPlantingDao = null;
    private static volatile com.google.samples.apps.sunflower.data.GardenPlantingRepository instance;
    public static final com.google.samples.apps.sunflower.data.GardenPlantingRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createGardenPlanting(@org.jetbrains.annotations.NotNull()
    java.lang.String plantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeGardenPlanting(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.sunflower.data.GardenPlanting gardenPlanting, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.sunflower.data.GardenPlanting> getGardenPlantingForPlant(@org.jetbrains.annotations.NotNull()
    java.lang.String plantId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.GardenPlanting>> getGardenPlantings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.PlantAndGardenPlantings>> getPlantAndGardenPlantings() {
        return null;
    }
    
    private GardenPlantingRepository(com.google.samples.apps.sunflower.data.GardenPlantingDao gardenPlantingDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/sunflower/data/GardenPlantingRepository$Companion;", "", "()V", "instance", "Lcom/google/samples/apps/sunflower/data/GardenPlantingRepository;", "getInstance", "gardenPlantingDao", "Lcom/google/samples/apps/sunflower/data/GardenPlantingDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.sunflower.data.GardenPlantingRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.sunflower.data.GardenPlantingDao gardenPlantingDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}