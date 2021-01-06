package id.ac.unhas.ioiprofilelist.model;

import id.ac.unhas.ioiprofilelist.R;
import java.util.ArrayList;

public class MemberData {
    private static String[] memberNames = {
            "Nayoung",
            "Chungha",
            "Sejeong",
            "Chaeyeon",
            "Kyulkyung",
            "Sohye",
            "Yeonjung",
            "Yoojung",
            "Mina",
            "Doyeon",
            "Somi"
    };

    private static String[] memberDetails = {
            "Nayoung Facts: \n\n" +
                    "- Her nickname is “Stone Nayoung” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She has an older brother \n" +
                    "- Hobby: Listening to Music, Manicure, Drawing \n" +
                    "- Education: Dongduk Girls University \n" +
                    "- Specialty: Dancing \n" +
                    "- Motto: If you do it, it works out \n" +
                    "- Life Goal: Not just me, but everybody be happy \n" +
                    "- She’s currently a member of the girl group Pristin \n" +
                    "- Nayoung appeared in Troy’s “Why Are We?” MV \n" +
                    "- She was a cameo in the drama “Entourage” together with Kim Chungha\n" +
                    "- Trainee Period: 4 years 7 months \n" +
                    "- Company: Pledis (when she was a PD101 contestant); as of May 24, 2019 her contract with Pledis was terminated \n" +
                    "- Currently in: she was a member of Pristin, but as of May 24, 2019 Pristin disbanded \n" +
                    "- In August 2019 she signed with Sublime Artist Agency \n" ,
            "Chungha Facts: \n\n" +
                    "- Her nickname is “Alcohol” (Chungha is the name of an alcohol drink brand. [SNL Korea 7 – May 7, 2016])" +
                    "- Chungha is a former JYP trainee \n" +
                    "- Hobby: Watching movies alone \n" +
                    "- Education: Sejong University \n" +
                    "- Specialty: Choreographs, Dancing \n" +
                    "- She can speak Korean and English \n" +
                    "- Chungha is brave as seen on their show where they go to many abandoned/haunted places \n" +
                    "- Trainee Period: 3 years 3 months \n" +
                    "- Chungha appeared in Pentagon’s “Pretty Pretty” MV \n" +
                    "- She was a cameo in the drama “Entourage” together with Nayoung \n" +
                    "- Chungha sang “Pit A Pat”, Strong Woman Do Bong Soon OST \n" +
                    "- Chungha debuted as a solo artist with “Why Don’t You Know” \n" +
                    "- Chungha lived in Dallas, Texas for 7/8 years \n" +
                    "- She revealed on “Hit The Stage” that she almost quit dancing due to financial issues but she asked her family to allow her to continue as she was confident in it \n" +
                    "- Company: M&H Entertainment \n" +
                    "- Currently a solo artist: Kim Chungha \n" ,
            "Sejeong Facts: \n\n" +
                    "- She was born in Jeonju, South Korea \n" +
                    "- She has an older brother \n" +
                    "- Her nickname is “Uncle” (SNL Korea 7 – May 7, 2016) \n" +
                    "- Hobby: Painting, Re-watching movies \n" +
                    "- Education: Indeogwon High School \n" +
                    "- Specialty: Singing ballads" +
                    "- She participated in Kpop Star Season (16 years old) \n" +
                    "- Sejeong had a cameo appearance on KBS’s web drama ‘Sound of Heart’ (2016) \n" +
                    "- Sejeong is acting as the lead actress in the drama called “School 2017” \n" +
                    "- She was as host of the show “Talents for Sale” in 2016 and was named a permanent MC for the show “Get it Beauty” in January 2017 \n" +
                    "- She gained a lot of popularity in variety shows for her brilliant personality and friendliness. She had variety shows appearances in TV programs like The Law of the Jungle, Boat Horn Clenched, Mr. Baek The Homemade Food Master 2, (KBS) Immortal Songs 2 , Yoo Hee Yeol’s Sketchbook , (SBS) Flower Crew, (MBC) King of Masked Singer, (KBS) Singing Battle,(KBS) Boom Shakalaka and more \n" +
                    "- Her song “Flower Road” (produced by Zico) managed to reach # 1 on the Korean charts. She is the fastest soloist to win a musical show (Show Champion) \n" +
                    "- On January 12, 2017, Sejeong released the song “If Only” for the OST of the Korean drama “The Legend of the Blue Sea” \n" +
                    "- Sejeong was in a Lotte Water Park CF with Astro’s Eunwoo \n" +
                    "- Trainee Period: 1 year 11 months \n" +
                    "- Company: Jellyfish Entertainment \n" +
                    "- Current Group: Gugudan / Gu9udan \n" ,
            "Chaeyeon Facts: \n\n" +
                    "- Her nickname is “Daeng (Clueless)” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She has an older sister \n" +
                    "- Hobby: Mobile Games, Movies \n" +
                    "- Education: School of Performing Arts Seoul \n" +
                    "- Specialty: Dance, Aegyo, Skating \n" +
                    "- She was born in Jorye-dong, Suncheon-si, Jeollanam-do, South Korea \n" +
                    "- She debuted on 2015 as a member of the girl group DIA. She temporarily withdrew from the group to join in the program Produce 101 as a trainee and returned after the I.O.I’s disbandment \n" +
                    "- In December 2016, she was cast in the science fiction web drama “109 Strange Things” \n" +
                    "- She was featured in SBS’s romantic fantasy drama “Reunited Worlds” \n" +
                    "- Chaeyeon acted as main cast on a web drama called “I am” (2017) \n" +
                    "- She was revealed as the new face of jewelry brand Lamucha \n" +
                    "- Trainee Period: 8 months \n" +
                    "- Company: MBK Entertainment \n" +
                    "- Current Group: DIA \n" ,
            "Kyulkyung Facts: \n\n" +
                    "- Her nickname is “Joo Jae Duk” (SNL Korea 7 – May 7, 2016) \n" +
                    "- Birthplace: Shanghai, China \n" +
                    "- She has a little sister and a little brother \n" +
                    "- Hobby: Window shopping, searching beauty sites \n" +
                    "- Education: Shanghai Conservatory of Music; School of Performing Arts Seoul \n" +
                    "- Specialty: Dance, Instruments (Pipa, Guitar) \n" +
                    "- The members said that “Kyulkyung” looks like an ostrich \n" +
                    "- Pinky is easily scared when having to go to abandoned/haunted places \n" +
                    "- Trainee Period: 5 years 5 months \n" +
                    "- Company: Pledis Entertainment \n" +
                    "- Currently in: she was a member of Pristin, but as of May 24, 2019 Pristin disbanded \n" +
                    "- Kyulkyung is a solo artist with activities in China, she debuted on September 9, 2018 with the title “Why” \n" +
            "Sohye Facts: \n\n" +
                    "- Her nickname is “Penguin” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She has a younger brother \n" +
                    "- Hobby: pickup trash as she walks, penguin collector \n" +
                    "- Education: Kyunggi Girls’ High School \n" +
                    "- Specialty: Ocarina, Volleyball, Beatbox, Acting \n" +
                    "- Sohye is easily scared when having to go to abandoned/haunted places \n" +
                    "- Sohye has her own cafe in Korea \n" +
                    "- Sohye was a host of Star Show 360 and currently hosts SBS Game Show and EBS2 English Lecture Program which teaches students English to prepare for the TOEIC exam \n" +
                    "- She acted in a short drama called “Poetic Story” \n" +
                    "- Sohye was a cameo is the web drama “Queen of Ring” and had the main role in the web drama “Unexpected Heroes” \n" +
                    "- In 2017, Sohye acted as the female lead in the KBS Drama Special “Kang Deoksun’s Love History” \n" +
                    "- Sohye also appeared in several music videos: The Ark – “The Light”, Jinlin Wang – “Goodbye School”, Ra.D – “Look Into Your Eyes” \n" +
                    "- She acted in the drama “Best Chicken” (2019) \n" +
                    "- Trainee Period: 1 year \n" +
                    "- Company: Shark & Penguin Entertainment \n" +
                    "- After I.O.I disbandment Sohye joined joined SBS Power FM Bae Sung-jae’s Ten Radio as a fixed member \n" +
                    "- Currently an actress: Kim So Hye \n" ,
            "Yeonjung Facts: \n\n" +
                    "- Her nickname is “Cider Vocal” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She has one older brother \n" +
                    "- Hobby: Playing alone \n" +
                    "- Education: Hanlim Multi Art School \n" +
                    "- Yeonjung acted in the drama “Hwayugi” (2017) as cameo in Ep. 1. \n" +
                    "- She can play the guitar \n" +
                    "- Yeonjung used to train under SM Entertainment \n" +
                    "- Trainee Period: 1 year 3 months \n" +
                    "- Company: Starship Entertainment \n" +
                    "- Current Group: Cosmic Girls \n" +


                    "- Trainee Period: 1 year \n" +
                    "- Trainee Period: 1 year \n" ,
            "Yoojung Facts: \n\n" +
                    "- Her nickname is “Wink Fairy” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She doesn’t have any siblings \n" +
                    "- Hobby: Dancing, Painting, Photography \n" +
                    "- Education: Seoul Music High School \n" +
                    "- Specialty: she raps and writes her own lyrics, covers boygroup’s choreography, grandmother/grandfather impersonation \n" +
                    "- Yoojung is easily scared when having to go to abandoned/haunted places \n" +
                    "- Yoojung can impersonate an orangutan \n" +
                    "- Motto: Don’t forget your roots, think of other first \n" +
                    "- Trainee Period: 4 years 7 months \n" +
                    "- Yoojung appeared in ASTRO’s ‘Breathless’ MV and ASTRO’s ‘To Be Continued’ drama \n" +
                    "- Yoojung and Doyeon were on the web-drama “Idol Fever” \n" +
                    "- Yoojung said that if she was a guy, she would date Chungha \n" +
                    "- Yoojung’s ideal type: Park Haejin, she especially loved him in “The Cheese in the Trap”; a man who is musician \n" +
                    "- Company: Fantagio Entertainment \n" +
                    "- Current group: Weki Meki \n" ,
            "Mina Facts: \n\n" +
                    "- Her nickname is “Juice Girl” (SNL Korea 7 – May 7, 2016) \n" +
                    "- Hobby: watching dramas, traveling alone and playing games \n" +
                    "- Education: Seoul School of Performing Arts \n" +
                    "- Specialty: Waacking Dance \n" +
                    "- Motto: “in any situation, eating comes first” \n" +
                    "- Mina and Doyeon have the exact same birthday (day, month, year) \n" +
                    "- Mina is the MC of Music Core \n" +
                    "- Mina appeared in Honeyst’s “Someone to Love” MV \n" +
                    "- In 2019 Mina was part of the cast for Law of the Jungle in Thailand \n" +
                    "- She acts in “Hotel Del Luna” tvn 2019 \n" +
                    "- Mina’s ideal type: someone who smiles refreshingly. She likes Nam Joo Hyuk \n" ,
                    "- Trainee Period: 1 year 1 month \n" +
                    "- Company: Jellyfish Entertainment \n" +
                    "- Current Groups: Gugudan / Gu9udan, Oguogu \n" ,
            "Doyeon Facts: \n\n" +
                    "- Her nickname is “Little Jun Ji Hyun” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She has an older sister and an older brother \n" +
                    "- Hobby: Watching Movies, Listening to Music \n" +
                    "- Education: Wonju, Gangwondo, South Korea \n" +
                    "- Specialty: Dancing, Reaction queen \n" +
                    "- Doyeon is brave as seen on their show where they go to many abandoned/haunted places \n" +
                    "- Mina and Doyeon have the exact same birthday (day, month, year) \n" +
                    "- Doyeon and Yoojung were on the web-drama “Idol Fever” \n" +
                    "- She can play basketball and was also the captain of her cheerleading team \n" +
                    "- Doyeon has a solo song with Long:D called All Night \n" +
                    "- Doyeon appeared in Fantagio’s web dramas To Be Continued and Idol Fever \n" ,
                    "- Trainee Period: 1 year 5 months \n" +
                    "- Company: Fantagio Entertainment \n" +
                    "- Current group: Weki Meki \n" +
                    "- Doyeon’s ideal type: Park Seo-joon. She said she really loved his character in “She Was Pretty” \n" ,

            "Somi Facts: \n\n" +
                    "- Her nickname is “Vitamin” (SNL Korea 7 – May 7, 2016) \n" +
                    "- She has a little sister \n" +
                    "- Hobby: Collecting Socks, Shopping, Walking Alone, Search for Good Music, Search for good restaurants \n" +
                    "- Education: Seoyun Middle School, Hanlim Multi Arts High School \n" +
                    "- Specialty: Taekwondo, Caricatures, cooking \n" +
                    "- Somi is easily scared when having to go to abandoned/haunted places \n" +
                    "- She holds 3rd degree black belt in Taekwondo \n" +
                    "- Somi appeared in GOT7’s “Stop stop It” MV \n" +
                    "- Somi also appeared in Up10tion’s “White Night” MV \n" +
                    "- Somi was a co-host for “Idol Likes Battle” ep. 3 (guests GOT7) \n" +
                    "- Former Contestant of SIXTEEN \n" +
                    "- Somi was meant to be a part of Twice and is close friends with Chaeyoung and the other members of Twice \n" +
                    "- Somi was,  alongside other 6 female idols, in “Idol Drama Operation Team” tv program. They created a 7 members girl group, called Girls Next Door , which debuted on July 14, 2017 \n" +
                    "- On August 20, 2018, Somi left JYPE \n" +
                    "- On September 23, Jeon Somi has signed a contract with The Black Label (a subsidiary label of YG Entertainment headed by Teddy) \n" +
                    "- Trainee Period: 2 years \n" +
                    "- Company: when she was in I.O.I she was under JYP Entertainment, but meanwhile she left JYPE \n" +
                    "- After I.O.I’s disbandment she joined different variety shows, such as Sister’s Slam Dunk Season 2 \n" +
                    "- On June 13, 2019 she debuted as a soloist with the single “Birthday” \n"
    };

    private static String[] moreDetailMembers = {
            "Stage name :\n Nayoung (나영) \n\n" +
                    "Birth Name :\nLim Na Young (임나영)\n\n" +
                    "Position :\nLeader, Main Rapper, Lead Dancer, Vocalist\n\n" +
                    "Birthday :\nDecember 18, 1995\n\n" +
                    "Zodiac Sign :\nSagittarius\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n171 cm (5’7″)\n\n" +
                    "Weight :\n50 kg (110 lbs)\n\n" +
                    "Blood Type :\nO\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" +
                    "Instagram : \n@nayoung_lim95" ,
            "Stage name :\n Chungha (청하) \n\n" +
                    "Birth Name :\nKim Chan-mi (김찬미)\n\n" +
                    "Position :\nMain Dancer, Lead Vocalist, Rapper\n\n" +
                    "Birthday :\nFebruary 9, 1996\n\n" +
                    "Zodiac Sign :\nAquarius\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n161 cm (5’3″)\n\n" +
                    "Weight :\n44 kg (97 lbs)\n\n" +
                    "Blood Type :\nA\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" +
                    "Instagram : \n@chungha_official" ,
            "Stage name :\n Sejeong (세정) \n\n" +
                    "Birth Name :\nKim Se Jeong (김세정)\n\n" +
                    "Position :\nMain Vocalist\n\n" +
                    "Birthday :\nAugust 28, 1996\n\n" +
                    "Zodiac Sign :\nVirgo\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n164 cm (5’5″)\n\n" +
                    "Weight :\n 48 kg (105 lbs)\n\n" +
                    "Blood Type :\nAB\n\n" ,
            "Stage name :\n Chaeyeon (채연) \n\n" +
                    "Birth Name :\n Jung Chae Yeon (정채연)\n\n" +
                    "Position :\nVocalist, Visual\n\n" +
                    "Birthday :\nDecember 1, 1997\n\n" +
                    "Zodiac Sign :\nSagittarius\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n166 cm (5’5″)\n\n" +
                    "Weight :\n49 kg (108 lbs)\n\n" +
                    "Blood Type :\nA\n\n" +
                    "Instagram : \n @j_chaeyeoni" ,
            "Stage name :\n Kyulkyung (결경) \n\n" +
                    "Birth Name :\nZhou Jie Qiong (周洁琼)\n\n" +
                    "Korean Name :\nJoo Kyulkyung (주결경)\n\n" +
                    "Position :\nLead Dancer, Vocalist, Visual\n\n" +
                    "Birthday :\nDecember 16, 1998\n\n" +
                    "Zodiac Sign :\nSagittarius\n\n" +
                    "Nationality :\nChinese\n\n" +
                    "Height :\n166 cm (5’5″)\n\n" +
                    "Weight :\n47 kg (103 lbs)\n\n" +
                    "Blood Type :\nO\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" +
                    "Instagram : \n@zhou_jieqiong1216" ,
            "Stage name :\n Sohye (소혜) \n\n" +
                    "Birth Name :\nKim So Hye (김소혜)\n\n" +
                    "Position :\nVocalist, Rapper\n\n" +
                    "Birthday :\nJuly 19, 1999\n\n" +
                    "Zodiac Sign :\nCancer\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n163 cm (5’4″)\n\n" +
                    "Weight :\n48 kg (105 lbs)\n\n" +
                    "Blood Type :\nA\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" +
                    "Instagram : \n@s_sohye" ,
            "Stage name :\n Yeonjung (연정) \n\n" +
                    "Birth Name :\nYu Yeon Jung (유연정)\n\n" +
                    "Position :\nMain Vocalist\n\n" +
                    "Birthday :\nAugust 3, 1999\n\n" +
                    "Zodiac Sign :\nLeo\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n167 cm (5’6″)\n\n" +
                    "Weight :\n52 kg (114 lbs)\n\n" +
                    "Blood Type :\nA\n\n" +
                    "Instagram : \n@uyj_s" ,
            "Stage name :\n Yoojung (유정) \n\n" +
                    "Birth Name :\nChoi Yoo Jung (최유정)\n\n" +
                    "Position :\nLead Rapper, Lead Dancer, Lead Vocalist\n\n" +
                    "Birthday :\nNovember 12, 1999\n\n" +
                    "Zodiac Sign :\nScorpio\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n157 cm (5’2″)\n\n" +
                    "Weight :\n44 kg (97 lbs)\n\n" +
                    "Blood Type :\nO\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" ,
            "Stage name :\n Mina (미나) \n\n" +
                    "Birth Name :\nKang Mi Na (강미나)\n\n" +
                    "Position :\nLead Dancer, Vocalist, Rapper\n\n" +
                    "Birthday :\nDecember 4, 1999\n\n" +
                    "Zodiac Sign :\nSagittarius\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n162 cm (5 ft 3¾ in)\n\n" +
                    "Weight :\n48 kg (105 lbs)\n\n" +
                    "Blood Type :\nO\n\n" ,
            "Stage name :\n Doyeon (도연) \n\n" +
                    "Birth Name :\nKim Do Yeon (김도연)\n\n" +
                    "Position :\nVocalist, Visual\n\n" +
                    "Birthday :\nDecember 4, 1999\n\n" +
                    "Zodiac Sign :\nSagittarius\n\n" +
                    "Nationality :\nKorean\n\n" +
                    "Height :\n173 cm (5’8″)\n\n" +
                    "Weight :\n50 kg (110 lbs)\n\n" +
                    "Blood Type :\nO\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" ,
            "Stage name :\n Somi (소미) \n\n" +
                    "Birth Name :\nEnnik Somi Douma {Jeon So Mi (전소미)}\n\n" +
                    "Position :\nLead Dancer, Lead Vocalist, Rapper, Face of the Group, Center, Maknae\n\n" +
                    "Birthday :\nMarch 9, 2001\n\n" +
                    "Zodiac Sign :\nPisces\n\n" +
                    "Nationality :\nDutch-Korean-Canadian\n\n" +
                    "Height :\n172 cm (5’8’’)\n\n" +
                    "Weight :\n48 kg (105 lbs)\n\n" +
                    "Blood Type :\nO\n\n" +
                    "Sub-Unit :\nI.O.I Sub Unit\n\n" +
                    "Instagram : \n@somsomi0309" ,
    };

    private static int[] memberImages = {
            R.drawable.nayoung,
            R.drawable.chungha,
            R.drawable.sejeong,
            R.drawable.chaeyeon,
            R.drawable.kyulkyung,
            R.drawable.sohye,
            R.drawable.yeonjung,
            R.drawable.yoojung,
            R.drawable.mina,
            R.drawable.doyeon,
            R.drawable.somi
    };

    private static String[] memberRating = {
            "Rank 10",
            "Rank 4",
            "Rank 2",
            "Rank 7",
            "Rank 6",
            "Rank 5",
            "Rank 11",
            "Rank 3",
            "Rank 9",
            "Rank 8",
            "Rank 1"
    };

    public static ArrayList<Member> getListData() {
        ArrayList<Member> list = new ArrayList<>();
        for (int position = 0; position < memberNames.length; position++) {
            Member member = new Member();
            member.setNamaMember(memberNames[position]);
            member.setDetail(memberDetails[position]);
            member.setPhoto(memberImages[position]);
            member.setMoreDetail(moreDetailMembers[position]);
            member.setRating(memberRating[position]);
            list.add(member);
        }
        return list;
    }
}
