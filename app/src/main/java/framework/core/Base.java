package framework.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Base extends Application {
  private static Context context;
  private static Activity currentActivity;
  private static LayoutInflater layoutInflater;

  @Override
  public void onCreate() {
    super.onCreate();
    context = getApplicationContext();
    layoutInflater = LayoutInflater.from(context);
  }

  public static Context getContext(){
    if(currentActivity != null) {
      return currentActivity;
    }
      return context;
  }
  public static void setCurrentActivity(Activity activity){
    currentActivity = activity;
  }

  public static Activity getCurrentActivity() {
    return currentActivity;
  }

  public static LayoutInflater getLayoutInflater(){
    return layoutInflater;
  }

  public static View layoutInflate(@LayoutRes int res, @Nullable ViewGrouproot){
    return LayoutInflater.inflate(res, root);
  }

  public static View layoutInflate(@LayoutRes int res){
    return LayoutInflater.inflate(res, null);
  }
}
