import java.util.*;
public class StudentSet {
     
       String Name;
       int Roll_No;


       public StudentSet(String Name,int Roll_no)
       {
        this.Name = Name;
        this.Roll_No = Roll_no;
       }


    @Override
    public String toString() {
        return "StudentSet [Name=" + Name + ", Roll_No=" + Roll_No + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Roll_No;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentSet other = (StudentSet) obj;
        if (Roll_No != other.Roll_No)
            return false;
        return true;
    }

    

     

}
