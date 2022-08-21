INSERT INTO USUARIO(nome, email, senha) VALUES('Fulano', 'fulano@email.com', '$2a$10$8kS.lt0NtfJ/KDBWw3Hte.I9yOP3bXRHWlw4teO9njY8LI3bO5oUu');
INSERT INTO USUARIO(nome, email, senha) VALUES('Cicrano', 'cicrano@email.com', '$2a$10$8kS.lt0NtfJ/KDBWw3Hte.I9yOP3bXRHWlw4teO9njY8LI3bO5oUu');

INSERT INTO tb_role(nome) values('ROLE_ADMIN');
INSERT INTO tb_role(nome) values('ROLE_USER');


INSERT INTO USUARIO_roles values(1,1);
INSERT INTO USUARIO_roles values(2,2);



