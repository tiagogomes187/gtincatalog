INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Tiago', 'Gomes', 'me@gmail.com', '$2a$10$E.GvS4fFhRqr3ITwuhRWIeCWtVIR6khyMtD/WrsYg.TdSO61ZL7Lm');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_category (name, created_At) VALUES ('Adultos', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Infantis', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Fora de linha', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Outros', NOW());

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10269,
        'Ouro',
        'Birkemiss Tira X New Brilho',
        'Miss-Miss',
        17908639125944,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            35.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/cf3e896de00458b8ec4be002c13ecedadf2fadab16d3ffa35b9b32745d84ff0b.png',
            'Full Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10268,
        'Prata',
        'Sandália Birkemiss Brilho',
        'Miss-Miss',
        17908639125791,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            34.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/bafb28296ffd755b6a01b4564b51a588f5d23c654fda6ed5958f8a84f3d2f2b2.png',
            'Full Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10267,
        'Verde Militar',
        'Sandália Birkemisso',
        'Miss-Miss',
        17908639125234,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/ed9a2f92dc05ab6fbed8a554f6c80e7688cd7d11697ae80ef51172b6948fcf76.png',
            'Espandido',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10266,
        'Off-White',
        'Sandália Birkemiss',
        'Miss-Miss',
        17908639123698,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            39.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/32985659fb1b927526263bdfb1e2da89fc2b826e91086ad7ddc1c5afba34edcd.png',
            'Espandido',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10263,
        'Azul Denim',
        'Anabela Adulto Laço Jeans',
        'Miss-Miss',
        17908639125036,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            27.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/2e136a2a4ea09131011ff97a49db7b222238ef77b11a7eb1b93e4c019edf8a1f.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10262,
        'Preto',
        'Sapatilha Adulto Laço Jeans',
        'Miss-Miss',
        17908639124497,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            25.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/0f592ac5651fb586f5719f16f4abc12d158bfefd5c7f2fdf34996d094a0d5fb2.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10259,
        'Pink',
        'Anabela Plataforma Elegance',
        'Miss-Miss',
        17908639122141,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            29.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/52e55f0cb01e994ad7dd46fbfb59e34ab26cfbdbfb411d7968ecf51a98bacb75.png',
            'Full-Plastic',
            4.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10257,
        'Camel',
        'Sandal Boot Monocolor (Sola Alta)',
        'Miss-Miss',
        17908639119271,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            47.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/587f491376c9d7c951ae3de33d0ae2c896f924d809ee7eb254bce87ee1038e0f.png',
            'Full-Plastic',
            5.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10254,
        'Azul Cobralto',
        'Rasteira Salomé Wood',
        'Miss-Miss',
        17908639120901,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/61beb592420bb9aec080639a9463c3b60ca7d808b984965ab62a161826db4146.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10247,
        'Rosê',
        'Mocassim Style ( Sola Baixa )',
        'Miss-Miss',
        17908639118472,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/40dc198410882c2b7f3e8f764a33be970ed725191b78d12d303c6902a68924f3.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10244,
        'Branco/Preto',
        'Birkenmiss Tiras Brilho',
        'Miss-Miss',
        17908639122493,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            47.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/1e7bfcea98873b4b4eee7fe3f8cd7018a2f6abd6803abb8327d6fce03acc016f.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10242,
        'Vermelho',
        'Tamanco Basic Sola Alta',
        'Miss-Miss',
        17908639102983,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            45.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/54e13a0a7d0b77d985f71d615168dbb4c56b74b8048c3f5074e670281b654438.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10240,
        'Cáqui',
        'Birkenmiss Fivelas',
        'Miss-Miss',
        17908639100163,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/027f4188ea5907b3164aa08987d3917d4bfb944d39b1aff5dd7983d77253ae25.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10237,
        'Pink Translúcido',
        'Tamanco Adulto Acrílico',
        'Miss-Miss',
        17908639102198,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/e3714bb41effef32e893c6bf8b9caa58595f18fc7d9cba1c929a2f075bc32112.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10232,
        'Verde Translúcido',
        'Aranha Adulto Salto',
        'Miss-Miss',
        17908639104185,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            27.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/6b55e1d5c718dae2a9257bd82be5d7950bc67ced37cab5db21fb0c2195c68078.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10228,
        'Rosê Dark',
        'Sapatilha Concavo',
        'Miss-Miss',
        17908639106226,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/b198ce1f2fa80d50049c70d9c2568e04e4ad187e32d4076c96002d8894328126.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10214,
        'Coral',
        'Sandália Corrente Sola Alta',
        'Miss-Miss',
        17908639110957,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            57.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/9b580c100914541e677e83a8875bb089b8fafcb32ac2c259f73e5e26a5158ac3.png',
            'Full-Plastic',
            2.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10212,
        'Azul Bebê Madeira',
        'Tamanco Madeira Retrô Adulto',
        'Miss-Miss',
        17908639111503,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            37.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/3c4d47ab4e347a4420f44ba5e5c30fa5429e9c8dbf0448698a289178c20c39bc.png',
            'Full-Plastic',
            5.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10195,
        'Rosa',
        'Sandália Coração Multicolor kids',
        'Miss-Miss',
        17908639112654,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            25.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/a1b3e4e92cfc3e689257b474c1e4ad7a1326257eb65b49f536c8eef3bfa8a854.png',
            'Full-Plastic',
            5.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10158,
        'Azul Carbono',
        'Anabela Adulto Laço Coração',
        'Miss-Miss',
        17908639114313,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            47.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/ff8be9aa98d0c9b181f6d3a9f84b8900666697ac6e00014103b3413c38570b87.png',
            'Full-Plastic',
            5.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO
    tb_product (
        reference,
        color,
        name,
        brand,
        gtin,
        ncm,
        date,
        type,
        price,
        img_Url,
        material,
        platform_Height,
        collection,
        created_At
    )
VALUES
    (
        10154,
        'Vermelho',
        'Sandália Adulto Trama Sola Alta',
        'Miss-Miss',
        17908639114962,
        '6402.99.90',
        TIMESTAMP
        WITH
            TIME ZONE '2023-10-12T10:30:00Z',
            'GTIN_14',
            57.90,
            'https://cnp30blob.blob.core.windows.net/cnp3filestemp/4c75831c753b0f121247790cb44a893cdd6d64b7f75788448824813fed7cfdd7.png',
            'Full-Plastic',
            5.2,
            'Primavera Verão 23/24',
            NOW ()
    );

INSERT INTO tb_product_category (product_id, category_id) VALUES (1,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6,4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (8,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (9,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (10,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (11,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (12,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (13,3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (14,4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (15,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (16,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (17,4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (18,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (19,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (20,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (21,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (22,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (23,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (24,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (25,3);
