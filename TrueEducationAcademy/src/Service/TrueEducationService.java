
package Service;

import DB.Database;
import Models.Student;
import Models.Lecturer;
import Models.underStudent;


public class TrueEducationService {
    
    ///////////
    public void underAddStudent(underStudent understudent){
    Database db =new Database();
    db.underaAddStudent(understudent);
    
    }
    
    public void underdeleteStudent(underStudent understudent)
{
    Database db = new Database();
    db.underdeleteStudent(understudent);
}
    
    
    
    public void underupdateStudent(underStudent understudent)
{
    Database db = new Database();
    db.UnderupdateStudent(understudent);
}
    
    
    public void UnderviewStudent(underStudent understudent)
{
    Database db = new Database();
    db.underviewStudent(understudent);
}

    
    
    
    /////////
    
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

public void updateStudent(Student student)
{
    Database DB = new Database();
    DB.updateStudent(student);
}

public void addLecturer(Lecturer lecturer)
{
    Database DB = new Database();
    DB.addLecturer(lecturer);
}

public void deleteLecturer(Lecturer lecturer)
{
    Database DB = new Database();
    DB.deleteLecturer(lecturer);
}

public void viewLecturer(Lecturer lecturer)
{
    Database DB = new Database();
    DB.viewLecturer(lecturer);
}

public void updateLecturer(Lecturer lecturer)
{
    Database DB = new Database();
    DB.updateLecturer(lecturer);

}

}
