# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are a very simple version of some of the functions in ecl_converters      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_converters_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5988cfa702a3169ca460d40584a1909f"
SRC_URI[sha256sum] = "cca132698ebb4c71d00d8f3dc8dad0b021ca2e4dbb45ef0c82d656c6579c89b8"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_converters_lite-0.61.6-0"

inherit catkin
