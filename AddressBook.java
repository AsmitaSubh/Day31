-- Create the AddressBook table
CREATE TABLE AddressBook (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  phone VARCHAR(20),
  email VARCHAR(100)
);

-- Insert sample data into the AddressBook table
INSERT INTO AddressBook (name, phone, email) VALUES
  ('John Doe', '1234567890', 'john.doe@example.com'),
  ('Jane Smith', '9876543210', 'jane.smith@example.com'),
  ('Michael Johnson', '5678901234', 'michael.johnson@example.com'),
  ('Emily Davis', '4567890123', 'emily.davis@example.com'),
  ('Robert Brown', '7890123456', 'robert.brown@example.com');

-- Retrieve all contacts from the AddressBook
SELECT * FROM AddressBook;

-- Search for a contact by name
SELECT * FROM AddressBook WHERE name LIKE '%John%';

-- Update the phone number of a contact
UPDATE AddressBook SET phone = '5555555555' WHERE id = 3;

-- Delete a contact
DELETE FROM AddressBook WHERE id = 5;
