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
        cadena = String.format("HOSPITAL %s\nDirección: %s\nCiudad: %s"
                + "\nProvincia: %s\nNúmero de especialidades: %d"
                + "\nListado de médicos\n", obtenerNombre(),
                obtenerDireccionHospital(),
                obtenerCiudadHospital(), obtenerProvinciaHospital(),
                obtenerNumeroEspecialidades());
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s - %s - sueldo: %.2f - %s\n", cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s \nTotal de sueldos a pagar por mes: %.2f",
                cadena, obtenerTotalSueldo(obtenerMedicos(),
                        obtenerEnfermeros()));
        return cadena;
    }
}

}
