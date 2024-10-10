package com.iw.project_blog;

import java.sql.Types;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create(
                "jdbc:mysql://localhost:33011/project_blog?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai",
                "root", "root")
                .globalConfig(builder -> {
                    builder.author("iw")// 设置作者
                            // .enableSwagger()// 开启 swagger 模式
                            .outputDir("/home/oo/ABC/Practice-Java/project_blog/src/main/java");// 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);
                }))
                .packageConfig(builder -> builder.parent("com.iw.project_blog") // 设置父包名
                        .moduleName(null) // 设置父包模块名
                        .pathInfo(Collections.singletonMap(OutputFile.xml,
                                "/home/oo/ABC/Practice-Java/project_blog/src/main/resources/mapper")) // 设置mapperXml生成路径
                )
                .strategyConfig(builder -> builder.addInclude("m_user", "m_blog") // 设置需要生成的表名
                        .addTablePrefix("t_", "c_", "m_") // 设置过滤表前缀
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
