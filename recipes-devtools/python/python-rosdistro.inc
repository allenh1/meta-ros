DESCRIPTION = "ROS package library"
SECTION = "devel/python"
LICENSE = "BSD & MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=48623a4c0f1b1f65fae1dedd990a7f54"
SRCNAME = "rosdistro"

SRC_URI = "http://download.ros.org/downloads/rosdistro/rosdistro-${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "${PYTHON_PN}-pyyaml"

BBCLASSEXTEND = "native"
