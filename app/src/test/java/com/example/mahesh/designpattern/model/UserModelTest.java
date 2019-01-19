package com.example.mahesh.designpattern.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserModelTest {

    private UserModel userModel;

    @Before
    public void init() {
        userModel = new UserModel();
    }

    @Test
    public void getUserData() {
        Assert.assertEquals("Naik ,Mahesh", userModel.getUserData());
    }
}