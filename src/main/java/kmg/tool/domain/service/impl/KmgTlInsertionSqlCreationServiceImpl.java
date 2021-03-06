package kmg.tool.domain.service.impl;

import java.nio.file.Path;

import kmg.tool.domain.service.KmgTlInsertionSqlCreationService;
import kmg.tool.domain.service.KmgTlInsertionSqlFileCreationService;

/**
 * ＫＭＧツール挿入ＳＱＬ作成サービス<br>
 *
 * @author KenichiroArai
 * @sine 1.0.0
 * @version 1.0.0
 */
public class KmgTlInsertionSqlCreationServiceImpl implements KmgTlInsertionSqlCreationService {

    /** 入力パス */
    private Path inputPath;

    /** 出力パス */
    private Path outputPath;

    /** スレッド数 */
    private short threadNum;

    /**
     * 初期化する<br>
     *
     * @author KenichiroArai
     * @sine 1.0.0
     * @version 1.0.0
     * @param inputPath
     *                   入力パス
     * @param outputPath
     *                   出力パス
     * @param threadNum
     *                   スレッド数
     */
    @SuppressWarnings("hiding")
    @Override
    public void initialize(final Path inputPath, final Path outputPath, final short threadNum) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
        this.threadNum = threadNum;
    }

    /**
     * 挿入ＳＱＬを出力する<br>
     *
     * @author KenichiroArai
     * @sine 1.0.0
     * @version 1.0.0
     */
    @Override
    public void outputInsertionSql() {

        final KmgTlInsertionSqlFileCreationService kmgTlInsertionSqlFileCreationService = new KmgTlInsertionSqlFileCreationServiceImpl();
        kmgTlInsertionSqlFileCreationService.initialize(this.inputPath, this.outputPath, this.threadNum);
        kmgTlInsertionSqlFileCreationService.outputInsertionSql();

    }

}
