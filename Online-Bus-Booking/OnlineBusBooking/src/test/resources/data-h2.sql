
INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    1,
    'Chennai',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(code) + 1
        FROM
            city
    ),
    'Tindivanam',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(code) + 1
        FROM
            city
    ),
    'Coimbatore',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(code) + 1
        FROM
            city
    ),
    'Pondicherry',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(code) + 1
        FROM
            city
    ),
    'Salem',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(code) + 1
        FROM
            city
    ),
    'Velore',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO city (
    code,
    city_name,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(code) + 1
        FROM
            city
    ),
    'Trichy',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    1,
    'TN-AX-9876',
    'SRS Bus Service',
    3,
    4,
    '10:00',
    '15:00',
    '5 Hours',
    '500',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-AN-1357',
    'SRS Bus Service',
    3,
    4,
    '10:00',
    '15:00',
    '5 Hours',
    '550',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-NX-8358',
    'SMS Bus Service',
    3,
    4,
    '12:00',
    '16:00',
    '5 Hours',
    '600',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-YO-1357',
    'NTS Bus Service',
    3,
    4,
    '16:00',
    '21:00',
    '5 Hours',
    '400',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-LN-6789',
    'NNM Bus Service',
    3,
    4,
    '9:00',
    '14:00',
    '5 Hours',
    '450',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-AX-7356',
    'SRS Bus Service',
    4,
    3,
    '10:00',
    '15:00',
    '5 Hours',
    '500',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-BX-3579',
    'SMS Bus Service',
    4,
    3,
    '12:00',
    '16:00',
    '5 Hours',
    '500',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-CX-6805',
    'NTS Bus Service',
    4,
    3,
    '16:00',
    '21:00',
    '5 Hours',
    '650',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

INSERT INTO bus_details (
    bus_id,
    bus_number,
    bus_name,
    departure_code,
    arrival_code,
    start_time,
    arrival_time,
    duration,
    bus_fair,
    is_active,
    created_by,
    creation_date,
    modified_by,
    modify_date
) VALUES (
    (
        SELECT
            MAX(bus_id) + 1
        FROM
            bus_details
    ),
    'TN-AB-1369',
    'NNM Bus Service',
    4,
    3,
    '9:00',
    '14:00',
    '5 Hours',
    '500',
    'Y',
    'SYSTEM',
    SYSDATE,
    'SYSTEM',
    SYSDATE
);

commit;