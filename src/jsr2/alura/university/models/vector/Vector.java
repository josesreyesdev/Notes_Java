package jsr2.alura.university.models.vector;

import java.util.Arrays;

public class Vector {

    private Student[] students = new Student[100];
    private int totalStudents = 0;

    // AGREGAR
    public void add(Student student) {
        // Agregar un alumno
        this.saveSpace();

        this.students[totalStudents] = student;
        totalStudents++;
    }

    // AGREGAR EN POSICION ESPECIFICA
    public void addInPosition(int position, Student student) {

        this.saveSpace();

        if (positionValid(position)) {
            throw new IllegalArgumentException("Position Invalida, no puedo agregar en la position: " + position);
        }

        for (int i = totalStudents - 1; i >= position; i -= 1) {
            students[i + 1] = students[i];
        }
        students[position] = student;
        totalStudents++;
    }

    // OBTENER
    public Student getStudent(int position) {
        // recibir una posicion y devolder un alumno
        if (!positionHeld(position)) {
            throw new IllegalArgumentException("Posicion Invalida, no puedo obtener el student");
        }

        return students[position];
    }

    private boolean positionHeld(int position) { // posicion ocupada
        return position >= 0 && position < totalStudents;
    }

    private boolean positionValid(int position) {
        return position < 0 || position > totalStudents;
    }

    // ELIMINAR
    public void remove(int position) {
        //eliminar por posicion

        if (positionValid(position)) {
            throw new IllegalArgumentException("Position Invalida, al querer eliminar");
        }

        for (int i = position; i < this.totalStudents; i++) {
            this.students[i] = this.students[i + 1];
        }
        totalStudents--;
    }

    // CONTIENE
    public boolean contains(Student student) {
        //Saber si esta el alumno o no en la lista
        for (int i = 0; i < totalStudents; i++) {
            if (student.equals(students[i])) {
                return true;
            }
        }
        return false;
    }

    // TAMAÑO
    public int size() {
        //devuelve la cantidad de alumnos
        return totalStudents;
    }

    @Override
    public String toString() {
        // Facilitará la impresion
        return Arrays.toString(students);
    }

    private void saveSpace() {
        if (totalStudents == students.length) {
            Student[] newArray = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newArray[i] = students[i];
            }
            this.students = newArray;
        }
    }
}
