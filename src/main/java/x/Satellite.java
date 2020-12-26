package x;

import jdk.jshell.execution.JdiInitiator;

public class Satellite {
    private CelestialCoordinates coordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates coordinates, String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.coordinates = coordinates;
        this.registerIdent = registerIdent;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public void modifyDestination(CelestialCoordinates diff) {
        int x = coordinates.getX() + diff.getX();
        int y = coordinates.getY() + diff.getY();
        int z = coordinates.getZ() + diff.getZ();
        coordinates = new CelestialCoordinates(x, y, z);
    }

    public CelestialCoordinates getCoordinates() {
        return coordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    @Override
    public String toString() {
        return registerIdent + ": " + coordinates.toString();
    }
}
