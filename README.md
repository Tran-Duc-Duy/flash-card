# FlashCard. Service.

## Description

Implement [`org.example.sevice.ServiceFactory`](src/main/java/org/example/sevice/ServiceFactory.java) method.  
It should return an Employee service instance.  
You may refer to DDL in [`init-ddl.sql`](src/main/resources/init-ddl.sql).  
You may not change classes in `org.example.domain` package.

It should return class QueueFlashCard:  
Funtion:   
[`setTime`](src/main/java/org/example/QueueFlashCard.java) take in an option and a flashcard
- with option 1, time adds 10
- with option 2, time adds 20
- with option 3, time adds 90

[`learn`](src/main/java/org/example/QueueFlashCard.java) read data from database, sort by wait time
- list is a list of order 1, 2, 3
- perform time increment of flashCard list in order of input list