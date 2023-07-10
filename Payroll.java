-- Create the Employee table
CREATE TABLE Employee (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  salary DECIMAL(10, 2) NOT NULL
);

-- Insert sample data into the Employee table
INSERT INTO Employee (name, salary) VALUES
  ('John Doe', 5000.00),
  ('Jane Smith', 6000.00),
  ('Michael Johnson', 4500.00),
  ('Emily Davis', 5500.00),
  ('Robert Brown', 7000.00);

-- Calculate the total salary of all employees
SELECT SUM(salary) AS total_salary FROM Employee;

-- Calculate the average salary of all employees
SELECT AVG(salary) AS average_salary FROM Employee;

-- Find the employee with the highest salary
SELECT * FROM Employee ORDER BY salary DESC LIMIT 1;

-- Update the salary of an employee
UPDATE Employee SET salary = 6500.00 WHERE id = 3;

-- Delete an employee
DELETE FROM Employee WHERE id = 5;
