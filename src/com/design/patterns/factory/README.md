# How it works?

1 - We have an `abstract class Employee`\
`abstract` so that can't be instantiated and has all the common Employee features\
All employees have `name`, `occupation` and `salary`

2 - Implements `IEmployee` interface because we have to make sure the defined function `doWork` is going to be implemented
in the future employee classes. Every employee does work.

3 - We define `BackendEngineer` class which `extends Employee` so that we can have access to 
and set  `name`, `occupation` and `salary`
(done in the constructor).

Backend engineers do different job from frontend and other employees that's why we have to `override` `doWork`
method and implement the logic for the concrete engineer. In our case the backend engineer 
is `Designing scalable RESTful APIs`

4 - It's the same for `FrontendEngineer` and all other employees. But in this case the frontend engineer job is to 
`Implement visual elements`

5 - `EmployeeFactory` is our FACTORY which instantiates the object we need without direct contact
with the objects themselves. 

Returns `Employee` object, don't forget all the other classes extend `Employee`

    public Employee getEmployee(String employee) {
    
We have to distinguish which object we need to be instantiated, that's why we need the `if/else`

    if (employee.equalsIgnoreCase("backend")) {
        return new BackendEngineer();
    }
    
Once we know which object we need we instantiate it like usual

    return new BackendEngineer();
    
Let's not forget that our `getEmpoloyee` method returns an object from type `Employee`
and  `BackendEngineer` extends `Employee` that's why this is possible

6 - `Main` you can see the result and how factory pattern works and instantiates the needed object