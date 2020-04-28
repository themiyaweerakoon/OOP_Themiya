
package Service;

import DB.Database;
import Models.Student;


public class TrueEducationService {
    
public void addStudent(Student student)
{
    Database DB = new Database();
    DB.addStudent(student);
}

public void deleteStudent(Student student)
{
    Database DB = new Database();
    DB.deleteStudent(student);
}

public void viewStudent(Student student)
{
    Database DB = new Database();
    DB.viewStudent(student);
}

}
