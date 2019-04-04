CREATE TABLE user (
  id bigint NOT NULL AUTO_INCREMENT,
  age integer,
  first_name varchar(255),
  last_name varchar(255),
  password varchar(255),
  salary bigint,
  username varchar(255),
  PRIMARY KEY (id)
) ENGINE = MYISAM;
INSERT INTO user (age, first_name, last_name, password, salary, username)
  VALUES (23, 'admin', 'admin', '$2a$10$eSVEcYk0LWKvD1dPejWL2eQIKAnUublByjypPWtbEcPxEViAKRBKu' /*PASSWORD 1*/, 12345, 'admin');


