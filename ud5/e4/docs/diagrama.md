```Mermaid
classDiagram
    class LibraryService {
        -Map~String,Book~ books
        -Map~String,User~ users
        +addBook(book: Book) void
        +addUser(user: User) void
        +borrowBook(isbn: String, userId: String) Loan
        +returnBook(loan: Loan) void
    }

    class Book {
        -String isbn
        -String title
        -boolean available
        +Book(isbn: String, title: String)
        +getIsbn() String
        +getTitle() String
        +isAvailable() boolean
        +borrow() void
        +giveBack() void
    }

    class User {
        -String id
        -String name
        -List~Loan~ loans
        +User(id: String, name: String)
        +getId() String
        +getName() String
        +getLoans() List~Loan~
        +addLoan(loan: Loan) void
        +removeLoan(loan: Loan) void
    }

    class Loan {
        -Book book
        -User user
        -LocalDate startDate
        -LocalDate endDate
        +Loan(book: Book, user: User)
        +getBook() Book
        +getUser() User
        +getStartDate() LocalDate
        +closeLoan() void
        +isActive() boolean
    }

    %% Relaciones entre las clases
    LibraryService "*" --> "*" Book : gestiona (books)
    LibraryService "*" --> "*" User : gestiona (users)
    
    User "1" --> "0..3" Loan : tiene (loans)
    
    Loan "*" --> "1" Book : pertenece a (book)
    Loan "*" --> "1" User : asignado a (user)

    ```