## SOLID Principle

> S - Single responsibility
```
Each class or Entity have only Single responsibility (Specific Purpose)


class ReportService {
    void generateReport(); -> Good
    void showReport() -> Good

    void saveToFile(); 
    // Bad As It can be handle by separate class
}
```

> O - Open/Close 

```
Open for extension and Close for Modification

class Rectangle {
    int width;
    int height;
}

class AreaCalculator{
    int calculateArea(Rectangle rec){
        return rec.width * rec.height;
    }
}

to calculate area of previous rectangle , we did not touch/modify existing class
rather we handle by another class
```

> L - Liskov Substitution 
```
It states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. In simpler terms, subclass should behave like the superclass also.

class Bird{
    void fly(); 
}

class Penguin{
    void fly(){
        throw new Exception("Method is Unsupported!!")
    }
    //this bird can not fly
}

the ‘Penguin’ class violates the LSP because it doesn’t behave like its superclass. A better approach might be to remove the ‘fly’ method from the ‘Bird’ superclass and create a separate ‘FlyingBird’ interface for birds that can fly.
```
> I - Interface Segregation
```
It suggests that a class should not be forced to implement interfaces it does not use. It’s better to have several small, specific interfaces rather than a large

interface Worker{
    eat();
    work();
    //Bad design
}

// Good Design as separated
interface Eatable{
    eat();
}

interface Workable{
    work();
}

```

> D - Dependency Inversion
```
Higher module should not tightly couple or direct dependent on Lower module, Better they both are attached to a abstraction layer 

// Abstraction: Defines the contract for sending messages
public interface MessageService {
    void sendMessage(String message, String recipient);
}

// Low-level module: Concrete implementation for sending emails
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {}
}

// Low-level module: Concrete implementation for sending SMS
public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {}
}

// High-level module: Depends on the MessageService abstraction
public class NotificationService {
    private final MessageService messageService;

    // Dependency Injection via constructor
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}
```