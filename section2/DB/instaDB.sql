CREATE TABLE user (
    ID  varchar(20) not null,
    name varchar(20) not null,
    email varchar(20) not null,
    password varchar(20) not null,
    created_date date not null,

    PRIMARY KEY(ID)
);

CREATE TABLE follow (
    ID varchar(20) not null,
    follow_ID varchar(20) not null,

    PRIMARY KEY(ID, follow_ID),
    FOREIGN KEY(ID) REFERENCES user (ID)
);

CREATE TABLE post (
    post_ID  varchar(20) not null,
    ID varchar(20) not null,
    content_link varchar(100) not null,

    PRIMARY KEY(post_ID),
    FOREIGN KEY(ID) REFERENCES user (ID)
);

CREATE TABLE like (
    post_ID  varchar(20) not null,
    like_ID varchar(20) not null,

    PRIMARY KEY(post_ID, like_ID),
    FOREIGN KEY(post_ID) REFERENCES post (post_ID)
);

CREATE TABLE comment (
    post_ID  varchar(20) not null,
    ID varchar(20) not null,
    comment_num int(11) not null,
    comment varchar(100) not null,

    PRIMARY KEY(comment_num),
    FOREIGN KEY(post_ID) REFERENCES post (post_ID),
    FOREIGN KEY(ID) REFERENCES user (ID)
);

CREATE TABLE hashtag (
    post_ID  varchar(20) not null,
    hashtag varchar(20) not null,

    PRIMARY KEY(post_ID),
    FOREIGN KEY(post_ID) REFERENCES post (post_ID)
);