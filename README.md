# demo
Actis ukázkový projekt

Pro testování API:
POST: http://localhost:8081/api/employees
  {
    "firstName": "Jane",
    "lastName": "Doe",
    "dateOfBirth": "1973-09-01",
    "personalNumber": 4,
    "isActive": true
  }
GET: http://localhost:8081/api/employees
PUT:  http://localhost:8081/api/employees/1
{
    "firstName": "Miroslav",
    "lastName": "Volf",
    "dateOfBirth": "1998-09-25",
    "personalNumber": 1,
    "isActive": false
}
DELETE: http://localhost:8081/api/employees/1
