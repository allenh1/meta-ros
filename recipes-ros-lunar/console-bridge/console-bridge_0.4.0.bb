DESCRIPTION = "console_bridge is a ROS-independent, pure CMake package that provides logging \
calls that mirror those found in rosconsole, but for applications that are not necessarily using \
ROS."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "\
    file://include/console_bridge/console.h;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
    file://src/console.cpp;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
"

DEPENDS = "boost"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "19a7b3ee7e99e41c1abd5c005418f50a"
SRC_URI[sha256sum] = "c78f87a05c1b2f299c0c8cc1aa9e0234c7e761aa521e4223ecf7aebd21874437"

S = "${WORKDIR}/${ROS_SP}"

FILES_${PN} = "\
  /usr/lib/console_bridge \
  /usr/lib/console_bridge/cmake \
  /usr/lib/console_bridge/cmake/console_bridge-targets.cmake \
  /usr/lib/console_bridge/cmake/console_bridge-targets-release.cmake \
  /usr/lib/console_bridge/cmake/console_bridge-config.cmake \
  /usr/lib/console_bridge/cmake/console_bridge-config-version.cmake \
  /usr/lib/libconsole_bridge.so.0.4 \
"

do_install_append() {
    rm ${D}/usr/lib/libconsole_bridge.so
}

inherit cmake ros faulty-solibs
