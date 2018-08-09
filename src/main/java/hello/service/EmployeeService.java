package hello.service;

import hello.entity.Employee;
import hello.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    /**
     *
     * @return
     */
    public List<Employee> getAllEmployees(){
        List<Employee> toReturn;

        toReturn = (List<Employee>) employeeRepository.findAll();

        return toReturn;
    }

    /**
     *
     *
     * @param empId
     * @return
     */
    public Employee getEmployeeById(Integer empId){
        Employee toReturn = employeeRepository.findById(empId).get();
        return toReturn;
    }

    /**
     *
     * @param employee
     */
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);

    }
    public boolean updateEmployee(Employee employee)
    {   Employee employee1 = null;
        employee1 = employeeRepository.save(employee);
        if(employee1!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public void deleteById(Integer empId){
        employeeRepository.deleteById(empId);
    }


}
