<template>
  <div class="goods">
    <el-container>
      <el-header>
        <el-row>
          <el-col :span="12">
            <el-input placeholder="请输入内容" v-model="input"></el-input>
          </el-col>
          <el-col :span="4">
            <el-button type="primary" @click="search">搜索</el-button>
          </el-col>
        </el-row>
      </el-header>
      <el-main>
        <el-table :data="tableData" style="width: 100%">
          <el-table-column prop="date" label="日期" width="180">
          </el-table-column>
          <el-table-column prop="name" label="姓名" width="180">
          </el-table-column>
          <el-table-column prop="address" label="地址">
          </el-table-column>
        </el-table>
      </el-main>
    </el-container>
  </div>
</template>

<script>
import { ref } from 'vue'
export default {
  setup () {
    const input = ref('')
    const tableData = ref([])
    const search = () => {
      console.log(input.value)
    }
    return {
      input,
      tableData,
      search
    }
  }
}
</script>

<style scoped>

</style>
