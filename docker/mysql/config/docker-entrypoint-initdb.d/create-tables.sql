CREATE TABLE accounts (
    id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60) NOT NULL
);

CREATE TABLE categories (
    id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60) NOT NULL
);

CREATE TABLE parties (
    id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    iban VARCHAR(60) NOT NULL,
    name VARCHAR(60),
    category_id INT(11)
);

CREATE TABLE transactions (
    id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    amount DECIMAL(6,2) NOT NULL,
    transferred_on DATETIME NOT NULL,
    description TEXT,
    category_id INT(11),
    account_id INT(11) NOT NULL,
    party_id INT(11) NOT NULL
);