package MoveablePoint;

import Point.Point;

public class MoveablePoint extends Point {
    private float Speedx=0.0f;
    private float Speedy=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float speedx, float speedy) {
        Speedx = speedx;
        Speedy = speedy;
    }

    public MoveablePoint(float x, float y, float speedx, float speedy) {
        super(x, y);
        Speedx = speedx;
        Speedy = speedy;
    }

    public float getSpeedx() {
        return Speedx;
    }

    public void setSpeedx(float speedx) {
        Speedx = speedx;
    }

    public float getSpeedy() {
        return Speedy;
    }

    public void setSpeedy(float speedy) {
        Speedy = speedy;
    }
    public void setSpeed(float speedx,float speedy){
        this.Speedx=speedx;
        this.Speedy=speedy;
    }
    public float [] getSpeed(){
        return new float[]{getSpeedx(),getSpeedy()};
    }


    @Override
    public String toString() {
        return "MoveablePoint{" +"("+getX()+
                ","+getY()+")"+
                "Speedx=(" + Speedx +","
                 + Speedy +")"+
                '}';
    }
    public void getMoveablePoint(){
        setX(getX() + getSpeedx());
        setY(getY()+getSpeedy());
    }
}
