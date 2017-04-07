package bship;

public class Ship {

    private String shipName;
    private int length;
    private boolean sunk;
    private Direction direction;
    private Location location;

    public Ship(String shipName, int length) {
        this.shipName = shipName;
        this.length = length;
    }

    public String getShipName() {
        return shipName;
    }

    public int getLength() {
        return length;
    }

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
