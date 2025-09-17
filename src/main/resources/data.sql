INSERT INTO patient_list (id, patient, email, birth_date, gender, blood_group)
VALUES
 (1, 'Test Patient', 'test.patient@example.com', '1990-01-01', 'Male', 'A_POSITIVE'),
 (2, 'Amit Sharma', 'amit.sharma@example.com', '1995-03-12', 'Male', 'A_POSITIVE'),
 (3, 'Priya Verma', 'priya.verma@example.com', '1998-07-25', 'Female', 'B_NEGATIVE'),
 (4, 'Rahul Singh', 'rahul.singh@example.com', '1987-11-05', 'Male', 'O_POSITIVE'),
 (5, 'Sneha Patel', 'sneha.patel@example.com', '1992-01-18', 'Female', 'AB_NEGATIVE'),
 (6, 'Vikas Yadav', 'vikas.yadav@example.com', '2000-09-09', 'Male', 'B_POSITIVE');

INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Rakesh Mehta', 'Cardiology', 'rakesh.mehta@example.com'),
    ('Dr. Sneha Kapoor', 'Dermatology', 'sneha.kapoor@example.com'),
    ('Dr. Arjun Nair', 'Orthopedics', 'arjun.nair@example.com');
