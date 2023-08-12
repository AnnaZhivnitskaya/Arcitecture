package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModalChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModalChangedObsrver> changedObsrvers;


    public ModelStore(List<IModalChangedObsrver> changedObsrvers) throws Exception {
        this.changedObsrvers = changedObsrvers;
        this.Cameras = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Models = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    @Override
    public void NotifyChange(IModalChanger sender) {}

    public Scene getScenes(int Id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).Id == Id)
                return Scenes.get(i);
        }
        return null;
    }
}
