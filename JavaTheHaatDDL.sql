CREATE TABLE users (
u_id INT,
fname VARCHAR2(40) NOT NULL,
lname VARCHAR2(40) NOT NULL,
email VARCHAR2(40) NOT NULL,
username VARCHAR2(40) NOT NULL UNIQUE,
password VARCHAR2(40) NOT NULL,
profile_pic VARCHAR2(4000),
acc_type_id INT NOT NULL,
acc_status_id INT NOT NULL,
PRIMARY KEY (u_id),
FOREIGN KEY (acc_type_id) REFERENCES account_type (acc_type_id),
FOREIGN KEY (acc_status_id) REFERENCES account_status (acc_status_id)
);

CREATE TABLE account_type (
acc_type_id INT,
acc_type VARCHAR2(40) NOT NULL UNIQUE,
PRIMARY KEY (acc_type_id)
);

CREATE TABLE account_status (
acc_status_id INT,
acc_status VARCHAR2(40) NOT NULL UNIQUE,
PRIMARY KEY (acc_status_id)
);

CREATE TABLE posts (
p_id INT,
u_id INT NOT NULL,
title VARCHAR2(100) NOT NULL,
description VARCHAR2(4000) NOT NULL,
video VARCHAR2(4000),
time_submission TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
category_id INT NOT NULL,
PRIMARY KEY (p_id),
FOREIGN KEY (u_id) REFERENCES users (u_id),
FOREIGN KEY (category_id) REFERENCES category (category_id)
);

CREATE TABLE category (
category_id INT,
category VARCHAR2 (40) NOT NULL UNIQUE,
PRIMARY KEY (category_id)
);

CREATE TABLE steps (
s_id INT,
p_id INT NOT NULL,
step_num INT NOT NULL,
step_name VARCHAR2(100) NOT NULL,
step_text VARCHAR2(4000) NOT NULL,
pic VARCHAR2(4000),
PRIMARY KEY (s_id),
FOREIGN KEY (p_id) REFERENCES posts (p_id)
);

CREATE TABLE comments (
c_id INT,
p_id INT NOT NULL,
u_id INT NOT NULL,
comment_text VARCHAR2 (4000) NOT NULL,
time_submission TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (c_id),
FOREIGN KEY (p_id) REFERENCES posts (p_id),
FOREIGN KEY (u_id) REFERENCES users (u_id)
);

CREATE TABLE favorites (
u_id INT,
p_id INT,
PRIMARY KEY (u_id, p_id),
FOREIGN KEY (u_id) REFERENCES users (u_id),
FOREIGN KEY (p_id) REFERENCES posts (p_id)
);











