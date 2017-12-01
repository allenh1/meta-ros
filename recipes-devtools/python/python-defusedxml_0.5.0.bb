DESCRIPTION = "XML bomb protection for Python stdlib modules"
SECTION = "devel/python"
LICENSE = "PSFL"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=a560e172e996ab553d352ccff41c7d20"
SRCNAME = "defusedxml"
SRC_URI = "https://github.com/tiran/defusedxml/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "3aa135375954a9705633aad3d5abfeda"
SRC_URI[sha256sum] = "9155e76a3e877b38fe32ae96ae906f6613541bd261c56a9f645ff85f3c9688b2"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
