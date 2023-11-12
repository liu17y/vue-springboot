<template>
  <div style="padding-top: 10px">
    <!-- 表单 -->
    <el-form :inline="true" :model="searchForm" class="demo-form-inline">
      <el-form-item label="姓名">
        <el-input v-model="searchForm.name" placeholder="姓名"></el-input>
      </el-form-item>
      <el-form-item label="性别">
        <el-select v-model="searchForm.gender" placeholder="性别">
          <el-option label="男" value="1"></el-option>
          <el-option label="女" value="2"></el-option>
        </el-select>
      </el-form-item>

      <el-form-item label="入职日期">
        <el-date-picker v-model="searchForm.entrydate" type="daterange" range-separator="至" start-placeholder="开始日期"
                        end-placeholder="结束日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">查询</el-button>
      </el-form-item>
    </el-form>
    <el-table :data="tableData" :pagination="false" border style="width: 100%"
              @selection-change="handleSelectionChange">
      <el-table-column fixed type="selection" width="50%" align="center" />
      <el-table-column prop="code" label="编号" width="180" align="center"></el-table-column>
      <el-table-column prop="name" label="姓名" width="180" align="center">
        <template v-slot="scope">
          <span>{{scope.row.sex ===0 ?'女':'男'}}</span>
        </template>
      </el-table-column>
      <el-table-column label="图像" width="180" align="center">
        <template v-slot="">
          <img src="http://s2s3869z3.hn-bkt.clouddn.com/BIM.jpg" width="100px" height="70px">
        </template>
      </el-table-column>
      <el-table-column prop="sex" label="性别" width="140" align="center"></el-table-column>
      <el-table-column prop="age" label="年龄" width="140" align="center"></el-table-column>
      <el-table-column prop="price" label="价格" width="140" align="center"></el-table-column>
      <el-table-column prop="remark" label="血常规" width="140" align="center"></el-table-column>
      <el-table-column label="操作" align="center">
        <el-button type="primary" size="mini">编辑</el-button>
        <el-button type="danger" size="mini">删除</el-button>
      </el-table-column>
    </el-table>
    <!--分页-->
    <el-config-provider :locale="locale" style="text-align: right">
      <el-pagination
        @size-change="handlePageSizeChange"
        @current-change="handleCurrentPageChange"
        :current-page="page.page"
        :page-sizes="[1, 10, 100, 200, 300, 400]"
        :page-size="page.pagesize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="page.total" />
    </el-config-provider>
  </div>
</template>
<script>
import zhCn from 'element-plus/lib/locale/lang/zh-cn'
// import axios from 'axios'
import axios from '@/api/request'
export default {
  data () {
    return {
      locale: zhCn,
      tableData: [],
      searchForm: {
        entrydate: null
      },
      page: {
        total: 10,
        currentPage: 1,
        pageSize: 8
      }
    }
  },
  created () {
    this.getData()
  },
  methods: {
    getData () {
      const currentPage = this.page.currentPage
      const pageSize = this.page.pageSize

      // 发送请求获取分页数据
      axios.get(`http://127.0.0.1:5000/checkItem/${currentPage}/${pageSize}`)
        .then(resp => {
          const data = resp.data
          this.total = data.total
          // alert('this.total')
          this.tableData = data.rows
        })
    },
    handlePageSizeChange (pageSize) {
      this.page.pageSize = pageSize
      this.page.currentPage = 1 // 重置为第一页
      this.getData()
    },
    handleCurrentPageChange (currentPage) {
      this.page.currentPage = currentPage
      this.getData()
    }
  }
}
</script>

<style>
/* 样式省略 */
</style>
