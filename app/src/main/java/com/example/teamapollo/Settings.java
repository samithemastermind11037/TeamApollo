<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="587dp"
        android:layout_height="304dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Volume"
        android:textSize="120dp"
        android:textAlignment="center"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.121"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="728dp" />

    <Button
        android:id="@+id/button"
        android:layout_width="779dp"
        android:layout_height="251dp"
        android:text="Change Orientation"
        tools:layout_editor_absoluteX="155dp"
        tools:layout_editor_absoluteY="1128dp"
        android:background="#a39aaf"/>

    <Button
        android:id="@+id/button3"
        android:layout_width="779dp"
        android:layout_height="251dp"
        android:text="Return to tile screen"
        tools:layout_editor_absoluteX="1098dp"


        android:textColor="@android:color/black"

        tools:layout_editor_absoluteY="1140dp" />

    <EditText
        android:id="@+id/editTextTextPersonName"
        android:layout_width="854dp"
        android:layout_height="385dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Settings"
        android:textAlignment="center"
        android:textSize="120dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.531"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="221dp" />

    <SeekBar
        android:id="@+id/seekBar2"
        android:layout_width="1138dp"
        android:layout_height="221dp"
        tools:layout_editor_absoluteX="739dp"
        tools:layout_editor_absoluteY="785dp" />
</androidx.constraintlayout.widget.ConstraintLayout>