package org.example.sem1_dz.store3D.inmemory;

public class Observer2 implements  IModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer#2");
    }
}
