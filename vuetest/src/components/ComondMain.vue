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
        <el-date-picker v-model="searchForm.entrydate" type="daterange" range-separator="至"
                        start-placeholder="开始日期" end-placeholder="结束日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">查询</el-button>
      </el-form-item>
    </el-form>
    <el-table :data="tableData">
      <el-table-column prop="name" label="姓名" width="180"></el-table-column>
      <!--<el-table-column prop="image" label="图像" width="180"></el-table-column>-->
      <el-table-column label="图像" width="180">
        <template v-slot="scope">
          <img :src="scope.row.image" width="100px" height="70px">
        </template>
      </el-table-column>
      <el-table-column prop="gender" label="性别" width="140"></el-table-column>
      <el-table-column prop="job" label="职位" width="140"></el-table-column>
      <el-table-column prop="entrydate" label="入职日期" width="180"></el-table-column>
      <el-table-column prop="updatetime" label="最后操作时间" width="230"></el-table-column>
      <el-table-column label="操作">
        <el-button type="primary" size="mini">编辑</el-button>
        <el-button type="danger" size="mini">删除</el-button>
      </el-table-column>
    </el-table>
    <el-config-provider :locale="locale">
      <el-pagination style="text-align: right"  @size-change="handleSizeChange" @current-change="handleCurrentChange"
            :current-page="page.page"
            :page-sizes="[1, 10, 100, 200, 300, 400]"
            :page-size="page.pagesize"
            layout="total, sizes, prev, pager, next, jumper"
            :total="page.total"
            />
    </el-config-provider>
  </div>
</template>
<script>
import zhCn from 'element-plus/lib/locale/lang/zh-cn'
import axios from 'axios'
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
        page: 3,
        pageSize: 2
      }

    }
  },
  created () {
    // axios请求查询 列表数据
    /* this.tableData = [
        {
            date: '2016-05-02',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
        }
    ] */
    axios.get('https://mock.apifox.cn/m1/3417603-0-default/emp/findAll/1/5').then(resp => {
      // alert(JSON.stringify(resp.data.data ));
      this.tableData = resp.data.data.emps
      this.page.total = resp.data.data.total
      this.page.pageSize = resp.data.data.pages
    })
  },
  methods: {
    onSubmit () {
      // searchForm
      // alert(JSON.stringify(this.searchForm));
      axios.post('https://mock.apifox.cn/m1/3417603-0-default/emp/findAll/1/5', this.searchForm).then(resp => {
        this.tableData = resp.data.data.emps
        this.page.total = resp.data.data.total
        this.page.pageSize = resp.data.data.pages
      })
    },
    handleSizeChange (size) {
      axios.get('https://mock.apifox.cn/m1/3417603-0-default/emp/findAll/' + size + '/5').then(resp => {
        // alert(JSON.stringify(resp.data.data ));
        this.tableData = resp.data.data.emps
        this.page.total = resp.data.data.total
        this.page.pageSize = resp.data.data.pages
      })
    },
    handleCurrentChange (page) {
      axios.get('https://mock.apifox.cn/m1/3417603-0-default/emp/findAll/1/' + page).then(resp => {
        // alert(JSON.stringify(resp.data.data ));
        this.tableData = resp.data.data.emps
        this.page.total = resp.data.data.total
        this.page.pageSize = resp.data.data.pages
        this.page.page = page
      })
    }

  }
}
</script>
<style>

</style>
