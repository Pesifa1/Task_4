package com.cgvsu.model;

import com.cgvsu.math.vector.Vector2;
import com.cgvsu.math.vector.Vector2f;
import com.cgvsu.math.vector.Vector3;
import com.cgvsu.math.vector.Vector3f;

import java.util.*;

public class Model {

    public ArrayList<Vector3> vertices = new ArrayList<Vector3>();
    public ArrayList<Vector2> textureVertices = new ArrayList<Vector2>();
    public ArrayList<Vector3> normals = new ArrayList<Vector3>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();
}
