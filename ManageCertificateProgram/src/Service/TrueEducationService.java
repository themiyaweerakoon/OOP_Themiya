
package Service;

import DB.Database;
import Models.Student;


public class TrueEducationService {
    
public void addStudent(Student student)
{
    Database DB = new Database();
    DB.addStudent(student);
}

}
