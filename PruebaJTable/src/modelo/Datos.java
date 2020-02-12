package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Datos extends AbstractTableModel {

    private final ArrayList<Persona> personas;
    private final String[] nombresColumnas = {"ID","Nombre","Edad","Teléfono","Profesión"};

    public Datos() {
   
        personas = new ArrayList<>();
        Persona p1 = new Persona(1, "Luis", 22, 981212223, "Pintor");
        Persona p2 = new Persona(2, "Eva", 33, 981212121, "Inspectora");
        Persona p3 = new Persona(3, "Juan", 44, 987656765, "Administrativo");
        Persona p4 = new Persona(4, "Antonio", 55, 657453453, "Cantamañanas");
        Persona p5 = new Persona(5, "Reina", 24, 654564323, "Vaga");
        Persona p6 = new Persona(6, "Lolo", 43, 986874342, "Funcionario");
        Persona p7 = new Persona(7, "Carmina", 21, 912343546, "Ganadera");
        Persona p8 = new Persona(8, "Nona", 64, 878767545, "Agricultora");
        Persona p9 = new Persona(9, "Wences", 59, 956453432, "Pastor");
        Persona p10 = new Persona(10, "Pipo", 68, 666777888, "Programador");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);
        personas.add(p7);
        personas.add(p8);
        personas.add(p9);
        personas.add(p10);
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Persona p = personas.get(fila);
        switch (columna) {
            case 0:
                return p.getId();
            case 1:
                return p.getNombre();
            case 2:
                return p.getEdad();
            case 3:
                return p.getTelefono();
            case 4:
                return p.getProfesion();
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return nombresColumnas[i];
    }
    
    public void guardarPersona(Persona p){
        personas.set(personas.indexOf(p), p);
        fireTableDataChanged();
    }
    

}
