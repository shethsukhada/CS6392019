package com.google.samples.apps.sunflower.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlantListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView plantList;

  protected FragmentPlantListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView plantList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.plantList = plantList;
  }

  @NonNull
  public static FragmentPlantListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_plant_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlantListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlantListBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.fragment_plant_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlantListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_plant_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlantListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlantListBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.fragment_plant_list, null, false, component);
  }

  public static FragmentPlantListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPlantListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlantListBinding)bind(component, view, com.google.samples.apps.sunflower.R.layout.fragment_plant_list);
  }
}
