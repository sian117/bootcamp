drop table user;
create table user(user_id text primary key, user_name text, mail_address text, address text, tel_no text);

drop table passwd;
create table passwd(user_id text primary key, user_password text);


insert into user values('testuser','�e�X�g���Y','test@arrow-systems.co.jp','�����s������e�X�g�P�|�R�|�P','090-0123-4567');
insert into user values('admin','�Ǘ����[�U�[','admin@arrow-systems.co.jp','�����s�L����e�X�g�Q�|�P�S�|�P','03-1111-1111');

insert into passwd values('testuser','testtest');
insert into passwd values('admin','root');
