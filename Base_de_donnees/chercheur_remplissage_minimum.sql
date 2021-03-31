INSERT INTO emploeur (id_employer, name_employer)
VALUES (1, 'Daignant');


INSERT INTO researcher (id_orcid_researcher, surname_researcher, name_researcher, id_employer, status, email_address )
VALUES (1, 'Marcel', 'Dupont', 1, 'Chercheur spécialisé en chirurgie', 'm.dpt@yahoo.fr');

SELECT * FROM researcher;