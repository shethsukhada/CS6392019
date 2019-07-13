package com.google.samples.apps.sunflower.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.samples.apps.sunflower.viewmodels.PlantDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlantDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageView detailImage;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final TextView plantDescription;

  @NonNull
  public final NestedScrollView plantDetailScrollview;

  @NonNull
  public final TextView plantName;

  @NonNull
  public final TextView plantWatering;

  @NonNull
  public final CollapsingToolbarLayout toolbarLayout;

  @Bindable
  protected PlantDetailViewModel mViewModel;

  protected FragmentPlantDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, ImageView detailImage, FloatingActionButton fab,
      TextView plantDescription, NestedScrollView plantDetailScrollview, TextView plantName,
      TextView plantWatering, CollapsingToolbarLayout toolbarLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.detailImage = detailImage;
    this.fab = fab;
    this.plantDescription = plantDescription;
    this.plantDetailScrollview = plantDetailScrollview;
    this.plantName = plantName;
    this.plantWatering = plantWatering;
    this.toolbarLayout = toolbarLayout;
  }

  public abstract void setViewModel(@Nullable PlantDetailViewModel viewModel);

  @Nullable
  public PlantDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPlantDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_plant_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlantDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlantDetailBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.fragment_plant_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlantDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_plant_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlantDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlantDetailBinding>inflateInternal(inflater, com.google.samples.apps.sunflower.R.layout.fragment_plant_detail, null, false, component);
  }

  public static FragmentPlantDetailBinding bind(@NonNull View view) {
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
  public static FragmentPlantDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlantDetailBinding)bind(component, view, com.google.samples.apps.sunflower.R.layout.fragment_plant_detail);
  }
}
