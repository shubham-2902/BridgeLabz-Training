public class DividePens
 {
    public static void main(String[] args)
     {

        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;// Calculated pen distributed among students
        int remainingPens = totalPens % students;// Calculated remaining pens

        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens
        );
     }
 }
