CREATE TABLE eleicao(
	eleicao_id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    totalEleitores integer NOT NULL,
    totalValidos integer NOT NULL,
    totalBrancos integer NOT NULL,
    totalNulos integer NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO eleicao (totalEleitores,totalValidos,totalBrancos,totalNulos)
VALUES (1000,800,150,50);