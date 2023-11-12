<template>
  <div >
    <el-form :model="form" ref="form" :rules="rules" label-width="80px" class="login-form">
      <el-form-item label="用户名" prop="username">
        <el-input v-model="form.username" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" v-model="form.password" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('form')">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>

export default {
}
</script>
<style>
.login-form{
width: 400px;
  margin: 0 auto;
  height: 40px;
  padding-top: 10px;
  display: flex;
  justify-content: space-between; /* 添加这个使标签和输入框左右对齐 */
  align-items: center;
}
</style>
