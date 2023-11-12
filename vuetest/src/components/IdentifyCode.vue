<template>
  <div class="s-canvas" @click="createdCode">
    <canvas id="s-canvas" :width="contentWidth" :height="contentHeight"></canvas>
  </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted, onUpdated, defineEmits } from 'vue'

const identifyCode = ref('')
const fontSizeMin = ref(25)
const fontSizeMax = ref(30)
const backgroundColorMin = ref(255)
const backgroundColorMax = ref(255)
const colorMin = ref(0)
const colorMax = ref(160)
const lineColorMin = ref(100)
const lineColorMax = ref(255)
const dotColorMin = ref(0)
const dotColorMax = ref(255)
const contentWidth = ref(120)
const contentHeight = ref(34)

const createdCode = () => {
  const len = 5
  const codeList = []
  const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz'
  const charsLen = chars.length
  for (let i = 0; i < len; i++) {
    codeList.push(chars.charAt(Math.floor(Math.random() * charsLen)))
  }
  identifyCode.value = codeList.join('')
  emit('getIdentifyCode', identifyCode.value.toLowerCase())
  drawPic()
}

const randomNum = (min, max) => {
  return Math.floor(Math.random() * (max - min) + min)
}

const randomColor = (min, max) => {
  const r = randomNum(min, max)
  const g = randomNum(min, max)
  const b = randomNum(min, max)
  return 'rgb(' + r + ',' + g + ',' + b + ')'
}

const drawPic = () => {
  const canvas = document.getElementById('s-canvas')
  const ctx = canvas.getContext('2d')
  ctx.textBaseline = 'bottom'
  // 绘制背景
  ctx.fillStyle = randomColor(backgroundColorMin.value, backgroundColorMax.value)
  ctx.fillRect(0, 0, contentWidth.value, contentHeight.value)
  // 绘制文字
  for (let i = 0; i < identifyCode.value.length; i++) {
    drawText(ctx, identifyCode.value[i], i)
  }
  drawLine(ctx)
  drawDot(ctx)
}

const drawText = (ctx, txt, i) => {
  ctx.fillStyle = randomColor(colorMin.value, colorMax.value)
  ctx.font = randomNum(fontSizeMin.value, fontSizeMax.value) + 'px SimHei'
  const x = (i + 1) * (contentWidth.value / (identifyCode.value.length + 1))
  const y = randomNum(fontSizeMax.value, contentHeight.value - 5)
  var deg = randomNum(-45, 45)
  // 修改坐标原点和旋转角度
  ctx.translate(x, y)
  ctx.rotate(deg * Math.PI / 180)
  ctx.fillText(txt, 0, 0)
  // 恢复坐标原点和旋转角度
  ctx.rotate(-deg * Math.PI / 180)
  ctx.translate(-x, -y)
}

// 绘制干扰线
const drawLine = (ctx) => {
  for (let i = 0; i < 5; i++) {
    ctx.strokeStyle = randomColor(lineColorMin.value, lineColorMax.value)
    ctx.beginPath()
    ctx.moveTo(randomNum(0, contentWidth.value), randomNum(0, contentHeight.value))
    ctx.lineTo(randomNum(0, contentWidth.value), randomNum(0, contentHeight.value))
    ctx.stroke()
  }
}

// 绘制干扰点
const drawDot = (ctx) => {
  for (let i = 0; i < 80; i++) {
    ctx.fillStyle = randomColor(dotColorMin.value, dotColorMax.value)
    ctx.beginPath()
    ctx.arc(randomNum(0, contentWidth.value), randomNum(0, contentHeight.value), 1, 0, 2 * Math.PI)
    ctx.fill()
  }
}

const emit = defineEmits(['getIdentifyCode'])

onMounted(() => {
  createdCode()
})

onUnmounted(() => {
  identifyCode.value = ''
})

onUpdated(() => {
  drawPic()
})
</script>

<style scoped>
.s-canvas {
  height: 38px;
  cursor: pointer;
}
.s-canvas canvas{
  margin-top: 1px;
  margin-left: 8px;
}
</style>
