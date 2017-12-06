/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.17-log : Database - movcat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`movcat` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `movcat`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `floor` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `is_index` varchar(255) DEFAULT NULL,
  `gift_article_id` int(11) DEFAULT NULL,
  `father_id` varchar(255) DEFAULT NULL,
  `is_son` varchar(255) DEFAULT NULL,
  `is_grandson` varchar(255) DEFAULT NULL,
  `reply_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`id`,`content`,`create_time`,`floor`,`user_id`,`is_index`,`gift_article_id`,`father_id`,`is_son`,`is_grandson`,`reply_id`) values (1,'自己觉得非常好看，很喜欢，男朋友肯定也喜欢','2017-12-01 17:12:12','1',1,'Y',1,NULL,'N','N',NULL),(2,'还可以吧','2017-12-22 20:11:20','2',1,'Y',1,'3','N','N',NULL),(3,'真的好看吗？','2017-12-02 20:42:46','1',1,NULL,1,'1','Y','N',NULL),(4,'我也觉得好看。','2017-12-03 20:43:46','2',1,NULL,1,'1','Y','N',NULL),(5,'哈哈哈哈','2017-12-15 22:08:37',NULL,1,NULL,1,'2','Y','N',NULL),(6,'AAA','2017-12-09 22:08:59',NULL,1,NULL,1,'2','Y','N',NULL),(8,'bbbb','2017-12-14 22:40:37',NULL,1,NULL,1,'1','Y','N',NULL),(9,'XXXXX','2017-12-22 01:14:19',NULL,2,NULL,1,'3','N','Y',3),(10,'jjj','2017-12-20 01:15:22',NULL,1,NULL,1,'3','N','Y',9),(12,'有趣','2017-12-01 02:12:59','1',3,'Y',2,NULL,'N','N',NULL),(13,'哈哈哈','2017-12-07 02:14:26','1',4,'N',2,'12','Y','N',NULL);

/*Table structure for table `gift` */

DROP TABLE IF EXISTS `gift`;

CREATE TABLE `gift` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL,
  `mall_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `video_url` varchar(255) DEFAULT NULL,
  `is_show` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `gift` */

insert  into `gift`(`id`,`create_time`,`img_url`,`intro`,`mall_url`,`name`,`price`,`tag`,`video_url`,`is_show`) values (1,'2017-12-02 15:40:40','https://img.alicdn.com/imgextra/i1/2422941685/TB2lAOubFOP.eBjSZFHXXXQnpXa_!!2422941685.jpg','圣诞节礼物送女朋友生日男生女生闺蜜创意麋鹿个性diy 友情实用品','https://item.taobao.com/item.htm?spm=a230r.1.14.28.18a9f4f5I5AOTm&id=541127719556&ns=1&abbucket=13#detail','创意麋鹿','118.80','创意',NULL,'Y'),(2,'2017-12-01 16:43:13','https://img.alicdn.com/imgextra/i3/2422941685/TB2xbZydwJlpuFjSspjXXcT.pXa_!!2422941685.jpg','生日礼物女生创意情侣手工送男生女朋友闺蜜新奇特别实用diy礼品','https://item.taobao.com/item.htm?spm=a230r.1.14.58.18a9f4f5I5AOTm&id=544390793007&ns=1&abbucket=13#detail','表白','1422.91','love',NULL,'Y');

/*Table structure for table `gift_article` */

DROP TABLE IF EXISTS `gift_article`;

CREATE TABLE `gift_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `gift_id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `is_show` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `gift_article` */

insert  into `gift_article`(`id`,`create_time`,`details`,`gift_id`,`title`,`user_id`,`is_show`,`img_url`) values (1,'2017-12-09 15:41:08',NULL,1,'经典全手工钉子绕线艺术画——麋鹿',1,'Y','https://g-search2.alicdn.com/img/bao/uploaded/i4/i1/2422941685/TB2.NNSdw1I.eBjSszeXXc2hpXa_!!2422941685.jpg_250x250.jpg_.webp'),(2,'2017-12-16 16:42:44',NULL,2,'经典全手工钉子绕线艺术画',1,'Y','https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/TB1NaCRPXXXXXbAXFXXYXGcGpXX_M2.SS2_250x250.jpg_.webp');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`email`,`img_url`,`name`,`tag`,`tel`,`password`) values (1,'1241943832@qq.com','http://img1.imgtn.bdimg.com/it/u=586723545,3678636448&fm=27&gp=0.jpg','王璐1',NULL,'1','c4ca4238a0b923820dcc509a6f75849b'),(2,'2',NULL,'小法',NULL,'2','c4ca4238a0b923820dcc509a6f75849b'),(3,NULL,'http://img3.duitang.com/uploads/item/201511/13/20151113110644_PcSFj.thumb.224_0.jpeg','智志楠',NULL,NULL,NULL),(4,NULL,'http://img.dongqiudi.com/uploads/avatar/2015/07/25/QM387nh7As_thumb_1437790672318.jpg','笑笑妈妈',NULL,NULL,NULL),(5,NULL,'http://www.feizl.com/upload2007/2014_01/140116182482507.jpg','天天要努力',NULL,NULL,NULL);

/*Table structure for table `variety` */

DROP TABLE IF EXISTS `variety`;

CREATE TABLE `variety` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `english_name` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `is_search` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `variety` */

insert  into `variety`(`id`,`name`,`english_name`,`img`,`is_search`) values (1,'孟买','Bombay','http://oznkdxut7.bkt.clouddn.com/bombay.jpg','Y'),(2,'波斯','Persian','http://oznkdxut7.bkt.clouddn.com/persian.jpg','Y'),(3,'挪威森林','Norwegian Forest','http://oznkdxut7.bkt.clouddn.com/norwegianforest.jpg','Y'),(4,'暹罗','Siamese','http://oznkdxut7.bkt.clouddn.com/siamese.jpg','Y'),(5,'苏格兰折耳','Scottish Fold','http://oznkdxut7.bkt.clouddn.com/scottishfold.jpg','Y'),(6,'短尾','Bobtail','http://oznkdxut7.bkt.clouddn.com/bobtail.jpg','Y'),(7,'加拿大无毛','Sphynx','http://oznkdxut7.bkt.clouddn.com/sphynx.jpg','Y'),(8,'暹罗','Benjal','http://oznkdxut7.bkt.clouddn.com/benjal.jpg','Y');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
