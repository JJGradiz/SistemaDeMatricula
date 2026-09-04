package ni.edu.uam.sistemadematricula.dao;

import ni.edu.uam.registro_app.Interfaces.Grud;
import ni.edu.uam.sistemadematricula..modelos.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDao implements Grud<Estudiante> {

    List <Estudiante> estudiantes = new ArrayList<>();

    public EstudianteDao() {
        estudiantes = new ArrayList<>();
    }

    @Override
    public void agregar(Estudiante entidad) {
        estudiantes.add(entidad);

    }

    @Override
    public List<Estudiante> Obtener() {
        return estudiantes;
    }
}
