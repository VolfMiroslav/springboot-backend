# Actis ukázkový projekt

### Databáze:
PostgreSQL. Nutnost vytvořit databázi employees. Porty nejsou nastavené na defaultní hodnoty, tedy je také bude nutnost změnit.
Změnit CrossOrigin v:

    src/main
        java/springboot
            controller 
                EmployeeController.java
#### Pro testování API:
#### POST: http://localhost:8081/api/employees
````
{
    "firstName": "Miroslav",
    "lastName": "Volf",
    "dateOfBirth": "1998-09-25",
    "personalNumber": 1,
    "isActive": false
}
````
#### GET: http://localhost:8081/api/employees
#### PUT:  http://localhost:8081/api/employees/1
````
{
    "firstName": "Miroslav",
    "lastName": "Volf",
    "dateOfBirth": "1998-09-25",
    "personalNumber": 1,
    "isActive": true
}
````
#### DELETE: http://localhost:8081/api/employees/1
