package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Student.getAverageGrade;

@AllArgsConstructor
@Data
public class Main {
    public static void main(String[] args) {



        // Создаем список студентов
        List<Student> students = Arrays.asList (
                new Student (  "Аппоринарий", Arrays.asList ( 5.0, 4.8, 4.9 ), "Информатика" ),
                new Student (  "Матильда", Arrays.asList ( 4.5, 4.6, 4.7 ), "Математика" ),
                new Student (  "Леонид", Arrays.asList ( 4.8, 4.9, 5.0 ), "Информатика" ),
                new Student (  "Феоклист", Arrays.asList ( 4.7, 4.6, 4.5 ), "Физика" ),
                new Student (  "Дмитрий", Arrays.asList ( 4.9, 4.8, 5.0 ), "Информатика" ),
                new Student (  "Евлампий", Arrays.asList ( 4.6, 4.7, 4.8 ), "Математика" ),
                new Student (  "Фекла", Arrays.asList ( 4.5, 4.4, 4.3 ), "Физика" ),
                new Student (  "Зульфия", Arrays.asList ( 5.0, 4.9, 4.8 ), "Информатика" ),
                new Student (  "Коловрат", Arrays.asList ( 4.4, 4.5, 4.6 ), "Математика" ),
                new Student (  "Симпомпони", Arrays.asList ( 4.3, 4.4, 4.5 ), "Физика" )
        );


                List<Student> filteredStudents = students.stream()
                        .filter(student -> student.getSpecialty().equals("Информатика"))
                        .filter(student -> getAverageGrade(student) > 4.5)
                        .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                        .limit(5)
                        .toList();

                // Выводим результат
                filteredStudents.forEach(student -> System.out.println(student.getName()));
            }


        }






