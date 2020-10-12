#1.Брой на потребители.
select * 
from users;

#2.Най-стария потребител.
select * 
from users 
order by birthDate 
limit 1;

#3.Най-младия потребител.
select * 
from users
order by birthDate 
DESC limit 1;

#4.Колко юзъра са регистрирани с мейли от abv и колко от gmail и колко с различни от двата?
(select count(email) from users where email like '%gmail%');
(select count(email) from users where email like '%abv%');
(select count(email) from users where email not	like '%gmail%' or '%abv%');

#5.Кои юзъри са banned?
select * from users 
where isBanned = '1';

#6.Изкарайте всички потребители от базата като ги наредите по име в азбучен ред и дата на раждане(от най-младия към най-възрастния).
select * 
from users 
order by username asc, birthDate asc;

#7.Изкарайте всички потребители от базата, на които потребителското име започва с a.
select * 
from users 
where username 
like 'a%';

#8.Изкарайте всички потребители от базата, които съдържат а username името си.
select * 
from users 
where username 
like '%a%';

#9.Изкарайте всички потребители от базата, чието име се състои от 2 имена.!!!!!!!!!!!!!!!!!!!!!!!


#10.Регистрирайте 1 юзър през UI-а и го забранете след това от базата.!!!!!!!!!!!
insert into users(username,password,salt,email) 
value('Petar','123','$ssd','noemail');


#11.Брой на всички постове.
select * 
from posts;

#12.Брой на всички постове групирани по статуса на post-a.
select count(caption), postStatus 
from posts 
group by postStatus;

#13.Намерете поста/овете с най-къс caption.
select caption, length(caption) 
from posts 
group by length(caption), caption asc;

#14.Покажете поста с най-дълъг caption. 
select caption, length(caption) 
from posts 
group by length(caption) desc, caption limit 1;

#15.Кой потребител има най-много постове? Използвайте join заявка.
select users.username, count(posts.userid) 
from posts 
join users 
on posts.userId=users.id 
group by posts.userid 
order by count(posts.userid) 
desc limit 1;

#16.Кои потребители имат най-малко постове? Използвайте join заявка.
select users.username, count(posts.userid) 
from posts 
join users 
on posts.userId=users.id 
group by posts.userid 
having count(posts.userid) <2;

#17.Колко потребителя с по 1 пост имаме? Използвайте join заявка, having clause и вложени заявки. !!!!!!!!!!!!!!!!!!!
select users.username , count(posts.userid) 
from posts 
join users 
on posts.userId=users.id 
group by posts.userid 
having count(posts.userid) = 1;

#18.Колко потребителя с по малко от 5 поста имаме? Използвайте join заявка, having clause и вложени заявки. !!!!!!!!!!!!!!!!!!
select users.username , count(posts.userid) 
from posts 
join users 
on posts.userId=users.id 
group by posts.userid
having count(posts.userid) < 5;

#19.Кои са постовете с най-много коментари? Използвайте вложена заявка и where clause. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!


#20.Покажете най-стария пост. Може да използвате order или с aggregate function.
select * 
from posts 
order by createdAT 
limit 1;

#21.Покажете най-новия пост. Може с order или с aggregate function.
select * 
from posts 
order by createdAT 
desc limit 1;

#22.Покажете всички постове с празен caption.
select * 
from posts 
where caption 
LIKE '';

#23.Създайте потребител през UI-а, добавете му public пост през базата и проверете дали се е създал през UI-а.
insert into posts(caption,coverUrl) 
value(' show MUST GO ON','1');

#24.Покажете всички постове и коментарите им ако имат такива.
select caption 
from posts;

#25.Покажете само постове с коментари и самите коментари.
select caption 
from posts 
where caption 
not LIKE '';

#26.Покажете името на потребителя с най-много коментари. Използвайте join клауза. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
select users.username, count(posts.userid) 
from posts 
join users 
on posts.userId=users.id 
group by posts.userid 
order by count(posts.userid) desc 
limit 1;

#27.Покажете всички коментари, към кой пост принадлежат и кой ги е направил. Използвайте join клауза.
select comments.content, posts.caption, users.username
from comments
join posts
on comments.postId=posts.id
join users
on comments.userId=users.id;

#28. Кои потребители са like-нали най-много постове?
select count(users_liked_posts.usersId),users.username
from users_liked_posts
join users 
on users_liked_posts.usersId=users.id
group by users_liked_posts.usersId
order by count(users_liked_posts.usersId) desc
limit 5;

#29.Кои отребители не са like-вали постове?

#30.Кои постове имат like-ове. Покажете id на поста и caption? 

#31.Кои постове имат най-много like-ове? Покажете id на поста и caption.

#32.Кои постове имат най-много like-ове. Покажете id на поста и caption.

#33.Покажете всички потребители, които не са follow-нати от никого.

#34.Регистрирайте потребител през UI. 
#Follow-нете някой съществуващ потребител и проверете дали записа го има в базата.




