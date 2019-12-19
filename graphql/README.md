Spring Boot with GraphQL Query Example
Book Store
/api/v1/books is the REST resource which can fetch Books information
DataFetchers are Interfaces for RuntimeWiring of GraphQL with JpaRepository

Sample GraphQL Scalar Queries
Accessible under http://localhost:8081/api/v1/books
Usage for allBooks { allBooks { isn title authors publisher } }
Usage for book { book(id: "123") { title authors publisher }


input:
{
    allBooks{
    	isn
    	title
    	authors
    }
}
---
{
    book(id: "123")
    {
    	isn
    	title
    	authors
    }
}

----

{
    book(id: "123")
    {
    	isn
    	title
    	authors
    }
    allBooks{
    	isn
    	title
    	authors
    }
}

