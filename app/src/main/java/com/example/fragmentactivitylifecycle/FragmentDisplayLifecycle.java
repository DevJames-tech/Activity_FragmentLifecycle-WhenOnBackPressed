package com.example.fragmentactivitylifecycle;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDisplayLifecycle extends Fragment {

    String fragmentLifecycle = "Lifecycle";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d(fragmentLifecycle,"OnAttach called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(fragmentLifecycle,"OnCreate called");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        Log.d(fragmentLifecycle,"OnCreateView called");

        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d(fragmentLifecycle,"OnViewCreate called");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(fragmentLifecycle,"OnActivityCreated called");

    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d(fragmentLifecycle,"onStart called");

    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d(fragmentLifecycle,"onResume called");

    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d(fragmentLifecycle,"OnPause called");

    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d(fragmentLifecycle,"onStop called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(fragmentLifecycle,"OnDestroyView called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(fragmentLifecycle,"onDestroy called");

    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d(fragmentLifecycle,"OnDetach called");

    }
}
