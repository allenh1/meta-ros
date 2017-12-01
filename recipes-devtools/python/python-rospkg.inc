DESCRIPTION = "ROS package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
SRCNAME = "rospkg"

SRC_URI = "https://github.com/ros-infrastructure/${SRCNAME}/archive/${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "${PYTHON_PN}-xml"

BBCLASSEXTEND = "native"
