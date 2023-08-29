package org.example.sem1_dz.store3D.models;

import java.util.List;

public class Scene {
    private int id;
    private List<PoligonalModel>  models;
    private List<Flash> flashes;


    public Scene(){}

    public Scene(int id, List<PoligonalModel> models) {
        this.id = id;
        this.models = models;
    }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public <T> T method1(T o) {return o;}

    public <T> T method2(T o, T n) {
        if (o.equals(n)) {return o;}
        else return n;
    }

    public int getId() {
        return id;
    }
}
