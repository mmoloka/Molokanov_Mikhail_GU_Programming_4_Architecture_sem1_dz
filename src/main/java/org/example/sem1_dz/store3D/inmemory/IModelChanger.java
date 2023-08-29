package org.example.sem1_dz.store3D.inmemory;

public interface IModelChanger {

    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange();

    void registerModelChanger(IModelChangedObserver o);
    void removeModelChanger(IModelChangedObserver o);
}
