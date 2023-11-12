<template>
    <el-menu
    background-color="#ffffff"
    active-text-color="#D9D914"
    class="el-menu-vertical-demo"
    text-color="#100f0f"
    @open="handleOpen"
    @close="handleClose"
    :default-openeds="['1', '3']"
    router
    >
      <el-menu-item index="1">
        <el-icon ><House /></el-icon>
        <span>首页</span>
      </el-menu-item>
      <el-sub-menu index="2">
        <template #title>
          <el-icon><Menu /></el-icon>
          <label>导航2</label>
        </template>
        <el-menu-item-group>
          <!--          <el-menu-item :index="item.path" v-for="item in list" :key="item.path" >页面内容</el-menu-item>-->
<!--          @click="$router.push('/backUl')"-->
          <el-menu-item index="/backUl" >管理</el-menu-item>
          <el-menu-item index="2"  @click="$router.push('/demo01')">检查项管理</el-menu-item>
        </el-menu-item-group>
        <el-sub-menu index="2-4">
          <template #title>选项 4</template>
          <el-menu-item index="3-1">其他1</el-menu-item>
          <el-menu-item index="3-2">其他2</el-menu-item>
        </el-sub-menu>
      </el-sub-menu>
      <el-sub-menu index="3">
        <template #title>
          <el-icon><LocationInformation /></el-icon>
          <span>导航3</span>
        </template>
        <el-menu-item index="3-1">其他1</el-menu-item>
        <el-menu-item index="3-2">其他2</el-menu-item>
      </el-sub-menu>
    </el-menu>
</template>

<script setup>

</script>

<style>
.el-menu {
  width: 200px;
}
</style>
