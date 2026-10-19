public class Main {
    public static void main(String[] args) {
        VideoJuego juego1 = new VideoJuego("Minecracft", "Supervivencia", 40);
        VideoJuego juego2 = new VideoJuego("GTA V", "Accion", 30);
        juego1.registrarSesion(15);
        juego2.registrarSesion(10);
        System.out.println("Juego 1: " + juego1.getNombre() + ", horas jugadas: " + juego1.getHorasJugadas() + ", es juego prolongado: " + juego1.esJuegoProlongado());
        System.out.println("Juego 2: " + juego2.getNombre() + ", horas jugadas: " + juego2.getHorasJugadas() + ", es juego prolongado: " + juego2.esJuegoProlongado());
    }
}