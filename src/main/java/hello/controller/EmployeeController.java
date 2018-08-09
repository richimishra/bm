package hello.controller;

import hello.entity.Employee;
import hello.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /*
    * getAllEmployees() call the service to fetch the records.
    *
     */
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    /*
    * getEmployeeById() calls the service to fetch the particular employee
    * param : empId (Integer) : empId of the employee
     */
    @GetMapping("/getEmployeeById")
    public Employee getEmployeeById(@RequestParam int empId){
        return employeeService.getEmployeeById(empId);
    }

    /*
    * addEmployee() calls the service to ad the employee
    * param: Employee Object : Json Object / Employee Object
     */
    @RequestMapping(value="/addEmployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    /**
     *
     * @param employee
     */
    @RequestMapping(value ="/updateEmployee",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }


    @RequestMapping(value="/deleteById",method= RequestMethod.DELETE )
     public void deleteById(@RequestParam int empId){
         employeeService.deleteById(empId);
    }
    }

