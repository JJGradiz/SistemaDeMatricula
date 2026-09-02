package ni.edu.uam.sistemadematricula.Controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import ni.edu.uam.sistemadematricula.Estudiante;

import java.time.LocalDate;


public class EstudianteController {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCurso;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private ComboBox<String> cbDepartamento;
    @FXML
    private RadioButton rbMasculino;
    @FXML
    private RadioButton rbFemenino;
    @FXML
    private ToggleGroup grupoGenero;

    @FXML
    public void initialize() {
        cbDepartamento.setItems(FXCollections.observableArrayList(
                "Managua", "León", "Chinandega", "Masaya",
                "Matagalpa", "Jinotega", "Estelí", "Granada"
        ));

        if (rbMasculino != null) rbMasculino.setToggleGroup(grupoGenero);
        if (rbFemenino != null) rbFemenino.setToggleGroup(grupoGenero);
    }

    @FXML
    protected void guardarOnClick() {
        leerDatos();
        contarRegistros();
        limpiarFormulario();
    }

    private void leerDatos() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String curso = txtCurso.getText();
        LocalDate fechaNac = dpFechaNacimiento.getValue();
        String departamento = cbDepartamento.getValue();
        String genero = obtenerGeneroSeleccionado();
        agregarDatos(new Estudiante(nombre, apellido, curso, fechaNac, genero, departamento));
    }

    private String obtenerGeneroSeleccionado() {
        RadioButton radioSeleccionado = (RadioButton) grupoGenero.getSelectedToggle();
        return radioSeleccionado != null ? radioSeleccionado.getText() : null;
    }
    private void agregarDatos(Estudiante estudiante) {
        listado.agregar(estudiante);

    }

    private void contarRegistros() {
        int cantidad = listado.Obtener().size();
        lblRegistro.setText("Cantidad de estudiantes registrados: " + cantidad);

    }
    private void limpiarFormulario() {
        txtNombre.clear();
        txtApellido.clear();
        txtCarrera.clear();
        dpFechaNacimiento.setValue(null);
        cbDepartamento.setValue(null);
        grupoGenero.selectToggle(null);
    }
}
