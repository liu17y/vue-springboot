<template>
  <el-container class="home-container">
    <el-aside width="200px" class="el-aside">
      <!-- 左边栏内容 -->
<!--      <h1><img src="http://s2s3869z3.hn-bkt.clouddn.com/backgroud.jpg" style="width:40px; height: 20px"/>药品用法用量管理系统</h1>-->
      <comond-aside />
    </el-aside>
    <el-container>
      <el-header class="el-header">
        <!-- 头部内容 -->
        <BackHeader />
      </el-header>
      <el-header class="headertwo">
        <el-card class="box-card">
          <div class="breadcrumb-container">
            <el-breadcrumb separator="/">
              <el-breadcrumb-item :to="{ path: '/1' }">首页</el-breadcrumb-item>
              <el-breadcrumb-item><a href="/1">活动管理</a></el-breadcrumb-item>
              <el-breadcrumb-item>活动列表</el-breadcrumb-item>
              <el-breadcrumb-item>活动详情</el-breadcrumb-item>
            </el-breadcrumb>
          </div>
        </el-card>
      </el-header>
      <el-main class="el-main">
        <el-main class="middle-content">
          <router-view />
        </el-main>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
import ComondAside from '../components/ComondAside.vue'
import BackHeader from '../components/BackHeader.vue'
export default {
  data () {
    return {}
  },
  components: {
    ComondAside,
    BackHeader
  }
}
</script>

<style scoped>
.home-container {
  height: 100vh;
  overflow: hidden;
}

.el-header {
  background-color: #ffffff;
  color: #fff;
  height: 80px;
  line-height: 80px;
  text-align: center;
}

.el-aside {
  background-color: #ffffff;
  display: flex;
  flex-direction: column;
  color: #070707;
}

.el-main {
  background-color: #f3f0f0;
  color: #fff;
}

.middle-content {
  background-color: #fcfcfc;
  padding: 1px;
  height: 100%;
}
.headertwo{
  background-color: #f3f0f0;
  position: relative;
  padding-top: 9px;
}
.box-card{
  display: flex;
  padding-top: 10px;
}
</style>
