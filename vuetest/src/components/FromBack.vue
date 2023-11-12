<template>
  <div class="el-container" style="border: 1px solid #eee">
    <div class="el-aside">
      <el-row class="tac">
        <el-col :span="12">
          <h5>自定义颜色</h5>
          <el-menu
            default-active="2"
            class="el-menu-vertical-demo"
            @open="handleOpen"
            @close="handleClose"
            background-color="#"
            text-color="#fff"
            active-text-color="#409EFF">
              <template v-slot:title>
                <i class="el-icon-location"></i>
                <span>导航一</span>
              </template>
              <el-menu-item-group>
                <template v-slot:title>分组一</template>
                <el-menu-item index="1-1">选项1</el-menu-item>
                <el-menu-item index="1-2">选项2</el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group title="分组2">
                <el-menu-item index="1-3">选项3</el-menu-item>
              </el-menu-item-group>
                <el-menu-item index="1-4-1">选项1</el-menu-item>
            <el-menu-item index="2">
              <i class="el-icon-menu"></i>
              <template v-slot:title>导航二</template>
            </el-menu-item>
            <el-menu-item index="3" disabled>
              <i class="el-icon-document"></i>
              <template v-slot:title>导航三</template>
            </el-menu-item>
            <el-menu-item index="4">
              <i class="el-icon-setting"></i>
              <template v-slot:title>导航四</template>
            </el-menu-item>
          </el-menu>
        </el-col>
      </el-row>
    </div>
    <div class="el-conmain">

      <div class="el-header-container">
        <div class="el-header" style="text-align: right; font-size: 28px">
          <div class="header-avatar">
            <img src="https://github.com/logo.png" alt="">
            <el-dropdown>
              <span class="el-dropdown-link">
                admin<i class="el-icon-arrow-down el-icon--right"></i>
              </span>
              <template #dropdown>
              <el-dropdown-menu>
                <el-dropdown-item icon="el-icon-plus">黄金糕</el-dropdown-item>
                <el-dropdown-item icon="el-icon-circle-plus">狮子头</el-dropdown-item>
                <el-dropdown-item icon="el-icon-circle-plus-outline">螺蛳粉</el-dropdown-item>
                <el-dropdown-item icon="el-icon-check">双皮奶</el-dropdown-item>
                <el-dropdown-item icon="el-icon-circle-check">蚵仔煎</el-dropdown-item>
              </el-dropdown-menu>
              </template>
            </el-dropdown>
            <strong>后台管理系统</strong>
          </div>
        </div>
      </div>
      <div class="el-main">
        <el-table :data="tableData">
          <el-table-column prop="date" label="日期" width="140">
          </el-table-column>
          <el-table-column prop="name" label="姓名" width="120">
          </el-table-column>
          <el-table-column prop="address" label="地址">
          </el-table-column>
        </el-table>
      </div>
    </div>
  </div>
</template>
<script>

export default {
  mounted () {
    this.$root.toggleNav()
  },
  beforeUnmount () {
    this.$root.toggleNav()
  },
  data () {
    const item = {
      date: '2016-05-02',
      name: '王小虎',
      address: '上海市普陀区金沙江路 1518 弄'
    }
    return {
      tableData: Array(20).fill(item)
    }
  },
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>

<style scoped>
.el-container {
  display: flex;
  flex-direction: row;
  height: 100vh;
  width: 100vw;
  box-sizing: border-box;
}

@media (max-width: 768px) {
  .el-container {
    flex-direction: column;
    height: 100%;
    width: 100%;
  }
}

.el-conmain {
  display: block;
  flex-direction: column;
  width: calc(100% - 200px);
}
.el-header-container {
  display: flex;
  justify-content: flex-end;
  width: 100%;
}

.el-header-container .header-avatar {
  display: flex;
  justify-content: flex-end;
  align-items: center;
}

.el-header-container .header-avatar img {
  width: 40px;
  height: 40px;
  border-radius: 50%;
  margin-right: 10px;
}

.el-header-container .el-dropdown-link {
  color: #fff;
  font-size: 16px;
  margin-right: 10px;
}

.el-header-container .el-dropdown-link i {
  font-size: 12px;
  margin-left: 5px;
}

.el-header-container strong {
  color: #fff;
  font-size: 20px;
}

.el-header-container {
  display: flex;
  width: 100%;
}

.el-header {
  background-color: #409EFF;

  line-height: 60px;
  height: 64px;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  box-sizing: border-box;
}

.el-aside {

  background-color: #E6A23C;
  width: 200px;
  height: 100%;
  box-sizing: border-box;
  flex-shrink: 0;
}

.el-main {
  padding: 20px;
  background-color: #909399;
  box-sizing: border-box;
  height: calc(100% - 64px);
}

.el-dropdown-link {
  cursor: pointer;
  color: #409EFF;
}
.el-icon-arrow-down {
  font-size: 12px;
}
.demonstration {
  display: block;
  color: #8492a6;
  font-size: 14px;
  margin-bottom: 20px;
}

</style>
