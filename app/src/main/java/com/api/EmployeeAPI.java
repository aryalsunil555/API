package com.api;

import java.util.List;

import model.Employee;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EmployeeAPI {
    @GET("employees")
    Call<List<Employee>> getEmployee();

    //get employee on the basis of empoyee id
@GET("employee/{empID}")


    Call<Employee> getEmployeeByID(@Path("empID") int empID);
}

