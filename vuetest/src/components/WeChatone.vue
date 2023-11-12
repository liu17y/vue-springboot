<template>
  <div>
    <qrcode :value="wechatUrl" />
  </div>
</template>

<script>
import Qrcode from 'vue-qrcode'
export default {
  name: 'WeChat',
  components: {
    Qrcode
  },
  data () {
    return {
      wechatUrl: 'https://res.wx.qq.com/open/js/jweixin-1.6.0.js' // 替换成你自己的微信链接
    }
  }
}
</script>
