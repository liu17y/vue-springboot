<template>
    <div class="el-page-header">
      <div class="meituan-content">
        <div
          v-motion
          :initial="{ opacity: 0, x: -100 }"
          :enter="{ opacity: 1, x: 0 }"
          :delay="300"
        >
        <div class="common-layout">
          <el-container >
            <el-header class="el-alert__title">
<!--              闪动效果-->
              <h3
                v-motion
                :initial="{ opacity: 0, y: -100 }"
                :enter="{ opacity: 1, y: 0, scale: 1 }"
                :variants="{ custom: {scale: 2}}"
                :hovered="{ scale: 1.2 }"
                :delay="300"
              >
<!--                药品用法用量管理系统-->
              </h3>
            </el-header>
              <el-container>
                <el-main class="password-login" width="450px" >
                  <el-form ref="formRef" :model="form" :rules="rules" label-width="80px" >
                    <el-form-item label="用户名" prop="username"
                                  v-motion
                                  :initial="{ opacity: 0, y: -100 }"
                                  :enter="{ opacity: 1, y: 0, transition: {delay :400}}"
                    >
                      <el-input v-model="form.username" placeholder="请输入用户名">
                        <template #prefix>
                          <span class="iconfont icon-zhanghu"></span>
                        </template>
                      </el-input>
                    </el-form-item>
                    <el-form-item label="密码" prop="password"
                                  v-motion
                                  :initial="{ opacity: 0, y: -100 }"
                                  :enter="{ opacity: 1, y: 0, transition: {delay :400}}"
                    >
                      <el-input placeholder="请输入密码" v-model="form.password" type="password" show-password>
                        <template #prefix>
                          <span class="iconfont icon-password"></span>
                        </template>
                      </el-input>
                    </el-form-item>
                    <!--             滑块验证-->
                    <div>
                      <el-form-item label="" type="Chiod"
                                    v-motion
                                    :initial="{ opacity: 0, y: -100 }"
                                    :enter="{ opacity: 1, y: 0, transition: {delay :400}}"
                      >
                        <mi-captcha
                          ref="captcha"
                          width="100%"
                          height="35"
                          :radius="6"
                          :bgColor="'#fff'"
                          :textColor="'#000'"
                          :borderColor="'#dcdfe6'"
                          :logo="LOGO"
                          @success="captchaSuccess"
                        />
                      </el-form-item>
                    </div>
  <!--                  <el-form-item label="验证码" prop="verificationCode" >-->
  <!--                    <div class="check-code-panel">-->
  <!--                      <el-input type="text" v-model="form.verificationCode" placeholder="请输入验证码" class="input-panle">-->
  <!--                        <template #prefix>-->
  <!--                          <span class="iconfont icon-yanzhengma2"></span>-->
  <!--                        </template>-->
  <!--                      </el-input>-->
  <!--                    </div>-->
  <!--                    <IdentifyCode ref="identifyCode" @click="refreshCode" />-->
  <!--                  </el-form-item>-->
                    <el-form-item label="" >
                      <el-checkbox v-model="form.rememberMe" :label="true" style=" font-size: 10px;"
                                   v-motion
                                   :initial="{ opacity: 0, y: -100 }"
                                   :enter="{ opacity: 1, y: 0, transition: {delay :400}}"
                      >
                        记住我
                      </el-checkbox>
                    </el-form-item>
                    <el-form-item type="login"
                                  v-motion
                                  :initial="{ opacity: 0, y: -100 }"
                                  :enter="{ opacity: 1, y: 0, transition: {delay :500}}"
                    >
                      <div class="long-one">
                        <el-button type="primary" @click="handleLogin" class="login">登录</el-button>
                      </div>
                    </el-form-item>
                  </el-form>
                </el-main>
              </el-container>
            </el-container>
          </div>
        </div>
      </div>
    </div>
</template>
<script>
// eslint-disable-next-line no-unused-vars
import { useRouter } from 'vue-router'
// eslint-disable-next-line no-unused-vars
import { useStore } from 'vuex'
// eslint-disable-next-line no-unused-vars
import { ElMessage } from 'element-plus'
export default {
  data () {
    return {
      form: {
        username: '',
        password: '',
        rememberMe: false
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
        verificationCode: [
          { required: true, message: '请输入验证码', trigger: 'blur' }
        ]
      }
    }
    // 滑动验证码校验成功
    // eslint-disable-next-line no-unused-vars
    function captchaSuccess () {
      console.log('验证成功')
    }
  },
  methods: {
    handleLogin () {
      this.$refs.formRef.validate((valid) => {
        if (valid) {
          this.$router.push('/backend')
          ElMessage.success('登录成功，欢迎进入管理系统')
        } else {
          ElMessage.error('登录失败，请检查输入信息')
        }
      })
    }
  }
}

</script>

<style scoped>
.el-alert__title{
  font-size: 30px;
  font-weight: bold;
  color: #000000;
  padding-top: 10px;
  text-align: center;
  border-bottom: 1px solid #cccccc;
  height: 90px;
}
.el-page-header {
  background-image: url("../assets/login-back.jpg");
  position: absolute;
  width: 100%;
  height: 100%;
  background-size: cover;
  background-position: center;
  top: 0;
  left: 0;
  z-index: -1;
}
.meituan-content{
  position : fixed;
  left : 50%;
  top : 50%;
  transform : translate(-50%,-50%);
  width : 600px;
  height : 500px;
  background-color: #fcfcfc;
  border-radius: 10px;
  opacity: 0.9;
}
.common-layout {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.password-login {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.password-login h1 {
  padding-top: 8px;
  padding-left: 50px;
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 20px;
  color: #000000;
}
.qrcode-login {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-bottom: 10px;
}
.qrcode-login h2 {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 20px;
  color: #000000;
}
#qr-code {
  width: 200px;
  height: 200px;
}
.long-one {
  padding-bottom: 30px;
  flex: 1;
  width: 100px;
}
.login {
  width: 100%;
  margin-top: 10px;
  border-radius: 10px;
}
.check-code-panel{
  display: flex;
}
.input-panle {
  flex: 1;
  width: 130px;
}
.check-code-panel {
  display: flex;
  align-items: center;
}
.input-panle {
  flex: 1;
}
</style>
