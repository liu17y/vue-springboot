import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import '@/assets/inconfont/iconfont.css'
// import '@/components/IdentifyCode.vue'
import IdentifyCode from '@/components/IdentifyCode.vue'
import wx from 'weixin-js-sdk'
import Qrcode from 'vue-qrcode'
import MakeitCaptcha from 'makeit-captcha'
import 'makeit-captcha/dist/captcha.min.css'
import { MotionPlugin } from '@vueuse/motion'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

const app = createApp(App)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
  app.component(key, component)
}
app.use(store)
app.use(router)
app.use(ElementPlus)
app.use(Qrcode)
app.use(IdentifyCode)
app.config.globalProperties.wx = wx
app.use(MakeitCaptcha)
app.use(MotionPlugin)
app.mount('#app')
