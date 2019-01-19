package com.example.mahesh.designpattern.view;

public interface MyContract {

    interface View {
        void setName(String fullName);
    }

    interface Presenter {
        void getData();
    }
}
