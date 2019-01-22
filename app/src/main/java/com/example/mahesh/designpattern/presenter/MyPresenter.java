package com.example.mahesh.designpattern.presenter;

import com.example.mahesh.designpattern.model.UserModel;

public class MyPresenter implements MyContract.Presenter{
    private UserModel userModel;
    private MyContract.View view;


    public MyPresenter(UserModel userModel, MyContract.View view) {
        this.userModel = userModel;
        this.view = view;

    }

    @Override
    public void getData() {
        String displayName = userModel.getUser().getLastName()
                +", "
                +userModel.getUser().getFirstName(); //Bringing the UI Logic to the presenter
        view.setName(displayName);
    }
}
