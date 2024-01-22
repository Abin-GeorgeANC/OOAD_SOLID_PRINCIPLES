# SOLID PRINCIPLES ASSIGNMENT
 
## SINGLE RESPONSIBILITY PRINCIPLE (SRP)
### User Class
The `User` class is responsible for encapsulating user information, providing methods to retrieve the users username,email and password. It adheres to the SRP by focusing solely on the management of User and associated data.
 
## OPEN-CLOSED PRINCIPLE (OCP)
### Regular Account Service Class, Login Service Interface , Register User Interface
The `Regular Account Service` Class implements `login` and `register_user` interface for normal users. To add more types of users you can just implement the interfaces. For a  premium user the 
same interfaces can be implemented for them without modifying anything.All user types are sub classes of `Account Service` class which can host all the common methods.
 
## LISKOV SUBSTITUTION PRINCIPLE (LSP)
### PremiumUser Class
The `PremiumUser` class extends the `User` class. The premium user class can be substituted where ever the user class is used. An example for this is the show user method which
user is logged in and users type.
 
## INTERFACE SEGREGATION PRINCIPLE (ISP)
### PhoneOtp Interface
The `phoneOtp` Interface is implemeted to `Regular Account Service` Class . The otp authentication methods can be clubbed together but different user types like premium members can 
only access other otp methods like `emailOtp` so differnt interfaces are  created for them instead of a single one.
 
## DEPENDENCY INVERSION PRINCIPLE (DIP)
### NotificationManager class
The `NotificationManager` class adheres to the Dependency Inversion Principle by depending on abstraction of `NotificationService` Interface rather than concrete implementations like `EmailNotificationService`. This promotes flexibility and ease of extension.
