CREATE TABLE usuarios (
      id INT AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(255) NOT NULL,
      email VARCHAR(255) NOT NULL UNIQUE
);

INSERT INTO usuarios (name, email) VALUES ('Alice Smith', 'alice.smith@example.com');
INSERT INTO usuarios (name, email) VALUES ('Bob Johnson', 'bob.johnson@example.com');
INSERT INTO usuarios (name, email) VALUES ('Charlie Brown', 'charlie.brown@example.com');
INSERT INTO usuarios (name, email) VALUES ('Diana Prince', 'diana.prince@example.com');
INSERT INTO usuarios (name, email) VALUES ('Eve Adams', 'eve.adams@example.com');
