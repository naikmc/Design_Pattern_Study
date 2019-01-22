package com.example.mahesh.designpattern.presenter;

public interface MyContract {

    interface View {
        void setName(String fullName);
    }

    interface Presenter {
        void getData();
    }
}
