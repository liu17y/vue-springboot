/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : zongyi

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 12/11/2023 19:03:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int NOT NULL,
  `label` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `is_sub_menu` tinyint(1) NOT NULL DEFAULT 0,
  `parent_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `parent_id`(`parent_id` ASC) USING BTREE,
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `menu` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user`  (
  `IDcard` int NOT NULL COMMENT '编号',
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮件',
  `phone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '电话号码',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`IDcard`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES (2652, '发件人', '1214', '14jf@163.com', '123143', '阿法', '他已经');
INSERT INTO `s_user` VALUES (3653, '打法ui', NULL, '123@qq.com', '1443417', '孤苦看', '而台湾');
INSERT INTO `s_user` VALUES (6567, '个人收', NULL, '21234@163.com', '21324', '覆盖率', '体育');
INSERT INTO `s_user` VALUES (24565, '反对的人', '123456', 'ewq@163.com', '12413', 'CV', '沸腾鱼');
INSERT INTO `s_user` VALUES (25267, 'adminb', '123456', '1323@qq.com', '1212341', '联合国粮农组织', '而无法');
INSERT INTO `s_user` VALUES (25426, '三个人', '', 'ewq@163.com', '12413', 'CV', '温热');
INSERT INTO `s_user` VALUES (25462, '然后同步', NULL, '12314', '13354656', '宝宝蹦蹦', '脱衣服');
INSERT INTO `s_user` VALUES (44154, 'qerqwer', '123456', 'ewq@163.com', '12413678905', 'CVMS', '广东富豪');
INSERT INTO `s_user` VALUES (45425, '发噶二', NULL, '1413', '13245', '发v额', '她故意让她');
INSERT INTO `s_user` VALUES (52456, '珠三角', '123456', 'ewq@163.com', '12413', 'CV', '飞机反坦克');
INSERT INTO `s_user` VALUES (54626, 'vse', NULL, '134', '12324', '方式v', 'vm');
INSERT INTO `s_user` VALUES (56345, '景山分段fhf', '1214', '14jf@163.com', '123143', '阿法', '啊ity');
INSERT INTO `s_user` VALUES (56524, '然后同步', NULL, '12314', '13354656', '宝宝蹦蹦', '收入提高');
INSERT INTO `s_user` VALUES (65746, '法国菜', NULL, '132', '123245', '分公司', '体育4');
INSERT INTO `s_user` VALUES (98934, '沟通', '2344', '14jf@163.com', '123144365', '粉红色', '安等人共同');
INSERT INTO `s_user` VALUES (123124, 'adminwe', '1244', '1435@qq.com', '21143', '出手大方', '德法费');
INSERT INTO `s_user` VALUES (134252, '未确认', NULL, '123456', '123243', '1423vfd', '爱他人');
INSERT INTO `s_user` VALUES (212312, '符合乳房', NULL, '12312@qq.com', '131321', 'v平整地面', '阿风啊');
INSERT INTO `s_user` VALUES (213241, 'ligang', '123456', '', NULL, NULL, '古巨基.藕片');
INSERT INTO `s_user` VALUES (245625, '电饭锅', '123456', 'ewq@163.com', '12413', 'CV', '覅看看');
INSERT INTO `s_user` VALUES (254628, '乳娃娃', NULL, '345@163.com', '213114315', '格哈尔', '阿发啊');
INSERT INTO `s_user` VALUES (254667, '三个人', '', 'ewq@163.com', '12413', 'CV', '问题');
INSERT INTO `s_user` VALUES (315345, 'awerw', '123413', '482506@qq.com', '54724567245', 'GZY', '为热热');
INSERT INTO `s_user` VALUES (542565, 'vse', NULL, '134', '12324', '方式v', '请问饿');
INSERT INTO `s_user` VALUES (546348, 'awffa', NULL, '123@qq.com', '1212344', '建瓯按结', '葛瑞格');
INSERT INTO `s_user` VALUES (635673, 'v饿啊港囧', NULL, '21345', '1234546', '245在电脑', '阿文');
INSERT INTO `s_user` VALUES (784683, '打法ui', NULL, '123@qq.com', '1443417', '孤苦看', '让他犹太人');
INSERT INTO `s_user` VALUES (786783, '认为', NULL, '133424', '13554636', '共和党和', '娃啊');
INSERT INTO `s_user` VALUES (814546, 'gaerrgr', '123456', 'qijy6@163.com', '142625723', 'QCHAO', '儿童');
INSERT INTO `s_user` VALUES (1213411, 'yujizhengt', '123456', '', NULL, NULL, '虞姬zro');
INSERT INTO `s_user` VALUES (1314145, 'eqqrqw', NULL, '13214@163.com', '07567431', 'VS的方式', '而且人');
INSERT INTO `s_user` VALUES (1345345, '解范化', '234245', '14jf@163.com', '123144365', '啊啊发吧', '肌肤');
INSERT INTO `s_user` VALUES (1451435, '32arfag', '234245', '14jf@163.com', '123144365', '啊啊发吧', '链接库il');
INSERT INTO `s_user` VALUES (1546146, 'fdgs', '123456', 'ewq@163.com', '12413', 'CV', 'ui哦股');
INSERT INTO `s_user` VALUES (2134515, 'aerawr', '123456', 'qij6@163.com', '14262572678', 'TD', '微软');
INSERT INTO `s_user` VALUES (2346568, '额威风', NULL, '2144', '21314', '范文芳', '热特热');
INSERT INTO `s_user` VALUES (2456256, '然后同步', '1314', '12314', '13354656', '宝宝蹦蹦', '飞天御剑');
INSERT INTO `s_user` VALUES (2554257, '安文丰', NULL, '1234', '21324', '安抚我跟他', '请问啊的官方');
INSERT INTO `s_user` VALUES (2656637, '同仁堂', NULL, '1314', '1234513', '施工合同', '热帖吗v');
INSERT INTO `s_user` VALUES (3213590, '123124qw', '13435', '', NULL, NULL, '啊如歌如');
INSERT INTO `s_user` VALUES (3412419, 'guchur', '467055d2e1aac0ce541aa8386480596d', '', NULL, NULL, '古川伊之');
INSERT INTO `s_user` VALUES (5431241, 'admin', '41b0ad59e03a297141b642875e39fbd2', '9023@163.com', '1212314145', '高升桥北街5号7楼2号房间', '管理员');
INSERT INTO `s_user` VALUES (5643523, '片刻工夫目标', '234245', '14jf@163.com', '123144365', '啊啊发吧', 'ufik');
INSERT INTO `s_user` VALUES (5765472, '珠三角', '123456', 'ewq@163.com', '12413', 'CV', '反坦克');
INSERT INTO `s_user` VALUES (6143534, 'liuzongyi', '123456', 'qetre@163.com', '1324234536', 'SADK', '喜之郎');
INSERT INTO `s_user` VALUES (7078670, '打法ui', NULL, '123@qq.com', '1443417', '孤苦看', '体育');
INSERT INTO `s_user` VALUES (7534542, '规划局', NULL, '123342', '12343456', '干涉台海', '阿尔');
INSERT INTO `s_user` VALUES (7657868, 'gsfth', '123456', '14jf@163.com', '123143', '阿法', '工会经费');
INSERT INTO `s_user` VALUES (9122314, 'admin12', 'fe38b3700677d76a28315ade338c0e5b', '', NULL, NULL, '二万人');
INSERT INTO `s_user` VALUES (9241632, 'aitianlai', NULL, '124342@qq.com', '07853463', '日本商业街影院', '爱田奈奈');
INSERT INTO `s_user` VALUES (10451346, 'ertey', '234245', '14jf@163.com', '123144365', '粉红反对', '热污染');
INSERT INTO `s_user` VALUES (12314341, 'fouersan', '123456', '', NULL, NULL, '佛山你');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` varbinary(32) NOT NULL,
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `sex` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (0x6A617661323330363033377A3973646F38386630, '廖秀英', 29, '女', '锦江区红星路三段668号');
INSERT INTO `student` VALUES (0x6A61766132333036306A3066337A31616D6D3530, '龙岚', 47, '女', '越秀区中山二路576号');
INSERT INTO `student` VALUES (0x6A617661323330363173326F687074787A667834, '姜岚', 23, '女', '罗湖区清水河一路321号');
INSERT INTO `student` VALUES (0x6A6176613233303632756871646C656A72317738, '傅嘉伦', 28, '男', '坑美十五巷470号');
INSERT INTO `student` VALUES (0x6A6176613233303633686A6D393039676D757778, '董子异', 45, '男', '锦江区人民南路四段772号');
INSERT INTO `student` VALUES (0x6A617661323330363369326A7573716262616D37, '潘睿', 42, '男', '白云区机场路棠苑街五巷852号');
INSERT INTO `student` VALUES (0x6A61766132333036343234377762666B6671787A, '向秀英', 50, '女', '白云区机场路棠苑街五巷377号');
INSERT INTO `student` VALUES (0x6A6176613233303634687037726A316679663338, '黎子异', 35, '男', '环区南街二巷532号');
INSERT INTO `student` VALUES (0x6A61766132333036346C6B303974386930687A71, '卢岚', 45, '女', '西城区复兴门内大街704号');
INSERT INTO `student` VALUES (0x6A617661323330363571727A6164697630676331, '傅秀英', 29, '女', '罗湖区田贝一路543号');
INSERT INTO `student` VALUES (0x6A61766132333036357634686A736F3630346436, '刘杰宏', 39, '男', '乐丰六路636号');
INSERT INTO `student` VALUES (0x6A61766132333036357878733663743632633066, '王云熙', 28, '男', '浦东新区健祥路969号');
INSERT INTO `student` VALUES (0x6A61766132333036366165367A366B34626E7030, '毛晓明', 42, '男', '福田区深南大道374号');
INSERT INTO `student` VALUES (0x6A61766132333036376C6373617A376175627234, '韩秀英', 31, '女', '成华区玉双路6号153号');
INSERT INTO `student` VALUES (0x6A6176613233303639346933686663716A766B79, '沈杰宏', 38, '男', '西城区复兴门内大街388号');
INSERT INTO `student` VALUES (0x6A61766132333036396175353566323133787137, '黄嘉伦', 40, '男', '天河区天河路899号');
INSERT INTO `student` VALUES (0x6A6176613233303661393679356F613078663334, '戴璐', 30, '女', '浦东新区橄榄路915号');
INSERT INTO `student` VALUES (0x6A6176613233303661796E66723468316D666269, '郑杰宏', 44, '男', '紫马岭商圈中山五路728号');
INSERT INTO `student` VALUES (0x6A61766132333036646164686A6B796777356974, '卢震南', 41, '男', '福田区景田东一街910号');
INSERT INTO `student` VALUES (0x6A6176613233303664676831357272367470686C, '董子异', 25, '男', '乐丰六路876号');
INSERT INTO `student` VALUES (0x6A61766132333036656C697A336C65686969756C, '郭嘉伦', 33, '男', '坑美十五巷245号');
INSERT INTO `student` VALUES (0x6A6176613233303667306E3767776476736D776A, '魏岚', 48, '女', '房山区岳琉路514号');
INSERT INTO `student` VALUES (0x6A61766132333036676C6775356E796970657336, '范秀英', 45, '女', '锦江区人民南路四段683号');
INSERT INTO `student` VALUES (0x6A61766132333036676C75703438647133616F36, '邹子韬', 46, '男', '天河区大信商圈大信南路454号');
INSERT INTO `student` VALUES (0x6A617661323330366772716830316B6F706D6232, '黄震南', 46, '男', '福田区深南大道106号');
INSERT INTO `student` VALUES (0x6A61766132333036693033346D783774786F6D6D, '莫子异', 23, '男', '西城区复兴门内大街98号');
INSERT INTO `student` VALUES (0x6A61766132333036696B74776176666334733831, '陆子异', 50, '男', '越秀区中山二路500号');
INSERT INTO `student` VALUES (0x6A617661323330366B6F6D77736A65353577726B, '何詩涵', 38, '女', '东泰五街890号');
INSERT INTO `student` VALUES (0x6A617661323330366C396B796478767538653432, '龙詩涵', 49, '女', '东泰五街431号');
INSERT INTO `student` VALUES (0x6A617661323330366C6D386A71793735326C6D71, '王致远', 42, '男', '罗湖区田贝一路699号');
INSERT INTO `student` VALUES (0x6A617661323330366C707764347A38777A35706A, '邵子韬', 23, '男', '浦东新区健祥路415号');
INSERT INTO `student` VALUES (0x6A617661323330366E36376F3370333573386932, '程杰宏', 41, '男', '锦江区人民南路四段552号');
INSERT INTO `student` VALUES (0x6A617661323330366F6678786B79626A36376375, '郭晓明', 26, '男', '黄浦区淮海中路863号');
INSERT INTO `student` VALUES (0x6A617661323330367077757A3430316F69656C66, '阎致远', 43, '男', '西城区复兴门内大街784号');
INSERT INTO `student` VALUES (0x6A6176613233303671376A386F37346B756F7872, '姚子异', 34, '男', '海淀区清河中街68号346号');
INSERT INTO `student` VALUES (0x6A6176613233303672393373696E6E6A7276776F, '蔡云熙', 35, '男', '延庆区028县道424号');
INSERT INTO `student` VALUES (0x6A617661323330367336756D7A7A6937366F6F68, '陆子韬', 27, '男', '西城区复兴门内大街915号');
INSERT INTO `student` VALUES (0x6A61766132333036737670636A366231616F6E39, '林璐', 37, '女', '延庆区028县道608号');
INSERT INTO `student` VALUES (0x6A6176613233303673767A73673374623730346D, '金致远', 46, '男', '白云区机场路棠苑街五巷660号');
INSERT INTO `student` VALUES (0x6A61766132333036743566656E627863706E686B, '苏云熙', 30, '男', '白云区小坪东路917号');
INSERT INTO `student` VALUES (0x6A61766132333036746B366C33706E7464647531, '宋秀英', 26, '女', '福田区深南大道600号');
INSERT INTO `student` VALUES (0x6A61766132333036746D786E667577307A686832, '陶震南', 27, '男', '东泰五街561号');
INSERT INTO `student` VALUES (0x6A617661323330367472696C747A716733657872, '林致远', 46, '男', '東城区東直門內大街904号');
INSERT INTO `student` VALUES (0x6A61766132333036756569776A7A326D64717937, '赵睿', 48, '男', '天河区天河路988号');
INSERT INTO `student` VALUES (0x6A61766132333036756576723435756970756170, '吴晓明', 29, '男', '西城区西長安街269号');
INSERT INTO `student` VALUES (0x6A6176613233303676617064346E313935733737, '于睿', 37, '男', '锦江区红星路三段463号');
INSERT INTO `student` VALUES (0x6A61766132333036776271667530346A6538636F, '高云熙', 41, '男', '成华区二仙桥东三路749号');
INSERT INTO `student` VALUES (0x6A6176613233303679646A6D773132637270316F, '宋嘉伦', 35, '男', '罗湖区蔡屋围深南东路955号');
INSERT INTO `student` VALUES (0x6A61766132333036796635736A316A6C33777479, '许子异', 36, '男', '罗湖区清水河一路114号');
INSERT INTO `student` VALUES (0x6A617661323330367A7574337A33787234336970, '秦岚', 37, '女', '坑美十五巷154号');

SET FOREIGN_KEY_CHECKS = 1;
