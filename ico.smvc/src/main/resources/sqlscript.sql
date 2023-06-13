CREATE DATABASE music;
USE music;
CREATE TABLE canciones (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  album VARCHAR(255) NOT NULL,
  artist VARCHAR(255) NOT NULL,
  genre VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  url_image VARCHAR(255) NOT NULL
);

INSERT INTO canciones (id, name, album, artist, genre, year, url_image) VALUES
(1, 'Dakiti', 'El Último Tour Del Mundo', 'Bad Bunny', 'Reggaeton', 2020, 'https://t2.genius.com/unsafe/300x300/https%3A%2F%2Fimages.genius.com%2F567b764e878fe32329c4a820687dba9b.1000x1000x1.png'),
(2, 'Callaíta', 'Un verano sin ti', 'Bad Bunny & Tainy', 'Reggaeton', 2019, 'https://upload.wikimedia.org/wikipedia/en/thumb/6/60/Bad_Bunny_-_Un_Verano_Sin_Ti.png/220px-Bad_Bunny_-_Un_Verano_Sin_Ti.png'),
(3, 'Mía', 'X 100PRE', 'Bad Bunny ft. Drake', 'Reggaeton', 2018, 'https://upload.wikimedia.org/wikipedia/en/thumb/e/e7/X100pre.jpg/220px-X100pre.jpg'),
(4, 'Safaera', 'YHLQMDLG', 'Bad Bunny, Jowell & Randy, Ñengo Flow', 'Reggaeton', 2020, 'https://media.pitchfork.com/photos/5e5d895d19382e0008724f89/1:1/w_320,c_limit/YHLQMDLG_Bad%20Bunny.jpg'),
(5, 'La Canción', 'OASIS', 'Bad Bunny ft. J Balvin', 'Reggaeton', 2020, 'https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/J_Balvin_and_Bad_Bunny_-_Oasis.png/220px-J_Balvin_and_Bad_Bunny_-_Oasis.png'),
(6, 'One', 'All Yours', 'ASTRO', 'K-Pop', 2019, 'https://i.scdn.co/image/ab67616d0000b273e0ca747eae494e94484f3997'),
(7, 'Knock', 'GATEWAY', 'ASTRO', 'K-Pop', 2020, 'https://upload.wikimedia.org/wikipedia/en/5/50/ASTRO_Gateway_EP_Cover.jpg'),
(8, 'Crazy Sexy Cool', 'Dream Part.02', 'ASTRO', 'K-Pop', 2017, 'https://upload.wikimedia.org/wikipedia/en/0/02/Dream_part-02.jpg'),
(9, 'After Midnight', 'Switch On', 'ASTRO', 'K-Pop', 2021, 'https://img.kpopmap.com/780x0/2021/08/ASTRO-Switch-On-Comeback_appearance-scaled.jpg'),
(10, 'Blue Flame', 'Blue Flame', 'ASTRO', 'K-Pop', 2019, 'https://e-cdn-images.dzcdn.net/images/cover/f3621bb2e026389d6574df8d7c6d29a4/264x264-000000-80-0-0.jpg');