package model.aeropuerto;

public enum Alianza {
    OneWorld, SkyTeam, StarAlliance;

    public static Alianza fromString(String nombre) {
        try {
            return Alianza.valueOf(nombre);
        }
        catch (Exception e) {
            return null;
        }
    }
}
