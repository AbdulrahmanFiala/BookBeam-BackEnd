# BookBeam-BackEnd 

## Description
BookBeam is a library web application designed to efficiently manage web-based libraries. It provides a comprehensive set of features for both users and administrators, facilitating easy access to library resources and seamless management of library operations. Identity management is handled using Okta for secure authentication and authorization.

### User Features:
- Browse available books.
- Search for a certain book.
- View the details of a certain book.
- Check out a certain book.
- Review a book and explore previous reviews.
- Manage book loans.
- Return a book.
- Renew a book loan.
- Browse previously checked-out books.
- Pay fees for late books using Stripe.
- Ask questions to the admin.
- Explore previously answered questions.

### Admin Features:
- Admin panel with secure access controls.
- Answer users' questions.
- Change the quantity of a certain book.
- Add new books to the library.
- Delete books from the library.


## Installation

### Prerequisites
- Java Development Kit (JDK) version 17.0.10 (LTS) installed
- Maven build tool installed
- MySQL installed and running
- Okta Account
- Stripe Account

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/AbdulrahmanFiala/BookBeam-BackEnd.git

2. Navigate to the project directory:
   ```bash
   cd "BookBeam-BackEnd"

3. Switch to the development branch
   ```bash
   git checkout development

4. Open and execute the bookbeamdatabase.sql to create the database filled with tables and dummy-data.


5. Move to the .env.example file location and change it to .env
   ```bash
   cd ./src/main/resources
   mv .env.example .env

6. Open the .env file and fill it with your database credentials, Okta credentials, and Stripe credentials.

7. Move back to the root directory of the project and run the project using Maven:
   ```bash
   cd ../../
   mvn spring-boot:run

### Setting Up Okta and Stripe

To use certain features of this application, such as user authentication and payment processing, you need to set up Okta and Stripe accounts and
configure them with your application. Follow the steps below to get started:

### Setting Up Okta
1. **Create an Okta Account**: If you don't already have one, sign up for an Okta account at [https://developer.okta.com/](https://developer.okta.com/).
2. **Create an Okta Application**: Log in to your Okta Developer account and create a new Web Application. Make note of the Client ID generated for your application
and OKTA Issuer generated for your account.
3. **Configure Redirect URIs**: Configure the redirect URIs for your Okta application.
4. **Update Application Properties**: Open the `.env` file in the `src/main/resources` directory and fill in the `OKTA_CLIENT_ID` and `OKTA_ISSUER`
fields with your Okta application's Client ID and OKTA Account Issuer.
5. Create two type of users, user with admin privliages and user without admin privlages.

### Setting Up Stripe
1. **Create a Stripe Account**: If you don't already have one, sign up for a Stripe account at [https://stripe.com/](https://stripe.com/).
2. **Get API Keys**: Retrieve your Stripe API keys from the Stripe Dashboard. You'll need the Secret Key.
3. **Update Application Properties**: Open the `.env` file in the `src/main/resources` directory and fill in the `STRIPE_SECRET_KEY` field with your Stripe API key.

Once you've completed these steps, your application will be configured to use Okta for user authentication and Stripe for payment processing.



## Usage
Once the application is running, you can access it in your web browser at:
[http://localhost:7000](http://localhost:7000)

For the frontend of the application, you can refer to the [BookBeam-FrontEnd](https://github.com/AbdulrahmanFiala/BookBeam-FrontEnd) repository.

