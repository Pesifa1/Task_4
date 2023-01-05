package com.cgvsu.model;
import com.cgvsu.math.Vector2f;
import com.cgvsu.math.Vector3f;

import java.util.*;

public class Model {

    public ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();

    public Model() { }

    public Model(ArrayList<Vector3f> vertices, ArrayList<Vector2f> textureVertices,
                 ArrayList<Vector3f> normals, ArrayList<Polygon> polygons) {
        this.vertices = vertices;
        this.textureVertices = textureVertices;
        this.normals = normals;
        this.polygons = polygons;
    }

    public void triangulate() {
        ArrayList<Polygon> triangulatedPolygons = new ArrayList<>();
        for (Polygon polygon : polygons) {
            List<Integer> vertexIndices = polygon.getVertexIndices();
            List<Integer> textureVertexIndices = polygon.getTextureVertexIndices();
            if (vertexIndices.size() > 3) {
                for (int i = 2; i < vertexIndices.size(); i++) {
                    Polygon triangle = new Polygon();
                    triangle.getVertexIndices().add(vertexIndices.get(0));
                    triangle.getTextureVertexIndices().add(textureVertexIndices.get(0));
                    triangle.getVertexIndices().add(vertexIndices.get(i - 1));
                    triangle.getTextureVertexIndices().add(textureVertexIndices.get(i - 1));
                    triangle.getVertexIndices().add(vertexIndices.get(i));
                    triangle.getTextureVertexIndices().add(textureVertexIndices.get(i));
                    triangulatedPolygons.add(triangle);
                }
            } else {
                triangulatedPolygons.add(polygon);
            }
        }
        polygons = triangulatedPolygons;
    }
}
