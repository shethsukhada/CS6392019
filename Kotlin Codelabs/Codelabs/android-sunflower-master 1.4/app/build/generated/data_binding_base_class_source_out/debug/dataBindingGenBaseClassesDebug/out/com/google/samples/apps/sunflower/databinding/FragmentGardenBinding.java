package com.google.samples.apps.sunflower.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGardenBinding extends ViewDataBinding {
  @NonNull
  public final TextView emptyGarden;

  @NonNull
  public final RecyclerView gardenList;

  @Bindable
  protected boolean mHasPlantings;

  protected FragmentGardenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView emptyGarden, RecyclerView gardenList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emptyGarden = emptyGarden;
    this.gardenList = gardenList;
  }

  public abstract void setHasPlantings(boolean hasPlantings);

  public boolean getHasPlantings() {
    return mHasPlantings;
  }

  @NonNull
  public static FragmentGardenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_garden, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGardenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGardenBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.fragment_garden, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGardenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_garden, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGardenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGardenBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.fragment_garden, null, false, component);
  }

  public static FragmentGardenBinding bind(@NonNull View view) {
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
  public static FragmentGardenBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGardenBinding)bind(component, view, com.google.samples.apps.sunflower.R.layout.fragment_garden);
  }
}
