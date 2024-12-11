# restservice


Here are example requests for the endpoints defined in your controller, including the newly added /process endpoint:

1. Get All Items
   HTTP Method: GET
   Endpoint: /api/items
   Example Request:

http
Copy code
GET /api/items HTTP/1.1
Host: localhost:8080
2. Get Item by ID
   HTTP Method: GET
   Endpoint: /api/items/{id}
   Example Request:

http
Copy code
GET /api/items/1 HTTP/1.1
Host: localhost:8080
3. Create a New Item
   HTTP Method: POST
   Endpoint: /api/items
   Headers:

Content-Type: application/json
Example Request:
http
Copy code
POST /api/items HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"name": "Sample Item",
"description": "This is a sample item."
}
4. Delete an Item by ID
   HTTP Method: DELETE
   Endpoint: /api/items/{id}
   Example Request:

http
Copy code
DELETE /api/items/1 HTTP/1.1
Host: localhost:8080
5. Process Form and Fin
   HTTP Method: POST
   Endpoint: /api/items/process
   Headers:

Content-Type: application/x-www-form-urlencoded
Example Request:
http
Copy code
POST /api/items/process HTTP/1.1
Host: localhost:8080
Content-Type: application/x-www-form-urlencoded

form=testForm&fin=testFin
cURL Commands for Testing
You can use the following cURL commands to test the API:

Get All Items:

bash
Copy code
curl -X GET http://localhost:8080/api/items
Get Item by ID:

bash
Copy code
curl -X GET http://localhost:8080/api/items/1
Create a New Item:

bash
Copy code
curl -X POST http://localhost:8080/api/items \
-H "Content-Type: application/json" \
-d '{"name":"Sample Item","description":"This is a sample item."}'
Delete an Item:

bash
Copy code
curl -X DELETE http://localhost:8080/api/items/1
Process Form and Fin:

bash
Copy code
curl -X POST http://localhost:8080/api/items/process \
-H "Content-Type: application/x-www-form-urlencoded" \
-d "form=testForm&fin=testFin"
These examples should help you test your REST service efficiently. Let me know if you need additional examples or explanations!