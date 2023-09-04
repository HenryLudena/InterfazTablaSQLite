CREATE TABLE IF NOT EXISTS GERENTE_REGIONAL
(   ID_GERENTE_REGIONAL    INTEGER         PRIMARY KEY AUTOINCREMENT,
    NOMBRE                 VARCHAR(20)     NOT NULL,
    FECHA_CREACION         VARCHAR(20)     DEFAULT(datetime('now')),
    FECHA_MODIFICA         VARCHAR(20)     DEFAULT(datetime('now')),
    ESTADO                 VARCHAR(1)      DEFAULT('A')
);

SELECT * FROM GERENTE_REGIONAL 
INSERT INTO GERENTE_REGIONAL (NOMBRE) VALUES("Gerente Loja");
INSERT INTO GERENTE_REGIONAL (NOMBRE) VALUES("Gerente Pichincha");
INSERT INTO GERENTE_REGIONAL (NOMBRE) VALUES("Gerente Zamora");
INSERT INTO GERENTE_REGIONAL (NOMBRE) VALUES("Gerente Galapagos");

CREATE TABLE IF NOT EXISTS GERENTE_TIENDA
(   ID_GERENTE_TIENDA      INTEGER         PRIMARY KEY AUTOINCREMENT,
    ID_GERENTE_REGIONAL    INTEGER         NOT NULL,
    NOMBRE                 VARCHAR(20)     NOT NULL,
    FECHA_CREACION         VARCHAR(20)     DEFAULT(datetime('now')),
    FECHA_MODIFICA         VARCHAR(20)     DEFAULT(datetime('now')),
    ESTADO                 VARCHAR(1)      DEFAULT('A'),
    FOREIGN KEY (ID_GERENTE_REGIONAL) REFERENCES GERENTE_REGIONAL(ID_GERENTE_REGIONAL)
);

INSERT INTO GERENTE_TIENDA (NOMBRE, ID_GERENTE_REGIONAL) VALUES("Gerente Quito", 2);
INSERT INTO GERENTE_TIENDA (NOMBRE, ID_GERENTE_REGIONAL) VALUES("Gerente Loja", 1);
INSERT INTO GERENTE_TIENDA (NOMBRE, ID_GERENTE_REGIONAL) VALUES("Gerente Catamayo", 1);
INSERT INTO GERENTE_TIENDA (NOMBRE, ID_GERENTE_REGIONAL) VALUES("Gerente Isabela", 4);

CREATE TABLE IF NOT EXISTS VENDEDOR
(   ID_VENDEDOR            INTEGER         PRIMARY KEY AUTOINCREMENT,
    ID_GERENTE_TIENDA      INTEGER         NOT NULL,
    ID_GERENTE_REGIONAL    INTEGER         NOT NULL,
    NOMBRE                 VARCHAR(20)     NOT NULL,
    FECHA_CREACION         VARCHAR(20)     DEFAULT(datetime('now')),
    FECHA_MODIFICA         VARCHAR(20)     DEFAULT(datetime('now')),
    ESTADO                 VARCHAR(1)      DEFAULT('A'),
    FOREIGN KEY (ID_GERENTE_TIENDA) REFERENCES GERENTE_TIENDA(ID_GERENTE_TIENDA),
    FOREIGN KEY (ID_GERENTE_REGIONAL) REFERENCES GERENTE_REGIONAL(ID_GERENTE_REGIONAL)
);

INSERT INTO VENDEDOR (NOMBRE, ID_GERENTE_TIENDA, ID_GERENTE_REGIONAL) VALUES("Tienda A", 1, 2);
INSERT INTO VENDEDOR (NOMBRE, ID_GERENTE_TIENDA, ID_GERENTE_REGIONAL) VALUES("Tienda B",2, 1);
INSERT INTO VENDEDOR (NOMBRE, ID_GERENTE_TIENDA, ID_GERENTE_REGIONAL) VALUES("Tienda C",3, 1);
INSERT INTO VENDEDOR (NOMBRE, ID_GERENTE_TIENDA, ID_GERENTE_REGIONAL) VALUES("Tienda D",4, 4);

SELECT gr.NOMBRE, gr.ID_GERENTE_REGIONAL, gr.ESTADO, gt.NOMBRE, gt.ID_GERENTE_TIENDA, gt.ESTADO, ve.NOMBRE, ve.ID_VENDEDOR, ve.ESTADO 
FROM VENDEDOR ve 
JOIN GERENTE_REGIONAL gr ON gr.ID_GERENTE_REGIONAL = ve.ID_GERENTE_REGIONAL 
JOIN GERENTE_TIENDA gt ON gt.ID_GERENTE_TIENDA = ve.ID_GERENTE_TIENDA 
WHERE ve.ESTADO = 'A';

UPDATE VENDEDOR SET ESTADO = 'A' WHERE ID_VENDEDOR = 2
