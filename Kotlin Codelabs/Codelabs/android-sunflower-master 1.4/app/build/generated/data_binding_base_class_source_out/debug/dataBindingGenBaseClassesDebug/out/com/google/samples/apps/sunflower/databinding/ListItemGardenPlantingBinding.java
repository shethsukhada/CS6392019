package com.google.samples.apps.sunflower.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.sunflower.viewmodels.PlantAndGardenPlantingsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemGardenPlantingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView plantDate;

  @NonNull
  public final TextView waterDate;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected PlantAndGardenPlantingsViewModel mViewModel;

  protected ListItemGardenPlantingBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView imageView, TextView plantDate, TextView waterDate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.plantDate = plantDate;
    this.waterDate = waterDate;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setViewModel(@Nullable PlantAndGardenPlantingsViewModel viewModel);

  @Nullable
  public PlantAndGardenPlantingsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemGardenPlantingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_garden_planting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemGardenPlantingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemGardenPlantingBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.list_item_garden_planting, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemGardenPlantingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_garden_planting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemGardenPlantingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemGardenPlantingBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.list_item_garden_planting, null, false, component);
  }

  public static ListItemGardenPlantingBinding bind(@NonNull View view) {
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
  public static ListItemGardenPlantingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemGardenPlantingBinding)bind(component, view, com.google.samples.apps.sunflower.R.layout.list_item_garden_planting);
  }
}
