package ni.edu.uam.sistemadematricula.interfaces;

public interface Grud <T>{
    public void agregar(T entidad);

    public List<T> ObtenerRegistro();

}
