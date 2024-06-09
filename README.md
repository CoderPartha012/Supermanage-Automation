### Project Workflow for Automation Testing

This project automates various functionalities of the SuperManage platform using Selenium WebDriver and TestNG. The primary goal is to ensure that different aspects of the platform, such as user login, employee management, and attendance tracking, function correctly and efficiently.

#### Workflow Steps:

1. **Setup and Configuration:**
   - Initialize the WebDriver for Chrome.
   - Configure WebDriver settings such as implicit wait and window maximization.
   - Set the URL for the SuperManage platform's login page.

2. **User Login:**
   - Navigate to the login page.
   - Enter the mobile number and submit the form.
   - Enter the OTP and submit the form.

3. **Scrolling Through the Dashboard:**
   - Use JavaScript to scroll down the dashboard multiple times.
   - Scroll back to the top of the page.

4. **Navigate to Employee Section:**
   - Click on the "Employee" section in the navigation menu.
   - Click on the button to add a new employee.

5. **Add New Employee:**
   - Enter employee details such as name, mobile number, date of joining, designation, employee type, salary, leave, shift name, in-time, and out-time.
   - Click on the "Create" button to add the employee.

6. **Mark Attendance:**
   - Navigate to the attendance section.
   - Select an employee and mark attendance for them.

7. **Overtime Section:**
   - Navigate to the "Overtime" section.
   - Click on the "Employee" tab and use the search field to find an employee by name.
   - Select the employee from the suggestions and mark overtime.

8. **Error Handling and Cleanup:**
   - Implement try-catch blocks to handle exceptions.
   - Close the browser after the operations are completed.
