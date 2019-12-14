<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/imut"
    tools:context=".AlatBahan">

    <ImageView
        android:layout_width="450dp"
        android:layout_height="176dp"
        android:layout_gravity="center"
        android:layout_marginTop="0dp"
        android:layout_marginBottom="0dp"
        android:src="@drawable/bluee" />

    <ImageView
        android:id="@+id/instagram"
        android:layout_above="@+id/facebook"
        android:layout_width="170dp"
        android:layout_height="100dp"
        android:layout_marginBottom="430dp"
        android:layout_alignParentBottom="true"
        android:src="@drawable/fotohijab"/>

    <ImageView
        android:id="@+id/facebook"
        android:layout_width="130dp"
        android:layout_height="100dp"
        android:layout_above="@+id/nama_fb"
        android:layout_alignParentRight="true"
        android:layout_marginRight="80dp"
        android:layout_marginBottom="170dp"
        android:src="@drawable/fotohijab" />

    <ImageView
        android:id="@+id/facebook"
        android:layout_above="@+id/snapchat"
        android:layout_width="170dp"
        android:layout_height="100dp"
        android:layout_marginBottom="200dp"
        android:layout_alignParentBottom="true"
        android:src="@drawable/fotohijab"/>

    <TextView
        android:id="@+id/nama_fb"
        android:layout_above="@+id/sc"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_marginRight="30dp"
        android:layout_marginBottom="120dp"
        android:textColor="#FFFF"
        android:textSize="25sp"
        android:text="Bella Febri Triani"/>

    <ImageView
        android:id="@+id/snapchat"
        android:layout_width="170dp"
        android:layout_height="100dp"
        android:layout_marginBottom="50dp"
        android:lay