package paquete6;

public class Hospital {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public Hospital(String nom, int numero, double presu) {
        nombre = nom;
        numeroCamas = numero;
        presupuesto = presu;
    }

    Hospital(String get, String get0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void establecerNombreHospital(String n) {
        nombre = n;
    }

    public void establecerDireccionHospital(int n) {
        numeroCamas = n;
    }

    public void establecerCiudadHospital(double n) {
        presupuesto = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("HOSPITAL %s\nNombre: %s\nNumero de camas: %d\n"
                + "Presupuesto %.2f\n",
                obtenerNombre(), obtenerNumeroCamas(), obtenerPresupuesto());

        return cadena;
    }
}
