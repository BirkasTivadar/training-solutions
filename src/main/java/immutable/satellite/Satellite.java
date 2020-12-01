package immutable.satellite;

public class Satellite {
    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        long x = destinationCoordinates.getX() + diff.getX();
        long y = destinationCoordinates.getY() + diff.getY();
        long z = destinationCoordinates.getZ() + diff.getZ();
        destinationCoordinates = new CelestialCoordinates(x, y, z);
    }

    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String toString() {
        return registerIdent + ": " + destinationCoordinates.toString();
    }
}
