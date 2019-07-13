package com.google.samples.apps.sunflower.data;

import java.lang.System;

/**
 * The Data Access Object for the Plant class.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/sunflower/data/PlantDao;", "", "getPlant", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/sunflower/data/Plant;", "plantId", "", "getPlants", "", "getPlantsWithGrowZoneNumber", "growZoneNumber", "", "insertAll", "", "plants", "app_debug"})
public abstract interface PlantDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM plants ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.Plant>> getPlants();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM plants WHERE growZoneNumber = :growZoneNumber ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.Plant>> getPlantsWithGrowZoneNumber(int growZoneNumber);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM plants WHERE id = :plantId")
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.sunflower.data.Plant> getPlant(@org.jetbrains.annotations.NotNull()
    java.lang.String plantId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.sunflower.data.Plant> plants);
}