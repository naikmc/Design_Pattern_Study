package com.example.mahesh.designpattern.ViewModel;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import android.arch.lifecycle.Observer;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityViewModelTest {

    MainActivityViewModel mainActivityViewModel;

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @Mock
    Observer<String> observer;

    @Before
    public void setUp(){
        mainActivityViewModel = new MainActivityViewModel();
    }

    @Test
    public void loadData() {
        mainActivityViewModel.getFullName().observeForever(observer);
        mainActivityViewModel.loadData();
        verify(observer).onChanged("Naik, Mahesh");
    }
}