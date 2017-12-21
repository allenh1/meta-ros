# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_console_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_console_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bc97dc0c1cd51fab9147ed1696923b0"
SRC_URI[sha256sum] = "6e09b1237a87caa0f2805027d7d55604fed52e769ea820c6b91d1fc368cd4565"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_console_util-2.0.0-0"

inherit catkin
