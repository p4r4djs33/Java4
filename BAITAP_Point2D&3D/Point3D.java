/**
 * Point3D
 */
public class Point3D extends Point2D{

    private float z = 0.0f;
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x, y);
        this.z =z;
    }
    public float[] getXYZ(){
        float[] xyz = {getX(),getY(), this.z};
        return xyz;
    }
    @Override
    public String toString(){
        return  "Point3D [x=" + getX() + ", y=" + getY() + ", z=" + getZ() + "]";
    }

}