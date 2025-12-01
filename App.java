import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static int idIncidenciaSecuencia = 1;

    public static int generarIdIncidencia() {
        return idIncidenciaSecuencia++;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaTicket sistema = new SistemaTicket();

        boolean ejecutando = true;

        while (ejecutando) {

            System.out.println("\n===== SISTEMA DE TICKETING LAB-LIS =====");
            System.out.println("1. Registrar incidencia");
            System.out.println("2. Listar incidencias");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Registrar nueva incidencia ---");

                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("ID del usuario que reporta (int): ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("ID del equipo afectado (int): ");
                    int idEquipo = scanner.nextInt();
                    scanner.nextLine();

                    // Crear usuario temporal
                    Usuario usuario = new Usuario(idUsuario, "Usuario " + idUsuario, "Alumno");

                    // Crear equipo temporal
                    EquipoComputo equipo = new EquipoComputo(idEquipo, "Equipo " + idEquipo, "Dell Optiplex");

                    // --- Switch para el tipo de incidencia ---
                    System.out.println("\nSeleccione el tipo de incidencia:");
                    System.out.println("1. Hardware");
                    System.out.println("2. Software");
                    System.out.println("3. Red");
                    System.out.print("Opción: ");
                    int opcionTipo = scanner.nextInt();
                    scanner.nextLine();

                    String tipo;
                    switch (opcionTipo) {
                        case 1 -> tipo = "Hardware";
                        case 2 -> tipo = "Software";
                        case 3 -> tipo = "Red";
                        default -> {
                            System.out.println("Opción inválida. Se asignó 'Hardware'.");
                            tipo = "Hardware";
                        }
                    }

                    // --- Switch para prioridad ---
                    System.out.println("\nSeleccione prioridad:");
                    System.out.println("1. Baja");
                    System.out.println("2. Media");
                    System.out.println("3. Alta");
                    System.out.print("Opción: ");
                    int opcionPrioridad = scanner.nextInt();
                    scanner.nextLine();

                    String prioridad;
                    switch (opcionPrioridad) {
                        case 1 -> prioridad = "Baja";
                        case 2 -> prioridad = "Media";
                        case 3 -> prioridad = "Alta";
                        default -> {
                            System.out.println("Opción inválida. Se asignó 'Media'.");
                            prioridad = "Media";
                        }
                    }

                    // --- Switch para estado inicial ---
                    System.out.println("\nSeleccione el estado inicial:");
                    System.out.println("1. Reportada");
                    System.out.println("2. En proceso");
                    System.out.println("3. Cerrada");
                    System.out.print("Opción: ");
                    int opcionEstado = scanner.nextInt();
                    scanner.nextLine();

                    String estado;
                    switch (opcionEstado) {
                        case 1 -> estado = "Reportada";
                        case 2 -> estado = "En proceso";
                        case 3 -> estado = "Cerrada";
                        default -> {
                            System.out.println("Opción inválida. Se asignó 'Reportada'.");
                            estado = "Reportada";
                        }
                    }

                    // Crear incidencia con tu constructor REAL
                    Incidencia nueva = new Incidencia(
                            generarIdIncidencia(),
                            descripcion,
                            tipo,
                            prioridad,
                            usuario,
                            equipo
                    );

                    // Aplicar estado elegido
                    nueva.cambiarEstado(estado);

                    sistema.registrarIncidencia(nueva);
                    System.out.println("Incidencia registrada con éxito.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de incidencias registradas ---");
                    ArrayList<Incidencia> lista = sistema.getIncidencias();

                    if (lista.isEmpty()) {
                        System.out.println("No hay incidencias registradas.");
                    } else {
                        for (Incidencia inc : lista) {
                            System.out.println("\n-----------------------------");
                            System.out.println("ID: " + inc.getIdIncidencia());
                            System.out.println("Descripción: " + inc.getDescripcion());
                            System.out.println("Tipo: " + inc.getTipoIncidencia());
                            System.out.println("Prioridad: " + inc.getPrioridad());
                            System.out.println("Estado: " + inc.getEstado());
                            System.out.println("Usuario: " + inc.getUsuario().getNombre());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    ejecutando = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
