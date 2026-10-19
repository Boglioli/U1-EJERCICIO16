public class VideoJuego {
    private String nombre;
    private String genero;
    private double horasJugadas;
    public VideoJuego(String nombre, String genero, double horasJugadas) {
        if(horasJugadas < 0) {
            throw new IllegalArgumentException("Las horas jugadas no pueden ser negativas");
        }
        this.nombre = nombre;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setHorasJugadas(double horas) {
        if(horas < 0) {
            throw new IllegalArgumentException("Las horas jugadas no pueden ser negativas");
        }
        this.horasJugadas = horas;
    }
    public void registrarSesion(double horas) {
        if(horas < 0) {
            throw new IllegalArgumentException("Las horas jugadas no pueden ser negativas");
        }
        this.horasJugadas += horas;
    }
    public double getHorasJugadas() {
        return horasJugadas;
    }
    public boolean esJuegoProlongado() {
        return horasJugadas > 50;
    }
}