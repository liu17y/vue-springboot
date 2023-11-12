module.exports = {
  types: [
    { value: 'feat', name: 'feat:     新功能' },
    { value: 'fix', name: 'fix:      修复bug' },
    { value: 'docs', name: 'docs:     文档变更' },
    { value: 'style', name: 'style:    代码格式（不影响功能，例如空格、分号等格式修正）' },
    {
      value: 'refactor',
      name: 'refactor: 代码重构（不增加feature，也不修复bug）'
    },
    { value: 'perf', name: 'perf:     性能优化（提升性能的代码更改）' },
    { value: 'test', name: 'test:     添加、修改测试用例' },
    { value: 'chore', name: 'chore:    构建流程、辅助工具的变动' },
    { value: 'revert', name: 'revert:   版本回退' },
    { value: 'build', name: 'build:    打包' }
  ],
//   消息步骤
  messages: {
    type: '选择一种你的提交类型:',
    coustomScope: '选择一个修改范围(可选):',
    subject: '短说明:\n',
    body: '长说明，使用"|"换行(可选)：\n',
    footer: '关联关闭的issue，例如：#31, #34(可选):\n',
    confirmCommit: '确定提交说明?（y/n/e/h）\n',
  },
//   消息跳过
  skipQuestions: ['scope', 'body', 'footer'],
//   范围
subjectLimit: 72,

}
