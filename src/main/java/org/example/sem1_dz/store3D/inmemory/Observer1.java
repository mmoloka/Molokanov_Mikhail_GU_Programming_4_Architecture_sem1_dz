package org.example.sem1_dz.store3D.inmemory;

public class Observer1 implements IModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer#1");
    }
}
