# Design_Pattern_Study
Created the project to learn and experiment different Android Design Pattern

The Application is just showing one page with Button and TextView. On Click of Button it will fetch the data from Model and show it on TextView

I have tried to implement using 3 design pattern in branches. 

1.MVC(Branch: master) : In Android, what we doing earlier, most of the View and Controller part is implemented in Activity or Fragment class. Model will be only independent module which can be tested without android components.

2.MVP(Branch: sample_mvp) : Here I created the contract interface which covers the all the possible view and "controller" behavior which is implemented in View(Activity) and Presenter class. Here Presenter is responsible updating view.

3.MVVM(Branch: sample_mvvm): Maintaining view reference in Presenter is overhead and challenge here is view should update data dynamically. ViewModel is the solution for this, data from ViewModel is subscribed by views.

This study is inspired by https://www.youtube.com/watch?v=QrbhPcbZv0I&t= 
