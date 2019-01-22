package com.example.mahesh.designpattern.view;

import com.example.mahesh.designpattern.model.User;
import com.example.mahesh.designpattern.model.UserModel;
import com.example.mahesh.designpattern.presenter.MyContract;
import com.example.mahesh.designpattern.presenter.MyPresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyPresenterTest {

    @Mock
    MyContract.View view;

    @Mock
    UserModel userModel;

    MyPresenter presenter;

    @Before
    public void setUp() {
        presenter = new MyPresenter(userModel, view);
    }

    @Test
    public void getData() {
        when(userModel.getUser()).thenReturn(new User("Mah", "Naik", 28));
        presenter.getData();
        verify(view).setName("Naik, Mah");
    }
}