package ss6_inheritanci.bai_tap.point2dandpoint3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {super.getX(), super.getY(), this.getZ()};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" + " x=" + super.getX() + " y=" + super.getY() + " z=" + this.getZ() + " .Array of {x,y,z} is " + Arrays.toString(this.getXYZ()) + '}';
    }
}
