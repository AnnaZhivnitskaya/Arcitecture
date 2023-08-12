package ModelElements;

import Staff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List <Poligon> Poligons;
    public List <Texture> Textures;

    public PoligonalModel (List<Texture> textures){
        this.Textures = textures;
        Poligons = new ArrayList<>();
        List<Point3D> Result = new ArrayList<>();
        Poligons.add(new Poligon(Result));
    }
}
