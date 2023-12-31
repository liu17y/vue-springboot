module.exports = {
  // 继承规则
  extends: ['@commitlint/config-conventional'],
  //  定义规则类型
  rules: {
  //   type 类型定义必须在type类型范围内
    'type-enum': [
      2, 'always', [
        'feat', // 新功能（feature）
        'fix', // 修补bug
        'docs', // 文档（documentation）
        'style', // 格式（不影响代码运行的变动）
        'refactor', // 重构（即不是新增功能，也不是修改bug的代码变动）
        'pref', // 性能优化
        'test', // 增加测试
        'chore', // 构建过程或辅助工具的变动
        'revert', // 回滚
        'build' // 打包
      ]
    ],
    // subject 大小写不做校验
    'subject-case': [0]
  }
}
