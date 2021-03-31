
CREATE SEQUENCE public.admin_id_admin_seq;

CREATE TABLE public.Admin (
                id_admin INTEGER NOT NULL DEFAULT nextval('public.admin_id_admin_seq'),
                login VARCHAR,
                password VARCHAR,
                CONSTRAINT pk_admin PRIMARY KEY (id_admin)
);


ALTER SEQUENCE public.admin_id_admin_seq OWNED BY public.Admin.id_admin;

CREATE SEQUENCE public.referent_id_referent_seq;

CREATE TABLE public.Referent (
                id_referent INTEGER NOT NULL DEFAULT nextval('public.referent_id_referent_seq'),
                login VARCHAR,
                password VARCHAR,
                CONSTRAINT pk_referent PRIMARY KEY (id_referent)
);


ALTER SEQUENCE public.referent_id_referent_seq OWNED BY public.Referent.id_referent;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_18;

CREATE TABLE public.Status_thesis (
                id_status_thesis INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_18'),
                name_choice VARCHAR,
                CONSTRAINT pk_status_thesis PRIMARY KEY (id_status_thesis)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_18 OWNED BY public.Status_thesis.id_status_thesis;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_17;

CREATE TABLE public.Background_student (
                id_background INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_17'),
                name_choice VARCHAR,
                CONSTRAINT pk_background_student PRIMARY KEY (id_background)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_17 OWNED BY public.Background_student.id_background;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_16;

CREATE TABLE public.Role_pi_scientific_recognition (
                id_role_pi INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_16'),
                name_choice VARCHAR,
                CONSTRAINT pk_role_pi_scientific_recognition PRIMARY KEY (id_role_pi)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_16 OWNED BY public.Role_pi_scientific_recognition.id_role_pi;

CREATE SEQUENCE public.scientific_recognition_award_responsibility_foreign_stay_id_671;

CREATE TABLE public.Sr_responsibility_learned_scientific_society (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.scientific_recognition_award_responsibility_foreign_stay_id_671'),
                scientific_society_name VARCHAR,
                start_date DATE,
                end_date DATE,
                id_role_pi INTEGER,
                CONSTRAINT pk_sr_responsibility_learned_scientific_society PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.scientific_recognition_award_responsibility_foreign_stay_id_671 OWNED BY public.Sr_responsibility_learned_scientific_society.id_activity;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_14;

CREATE TABLE public.Role_pi_lab_eval (
                id_role_pi_lab_eval INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_14'),
                name_choice VARCHAR,
                CONSTRAINT pk_role_pi_lab_eval PRIMARY KEY (id_role_pi_lab_eval)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_14 OWNED BY public.Role_pi_lab_eval.id_role_pi_lab_eval;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_13;

CREATE TABLE public.Role_pi_grant (
                id_role_pi_grant INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_13'),
                name_choice VARCHAR,
                CONSTRAINT pk_role_pi_grant PRIMARY KEY (id_role_pi_grant)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_13 OWNED BY public.Role_pi_grant.id_role_pi_grant;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_12;

CREATE TABLE public.Category_grant (
                id_category_grant INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_12'),
                name_choice VARCHAR,
                CONSTRAINT pk_category_grant PRIMARY KEY (id_category_grant)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_12 OWNED BY public.Category_grant.id_category_grant;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_11;

CREATE TABLE public.Role_pi_thesis (
                id_role_pi_thesis INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_11'),
                name_choice VARCHAR,
                CONSTRAINT pk_role_pi_thesis PRIMARY KEY (id_role_pi_thesis)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_11 OWNED BY public.Role_pi_thesis.id_role_pi_thesis;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_10;

CREATE TABLE public.Type_thesis (
                id_type INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_10'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_thesis PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_10 OWNED BY public.Type_thesis.id_type;

CREATE SEQUENCE public.choice_national_inter_meeting_id_choice_seq_4;

CREATE TABLE public.Type_consortium (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_national_inter_meeting_id_choice_seq_4'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_consortium PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_national_inter_meeting_id_choice_seq_4 OWNED BY public.Type_consortium.id_type;

CREATE SEQUENCE public.socio_economic_interaction_id_activite_seq_4;

CREATE TABLE public.Sei_lead_consortium_industry (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.socio_economic_interaction_id_activite_seq_4'),
                consortium_start_date DATE,
                name_consortium VARCHAR,
                id_type INTEGER,
                title_project VARCHAR,
                private_party_involved VARCHAR,
                consortium_end_date DATE,
                associated_publi_ref VARCHAR,
                CONSTRAINT pk_sei_lead_consortium_industry PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.socio_economic_interaction_id_activite_seq_4 OWNED BY public.Sei_lead_consortium_industry.id_activity;

CREATE SEQUENCE public.socio_economic_interaction_id_activite_seq_3;

CREATE TABLE public.Sei_company_creation (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.socio_economic_interaction_id_activite_seq_3'),
                date_creation DATE,
                name_company VARCHAR,
                in_activity BOOLEAN,
                CONSTRAINT pk_sei_company_creation PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.socio_economic_interaction_id_activite_seq_3 OWNED BY public.Sei_company_creation.id_activity;

CREATE SEQUENCE public.socio_economic_interaction_id_activite_seq_2;

CREATE TABLE public.Sei_network_unit_creation (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.socio_economic_interaction_id_activite_seq_2'),
                network_start_date DATE,
                name_network VARCHAR,
                name_partner VARCHAR,
                title_project VARCHAR,
                network_end_date DATE,
                associated_publi_ref VARCHAR,
                CONSTRAINT pk_sei_network_unit_creation PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.socio_economic_interaction_id_activite_seq_2 OWNED BY public.Sei_network_unit_creation.id_activity;

CREATE SEQUENCE public.socio_economic_interaction_id_activite_seq_1;

CREATE TABLE public.Sei_labcom_creation (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.socio_economic_interaction_id_activite_seq_1'),
                contract_start_date DATE,
                name_labcom VARCHAR,
                name_company_involved VARCHAR,
                title_project VARCHAR,
                contract_end_date DATE,
                associated_publi_ref VARCHAR,
                CONSTRAINT pk_sei_labcom_creation PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.socio_economic_interaction_id_activite_seq_1 OWNED BY public.Sei_labcom_creation.id_activity;

CREATE SEQUENCE public.involvement_in_training_id_activite_seq_1;

CREATE TABLE public.Involvement_training_m1_m2_trainee_hosting (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.involvement_in_training_id_activite_seq_1'),
                year INTEGER,
                nb_trainee_hosted INTEGER,
                CONSTRAINT pk_involvement_training_m1_m2_trainee_hosting PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.involvement_in_training_id_activite_seq_1 OWNED BY public.Involvement_training_m1_m2_trainee_hosting.id_activity;

CREATE SEQUENCE public.choice_national_inter_meeting_id_choice_seq_2;

CREATE TABLE public.Type_invited_oral_com (
                id_type_meeting INTEGER NOT NULL DEFAULT nextval('public.choice_national_inter_meeting_id_choice_seq_2'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_invited_oral_com PRIMARY KEY (id_type_meeting)
);


ALTER SEQUENCE public.choice_national_inter_meeting_id_choice_seq_2 OWNED BY public.Type_invited_oral_com.id_type_meeting;

CREATE SEQUENCE public.outgoing_mobility_id_activity_seq;

CREATE TABLE public.Outgoing_mobility (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.outgoing_mobility_id_activity_seq'),
                name_person_concerned VARCHAR,
                arrival_date DATE,
                departure_date DATE,
                duration INTEGER,
                host_lab_name VARCHAR,
                host_lab_location VARCHAR,
                pi_partner VARCHAR,
                project_title VARCHAR,
                associated_funding VARCHAR,
                nb_publications INTEGER,
                publication_reference VARCHAR,
                strategic_recurring_collab BOOLEAN,
                active_project BOOLEAN,
                umr1064_coordinated BOOLEAN,
                agreement_signed BOOLEAN,
                CONSTRAINT pk_outgoing_mobility PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.outgoing_mobility_id_activity_seq OWNED BY public.Outgoing_mobility.id_activity;

CREATE SEQUENCE public.incoming_mobility_id_activity_seq;

CREATE TABLE public.Incoming_mobility (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.incoming_mobility_id_activity_seq'),
                name_senior_scientist VARCHAR,
                arrival_date DATE,
                departure_date DATE,
                duration INTEGER,
                nationality VARCHAR,
                original_lab_name VARCHAR,
                origina_lab_location VARCHAR,
                pi_partner VARCHAR,
                project_title VARCHAR,
                associated_funding VARCHAR,
                publication_reference VARCHAR,
                strategic_recurring_collab BOOLEAN,
                active_project BOOLEAN,
                umr1064_coordinated BOOLEAN,
                agreement_signed BOOLEAN,
                CONSTRAINT pk_incoming_mobility PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.incoming_mobility_id_activity_seq OWNED BY public.Incoming_mobility.id_activity;

CREATE SEQUENCE public.lab_evaluation_project_evaluation_id_activite_seq_1;

CREATE TABLE public.Project_evaluation_grant (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.lab_evaluation_project_evaluation_id_activite_seq_1'),
                year INTEGER,
                name_funder VARCHAR,
                id_category_grant INTEGER,
                id_role_pi_grant INTEGER,
                CONSTRAINT pk_project_evaluation_grant PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.lab_evaluation_project_evaluation_id_activite_seq_1 OWNED BY public.Project_evaluation_grant.id_activity;

CREATE SEQUENCE public.electronic_tool_product_id_activite_seq_4;

CREATE TABLE public.Tool_product_biocollection (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.electronic_tool_product_id_activite_seq_4'),
                name_biocollection VARCHAR,
                creation_date DATE,
                description VARCHAR,
                CONSTRAINT pk_tool_product_biocollection PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.electronic_tool_product_id_activite_seq_4 OWNED BY public.Tool_product_biocollection.id_activity;

CREATE SEQUENCE public.electronic_tool_product_id_activite_seq_3;

CREATE TABLE public.Tool_product_decision_support_tool (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.electronic_tool_product_id_activite_seq_3'),
                name_decision_support_tool VARCHAR,
                creation_date DATE,
                authors VARCHAR,
                description VARCHAR,
                CONSTRAINT pk_tool_product_decision_support_tool PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.electronic_tool_product_id_activite_seq_3 OWNED BY public.Tool_product_decision_support_tool.id_activity;

CREATE SEQUENCE public.electronic_tool_product_id_activite_seq_2;

CREATE TABLE public.Tool_product_software (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.electronic_tool_product_id_activite_seq_2'),
                name_software VARCHAR,
                creation_date DATE,
                authors VARCHAR,
                description VARCHAR,
                CONSTRAINT pk_tool_product_software PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.electronic_tool_product_id_activite_seq_2 OWNED BY public.Tool_product_software.id_activity;

CREATE SEQUENCE public.electronic_tool_product_id_activite_seq_1;

CREATE TABLE public.Tool_product_database (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.electronic_tool_product_id_activite_seq_1'),
                titke_database VARCHAR,
                creation_date DATE,
                authors VARCHAR,
                description VARCHAR,
                CONSTRAINT pk_tool_product_database PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.electronic_tool_product_id_activite_seq_1 OWNED BY public.Tool_product_database.id_activity;

CREATE SEQUENCE public.book_id_activite_seq_1;

CREATE TABLE public.Book_chapter (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.book_id_activite_seq_1'),
                publication_date DATE,
                chapter_title VARCHAR,
                book_title VARCHAR,
                editor VARCHAR,
                nb_page INTEGER,
                authors VARCHAR,
                language VARCHAR,
                additional_info VARCHAR,
                CONSTRAINT pk_book_chapter PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.book_id_activite_seq_1 OWNED BY public.Book_chapter.id_activity;

CREATE SEQUENCE public.choice_publication_id_choice_seq;

CREATE TABLE public.Choice_publication (
                id_choice INTEGER NOT NULL DEFAULT nextval('public.choice_publication_id_choice_seq'),
                name_choice VARCHAR,
                CONSTRAINT pk_choice_publication PRIMARY KEY (id_choice)
);


ALTER SEQUENCE public.choice_publication_id_choice_seq OWNED BY public.Choice_publication.id_choice;

CREATE SEQUENCE public.choice_oral_com_poster_id_choice_seq;

CREATE TABLE public.Type_oral_com_poster (
                id_type_com INTEGER NOT NULL DEFAULT nextval('public.choice_oral_com_poster_id_choice_seq'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_oral_com_poster PRIMARY KEY (id_type_com)
);


ALTER SEQUENCE public.choice_oral_com_poster_id_choice_seq OWNED BY public.Type_oral_com_poster.id_type_com;

CREATE SEQUENCE public.choice_national_inter_meeting_id_choice_seq_1;

CREATE TABLE public.Type_meeting (
                id_choice_meeting INTEGER NOT NULL DEFAULT nextval('public.choice_national_inter_meeting_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_meeting PRIMARY KEY (id_choice_meeting)
);


ALTER SEQUENCE public.choice_national_inter_meeting_id_choice_seq_1 OWNED BY public.Type_meeting.id_choice_meeting;

CREATE SEQUENCE public.choice_type_collab_id_choice_seq_1;

CREATE TABLE public.Choice_type_collab (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_type_collab_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_choice_type_collab PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_type_collab_id_choice_seq_1 OWNED BY public.Choice_type_collab.id_type;

CREATE SEQUENCE public.type_involvement_in_training_id_choice_seq_7;

CREATE TABLE public.Type_involvement_in_training (
                id_type INTEGER NOT NULL DEFAULT nextval('public.type_involvement_in_training_id_choice_seq_7'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_involvement_in_training PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.type_involvement_in_training_id_choice_seq_7 OWNED BY public.Type_involvement_in_training.id_type;

CREATE SEQUENCE public.choice_educational_output_id_choice_seq_1;

CREATE TABLE public.Choice_educational_output (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_educational_output_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_choice_educational_output PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_educational_output_id_choice_seq_1 OWNED BY public.Choice_educational_output.id_type;

CREATE SEQUENCE public.choice_public_outreach_id_choice_seq_1;

CREATE TABLE public.Choice_public_outreach (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_public_outreach_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_choice_public_outreach PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_public_outreach_id_choice_seq_1 OWNED BY public.Choice_public_outreach.id_type;

CREATE SEQUENCE public.choice_scientific_expertise_id_choice_seq_1;

CREATE TABLE public.Choice_scientific_expertise (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_scientific_expertise_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_choice_scientific_expertise PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_scientific_expertise_id_choice_seq_1 OWNED BY public.Choice_scientific_expertise.id_type;

CREATE SEQUENCE public.choice_patent_licence_invention_disclosure_id_choice_seq_1;

CREATE TABLE public.Type_patent (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_patent_licence_invention_disclosure_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_patent PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_patent_licence_invention_disclosure_id_choice_seq_1 OWNED BY public.Type_patent.id_type;

CREATE SEQUENCE public.choice_type_congress_organisation_id_choice_seq;

CREATE TABLE public.Type_congress_organisation (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_type_congress_organisation_id_choice_seq'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_congress_organisation PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_type_congress_organisation_id_choice_seq OWNED BY public.Type_congress_organisation.id_type;

CREATE SEQUENCE public.choice_research_contract_funded_public_charitable_inst_id_cho815;

CREATE TABLE public.Type_research_contract (
                id_type INTEGER NOT NULL DEFAULT nextval('public.choice_research_contract_funded_public_charitable_inst_id_cho815'),
                name_choice VARCHAR,
                CONSTRAINT pk_type_research_contract PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.choice_research_contract_funded_public_charitable_inst_id_cho815 OWNED BY public.Type_research_contract.id_type;

CREATE SEQUENCE public.function_electronic_tool_product_1_id_choice_seq_1;

CREATE TABLE public.Function_editorial_activity (
                id_function INTEGER NOT NULL DEFAULT nextval('public.function_electronic_tool_product_1_id_choice_seq_1'),
                name_choice VARCHAR,
                CONSTRAINT pk_function_editorial_activity PRIMARY KEY (id_function)
);


ALTER SEQUENCE public.function_electronic_tool_product_1_id_choice_seq_1 OWNED BY public.Function_editorial_activity.id_function;

CREATE SEQUENCE public.oral_communication_poster_id_activity_seq;

CREATE TABLE public.Oral_communication_poster (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.oral_communication_poster_id_activity_seq'),
                year INTEGER,
                id_type_com INTEGER,
                id_choice_meeting INTEGER,
                titleoral_com_poster VARCHAR,
                authors VARCHAR,
                meeting_name VARCHAR,
                date DATE,
                location VARCHAR,
                CONSTRAINT pk_oral_communication_poster PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.oral_communication_poster_id_activity_seq OWNED BY public.Oral_communication_poster.id_activity;

CREATE SEQUENCE public.scientific_recognition_meeting_congress_org_id_activite_seq;

CREATE TABLE public.Meeting_congress_org (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.scientific_recognition_meeting_congress_org_id_activite_seq'),
                year INTEGER,
                id_type INTEGER,
                name_congress VARCHAR,
                date DATE,
                location VARCHAR,
                CONSTRAINT pk_meeting_congress_org PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.scientific_recognition_meeting_congress_org_id_activite_seq OWNED BY public.Meeting_congress_org.id_activity;

CREATE SEQUENCE public.scientific_recognition_invited_oral_com_id_activite_seq;

CREATE TABLE public.Invited_oral_communication (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.scientific_recognition_invited_oral_com_id_activite_seq'),
                date_communication DATE,
                title VARCHAR,
                name_meeting VARCHAR,
                date_meeting DATE,
                location VARCHAR,
                id_type_meeting INTEGER,
                CONSTRAINT pk_invited_oral_communication PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.scientific_recognition_invited_oral_com_id_activite_seq OWNED BY public.Invited_oral_communication.id_activity;

CREATE SEQUENCE public.scientific_recognition_award_responsibility_foreign_stay_id_277;

CREATE TABLE public.Sr_award (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.scientific_recognition_award_responsibility_foreign_stay_id_277'),
                award_date DATE,
                awardee_name VARCHAR,
                description VARCHAR,
                CONSTRAINT pk_sr_award PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.scientific_recognition_award_responsibility_foreign_stay_id_277 OWNED BY public.Sr_award.id_activity;

CREATE SEQUENCE public.lab_evaluation_responsibility_inst_comitee_jury_id_activite_seq;

CREATE TABLE public.Responsibility_institutional_comitee_jury (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.lab_evaluation_responsibility_inst_comitee_jury_id_activite_seq'),
                year INTEGER,
                name_institutional_comitee VARCHAR,
                id_role_pi_lab_eval INTEGER,
                CONSTRAINT pk_responsibility_institutional_comitee_jury PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.lab_evaluation_responsibility_inst_comitee_jury_id_activite_seq OWNED BY public.Responsibility_institutional_comitee_jury.id_activity;

CREATE SEQUENCE public.lab_evaluation_id_activite_seq;

CREATE TABLE public.Lab_evaluation (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.lab_evaluation_id_activite_seq'),
                year INTEGER,
                name_evaluated_laboratory VARCHAR,
                id_role_pi_lab_eval INTEGER,
                CONSTRAINT pk_lab_evaluation PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.lab_evaluation_id_activite_seq OWNED BY public.Lab_evaluation.id_activity;

CREATE SEQUENCE public.lab_evaluation_project_evaluation_id_activite_seq;

CREATE TABLE public.Project_evaluation_thesis (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.lab_evaluation_project_evaluation_id_activite_seq'),
                year INTEGER,
                name_university VARCHAR,
                id_type INTEGER,
                id_role_pi_thesis INTEGER,
                CONSTRAINT pk_project_evaluation_thesis PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.lab_evaluation_project_evaluation_id_activite_seq OWNED BY public.Project_evaluation_thesis.id_activity;

CREATE SEQUENCE public.lab_evaluation_journal_activity_review_id_activite_seq;

CREATE TABLE public.Reviewing_journal_articles (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.lab_evaluation_journal_activity_review_id_activite_seq'),
                year INTEGER,
                name_journal VARCHAR,
                nb_reviewed_articles INTEGER,
                impact_factor_journal REAL,
                CONSTRAINT pk_reviewing_journal_articles PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.lab_evaluation_journal_activity_review_id_activite_seq OWNED BY public.Reviewing_journal_articles.id_activity;

CREATE SEQUENCE public.clinical_trial_id_activite_seq;

CREATE TABLE public.Sei_clinical_trial (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.clinical_trial_id_activite_seq'),
                start_date DATE,
                coordinator_partner BOOLEAN,
                title_clinical_trial VARCHAR,
                end_date DATE,
                registration_nb VARCHAR,
                sponsor_name VARCHAR,
                included_patients_nb INTEGER,
                funding VARCHAR,
                funding_amount INTEGER,
                CONSTRAINT pk_sei_clinical_trial PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.clinical_trial_id_activite_seq OWNED BY public.Sei_clinical_trial.id_activity;

CREATE SEQUENCE public.industrial_r_d_contract_id_activite_seq;

CREATE TABLE public.Sei_industrial_r_d_contract (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.industrial_r_d_contract_id_activite_seq'),
                start_date DATE,
                name_company_involved VARCHAR,
                project_title VARCHAR,
                agreement_amount INTEGER,
                end_date DATE,
                associated_publi_ref VARCHAR,
                CONSTRAINT pk_sei_industrial_r_d_contract PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.industrial_r_d_contract_id_activite_seq OWNED BY public.Sei_industrial_r_d_contract.id_activity;

CREATE SEQUENCE public.socio_economic_interaction_id_activite_seq;

CREATE TABLE public.Sei_cifre_fellowship (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.socio_economic_interaction_id_activite_seq'),
                contract_start_date DATE,
                name_fellow VARCHAR,
                name_company_involved VARCHAR,
                title_thesis VARCHAR,
                contract_end_date DATE,
                contract_amount INTEGER,
                associated_publi_ref VARCHAR,
                CONSTRAINT pk_sei_cifre_fellowship PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.socio_economic_interaction_id_activite_seq OWNED BY public.Sei_cifre_fellowship.id_activity;

CREATE SEQUENCE public.training_thesis_publication_id_activite_seq;

CREATE TABLE public.Training_thesis_publication (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.training_thesis_publication_id_activite_seq'),
                name_student VARCHAR,
                surname_student VARCHAR,
                nationality VARCHAR,
                id_background INTEGER,
                id_status_thesis INTEGER,
                start_date DATE,
                defense_date DATE,
                duration_thesis INTEGER,
                name_director VARCHAR,
                associated_funding VARCHAR,
                nb_original_articles INTEGER,
                nb_original_articles_1_2_position INTEGER,
                ref_publications VARCHAR,
                becoming_student VARCHAR,
                CONSTRAINT pk_training_thesis_publication PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.training_thesis_publication_id_activite_seq OWNED BY public.Training_thesis_publication.id_activity;

CREATE SEQUENCE public.involvement_in_training_id_activite_seq;

CREATE TABLE public.Involvement_training_pedagogical_responsibility (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.involvement_in_training_id_activite_seq'),
                year INTEGER,
                name_master VARCHAR,
                id_type INTEGER,
                CONSTRAINT pk_involvement_training_pedagogical_responsibility PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.involvement_in_training_id_activite_seq OWNED BY public.Involvement_training_pedagogical_responsibility.id_activity;

CREATE SEQUENCE public.invited_seminar_id_activite_seq;

CREATE TABLE public.Invited_seminar (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.invited_seminar_id_activite_seq'),
                date DATE,
                title_seminar VARCHAR,
                location VARCHAR,
                invited_by VARCHAR,
                CONSTRAINT pk_invited_seminar PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.invited_seminar_id_activite_seq OWNED BY public.Invited_seminar.id_activity;

CREATE SEQUENCE public.network_id_activite_seq;

CREATE TABLE public.Network (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.network_id_activite_seq'),
                start_date DATE,
                name_network VARCHAR,
                active_network BOOLEAN,
                associated_funding VARCHAR,
                nb_resulting_publications INTEGER,
                ref_resulting_publications VARCHAR,
                umr1064_coordinated BOOLEAN,
                agreement_signed BOOLEAN,
                CONSTRAINT pk_network PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.network_id_activite_seq OWNED BY public.Network.id_activity;

CREATE SEQUENCE public.national_international_collaboration_id_activite_seq;

CREATE TABLE public.National_international_collaboration (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.national_international_collaboration_id_activite_seq'),
                date_project_start DATE,
                id_type INTEGER,
                partner_entity VARCHAR,
                country_state_city VARCHAR,
                pi_partners VARCHAR,
                mail_partners VARCHAR,
                projetc_title VARCHAR,
                strategic_recurring_collab BOOLEAN,
                active_project BOOLEAN,
                associated_funding VARCHAR,
                number_resulting_publications INTEGER,
                ref_joint_publication VARCHAR,
                umr1064_coordinated BOOLEAN,
                agreement_signed BOOLEAN,
                CONSTRAINT pk_national_international_collaboration PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.national_international_collaboration_id_activite_seq OWNED BY public.National_international_collaboration.id_activity;

CREATE SEQUENCE public.educational_output_id_activite_seq;

CREATE TABLE public.Educational_output (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.educational_output_id_activite_seq'),
                id_type INTEGER,
                completion_date DATE,
                description VARCHAR,
                CONSTRAINT pk_educational_output PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.educational_output_id_activite_seq OWNED BY public.Educational_output.id_activity;

CREATE SEQUENCE public.public_outreach_id_activite_seq;

CREATE TABLE public.Public_outreach (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.public_outreach_id_activite_seq'),
                completion_date DATE,
                description VARCHAR,
                id_type INTEGER,
                CONSTRAINT pk_public_outreach PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.public_outreach_id_activite_seq OWNED BY public.Public_outreach.id_activity;

CREATE SEQUENCE public.scientific_expertise_id_activite_seq;

CREATE TABLE public.Scientific_expertise (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.scientific_expertise_id_activite_seq'),
                start_date DATE,
                id_type INTEGER,
                description VARCHAR,
                end_date DATE,
                CONSTRAINT pk_scientific_expertise PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.scientific_expertise_id_activite_seq OWNED BY public.Scientific_expertise.id_activity;

CREATE SEQUENCE public.patent_licence_invention_disclosure_id_activite_seq;

CREATE TABLE public.Patent_licence_invention_disclosure (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.patent_licence_invention_disclosure_id_activite_seq'),
                id_type INTEGER,
                registration_date DATE,
                filing_date DATE,
                acceptation_date DATE,
                licensing_date DATE,
                title VARCHAR,
                inventors VARCHAR,
                co_owners VARCHAR,
                priority_number REAL,
                priority_date DATE,
                publication_number VARCHAR,
                publication_date DATE,
                pct_extension_obtained BOOLEAN,
                publication_number_pct_extension VARCHAR,
                publication_date_pct_extension DATE,
                international_extension BOOLEAN,
                publication_number_international_extension VARCHAR,
                publication_date_international_extension DATE,
                ref_transfer_contract VARCHAR,
                name_company_involved VARCHAR,
                status BOOLEAN,
                inpi_link VARCHAR,
                CONSTRAINT pk_patent_licence_invention_disclosure PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.patent_licence_invention_disclosure_id_activite_seq OWNED BY public.Patent_licence_invention_disclosure.id_activity;

CREATE SEQUENCE public.podt_doc_visiting_senior_scientists_id_activite_seq;

CREATE TABLE public.Post_doc (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.podt_doc_visiting_senior_scientists_id_activite_seq'),
                name_post_doc VARCHAR,
                name_supervisor VARCHAR,
                arrival_date DATE,
                departure_date DATE,
                duration INTEGER,
                nationality VARCHAR,
                original_lab VARCHAR,
                associated_funding VARCHAR,
                associated_publi_ref VARCHAR,
                CONSTRAINT pk_post_doc PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.podt_doc_visiting_senior_scientists_id_activite_seq OWNED BY public.Post_doc.id_activity;

CREATE SEQUENCE public.research_contract_funded_public_charitable_inst_id_activite_seq;

CREATE TABLE public.Research_contract_funded_public_charitable_inst (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.research_contract_funded_public_charitable_inst_id_activite_seq'),
                date_contract_award DATE,
                funding_intitution VARCHAR,
                project_title VARCHAR,
                start_year INTEGER,
                end_year INTEGER,
                grant_amount INTEGER,
                id_type INTEGER,
                CONSTRAINT pk_research_contract_funded_public_charitable_inst PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.research_contract_funded_public_charitable_inst_id_activite_seq OWNED BY public.Research_contract_funded_public_charitable_inst.id_activity;

CREATE SEQUENCE public.editorial_activity_id_activite_seq;

CREATE TABLE public.Editorial_activity (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.editorial_activity_id_activite_seq'),
                start_date DATE,
                end_date DATE,
                name_journal VARCHAR,
                impact_factor_journal REAL,
                id_function INTEGER,
                CONSTRAINT pk_editorial_activity PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.editorial_activity_id_activite_seq OWNED BY public.Editorial_activity.id_activity;

CREATE SEQUENCE public.platform_id_activite_seq;

CREATE TABLE public.Platform (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.platform_id_activite_seq'),
                creation_date DATE,
                description VARCHAR,
                managers VARCHAR,
                affiliation VARCHAR,
                labellisation VARCHAR,
                open_private_researchers BOOLEAN,
                CONSTRAINT pk_platform PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.platform_id_activite_seq OWNED BY public.Platform.id_activity;

CREATE SEQUENCE public.electronic_tool_product_id_activite_seq;

CREATE TABLE public.Tool_product_cohort (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.electronic_tool_product_id_activite_seq'),
                name_cohort VARCHAR,
                creation_date DATE,
                involved_researchers_crti VARCHAR,
                description VARCHAR,
                CONSTRAINT pk_tool_product_cohort PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.electronic_tool_product_id_activite_seq OWNED BY public.Tool_product_cohort.id_activity;

CREATE SEQUENCE public.book_id_activite_seq;

CREATE TABLE public.Book (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.book_id_activite_seq'),
                publication_date DATE,
                title VARCHAR,
                editor VARCHAR,
                nb_page INTEGER,
                authors VARCHAR,
                language VARCHAR,
                CONSTRAINT pk_book PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.book_id_activite_seq OWNED BY public.Book.id_activity;

CREATE SEQUENCE public.publication_id_activite_seq;

CREATE TABLE public.Publication (
                id_activity INTEGER NOT NULL DEFAULT nextval('public.publication_id_activite_seq'),
                title VARCHAR,
                authors VARCHAR,
                source VARCHAR,
                publication_date DATE,
                pmid INTEGER,
                impact_factor REAL,
                clinic BOOLEAN,
                pdc BOOLEAN,
                colab_inter BOOLEAN,
                colab_intra_crti BOOLEAN,
                id_choice INTEGER,
                CONSTRAINT pk_publication PRIMARY KEY (id_activity)
);


ALTER SEQUENCE public.publication_id_activite_seq OWNED BY public.Publication.id_activity;

CREATE SEQUENCE public.type_activity_id_type_seq;

CREATE TABLE public.Type_activity (
                id_type INTEGER NOT NULL DEFAULT nextval('public.type_activity_id_type_seq'),
                name_type VARCHAR,
                CONSTRAINT pk_type_activity PRIMARY KEY (id_type)
);


ALTER SEQUENCE public.type_activity_id_type_seq OWNED BY public.Type_activity.id_type;

CREATE SEQUENCE public.team_id_equipe_seq;

CREATE TABLE public.Team (
                id_team INTEGER NOT NULL DEFAULT nextval('public.team_id_equipe_seq'),
                nom_equipe VARCHAR,
                creation_date DATE,
                end_date DATE,
                id_orcid_researcher VARCHAR,
                date_last_report DATE,
                id_referent INTEGER,
                CONSTRAINT pk_team PRIMARY KEY (id_team)
);


ALTER SEQUENCE public.team_id_equipe_seq OWNED BY public.Team.id_team;

CREATE SEQUENCE public.mail_id_mail_seq;

CREATE TABLE public.Mail (
                id_mail INTEGER NOT NULL DEFAULT nextval('public.mail_id_mail_seq'),
                subject_line VARCHAR,
                content VARCHAR,
                CONSTRAINT pk_mail PRIMARY KEY (id_mail)
);


ALTER SEQUENCE public.mail_id_mail_seq OWNED BY public.Mail.id_mail;

CREATE SEQUENCE public.employeur_id_employeur_seq;

CREATE TABLE public.Emploeur (
                id_employer INTEGER NOT NULL DEFAULT nextval('public.employeur_id_employeur_seq'),
                name_employer VARCHAR,
                CONSTRAINT pk_employer PRIMARY KEY (id_employer)
);


ALTER SEQUENCE public.employeur_id_employeur_seq OWNED BY public.Emploeur.id_employer;

CREATE TABLE public.Researcher (
                id_orcid_researcher VARCHAR,
                surname_researcher VARCHAR,
                name_researcher VARCHAR,
                id_employer INTEGER,
                status VARCHAR,
                contract_type VARCHAR,
                function VARCHAR,
                email_address VARCHAR,
                CONSTRAINT pk_researcher PRIMARY KEY (id_orcid_researcher)
);


CREATE SEQUENCE public.doctoral_student_id_doctorant_seq;

CREATE TABLE public.Doctoral_student (
                id_doc_student INTEGER NOT NULL DEFAULT nextval('public.doctoral_student_id_doctorant_seq'),
                id_orcid VARCHAR,
                surname_student VARCHAR,
                name_student VARCHAR,
                defense_date DATE,
                date_start_thesis DATE,
                future VARCHAR,
                CONSTRAINT pk_doctoral_student PRIMARY KEY (id_doc_student)
);


ALTER SEQUENCE public.doctoral_student_id_doctorant_seq OWNED BY public.Doctoral_student.id_doc_student;

CREATE SEQUENCE public.activity_id_auto_seq;

CREATE TABLE public.Activity (
                id_auto INTEGER NOT NULL DEFAULT nextval('public.activity_id_auto_seq'),
                id_orcid_researcher VARCHAR,
                id_doc_student INTEGER,
                id_type INTEGER,
                id_activity INTEGER,
                id_team INTEGER,
                CONSTRAINT pk_activity PRIMARY KEY (id_auto)
);


ALTER SEQUENCE public.activity_id_auto_seq OWNED BY public.Activity.id_auto;

CREATE SEQUENCE public.supervisor_id_encadrant_seq;

CREATE TABLE public.Supervisor (
                id_supervisor INTEGER NOT NULL DEFAULT nextval('public.supervisor_id_encadrant_seq'),
                id_orcid_researcher VARCHAR,
                id_doc_student INTEGER,
                CONSTRAINT pk_supervisor PRIMARY KEY (id_supervisor)
);


ALTER SEQUENCE public.supervisor_id_encadrant_seq OWNED BY public.Supervisor.id_supervisor;

CREATE SEQUENCE public.belongs_team_id_app_equipe_seq;

CREATE TABLE public.Belongs_team (
                id_belongs_team INTEGER NOT NULL DEFAULT nextval('public.belongs_team_id_app_equipe_seq'),
                id_doc_student INTEGER,
                id_orcid_researcher VARCHAR,
                id_team INTEGER,
                onboarding_date DATE,
                leaving_date DATE,
                CONSTRAINT pk_belongs_team PRIMARY KEY (id_belongs_team)
);


ALTER SEQUENCE public.belongs_team_id_app_equipe_seq OWNED BY public.Belongs_team.id_belongs_team;

ALTER TABLE public.Team ADD CONSTRAINT referent_team_fk
FOREIGN KEY (id_referent)
REFERENCES public.Referent (id_referent)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Training_thesis_publication ADD CONSTRAINT status_thesis_training_thesis_publication_fk
FOREIGN KEY (id_status_thesis)
REFERENCES public.Status_thesis (id_status_thesis)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Training_thesis_publication ADD CONSTRAINT background_student_training_thesis_publication_fk
FOREIGN KEY (id_background)
REFERENCES public.Background_student (id_background)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Sr_responsibility_learned_scientific_society ADD CONSTRAINT role_pi_scientific_recognition_scientific_recognition_respon970
FOREIGN KEY (id_role_pi)
REFERENCES public.Role_pi_scientific_recognition (id_role_pi)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Lab_evaluation ADD CONSTRAINT role_pi_lab_eval_lab_evaluation_fk
FOREIGN KEY (id_role_pi_lab_eval)
REFERENCES public.Role_pi_lab_eval (id_role_pi_lab_eval)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Responsibility_institutional_comitee_jury ADD CONSTRAINT role_pi_lab_eval_responsibility_institutional_comitee_jury_fk
FOREIGN KEY (id_role_pi_lab_eval)
REFERENCES public.Role_pi_lab_eval (id_role_pi_lab_eval)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Project_evaluation_grant ADD CONSTRAINT role_pi_grant_project_evaluation_grant_fk
FOREIGN KEY (id_role_pi_grant)
REFERENCES public.Role_pi_grant (id_role_pi_grant)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Project_evaluation_grant ADD CONSTRAINT category_grant_project_evaluation_grant_fk
FOREIGN KEY (id_category_grant)
REFERENCES public.Category_grant (id_category_grant)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Project_evaluation_thesis ADD CONSTRAINT role_pi_thesis_project_evaluation_thesis_fk
FOREIGN KEY (id_role_pi_thesis)
REFERENCES public.Role_pi_thesis (id_role_pi_thesis)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Project_evaluation_thesis ADD CONSTRAINT type_thesis_project_evaluation_thesis_fk
FOREIGN KEY (id_type)
REFERENCES public.Type_thesis (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Sei_lead_consortium_industry ADD CONSTRAINT type_consortium_socio_economic_interaction_lead_consortium_i423
FOREIGN KEY (id_type)
REFERENCES public.Type_consortium (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Invited_oral_communication ADD CONSTRAINT choice_type_meeting_scientific_recognition_invited_oral_com_fk
FOREIGN KEY (id_type_meeting)
REFERENCES public.Type_invited_oral_com (id_type_meeting)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Publication ADD CONSTRAINT choice_publication_publication_fk
FOREIGN KEY (id_choice)
REFERENCES public.Choice_publication (id_choice)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Oral_communication_poster ADD CONSTRAINT choice_oral_com_poster_oral_communication_poster_fk
FOREIGN KEY (id_type_com)
REFERENCES public.Type_oral_com_poster (id_type_com)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Oral_communication_poster ADD CONSTRAINT choice_national_inter_meeting_scientific_recognition_oral_co616
FOREIGN KEY (id_choice_meeting)
REFERENCES public.Type_meeting (id_choice_meeting)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.National_international_collaboration ADD CONSTRAINT choice_type_collab_national_international_collaboration_fk
FOREIGN KEY (id_type)
REFERENCES public.Choice_type_collab (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Involvement_training_pedagogical_responsibility ADD CONSTRAINT type_involvement_in_training_involvement_training_pedagogica556
FOREIGN KEY (id_type)
REFERENCES public.Type_involvement_in_training (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Educational_output ADD CONSTRAINT choice_educational_output_educational_output_fk
FOREIGN KEY (id_type)
REFERENCES public.Choice_educational_output (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Public_outreach ADD CONSTRAINT choice_public_outreach_public_outreach_fk
FOREIGN KEY (id_type)
REFERENCES public.Choice_public_outreach (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Scientific_expertise ADD CONSTRAINT choice_scientific_expertise_scientific_expertise_fk
FOREIGN KEY (id_type)
REFERENCES public.Choice_scientific_expertise (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Patent_licence_invention_disclosure ADD CONSTRAINT choice_patent_licence_invention_disclosure_patent_licence_in35
FOREIGN KEY (id_type)
REFERENCES public.Type_patent (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Meeting_congress_org ADD CONSTRAINT choice_scientific_recognition_scientific_recognition_meeting237
FOREIGN KEY (id_type)
REFERENCES public.Type_congress_organisation (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Research_contract_funded_public_charitable_inst ADD CONSTRAINT choice_research_contract_funded_public_charitable_inst_resear516
FOREIGN KEY (id_type)
REFERENCES public.Type_research_contract (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Editorial_activity ADD CONSTRAINT function_electronic_tool_product_1_editorial_activity_fk
FOREIGN KEY (id_function)
REFERENCES public.Function_editorial_activity (id_function)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Activity ADD CONSTRAINT type_activite_activite_fk
FOREIGN KEY (id_type)
REFERENCES public.Type_activity (id_type)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Belongs_team ADD CONSTRAINT equipe_appartient_equipe_fk
FOREIGN KEY (id_team)
REFERENCES public.Team (id_team)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Activity ADD CONSTRAINT team_activity_fk
FOREIGN KEY (id_team)
REFERENCES public.Team (id_team)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Researcher ADD CONSTRAINT emploeur_chercheur_fk
FOREIGN KEY (id_employer)
REFERENCES public.Emploeur (id_employer)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Belongs_team ADD CONSTRAINT chercheur_appartient_equipe_fk
FOREIGN KEY (id_orcid_researcher)
REFERENCES public.Researcher (id_orcid_researcher)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Supervisor ADD CONSTRAINT chercheur_encadrant_fk
FOREIGN KEY (id_orcid_researcher)
REFERENCES public.Researcher (id_orcid_researcher)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Activity ADD CONSTRAINT chercheur_activite_fk
FOREIGN KEY (id_orcid_researcher)
REFERENCES public.Researcher (id_orcid_researcher)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Belongs_team ADD CONSTRAINT doctorant_appartient_equipe_fk
FOREIGN KEY (id_doc_student)
REFERENCES public.Doctoral_student (id_doc_student)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Supervisor ADD CONSTRAINT doctorant_encadrant_fk
FOREIGN KEY (id_doc_student)
REFERENCES public.Doctoral_student (id_doc_student)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Activity ADD CONSTRAINT doctorant_activite_fk
FOREIGN KEY (id_doc_student)
REFERENCES public.Doctoral_student (id_doc_student)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

INSERT INTO Choice_publication (name_choice) 
	VALUES 
		('AO'),
		('Review'),
		('Other');

INSERT INTO Function_editorial_activity (name_choice)
	VALUES
		('Editor in chief'),
		('Associate editor'),
		('Review editor'),
		('Board member'),
		('Other');

INSERT INTO Type_research_contract (name_choice)
	VALUES
		('ERC grants - coordination'),
		('Other European grants (H2020, MSCA,…) - coordination'),
		('Other European grants (H2020, MSCA,…) - partnership'),
		('International (outside Europe) ((NSF, JSPS, NIH, World Bank, FAO, etc.) grants - coordination'),
		('International (outside Europe) ((NSF, JSPS, NIH, World Bank, FAO, etc.) grants - partnership'),
		('National public grants (ANR, PHRC, FUI, INCA, etc.) - coordination'),
		('National public grants (ANR, PHRC, FUI, INCA, etc.) - partnership'),
		('PIA (labex, equipex etc.) grants - coordination'),
		('PIA (labex, equipex etc.) grants - partnership'),
		('Grants from foundations and charities (ARC, FMR, FRM, etc.) - coordination'),
		('Grants from foundations and charities (ARC, FMR, FRM, etc.) - partnership'),
		('Local grants (collectivités territoriales) - coordination'),
		('Local grants (collectivités territoriales) - partnership'),
		('Internal calls in the frame of PIA (Labex, Idex, I-Site) from the university, hospital centre,... - coordination'),
		('Internal calls in the frame of PIA (Labex, Idex, I-Site) from the university, hospital centre,...    - partnership'),
		('Others');

INSERT INTO Choice_scientific_expertise (name_choice)
	VALUES
		('Consulting'),
		('Participation in expert committees (such as ANSES) or standardisation bodies'),
		('Legal expertise'),
		('Coordination of national or international research networks, of a National Reference Centre, etc.'),
		('Expert and standardization reports');

INSERT INTO Choice_public_outreach (name_choice)
	VALUES
		('Radio broadcasts, TV shows, magazines'),
		('Articles, interviews, book editions, videos, scientific mediation products, science and society debates, etc.');

INSERT INTO Type_patent (name_choice)
	VALUES 
		('Disclosure'),
		('Filed patent'),
		('Accepted patent'),
		('Licenced patent');

INSERT INTO Choice_educational_output (name_choice)
	VALUES
		('Books'),
		('E-learning, MOOCS, multimedia courses, scientific workshops, etc.');

INSERT INTO Choice_type_collab (name_choice)
	VALUES
		('Thesis co-supervision'),
		('Joint research project'),
		('International laboratory (LIA, LEA)'),
		('Others');	

INSERT INTO Type_involvement_in_training (name_choice)
	VALUES
		('Pedagogical responsibility for a masters degree or course'),
		('Pedagogical responsibility for a masters degree or course with international accreditation (e. g. erasmus mundus)');

INSERT INTO Background_student (name_choice)
	VALUES
		('Faculty of science'),
		('Ecole Normale Supérieure'),
		('Med school'),
		('Pharm school'),
		('Vet school'),
		('Engineering school'),
		('Dental school'),
		('Other');

INSERT INTO Status_thesis (name_choice)
	VALUES
		('Defended'),
		('On going thesis');

INSERT INTO Role_pi_thesis (name_choice)
	VALUES
		('Reviewer'),
		('Jury member'),
		('Jury president'),
		('Foreign reviewer');

INSERT INTO Type_thesis (name_choice)
	VALUES
		('Thesis in France'),
		('Thesis abroad'),
		('HDR');

INSERT INTO Category_grant (name_choice)
	VALUES
		('Local'),
		('National'),
		('Internation grant');

INSERT INTO Role_pi_grant (name_choice)
	VALUES
		('Reviewer'),
		('Scientific board member');

INSERT INTO Role_pi_lab_eval (name_choice)
	VALUES
		('Member of the committee'),
		('President of the committee'),
		('Other');

INSERT INTO Role_pi_scientific_recognition (name_choice)
	VALUES
		('President'),
		('Vice president'),
		('Board member'),
		('Other');

INSERT INTO Type_congress_organisation (name_choice)
	VALUES
		('organisation of symposia / congresses / sessions - national level'),
		('organisation of symposia / congresses / sessions - european level'),
		('organisation of symposia / congresses / sessions - international level'),
		('session moderation');

INSERT INTO Type_invited_oral_com (name_choice)
	VALUES
		('National meeting'),
		('International meeting');

INSERT INTO Type_meeting (name_choice)
	VALUES
		('Nation meeting'),
		('International meeting');

INSERT INTO Type_oral_com_poster (name_choice)
	VALUES
		('Oral communication'),
		('Poster');

INSERT INTO Type_consortium (name_choice)
	VALUES
		('National consortium'),
		('International consortium');

INSERT INTO Type_activity (name_type)
	VALUES
		('Publication'),
		('Book'),
		('Book_chapter'),
		('Patent_licence_invention_disclosure'),
		('Editorial_activity'),
		('Platform'),
		('Tool_product_decision_support_tool'),
		('Tool_product_biocollection'),
		('Tool_product_software'),
		('Tool_product_database'),
		('Tool_product_cohort'),
		('Educational_output'),
		('National_international_collaboration'),
		('Network'),
		('Invited_seminar'),
		('Scientific_expertise'),
		('Research_contract_funded_public_charitable_inst'),
		('Training_thesis_publication'),
		('Involvement_training_m1_m2_trainee_hosting'),
		('Involvement_training_pedagogical_responsibility'),
		('Post_doc'),
		('Public_outreach'),
		('Reviewing_journal_articles'),
		('Project_evaluation_thesis'),
		('Project_evaluation_grant'),
		('Lab_evaluation'),
		('Responsibility_institutional_comitee_jury'),
		('Sr_responsibility_learned_scientific_society'),
		('Sr_award'),
		('Meeting_congress_org'),
		('Invited_oral_communication'),
		('Oral_communication_poster'),
		('Outgoing_mobility'),
		('Incoming_mobility'),
		('Sei_cifre_fellowship'),
		('Sei_labcom_creation'),
		('Sei_network_unit_creation'),
		('Sei_company_creation'),
		('Sei_lead_consortium_industry'),
		('Sei_industrial_r_d_contract'),
		('Sei_clinical_trial');