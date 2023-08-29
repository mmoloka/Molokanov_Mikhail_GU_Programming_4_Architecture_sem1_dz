package org.example.sem1_dz.store3D.inmemory;

import org.example.sem1_dz.store3D.models.Camera;
import org.example.sem1_dz.store3D.models.Flash;
import org.example.sem1_dz.store3D.models.PoligonalModel;
import org.example.sem1_dz.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();
    private List<IModelChangedObserver> observers = new ArrayList<>();

    public Scene getScene(int id) {
        for (Scene scene: this.scenes) {
            if (scene.getId() == id) return scene;
        }
        return null;
    }

    public void add(PoligonalModel model){
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(IModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(IModelChangedObserver o) {
        observers.remove(o);
    }

}
