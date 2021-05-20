package paquete4;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospitales.data";

        Hospital ho = new Hospital("Hospital Basico Arenillas", 50, 6000);
        Hospital ho2 = new Hospital("Hospital Teofila Davila", 120, 10000);
        Hospital ho3 = new Hospital("Hospital Santa Teresita", 60, 1520);
        Hospital ho4 = new Hospital("Hospital Basico Huaquillas", 70, 8040);

        Hospital[] lista = {ho, ho2, ho3, ho4};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
}
