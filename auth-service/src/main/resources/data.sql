INSERT IGNORE INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information)
VALUES ('mobile', '{bcrypt}$2a$10$gPhlXZfms0EpNHX0.HHptOhoFD1AoxSr/yUIdTqA8vtjeP4zi0DDu', 'http://localhost:8080/code', 'READ,WRITE', '3600', '10000', 'microservice', 'authorization_code,password,refresh_token,implicit', '{}');

 INSERT IGNORE INTO PERMISSION (NAME) VALUES
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 INSERT IGNORE INTO role (NAME) VALUES
		('ROLE_admin'),('ROLE_editor'),('ROLE_operator');

 INSERT IGNORE INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read Editor */
     (3,2),  /* update Editor */
     (2,3);  /* read operator */


 insert IGNORE into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'admin','{bcrypt}$2a$12$xVEzhL3RTFP1WCYhS4cv5ecNZIf89EnOW4XQczWHNB/Zi4zQAnkuS', 'stanislavam@live.co.uk', '1', '1', '1', '1');
 insert IGNORE into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'stash', '{bcrypt}$2a$12$hGH2fbELBY3xd/FdqQR5FuEeilbJLycZ4uV7w4NafpkSwyFDE.qLG','stanislavam@live.co.uk', '1', '1', '1', '1');
 insert IGNORE into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('3', 'user', '{bcrypt}$2a$12$udISUXbLy9ng5wuFsrCMPeQIYzaKtAEXNJqzeprSuaty86N4m6emW','stanislavam@live.co.uk', '1', '1', '1', '1');
 /*
 passwords:
 admin - admin
 stash - stash
 user - user
 */


INSERT IGNORE INTO ROLE_USER (ROLE_ID, USER_ID)
    VALUES
    (1, 1), /* admin-admin */
    (2, 2), /* stash-editor */
    (3, 3); /* user-operator */