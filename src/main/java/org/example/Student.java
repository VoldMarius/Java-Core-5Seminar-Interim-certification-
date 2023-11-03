package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;



import java.util.List;


@AllArgsConstructor
@Data
public class Student   {

    private String name;
    private List<Double> Grade;
    private String Specialty;




    static double getAverageGrade(Student student) {
        return student.getGrade().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}

