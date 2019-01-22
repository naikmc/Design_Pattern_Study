package com.example.mahesh.designpattern.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.mahesh.designpattern.model.UserModel;

public class MainActivityViewModel extends ViewModel {
    private UserModel userModel;

    private MutableLiveData<String> fullName ;

    public MainActivityViewModel(){
        userModel = new UserModel();
    }

    public LiveData<String> getFullName() {

        if (fullName == null) {
            fullName = new MutableLiveData<>();
        }
        return fullName;
    }

    public void loadData() {
        String displayName = userModel.getUser().getLastName()
                +", "
                +userModel.getUser().getFirstName(); //Bringing the UI Logic to the presenter
        fullName.postValue(displayName);

    }


}
