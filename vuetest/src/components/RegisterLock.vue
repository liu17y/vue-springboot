<template>
  <div class="about">
    <div class="background">
      <div class="el-cavas">
        <el-container class="el-container">
          <h1>注册</h1>
          <el-form ref="form" :model="form" :rules="rules" label-width="80px">
            <el-form-item label="用户名" prop="username">
              <el-input v-model="form.username" placeholder="请输入用户名"></el-input>
            </el-form-item>
            <el-form-item label="密码" prop="password">
              <el-input type="password" v-model="form.password" placeholder="请输入密码"></el-input>
            </el-form-item>
            <el-form-item label="确认密码" prop="confirmPassword">
              <el-input type="password" v-model="form.confirmPassword" placeholder="请再次输入密码"></el-input>
              <div>
                <IdentifyCode ref="identifyCode" @click="refreshCode" />
              </div>
            </el-form-item>
            <!--              <el-form-item label="邮箱" prop="email">-->
            <!--                <el-input v-model="form.email" placeholder="请输入邮箱"></el-input>-->
            <!--              </el-form-item>-->
            <el-form-item>
              <el-button style="width:200px" type="primary" @click="register">注册</el-button>
            </el-form-item>
            <div class="login-link">
              已经有账号？<a href="#">登录</a>
            </div>
          </el-form>
        </el-container>
      </div>
    </div>
  </div>
</template>

<script>
// import { ref } from 'vue'
import { ElMessage, ElForm, ElFormItem, ElInput } from 'element-plus'
// import IdentifyCode from '../components/IdentifyCode.vue'

// import router  from "@/router";

export default {
  components: {
    ElForm,
    ElFormItem,
    ElInput
  },
  data () {
    return {
      form: {
        username: '',
        password: '',
        confirmPassword: '',
        email: ''
      },
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
          { min: 5, max: 10, message: '长度在 5 到 10 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 6, max: 10, message: '长度在 6 到 10 个字符', trigger: 'blur' }
        ],
        confirmPassword: [
          { required: true, message: '请再次输入密码', trigger: 'blur' },
          {
            validator: (rule, value, callback) => {
              if (value !== this.value.password) {
                callback(new Error('两次输入密码不一致'))
              } else {
                callback()
              }
            },
            trigger: 'blur'
          }
        ],
        email: [
          {
            required: true,
            message: '请输入邮箱',
            trigger: 'blur'
          },
          {
            type: 'email',
            message: '请输入正确的邮箱地址',
            trigger: ['blur', 'change']
          }
        ]
      }
    }
  },

  methods: {
    register () {
      this.value.$refs.form.validate(valid => {
        if (valid) {
          // TODO: 发送注册请求
          ElMessage({
            message: '注册成功',
            type: 'success'
          })
        } else {
          console.log('error submit!!')
          return false
        }
      })
    }
  }
}

</script>

<style scoped>
.background{
  background-image: url('../assets/login-back.jpg');
  background-size: cover;
  background-position: center;
  width: 100%;
  height: 100%;
  position: fixed;
  top: 0;
  left: 0;
}

.el-cavas {
  position: absolute;
  top: 50%;left: 50%;
  height: 500px;
  width: 400px;
  /*margin: -100% 0 0 -100%;*/
  transform : translate(-50%,-50%);
  background-color: rgb(255, 255, 255);
  border-radius: 10px;
  opacity: 0.7;
}
.el-span{
  font-size: 30px;
  font-weight: bold;
  padding-top: 200px;
}
.el-container{
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 100%;
  justify-content: center;
}
.el-container h1{
  font-size: 30px;
  font-weight: bold;
  padding-top: 20px;
}

</style>
